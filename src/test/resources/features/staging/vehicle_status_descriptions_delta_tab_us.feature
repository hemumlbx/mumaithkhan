@CanadaOnly @TEST:GMIOMSUS-59048
Feature: Staging ETL - Vehicle Status and Descriptions under Delta Tab US

  Background:
    Given John logs into Data Viewer application for US

  @Pending @TEST:GMIOMSUS-59039
  Scenario Outline: Brand Tab - Vehicle Status and Description for brand Added through Staging Feed US
    When he opens the Brands under Delta Tab
    Then he should see <vehicle> with <status> and original column with English: <eng description>
    Examples:
      | vehicle        | status | eng description |
      | 2021 Chevrolet | EDITED | Silverado 1500  |

  @Pending @TEST:GMIOMSUS-59040
  Scenario Outline: Brand Tab - Vehicle Status and Description for brand Edited through Staging Feed US
    When he opens the Brands under Delta Tab
    Then he should see <vehicle> with <status> and original column with English: <eng description>
    Examples:
      | vehicle                 | status | eng description    |
      | 2018 Cadillac ATS Coupe | EDITED | ATS CoupeDeltaDesc |

  @Pending @TEST:GMIOMSUS-59041
  Scenario Outline: Brand Tab - Vehicle Status and Description for brand Deleted through Staging Feed US
    When he opens the Brands under Delta Tab
    Then he should see <vehicle> with <status> and original column with English: <eng description>
    Examples:
      | vehicle            | status  | eng description |
      | 2019 Buick Enclave | DELETED | Enclave         |

  @Pending @TEST:GMIOMSUS-59042
  Scenario Outline: Features Tab - Vehicle Status and Description for Features Added through Staging Feed US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under Original column with <Original English Description>
    And he should see <vehicle> for <code> and <category> with <status> under New column with <New English Description>
    Examples:
      | vehicle                    | code | category   | status | Original English Description | New English Description |
      | 2021 Cadillac Escalade ESV | 4WD  | drivetrain | EDITED | 4WD                          | 4WD                     |

  @Pending @TEST:GMIOMSUS-59043
  Scenario Outline: Features Tab - Vehicle Status and Description for Features Edited through Staging Feed US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under Original column with <Original English Description>
    And he should see <vehicle> for <code> and <category> with <status> under New column with <New English Description>
    Examples:
      | vehicle                 | code | category | status | Original English Description | New English Description |
      | 2019 Chevrolet Colorado |      |          | New    |                              |                         |

  @Pending @TEST:GMIOMSUS-59044
  Scenario Outline: Features Tab - Vehicle Status and Description for Features Archived through Staging Feed US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under Original column with <Original English Description>
    And he should see <vehicle> for <code> and <category> with <status> under New column with <New English Description>
    Examples:
      | vehicle                 | code | category | status | Original English Description | New English Description |
      | 2019 Chevrolet Colorado |      |          | New    |                              |                         |

  @Pending @TEST:GMIOMSUS-59045
  Scenario Outline: RPOs Tab - Vehicle Status and Description for RPOs Added through Staging Feed US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under Original column with <Original English Description>
    And he should see <vehicle> for <code> and <category> with <status> under New column with <New English Description>
    Examples:
      | vehicle                | code | category     | status | Original English Description                                         | New English Description                                              |
      | 2021 Chevrolet Bolt EV | MMF  | Transmission | EDITED | Electric drive unit, (200 hp [150 kW] 266 lb-ft of torque [360 N-m]) | Electric drive unit, (200 hp [150 kW] 266 lb-ft of torque [360 N-m]) |

  @Pending @TEST:GMIOMSUS-59046
  Scenario Outline: RPOs Tab - Vehicle Status and Description for RPOs Edited through Staging Feed US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under Original column with <Original English Description>
    And he should see <vehicle> for <code> and <category> with <status> under New column with <New English Description>
    Examples:
      | vehicle                 | code | category | status | Original English Description | New English Description |
      | 2019 Chevrolet Colorado |      |          | New    |                              |                         |

  @Pending @TEST:GMIOMSUS-59047
  Scenario Outline: RPOs Tab - Vehicle Status and Description for RPOs Archived through Staging Feed US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> under Original column with <Original English Description>
    And he should see <vehicle> for <code> and <category> with <status> under New column with <New English Description>
    Examples:
      | vehicle                 | code | category | status | Original English Description | New English Description |
      | 2019 Chevrolet Colorado |      |          | New    |                              |                         |