@USOnly @TEST:GMIOMSUS-57451
Feature: RPOs Tab Functionality US

  Background:
    Given John logs into Data Viewer application for US

  @TEST:GMIOMSUS-57438
  Scenario: RPOs - Verification of RPOs tab layout US
    When he navigates through RPOs Tab
    Then he should verify the RPOs layout

  @TEST:GMIOMSUS-57439
  Scenario Outline: ROPs - Verification of RPOs Categories Tab layout US
    When he navigates through RPOs Tab
    And he selects Tab Categories
    Then he should verify the Categories Tab Layout using <category>
    Examples:
      | category                                         |
      | Body Code, Wheel Type, PEG, Engine, Transmission |

  @TEST:GMIOMSUS-57440
  Scenario: ROPs - Verification of Dropdown values US
    When he navigates through RPOs Tab
    Then he should verify the list of dropdown values under RPOs tab
      | Year           | Division                     | Brand                           | Category                        | Status          |
      | 2020,2021,2022 | Buick,Cadillac,Chevrolet,GMC | Acadia,Yukon,Sierra 1500,Canyon | Body Code,Engine,PEG,Wheel Type | Active,Archived |

  @TEST:GMIOMSUS-57441
  Scenario Outline: RPOs - Verification of Category List returned - US
    When he navigates through RPOs Tab
    And he search for RPOs using following information
      | Year | Division | Brand  | Category | Status |
      | 2021 | GMC      | Canyon | Engine   | Active |
    Then he verifies the list of <CategoryList> returned
    Examples:
      | CategoryList |
      | Engine       |

  @TEST:GMIOMSUS-57442
  Scenario Outline: RPOs - Verification of Features List returned - US
    When he navigates through RPOs Tab
    And he search for RPOs using following information
      | Year | Division | Brand  | Category | Status |
      | 2021 | GMC      | Canyon | Engine   | Active |
    Then he must see the list of <features> returned
    Examples:
      | features    |
      | LCV,LGZ,LWN |

  @TEST:GMIOMSUS-57443
  Scenario: RPOs - Verification of Add RPO Layout - US
    When he navigates through RPOs Tab
    And he clicks on Add New RPO
    Then he should verify the Add New RPO Layout using the below dropdown values
      | Year           | Division                     | Brand                             | Category                        |
      | 2020,2021,2022 | Buick,Cadillac,Chevrolet,GMC | Enclave,Encore,Encore GX,Envision | Body Code,Engine,PEG,Wheel Type |

  @TEST:GMIOMSUS-57444
  Scenario: RPOs - Verification of Edit Selected Button Layout - US
    When he navigates through RPOs Tab
    And he search for RPOs using following information
      | Year | Division | Brand  | Category | Status |
      | 2018 | GMC      | Acadia | Engine   | Active |
    And he selects sub feature LGX to Edit
    Then he verifies the Edit Selected Layout using Engine, 3.6L V6, SIDI, DOHC and 3.6L V6 SIDI DOHC engine with Variable Valve Timing (VVT) values

  @TEST:GMIOMSUS-57445
  Scenario: RPOs - Verification of Archive Folder - US
    When he navigates through RPOs Tab
    And he search for RPOs using following information
      | Year | Division  | Brand    | Category | Status |
      | 2021 | Chevrolet | Colorado | PEG      | Active |
    And he selects sub feature 4LT to Archive
    Then he should verify the warning pop-up

  @TEST:GMIOMSUS-57446
  Scenario: RPOs - Verification of Error Messages in Add RPO Layout - US
    When he navigates through RPOs Tab
    And he clicks on Add New RPO
    Then he must verify the Error messages displayed

  @TEST:GMIOMSUS-57447
  Scenario: RPOs - Verification of Error Messages in Edit Selected Layout - US
    When he navigates through RPOs Tab
    And he clicks on EditSelected
    Then he must verify the Error pop-up displayed

  @TEST:GMIOMSUS-57448
  Scenario: RPOs - Verification of Add New Category Layout - US
    When he navigates through RPOs Tab
    And he selects Tab Categories
    Then he should verify the Add New Category layout

  @TEST:GMIOMSUS-57449
  Scenario: RPOs - Verification of adding a New Category to the list - US
    When he navigates through RPOs Tab
    And he selects Tab Categories
    Then he must be able to Add a New Category named DEMO into categories
    And he must be able to verify the Alert message A system error has occurred. If he repeats the previous step

  @resetCategoryFields @TEST:GMIOMSUS-57450
  Scenario: RPOs - Verify to Edit a existing Category in the list - US
    When he navigates through RPOs Tab
    And he selects Tab Categories
    And he selects category New to Edit
    Then he must be able to rename New with Value in categories list