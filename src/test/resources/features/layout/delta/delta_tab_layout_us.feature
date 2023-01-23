@USOnly @TEST:GMIOMSUS-57393
Feature: Delta Tab - Layout US

  Background:
    Given John logs into Data Viewer application for US

  @TEST:GMIOMSUS-59060
  Scenario: Verification of Delta Tab Landing Page Layout US
    Then he should verify the Delta Tab and Brands Tab Layout in Delta Landing page using following data
      | status     | newField                                                                                   | original                |
      | NEW,EDITED | 2022 Buick\nEnglish: Encore,2023 Buick\nEnglish: Enclave,2022 Chevrolet\nEnglish: Colorado | English: Silverado 1500 |

  @TEST:GMIOMSUS-57385
  Scenario Outline: Verification of Features Tab Layout US
    When he navigate to Features Tab
    Then he should verify the Features Tab Layout in Delta Landing page using <status>
    Examples:
      | status                                                            |
      | 2021 Cadillac Escalade,2021 Cadillac Escalade ESV,2021 GMC Canyon |

  @TEST:GMIOMSUS-57386
  Scenario Outline: Verification of RPOs Tab Layout US
    When he navigate to RPOs Tab
    Then he should verify the RPOs Tab Layout in Delta Landing page using <Status>
    Examples:
      | Status                                                                           |
      | 2021 Cadillac Escalade ESV,2021 GMC Yukon,2021 Chevrolet Bolt EV,2021 GMC Canyon |

  @TEST:GMIOMSUS-57387
  Scenario Outline: Verification of CHROMEID values in Brands Tab Vehicle List US
    When he selects a vehicle using following information
      | brand | division      | status |
      | CT5-V | 2022 Cadillac | NEW    |
    Then he should verify the Vehicle List using <chrome id> and <fvd replacement string> values
    Examples:
      | chrome id                   | fvd replacement string                                                                                                                                                                                |
      | 419255,419256,419257,419258 | +COUNTRY=US+YEAR=2022+DIVISION=CADILLAC+BRAND=CT5-V+DRIVETRAIN=2WD+WHEELBASE=116+RPOCODE=1SF,+COUNTRY=US+YEAR=2022+DIVISION=CADILLAC+BRAND=CT5-V+DRIVETRAIN=2WD+WHEELBASE=116+RPOCODE=1SF+RPOCODE=RWL |

  @TEST:GMIOMSUS-57388
  Scenario Outline: Verification of MMC values in Brands Tab Vehicle List US
    When he selects a vehicle using following information
      | brand | division | status |
      | Yukon | 2022 GMC | NEW    |
    Then he should verify the vehicle List using <mmc> and <fvd replacement string> values
    Examples:
      | mmc             | fvd replacement string                                                                                                                                      |
      | TC10706,TK10706 | +COUNTRY=US+YEAR=2022+DIVISION=GMC+BRAND=YUKON+DRIVETRAIN=2WD+WHEELBASE=120.9,+COUNTRY=US+YEAR=2022+DIVISION=GMC+BRAND=YUKON+WHEELBASE=120.9+DRIVETRAIN=4WD |

  @TEST:GMIOMSUS-57389
  Scenario:  Verification of Edit Vehicle Pop-up US
    When he clicks on Edit icon of vehicle with Status NEW and Division 2022 Chevrolet and brand Equinox
    Then he should verify Edit Vehicle Layout

  @TEST:GMIOMSUS-57390
  Scenario: Verification of Actions Button US
    When he clicks on Actions Icon of vehicle with Status NEW and Division 2022 Chevrolet and brand Malibu
    Then he should verify the Action change from Ignored to Accepted

  @TEST:GMIOMSUS-57391
  Scenario: Verification of Accept All Button in Brands Tab US
    Then he should verify the Actions change from Ignored to Accepted

  @TEST:GMIOMSUS-57392
  Scenario: Verification of Accept All Button in RPOs Tab US
    When she navigate to RPOs Tab
    Then he should verify the Actions Icon Status Change




