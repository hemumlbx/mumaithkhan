@CanadaOnly @TEST:GMIOMSUS-57976
Feature: Publish ETL - Publish Vehicle Descriptions using different Tabs in Data viewer CA

  Background:
    Given John logs into Data Viewer application for CA

  @TEST:GMIOMSUS-57959
  Scenario Outline: Search Tab - Search By Features to Add Descriptions CA
    When he navigates to Search Tab
    And he enters description for 2017 GMC Sierra 1500 using By Features under search tab for feature type cab and feature Crew
      | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | CrewIncDescEng                | CrewOfrDescEng            | CrewIncDescFré               | CrewOfrDescFré           |
    Then he should see the added <Incentive Description> and <Offer Description> in the Landing Page
    Examples:
      | Incentive Description | Offer Description |
      | CrewIncDescEng        | CrewOfrDescEng    |

  @TEST:GMIOMSUS-57960
  Scenario Outline: Search Tab - Search By RPO to Add Descriptions using Single Edit CA
    When he navigates to Search Tab
    And he enters description for 2018 Chevrolet Traverse using By RPO under search tab for category type NO OPTION KIND and RPO LPO, Premium Carpet Mat Package(PCV)
      | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | PCVIncDescEng                 | PCVOfrDescEng             | PCVIncDescFré                | PCVOfrDescFré            |
    Then he should see the added <Incentive Description> and <Offer Description> in the Landing Page
    Examples:
      | Incentive Description | Offer Description |
      | PCVIncDescEng         | PCVOfrDescEng     |

  @TEST:GMIOMSUS-57961
  Scenario Outline: Search Tab - Search By RPO to Add Descriptions using Multiple Edits CA
    When he navigates to Search Tab
    And he selects multiple <vehicles> under rpo category <RPOs> using By RPO under search tab for type Engine
    And he enters the descriptions for Multiple Edits
      | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | EngineIncDescEng              | EngineOfrDescEng          | EngineIncDescFré             | EngineOfrDescFré         |
    Then he should see the added <Incentive Description> and <Offer Description> in the Landing Page
    Examples:
      | RPOs                                                                                                                               | vehicles                                    | Incentive Description | Offer Description |
      | Engine, ECOTEC 2.5L DOHC 4-cylinder DI with Variable Valve Timing (VVT) and auto stop/start(LCV);Engine, 3.6L DOHC V6 Bi-Fuel(LFR) | 2018 Chevrolet Impala;2017 Chevrolet Impala | EngineIncDescEng      | EngineOfrDescEng  |

  @TEST:GMIOMSUS-57962
  Scenario: Nameplate Tab - Edit Nameplate CA
    When he navigates to Nameplate Tab
    And he edit nameplate for a vehicle using Nameplate Tab
      | Division | Model | Year | English Nameplate | French Nameplate |
      | Buick    | Regal | 2017 | Regal SedanEng    | Regal SedanFré   |
    Then he should see nameplate modified to Regal SedanEng

  @TEST:GMIOMSUS-57963
  Scenario: Nameplate Tab - Add New Nameplate CA
    When he navigates to Nameplate Tab
    And  he removes 2019 Cadillac Escalade ESV from the selected nameplate list
    And he add new nameplate for a vehicle using nameplate tab
      | Division | Model        | Year | English Nameplate | French Nameplate |
      | Cadillac | Escalade ESV | 2019 | Escalade ESVEng   | Escalade ESVFré  |
    Then he should see nameplate modified to Escalade ESVEng

  @TEST:GMIOMSUS-57964
  Scenario: Brand Tab - Edit Brand CA
    When he navigates to Brands Tab
    And he edit brand for a vehicle using Brand Tab
      | Division | Model     | Year | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description | English Chrome Description | French Chrome Description |
      | Cadillac | CTS Sedan | 2017 | CTS SedanIncDescEng           | CTS SedanOfrDescEng       | CTS SedanIncDescFré          | CTS SedanOfrDescFré      | not required               | not required              |
    Then he should see nameplate modified to CTS Sedan

  @TEST:GMIOMSUS-57965
  Scenario Outline: Brand Tab - Add New Brand CA
    When he navigates to Brands Tab
    And he add new brand for a vehicle using brand tab using styles <Brand Styles>
      | Division  | Model    | Year | English Incentive Description | English Offer Description     | French Incentive Description  | French Offer Description      | English Chrome Description | French Chrome Description |
      | Chevrolet | Suburban | 2018 | Suburban CommercialIncDescEng | Suburban CommercialOfrDescEng | Suburban CommercialIncDescFré | Suburban CommercialOfrDescFré | Suburban Commercial        | Suburban Commercial       |
    Then he should see new brand name Suburban Commercial from the brand list
    Examples:
      | Brand Styles                                          |
      | CC15906 - 1FL - Commercial,CK15906 - 1FL - Commercial |

  @TEST:GMIOMSUS-57966
  Scenario: Brand Tab - Add Nameplate for the New Brand
    When he navigates to Nameplate Tab
    And  he removes 2018 Chevrolet Suburban Commercial from the selected nameplate list
    And he add new nameplate for a vehicle using nameplate tab
      | Division  | Model    | Year | English Nameplate   | French Nameplate       |
      | Chevrolet | Suburban | 2018 | Suburban Commercial | Suburban CommercialFré |
    Then he should see nameplate modified to Suburban Commercial

  @TEST:GMIOMSUS-57967
  Scenario: Features Tab - Edit Features CA
    When he navigates to Features Tab
    And he edit feature for a vehicle using Feature Tab
      | Division | Model  | Year | Category   | Status | Feature Value   | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description  |
      | GMC      | Acadia | 2018 | drivetrain | Active | All Wheel Drive | All Wheel DriveIncDescEng     | All Wheel DriveOfrDescEng | All Wheel DriveIncDescFré    | All Wheel DriveOfrDescFré |
    Then he should see the added descriptions

  @TEST:GMIOMSUS-57968
  Scenario: Features Tab - Archive Features CA
    When he navigates to Features Tab
    And he archive the feature using the following vehicle information
      | Division  | Model             | Year | Category  | Status | Feature Value | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | Chevrolet | Express Passenger | 2017 | wheelbase | Active | 155.0         | not required                  | not required              | not required                 | not required             |
    Then he should not see Archived feature under Active status

  @TEST:GMIOMSUS-57969
  Scenario: Edit RPO Tab - Single RPO - 1 CA
    When he navigates to RPOs Tab
    And he edit RPO for a vehicle using RPOs Tab using category Transmission
      | Division | Model    | Year | Category     | Status | Feature Value | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | GMC      | Yukon XL | 2017 | Transmission | Active | MYC           | MYCIncDescEng                 | MYCOfrDescEng             | MYCIncDescFré                | MYCOfrDescFré            |
    Then he should see the added descriptions

  @TEST:GMIOMSUS-57970
  Scenario: Add New RPO - Single RPO CA
    When he navigates to RPOs Tab
    And he Add New RPO AA1 for a vehicle using category Transmission under RPOs Tab
      | Division  | Model    | Year | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description | English Chrome Description | French Chrome Description |
      | Chevrolet | Suburban | 2018 | AA1IncDescEng                 | AA1OfrDescEng             | AA1IncDescFré                | AA1OfrDescFré            | AA1                        | AA1                       |
    Then he should see the newly added RPO descriptions

  @TEST:GMIOMSUS-57971
  Scenario: RPO Tab - Edit Multiple RPOs CA
    When he navigates to RPOs Tab
    And he edit multiple RPOs for a vehicle using RPOs Tab
      | Division | Model  | Year | Category | Status | Feature Value | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | GMC      | Canyon | 2017 | Engine   | Active | LCV,LWN       | EngineIncDescEng              | EngineOfrDescEng          | EngineIncDescFré             | EngineOfrDescFré         |
    Then he should see the added descriptions

  @TEST:GMIOMSUS-57972
  Scenario: Edit RPO Tab - Single RPO - 2 CA
    When he navigates to RPOs Tab
    And he edit RPO for a vehicle using RPOs Tab using category Transmission
      | Division | Model    | Year | Category     | Status | Feature Value | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | Buick    | LaCrosse | 2018 | Transmission | Active | M3G           | M3GIncDescEng                 | M3GOfrDescEng             | M3GIncDescFré                | M3GOfrDescFré            |
    Then he should see the added descriptions

  @TEST:GMIOMSUS-57973
  Scenario: RPO Tab - Archive RPO CA
    When he navigates to RPOs Tab
    And he archive the RPO using the following vehicle information
      | Division  | Model   | Year | Category       | Status | Feature Value | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | Chevrolet | Equinox | 2017 | NO OPTION KIND | Active | PDR           | Not Required                  | Not Required              | Not Required                 | Not Required             |
    Then he should not see Archived rpo under Active status

  @TEST:GMIOMSUS-57974
  Scenario Outline: RPO Tab - Edit Category CA
    When he navigates to RPOs Tab
    And he edit <Category> to <Modify Category> under Categories tab
    Then he should see <Modify Category> added to the category list
    And he navigates to sub tab called RPOs
    And he edit RPO for a vehicle using RPOs Tab using category Fleet Incentive Model
      | Division | Model   | Year | Category              | Status | Feature Value | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | GMC      | Terrain | 2017 | Fleet Incentive Model | Active | A4F           | A4FIncDescEng                 | A4FOfrDescEng             | A4FIncDescFré                | A4FOfrDescFré            |
    And he should see the added descriptions
    Examples:
      | Category        | Modify Category       |
      | Fleet Incentive | Fleet Incentive Model |

  @TEST:GMIOMSUS-57975
  Scenario Outline: RPO Tab - Add New Category CA
    When he navigates to RPOs Tab
    And he add new category <New Category> using Categories tab
    Then he should see <New Category> added to the category list
    And he navigates to sub tab called RPOs
    And he edit RPO for a vehicle using RPOs Tab with category <New Category>
      | Division  | Model | Year | Category       | Status | Feature Value | English Incentive Description | English Offer Description | French Incentive Description | French Offer Description |
      | Chevrolet | Tahoe | 2017 | NO OPTION KIND | Active | UE1           | UE1IncDescEng                 | UE1OfrDescEng             | UE1IncDescFré                | UE1OfrDescFré            |
    Examples:
      | New Category |
      | OnStar       |
