@USOnly @TEST:GMIOMSUS-58320
Feature: Publish WS GVM - V4 Vehicles Published through different tabs using Data Viewer in US EN

  Background:
    Given John has access to the vehicle api for country US using V4

  @TEST:GMIOMSUS-58305
  Scenario Outline: Publish WS  - GVM - V4 Search By Features Descriptions Added through Search Tab in Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                   | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                  |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR01A,DV-US-SRCTST-AFT01A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Sierra 1500 CrewIncDescEng CAB |

  @TEST:GMIOMSUS-58306
  Scenario Outline: Publish WS  - GVM - V4 Search By RPO Descriptions using Single Edit in Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                           |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR02A,DV-US-SRCTST-AFT02A |             |               | 1000.0,1000.0   | Y                | 2018 CHEVROLET Traverse with PCV |

  @TEST:GMIOMSUS-58307
  Scenario Outline: Publish WS  - GVM - V4 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                         |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR03A,DV-US-SRCTST-AFT03A |             |               | 1000.0,1000.0   | Y                | 2018 CHEVROLET Impala with LCV |

  @TEST:GMIOMSUS-58308
  Scenario Outline: Publish WS  - GVM - V4 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                         |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR03B,DV-US-SRCTST-AFT03B |             |               | 1000.0,1000.0   | Y                | 2017 CHEVROLET Impala with LFR |

  @TEST:GMIOMSUS-58309
  Scenario Outline: Publish WS  - GVM - V4 Edited Nameplate published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                          | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header           |
      | +COUNTRY=US+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR04A,DV-US-SRCTST-AFT04A |             |               | 1000.0,1000.0   | Y                | 2017 BUICK Regal |

  @TEST:GMIOMSUS-58310
  Scenario Outline: Publish WS  - GVM - V4 New Nameplate published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                     |
      | +COUNTRY=US+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=US+REGION=NATIONAL | DV-US-SRCTST-AFT05A |             |               | 1000.0,1000.0   | Y                | 2019 CADILLAC Escalade ESV |

  @TEST:GMIOMSUS-58311
  Scenario Outline: Publish WS  - GVM - V4 Edited Brand published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                     |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN             | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR06A    |             |               | 1000.0          | Y                | 2017 CADILLAC CTS SedanIncDescEng          |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 | +COUNTRY=US+REGION=NATIONAL | DV-US-SRCTST-AFT06A |             |               | 1000.0,1000.0   | Y                | 2017 CADILLAC CTS SedanIncDescEng with LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-58312
  Scenario Outline: Publish WS  - GVM - V4 Added Brand published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                        | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                             |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=US+REGION=NATIONAL | DV-US-SRCTST-AFT07A |             |               | 1000.0          | Y                | 2017 CHEVROLET Suburban Commercial |

  @TEST:GMIOMSUS-58313
  Scenario Outline: Publish WS  - GVM - V4 Edited Features published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                    | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                        |
      | +COUNTRY=US+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=AWD | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR08A,DV-US-SRCTST-AFT08A |             |               | 1000.0,1000.0   | Y                | 2018 GMC Acadia AWDIncDescEng |

  @TEST:GMIOMSUS-58314
  Scenario Outline: Publish WS  - GVM - V4 Edit RPO Tab - Single RPO - 1 published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                   | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                     |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR10A,DV-US-SRCTST-AFT10A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Yukon XL with MYC |

  @TEST:GMIOMSUS-58315
  Scenario Outline: Publish WS  - GVM - V4 Added RPO - Single RPO - 1 published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                           |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 | +COUNTRY=US+REGION=NATIONAL | DV-US-SRCTST-AFT11A |             |               | 1000.0          | Y                | 2018 CHEVROLET Suburban with AA1 |

  @TEST:GMIOMSUS-58316
  Scenario Outline: Publish WS  - GVM - V4 Edit Multiple RPOs 1 published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                 | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                   |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR12A,DV-US-SRCTST-AFT12A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Canyon with LCV |

  @TEST:GMIOMSUS-58316
  Scenario Outline: Publish WS  - GVM - V4 Edit Multiple RPOs 1 published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                 | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                   |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR12B,DV-US-SRCTST-AFT12B |             |               | 1000.0,1000.0   | Y                | 2017 GMC Canyon with LWN |

  @TEST:GMIOMSUS-58317
  Scenario Outline: Publish WS  - GVM - V4 Added RPO - Single RPO - 2 published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                     | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                       |
      | +COUNTRY=US+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR13A,DV-US-SRCTST-AFT13A |             |               | 1000.0,1000.0   | Y                | 2018 BUICK LaCrosse with M3G |

  @TEST:GMIOMSUS-58318
  Scenario Outline: Publish WS  - GVM - V4 Edit Category published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                           |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=COLORADO+RPOCODE=FVX | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR15A,DV-US-SRCTST-AFT15A |             |               | 1000.0,1000.0   | Y                | 2017 CHEVROLET Colorado with FVX |

  @TEST:GMIOMSUS-58319
  Scenario Outline: Publish WS  - GVM - V4 New Category published through Data Viewer US EN
    When the user has a GMV vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                      | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                        |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 | +COUNTRY=US+REGION=NATIONAL | DV-US-SRCTST-AFT16A |             |               | 1000.0          | Y                | 2017 CHEVROLET Tahoe with UE1 |