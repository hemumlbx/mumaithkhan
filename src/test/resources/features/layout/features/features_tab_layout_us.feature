@USOnly @TEST:GMIOMSUS-57411
Feature: Features Tab Functionality US

  Background:
    Given John logs into Data Viewer application for US

  @TEST:GMIOMSUS-57403
  Scenario: Features - Verification of Features Tab layout US
    When he clicks on Features Tab
    Then he should verify the Features layout

  @TEST:GMIOMSUS-57404
  Scenario: Features - Verification of Dropdown Values - US
    When he clicks on Features Tab
    Then he should verify the list of dropdown values under Feature tab
      | Year           | Division                     | Brand                         | Category                    | Status          |
      | 2020,2021,2022 | Buick,Cadillac,Chevrolet,GMC | Spark,Bolt EV,Colorado,Blazer | body,boxType,cab,drivetrain | Active,Archived |

  @TEST:GMIOMSUS-57405
  Scenario Outline: Features - Verification of Category List returned - US
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category   | Status |
      | 2017 | Chevrolet | Colorado | drivetrain | Active |
    Then he should view the list of <category> returned
    Examples:
      | category   |
      | drivetrain |

  @TEST:GMIOMSUS-57406
  Scenario Outline: Features - Verification of Category Values returned - US
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category   | Status |
      | 2017 | Chevrolet | Colorado | drivetrain | Active |
    Then he must view the list of <values> returned
    Examples:
      | values   |
      | 2WD, 4WD |

  @TEST:GMIOMSUS-57407
  Scenario: Features - Verification of Edit Selected Button Layout - US
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category   | Status |
      | 2017 | Chevrolet | Colorado | drivetrain | Active |
    And he selects 4WD Feature to Edit
    Then he should verify the Edit Selected Layout

  @TEST:GMIOMSUS-57408
  Scenario: Features - Verification of Error pop-up - US
    When he clicks on Features Tab
    And he clicks Edit Selected Button
    Then she should verify the Error Popup displayed

  @TEST:GMIOMSUS-57409
  Scenario: Features - Verification of Edit Feature Layout - US
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category   | Status |
      | 2017 | Chevrolet | Colorado | drivetrain | Active |
    And he selects Feature 2WD to Edit
    Then he should verify the Edit Feature Layout

  @TEST:GMIOMSUS-57410
  Scenario: Features - Verification of Archive Folder - US
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category  | Status |
      | 2021 | Chevrolet | Colorado | wheelbase | Active |
    And he selects a Feature 128.5 to move to Archive
    Then he should verify the Warning pop-up