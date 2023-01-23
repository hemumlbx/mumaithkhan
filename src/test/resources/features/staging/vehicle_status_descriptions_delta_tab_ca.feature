@CanadaOnly @TEST:GMIOMSUS-59038
Feature: Staging ETL - Vehicle Status and Descriptions under Delta Tab CA

  Background:
    Given John logs into Data Viewer application for CA

  @Pending @TEST:GMIOMSUS-59029
  Scenario Outline: Brand Tab - Vehicle Status and Description for brand Added through Staging Feed CA
    When he opens the Brands under Delta Tab
    Then he should see <vehicle> with <status> and Original column with English: <eng description> and French: <fre description>
    Examples:
      | vehicle             | status | eng description | fre description |
      | 2019 Buick Envision | ADDED  | Envision        | Envision        |

  @Pending @TEST:GMIOMSUS-59030
  Scenario Outline: Brand Tab - Vehicle Status and Description for brand Edited through Staging Feed CA
    When he opens the Brands under Delta Tab
    Then he should see <vehicle> with <status> and Original column with English: <eng description> and French: <fre description>
    Examples:
      | vehicle                 | status | eng description    | fre description    |
      | 2018 Cadillac ATS Coupe | EDITED | ATS CoupeDeltaDesc | ATS CoupeDeltaDesc |

  @Pending @TEST:GMIOMSUS-59031
  Scenario Outline: Brand Tab - Vehicle Status and Description for brand Deleted through Staging Feed CA
    When he opens the Brands under Delta Tab
    Then he should see <vehicle> with <status> and Original column with English: <eng description> and French: <fre description>
    Examples:
      | vehicle            | status  | eng description | fre description |
      | 2019 Buick Enclave | DELETED | Enclave         | Enclave         |

  @Pending @TEST:GMIOMSUS-59032
  Scenario Outline: Features Tab - Vehicle Status and Description for Features Added through Staging Feed CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under original column with <Original English Description> and <Original French Description>
    And he should see <vehicle> for <code> and <category> with <status> under new column with <New English Description> and <New French Description>
    Examples:
      | vehicle            | code            | category   | status | Original English Description | Original French Description | New English Description | New French Description |
      | 2019 Buick Enclave | All Wheel Drive | drivetrain | EDITED | All Wheel Drive              | Transmission intégrale      | All Wheel Drive         | Transmission intégrale |

  @Pending @TEST:GMIOMSUS-59033
  Scenario Outline: Features Tab - Vehicle Status and Description for Features Edited through Staging Feed CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under original column with <Original English Description> and <Original French Description>
    And he should see <vehicle> for <code> and <category> with <status> under new column with <New English Description> and <New French Description>
    Examples:
      | vehicle            | code            | category   | status | Original English Description | Original French Description | New English Description | New French Description |
      | 2019 Buick Enclave | All Wheel Drive | drivetrain | EDITED | All Wheel Drive              | Transmissio                 |                         |                        |

  @Pending @TEST:GMIOMSUS-59034
  Scenario Outline: Features Tab - Vehicle Status and Description for Features Archived through Staging Feed CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under original column with <Original English Description> and <Original French Description>
    And he should see <vehicle> for <code> and <category> with <status> under new column with <New English Description> and <New French Description>
    Examples:
      | vehicle            | code            | category   | status | Original English Description | Original French Description | New English Description | New French Description |
      | 2019 Buick Enclave | All Wheel Drive | drivetrain | EDITED | All Wheel Drive              | Transmissio                 |                         |                        |

  @Pending @TEST:GMIOMSUS-59035
  Scenario Outline: RPOs Tab - Vehicle Status and Description for RPOs Added through Staging Feed CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under original column with <Original English Description> and <Original French Description>
    And he should see <vehicle> for <code> and <category> with <status> under new column with <New English Description> and <New French Description>
    Examples:
      | vehicle            | code | category       | status | Original English Description                | Original French Description                            | New English Description                     | New French Description                                 |
      | 2019 Buick Enclave | UE1  | NO OPTION KIND | EDITED | OnStar and Buick connected services capable | Compatible avec les services connectés OnStar et Buick | OnStar and Buick connected services capable | Compatible avec les services connectés OnStar et Buick |

  @Pending @TEST:GMIOMSUS-59036
  Scenario Outline: RPOs Tab - Vehicle Status and Description for RPOs Edited through Staging Feed CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under original column with <Original English Description> and <Original French Description>
    And he should see <vehicle> for <code> and <category> with <status> under new column with <New English Description> and <New French Description>
    Examples:
      | vehicle            | code            | category   | status | Original English Description | Original French Description | New English Description | New French Description |
      | 2019 Buick Enclave | All Wheel Drive | drivetrain | EDITED | All Wheel Drive              | Transmissio                 |                         |                        |

  @Pending @TEST:GMIOMSUS-59037
  Scenario Outline: RPOs Tab - Vehicle Status and Description for RPOs Archived through Staging Feed CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under original column with <Original English Description> and <Original French Description>
    And he should see <vehicle> for <code> and <category> with <status> under new column with <New English Description> and <New French Description>
    Examples:
      | vehicle            | code            | category   | status | Original English Description | Original French Description | New English Description | New French Description |
      | 2019 Buick Enclave | All Wheel Drive | drivetrain | EDITED | All Wheel Drive              | Transmissio                 |                         |                        |
