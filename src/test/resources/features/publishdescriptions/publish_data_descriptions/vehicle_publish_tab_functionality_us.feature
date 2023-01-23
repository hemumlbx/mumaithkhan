@USOnly @TEST:GMIOMSUS-58032
Feature: Publish ETL - Publish Tab functionality US

  Background:
    Given John logs into Data Viewer application for US

  @TEST:GMIOMSUS-58014
  Scenario: Publish Tab - Publish changes through Search By Features Descriptions US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model       | Year | Category | Category Type |
      | GMC      | Sierra 1500 | 2017 | cab      | FEATURE       |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58015
  Scenario: Publish Tab - Publish changes through Search By RPO Descriptions using Single Edit US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model    | Year | Category       | Category Type |
      | Chevrolet | Traverse | 2018 | NO OPTION KIND | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58016
  Scenario: Publish Tab - Publish changes through Search By RPO Descriptions using Multiple Edits 1 US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2017 | Engine   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58017
  Scenario: Publish Tab - Publish changes through Search By RPO Descriptions using Multiple Edits 2 US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2018 | Engine   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58018
  Scenario Outline: Publish Tab - Publish changes of Edited Nameplate US
    When he navigates to Publish Tab
    And he publish the nameplate <NamePlate> through Publish Nameplates tab
    Then he should see the nameplates published <NamePlate> under Pending Publish Queue tab
    Examples:
      | NamePlate      |
      | Regal SedanEng |

  @TEST:GMIOMSUS-58019
  Scenario Outline: Publish Tab - Publish changes of Added Nameplate US
    When he navigates to Publish Tab
    And he publish the nameplate <NamePlate> through Publish Nameplates tab
    Then he should see the nameplates published <NamePlate> under Pending Publish Queue tab
    Examples:
      | NamePlate       |
      | Escalade ESVEng |

  @TEST:GMIOMSUS-58020
  Scenario Outline: Publish Tab - Publish changes of Edited Brand US
    When he navigates to Publish Tab
    And he publish the brand <Brands> through Publish Models tab using <year> and <division>
    Then he should see the published Models data under the Pending Publish Queue
    Examples:
      | Brands    | year | division |
      | CTS Sedan | 2017 | Cadillac |

  @TEST:GMIOMSUS-58021
  Scenario Outline: Publish Tab - Publish changes of Added Brand US
    When he navigates to Publish Tab
    And he publish the brand <Brands> through Publish Models tab using <year> and <division>
    Then he should see the published Models data under the Pending Publish Queue
    Examples:
      | Brands              | year | division  |
      | Suburban Commercial | 2018 | Chevrolet |

  @TEST:GMIOMSUS-58022
  Scenario: Publish Tab - Publish changes of Edited Feature US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model  | Year | Category   | Category Type |
      | GMC      | Acadia | 2018 | drivetrain | FEATURE       |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58023
  Scenario: Publish Tab - Publish changes of Archived Feature US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model             | Year | Category  | Category Type |
      | Chevrolet | Express Passenger | 2017 | wheelbase | FEATURE       |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58024
  Scenario: Publish Tab - Publish changes through Edited Single RPO 1 US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model    | Year | Category     | Category Type |
      | GMC      | Yukon XL | 2017 | Transmission | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58025
  Scenario: Publish Tab - Publish changes through Added Single RPO 1 US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model    | Year | Category     | Category Type |
      | Chevrolet | Suburban | 2018 | Transmission | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58026
  Scenario: Publish Tab - Publish changes through Edited Multiple RPOs 1 US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | Engine   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58027
  Scenario: Publish Tab - Publish changes through Edited Multiple RPOs 2 US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | Engine   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58028
  Scenario: Publish Tab - Publish changes through Edited Single RPOs US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model    | Year | Category     | Category Type |
      | Buick    | LaCrosse | 2018 | Transmission | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58029
  Scenario: Publish Tab - Publish changes through Archived RPO US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model   | Year | Category       | Category Type |
      | Chevrolet | Equinox | 2017 | NO OPTION KIND | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58030
  Scenario: Publish Tab - Publish changes of Edited Category US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model    | Year | Category              | Category Type |
      | Chevrolet | Colorado | 2017 | Fleet Incentive Model | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58031
  Scenario: Publish Tab - Publish changes of Added New Category US
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model | Year | Category | Category Type |
      | Chevrolet | Tahoe | 2017 | OnStar   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue