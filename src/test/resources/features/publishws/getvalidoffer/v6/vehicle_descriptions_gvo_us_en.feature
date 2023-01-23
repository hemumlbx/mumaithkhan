@USOnly @TEST:GMIOMSUS-58656
Feature: Publish WS GVO - V6 Vehicles Published through different tabs using Data Viewer in US EN

  Background:
    Given John has access to the vehicle api for country US using V6

  @TEST:GMIOMSUS-58641
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Search By Features Descriptions Added through Search Tab in Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                   | Request FGD                 | Offer Name         | Offer Returned | Offer Header                        | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT01A | Y              | 2017 GMC Sierra 1500 CrewOfrDescEng | DV-US-SRCTST-AFT01A |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR01A    | Y              | 2017 GMC Sierra 1500 CrewOfrDescEng | DV-SRCTST-BFR01A    |

  @TEST:GMIOMSUS-58642
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Search By RPO Descriptions using Single Edit in Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name         | Offer Returned | Offer Header                            | Program Name        |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT02A | Y              | 2018 CHEVROLET Traverse w/PCVOfrDescEng | DV-US-SRCTST-AFT02A |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR02A    | Y              | 2018 CHEVROLET Traverse w/PCVOfrDescEng | DV-SRCTST-BFR02A    |

  @TEST:GMIOMSUS-58643
  Scenario Outline: Scenario Outline: Publish WS  - Get Valid Offer - V6 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                       | Request FGD                 | Offer Name         | Offer Returned | Offer Header                             | Program Name        |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT03A | Y              | 2018 CHEVROLET Impala w/EngineOfrDescEng | DV-US-SRCTST-AFT03A |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR03A    | Y              | 2018 CHEVROLET Impala w/EngineOfrDescEng | DV-SRCTST-BFR03A    |

  @TEST:GMIOMSUS-58644
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                       | Request FGD                 | Offer Name         | Offer Returned | Offer Header                             | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT03B | Y              | 2017 CHEVROLET Impala w/EngineOfrDescEng | DV-US-SRCTST-AFT03B |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR03B    | Y              | 2017 CHEVROLET Impala w/EngineOfrDescEng | DV-SRCTST-BFR03B    |

  @TEST:GMIOMSUS-58645
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Edited Nameplate published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                          | Request FGD                 | Offer Name         | Offer Returned | Offer Header              | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT04A | Y              | 2017 BUICK Regal SedanEng | DV-US-SRCTST-AFT04A |
      | +COUNTRY=US+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR04A    | Y              | 2017 BUICK Regal SedanEng | DV-SRCTST-BFR04A    |

  @TEST:GMIOMSUS-58646
  Scenario Outline: Publish WS  - Get Valid Offer - V6 New Nameplate published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                       | Request FGD                 | Offer Name         | Offer Returned | Offer Header                  | Program Name        |
      | +COUNTRY=US+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT05A | Y              | 2019 CADILLAC Escalade ESVEng | DV-US-SRCTST-AFT05A |

  @TEST:GMIOMSUS-58647
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Edited Brand published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name         | Offer Returned | Offer Header                                                  | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT06A | Y              | 2017 CADILLAC CTS SedanOfrDescEng w/3.6L V6 Twin Turbo engine | DV-US-SRCTST-AFT06A |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN             | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR06A    | Y              | 2017 CADILLAC CTS SedanOfrDescEng                             | DV-SRCTST-BFR06A    |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-58648
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Added Brand published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                        | Request FGD                 | Offer Name         | Offer Returned | Offer Header                       | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT07A | Y              | 2017 CHEVROLET Suburban Commercial | DV-US-SRCTST-AFT07A |

  @TEST:GMIOMSUS-58649
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Edited Features published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                    | Request FGD                 | Offer Name         | Offer Returned | Offer Header                  | Program Name        |
      | +COUNTRY=US+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=AWD | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT08A | Y              | 2018 GMC Acadia AWDOfrDescEng | DV-US-SRCTST-AFT08A |
      | +COUNTRY=US+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=AWD | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR08A    | Y              | 2018 GMC Acadia AWDOfrDescEng | DV-SRCTST-BFR08A    |

  @TEST:GMIOMSUS-58650
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Edit RPO Tab - Single RPO - 1 published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                   | Request FGD                 | Offer Name         | Offer Returned | Offer Header                      | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT10A | Y              | 2017 GMC Yukon XL w/MYCOfrDescEng | DV-US-SRCTST-AFT10A |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR10A    | Y              | 2017 GMC Yukon XL w/MYCOfrDescEng | DV-SRCTST-BFR10A    |

  @TEST:GMIOMSUS-58651
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Added RPO - Single RPO - 1 published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name         | Offer Returned | Offer Header                            | Program Name        |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT11A | Y              | 2018 CHEVROLET Suburban w/AA1OfrDescEng | DV-US-SRCTST-AFT11A |

  @TEST:GMIOMSUS-58652
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Edit Multiple RPOs 1 published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                 | Request FGD                 | Offer Name         | Offer Returned | Offer Header                       | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT12A | Y              | 2017 GMC Canyon w/EngineOfrDescEng | DV-US-SRCTST-AFT12A |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR12A    | Y              | 2017 GMC Canyon w/EngineOfrDescEng | DV-SRCTST-BFR12A    |

  @TEST:GMIOMSUS-58652
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Edit Multiple RPOs 1 published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                 | Request FGD                 | Offer Name         | Offer Returned | Offer Header                       | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT12B | Y              | 2017 GMC Canyon w/EngineOfrDescEng | DV-US-SRCTST-AFT12B |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR12B    | Y              | 2017 GMC Canyon w/EngineOfrDescEng | DV-SRCTST-BFR12B    |

  @TEST:GMIOMSUS-58653
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Added RPO - Single RPO - 2 published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                     | Request FGD                 | Offer Name         | Offer Returned | Offer Header                        | Program Name        |
      | +COUNTRY=US+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT13A | Y              | 2018 BUICK LaCrosse w/M3GOfrDescEng | DV-US-SRCTST-AFT13A |
      | +COUNTRY=US+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=US+REGION=NATIONAL | DV-OFFER-BFR13A    | Y              | 2018 BUICK LaCrosse w/M3GOfrDescEng | DV-SRCTST-BFR13A    |

  @TEST:GMIOMSUS-58654
  Scenario Outline: Publish WS  - Get Valid Offer - V6 Edit Category published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name         | Offer Returned | Offer Header                            | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=COLORADO+RPOCODE=FVX | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT15A | Y              | 2017 CHEVROLET Colorado w/FVXOfrDescEng | DV-US-SRCTST-AFT15A |

  @TEST:GMIOMSUS-58655
  Scenario Outline: Publish WS  - Get Valid Offer - V6 New Category published through Data Viewer US EN
    When the user has a GVO vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                      | Request FGD                 | Offer Name         | Offer Returned | Offer Header                         | Program Name        |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 | +COUNTRY=US+REGION=NATIONAL | DV-US-OFFER-AFT16A | Y              | 2017 CHEVROLET Tahoe w/UE1OfrDescEng | DV-US-SRCTST-AFT16A |
