@CanadaOnly @TEST:GMIOMSUS-57402
Feature: Features Tab Functionality CA

  Background:
    Given John logs into Data Viewer application for CA

  @TEST:GMIOMSUS-57394
  Scenario: Features - Verification of Features Tab layout CA
    When he clicks on Features Tab
    Then he should verify the Features layout

  @TEST:GMIOMSUS-57395
  Scenario: Features - Verification of Dropdown Values - CA
    When he clicks on Features Tab
    Then he should verify the list of dropdown values under Feature tab
      | Year           | Division                     | Brand                         | Category                    | Status          |
      | 2020,2021,2022 | Buick,Cadillac,Chevrolet,GMC | Spark,Bolt EV,Colorado,Blazer | body,boxType,cab,drivetrain | Active,Archived |

  @TEST:GMIOMSUS-57396
  Scenario Outline: Features - Verification of Category List returned - CA
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category   | Status |
      | 2017 | Chevrolet | Colorado | drivetrain | Active |
    Then he should view the list of <category> returned
    Examples:
      | category   |
      | drivetrain |

  @TEST:GMIOMSUS-57397
  Scenario Outline: Features - Verification of Category Values returned - CA
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category   | Status |
      | 2017 | Chevrolet | Colorado | drivetrain | Active |
    Then he must view the list of <values> returned
    Examples:
      | values                             |
      | Four Wheel Drive, Rear Wheel Drive |

  @TEST:GMIOMSUS-57398
  Scenario: Features - Verification of Edit Selected Button Layout - CA
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category   | Status |
      | 2017 | Chevrolet | Colorado | drivetrain | Active |
    And he selects Four Wheel Drive Feature to Edit
    Then he should verify the Edit Selected Layout

  @TEST:GMIOMSUS-57399
  Scenario: Features - Verification of Error pop-up - CA
    When he clicks on Features Tab
    And he clicks Edit Selected Button
    Then she should verify the Error Popup displayed

  @TEST:GMIOMSUS-57400
  Scenario: Features - Verification of Edit Feature Layout - CA
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category   | Status |
      | 2017 | Chevrolet | Colorado | drivetrain | Active |
    And he selects Feature Rear Wheel Drive to Edit
    Then he should verify the Edit Feature Layout

  @TEST:GMIOMSUS-57401
  Scenario: Features - Verification of Archive Folder - CA
    When he clicks on Features Tab
    And he search for feature using following information
      | Year | Division  | Brand    | Category  | Status |
      | 2021 | Chevrolet | Colorado | wheelbase | Active |
    And he selects a Feature 128.5 to move to Archive
    Then he should verify the Warning pop-up