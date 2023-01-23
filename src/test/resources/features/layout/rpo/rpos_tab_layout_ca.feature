@CanadaOnly @TEST:GMIOMSUS-57437
Feature: RPOs Tab Functionality CA

  Background:
    Given John logs into Data Viewer application for CA

  @TEST:GMIOMSUS-57424
  Scenario: RPOs - Verification of RPOs tab layout CA
    When he navigates through RPOs Tab
    Then he should verify the RPOs layout

  @TEST:GMIOMSUS-57425
  Scenario Outline: ROPs - Verification of RPOs Categories Tab layout CA
    When he navigates through RPOs Tab
    And he selects Tab Categories
    Then he should verify the Categories Tab Layout using <category>
    Examples:
      | category                                         |
      | Body Code, Wheel Type, PEG, Engine, Transmission |

  @TEST:GMIOMSUS-57426
  Scenario: ROPs - Verification of Dropdown values CA
    When he navigates through RPOs Tab
    Then he should verify the list of dropdown values under RPOs tab
      | Year           | Division                     | Brand                           | Category                        | Status          |
      | 2020,2021,2022 | Buick,Cadillac,Chevrolet,GMC | Acadia,Yukon,Sierra 1500,Canyon | Body Code,Engine,PEG,Wheel Type | Active,Archived |

  @TEST:GMIOMSUS-57427
  Scenario Outline: RPOs - Verification of Category List returned - CA
    When he navigates through RPOs Tab
    And he search for RPOs using following information
      | Year | Division | Brand  | Category | Status |
      | 2021 | GMC      | Canyon | Engine   | Active |
    Then he verifies the list of <CategoryList> returned
    Examples:
      | CategoryList |
      | Engine       |

  @TEST:GMIOMSUS-57428
  Scenario Outline: RPOs - Verification of Features List returned - CA
    When he navigates through RPOs Tab
    And he search for RPOs using following information
      | Year | Division | Brand  | Category | Status |
      | 2021 | GMC      | Canyon | Engine   | Active |
    Then he must see the list of <features> returned
    Examples:
      | features    |
      | LCV,LGZ,LWN |

  @TEST:GMIOMSUS-57429
  Scenario: RPOs - Verification of Add RPO Layout - CA
    When he navigates through RPOs Tab
    And he clicks on Add New RPO
    Then he should verify the Add New RPO Layout using the below dropdown values
      | Year           | Division                     | Brand                             | Category                        |
      | 2020,2021,2022 | Buick,Cadillac,Chevrolet,GMC | Enclave,Encore,Encore GX,Envision | Body Code,Engine,PEG,Wheel Type |

  @TEST:GMIOMSUS-57430
  Scenario: RPOs - Verification of Edit Selected Button Layout - CA
    When he navigates through RPOs Tab
    And he search for RPOs using following information
      | Year | Division | Brand    | Category | Status |
      | 2021 | Cadillac | Escalade | Engine   | Active |
    And he selects sub feature LM2 to Edit
    Then he verifies the Edit Selected Layout using Engine, Duramax 3.0L Turbo Diesel and 3.0L Duramax Turbo Diesel engine values

  @TEST:GMIOMSUS-57431
  Scenario: RPOs - Verification of Archive Folder - CA
    When he navigates through RPOs Tab
    And he search for RPOs using following information
      | Year | Division  | Brand    | Category | Status |
      | 2021 | Chevrolet | Colorado | PEG      | Active |
    And he selects sub feature 4LT to Archive
    Then he should verify the warning pop-up

  @TEST:GMIOMSUS-57432
  Scenario: RPOs - Verification of Error Messages in Add RPO Layout - CA
    When he navigates through RPOs Tab
    And he clicks on Add New RPO
    Then he must verify the Error messages displayed

  @TEST:GMIOMSUS-57433
  Scenario: RPOs - Verification of Error Messages in Edit Selected Layout - CA
    When he navigates through RPOs Tab
    And he clicks on EditSelected
    Then he must verify the Error pop-up displayed

  @TEST:GMIOMSUS-57434
  Scenario: RPOs - Verification of Add New Category Layout - CA
    When he navigates through RPOs Tab
    And he selects Tab Categories
    Then he should verify the Add New Category layout

  @TEST:GMIOMSUS-57435
  Scenario: RPOs - Verification of adding a New Category to the list - CA
    When he navigates through RPOs Tab
    And he selects Tab Categories
    Then he must be able to Add a New Category named DEMO into categories
    And he must be able to verify the Alert message A system error has occurred. If he repeats the previous step

  @resetCategoryFields @TEST:GMIOMSUS-57436
  Scenario: RPOs - Verify to Edit a existing Category in the list - CA
    When he navigates through RPOs Tab
    And he selects Tab Categories
    And he selects category New to Edit
    Then he must be able to rename New with Value in categories list