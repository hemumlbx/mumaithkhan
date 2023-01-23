@CanadaOnly @TEST:GMIOMSUS-57384
Feature: Delta Tab - Layout CA

  Background:
    Given John logs into Data Viewer application for CA

  @TEST:GMIOMSUS-59059
  Scenario: Verification of Delta Tab Landing Page Layout CA
    Then he should verify the Delta Tab and Brands Tab Layout in Delta Landing page using following data
      | status     | newField                                                                                     | original                                                    |
      | NEW,EDITED | 2023 Buick\nEnglish: Envision\nFrench: Envision,2022 Cadillac\nEnglish: CT4-V\nFrench: CT4-V | English: CT4-V\nFrench: CT4-V,English: CT5-V\nFrench: CT5-V |

  @TEST:GMIOMSUS-57376
  Scenario Outline: Verification of Features Tab Layout CA
    When he navigate to Features Tab
    Then he should verify the Features Tab Layout in Delta Landing page using <status>
    Examples:
      | status                                                        |
      | 2021 Cadillac Escalade,2021 Chevrolet Bolt EV,2022 GMC Acadia |

  @TEST:GMIOMSUS-57377
  Scenario Outline: Verification of RPOs Tab Layout CA
    When he navigate to RPOs Tab
    Then he should verify the RPOs Tab Layout in Delta Landing page using <status>
    Examples:
      | status                                                                                |
      | 2021 Cadillac Escalade ESV,2022 Buick Envision,2022 Chevrolet Bolt EV,2022 GMC Acadia |

  @TEST:GMIOMSUS-57378
  Scenario Outline: Verification of CHROMEID values in Brands Tab Vehicle List CA
    When he selects a vehicle using following information
      | brand | division      | status |
      | CT5-V | 2022 Cadillac | EDITED |
    Then he should verify the Vehicle List using <chrome id> and <fvd replacement string> values
    Examples:
      | chrome id                   | fvd replacement string                                                                                                                                                                                              |
      | 419368,419370,419371,419369 | +COUNTRY=CA+YEAR=2022+DIVISION=CADILLAC+BRAND=CT5-V+DRIVETRAIN=REAR WHEEL DRIVE+WHEELBASE=116+RPOCODE=1SF,+COUNTRY=CA+YEAR=2022+DIVISION=CADILLAC+BRAND=CT5-V+WHEELBASE=116+DRIVETRAIN=REAR WHEEL DRIVE+RPOCODE=1SV |

  @TEST:GMIOMSUS-57379
  Scenario Outline: Verification of MMC values in Brands Tab Vehicle List CA
    When he selects a vehicle using following information
      | brand               | division | status |
      | Sierra 1500 Limited | 2022 GMC | NEW    |
    Then he should verify the vehicle List using <mmc> and <fvd replacement string> values
    Examples:
      | mmc                             | fvd replacement string                                                                                                                                                                                                                                                        |
      | TC18543,TC18753,TC18903,TC18543 | +COUNTRY=CA+YEAR=2022+DIVISION=GMC+BRAND=SIERRA 1500 LIMITED+DRIVETRAIN=REAR WHEEL DRIVE+CAB=CREW+SERIES=1500+BOXTYPE=SHORT+WHEELBASE=147.43,+COUNTRY=CA+YEAR=2022+DIVISION=GMC+BRAND=SIERRA 1500 LIMITED+CAB=DOUBLE+DRIVETRAIN=REAR WHEEL DRIVE+SERIES=1500+WHEELBASE=147.44 |

  @TEST:GMIOMSUS-57380
  Scenario:  Verification of Edit Vehicle Pop-up CA
    When he clicks on Edit icon of vehicle with Status NEW and Division 2023 Buick and brand Envision
    Then he should verify Edit Vehicle Layout

  @TEST:GMIOMSUS-57381
  Scenario: Verification of Actions Button CA
    When he clicks on Actions Icon of vehicle with Status NEW and Division 2022 GMC and brand Yukon XL
    Then he should verify the Action change from Ignored to Accepted

  @TEST:GMIOMSUS-57382
  Scenario: Verification of Accept All Button in Brands Tab CA
    Then he should verify the Actions change from Ignored to Accepted

  @TEST:GMIOMSUS-57383
  Scenario: Verification of Accept All Button in RPOs Tab CA
    When she navigate to RPOs Tab
    Then he should verify the Actions Icon Status Change




