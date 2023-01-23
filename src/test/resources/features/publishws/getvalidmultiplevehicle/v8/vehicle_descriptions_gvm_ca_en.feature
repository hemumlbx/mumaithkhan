@CanadaOnly @TEST:GMIOMSUS-58480
Feature: Publish WS GVM - V8 Vehicles Published through different tabs using Data Viewer in Canada EN

  Background:
    Given John has access to the vehicle api for country CA using V8

  @TEST:GMIOMSUS-58465
  Scenario Outline: Publish WS  - GVM - V8 Search By Features Descriptions Added through Search Tab in Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                   | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                  |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR01A,DV-CA-SRCTST-AFT01A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Sierra 1500 CrewIncDescEng CAB |

  @TEST:GMIOMSUS-58466
  Scenario Outline: Publish WS  - GVM - V8 Search By RPO Descriptions using Single Edit in Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                           |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR02A,DV-CA-SRCTST-AFT02A |             |               | 1000.0,1000.0   | Y                | 2018 CHEVROLET Traverse with PCV |

  @TEST:GMIOMSUS-58467
  Scenario Outline: Publish WS  - GVM - V8 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                         |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR03A,DV-CA-SRCTST-AFT03A |             |               | 1000.0,1000.0   | Y                | 2018 CHEVROLET Impala with LCV |

  @TEST:GMIOMSUS-58468
  Scenario Outline: Publish WS  - GVM - V8 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                         |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR03B,DV-CA-SRCTST-AFT03B |             |               | 1000.0,1000.0   | Y                | 2017 CHEVROLET Impala with LFR |

  @TEST:GMIOMSUS-58469
  Scenario Outline: Publish WS  - GVM - V8 Edited Nameplate published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                          | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header           |
      | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR04A,DV-CA-SRCTST-AFT04A |             |               | 1000.0,1000.0   | Y                | 2017 BUICK Regal |

  @TEST:GMIOMSUS-58470
  Scenario Outline: Publish WS  - GVM - V8 New Nameplate published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                     |
      | +COUNTRY=CA+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT05A |             |               | 1000.0,1000.0   | Y                | 2019 CADILLAC Escalade ESV |

  @TEST:GMIOMSUS-58471
  Scenario Outline: Publish WS  - GVM - V8 Edited Brand published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                     |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN             | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR06A    |             |               | 1000.0          | Y                | 2017 CADILLAC CTS SedanIncDescEng          |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT06A |             |               | 1000.0,1000.0   | Y                | 2017 CADILLAC CTS SedanIncDescEng with LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-58472
  Scenario Outline: Publish WS  - GVM - V8 Added Brand published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                        | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                             |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT07A |             |               | 1000.0          | Y                | 2017 CHEVROLET Suburban Commercial |

  @issue:GMIOMSUS-57220 @TEST:GMIOMSUS-58473
  Scenario Outline: Publish WS  - GVM - V8 Edited Features published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                                | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                    |
      | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR08A,DV-CA-SRCTST-AFT08A |             |               | 1000.0,1000.0   | Y                | 2018 GMC Acadia All Wheel DriveIncDescEng |

  @TEST:GMIOMSUS-58474
  Scenario Outline: Publish WS  - GVM - V8 Edit RPO Tab - Single RPO - 1 published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                   | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                     |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR10A,DV-CA-SRCTST-AFT10A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Yukon XL with MYC |

  @TEST:GMIOMSUS-58475
  Scenario Outline: Publish WS  - GVM - V8 Added RPO - Single RPO - 1 published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                           |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT11A |             |               | 1000.0          | Y                | 2018 CHEVROLET Suburban with AA1 |

  @TEST:GMIOMSUS-58476
  Scenario Outline: Publish WS  - GVM - V8 Edit Multiple RPOs 1 published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                 | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                   |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR12A,DV-CA-SRCTST-AFT12A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Canyon with LCV |

  @TEST:GMIOMSUS-58476
  Scenario Outline: Publish WS  - GVM - V8 Edit Multiple RPOs 1 published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                 | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                   |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR12B,DV-CA-SRCTST-AFT12B |             |               | 1000.0,1000.0   | Y                | 2017 GMC Canyon with LWN |

  @TEST:GMIOMSUS-58477
  Scenario Outline: Publish WS  - GVM - V8 Added RPO - Single RPO - 2 published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                     | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                       |
      | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR13A,DV-CA-SRCTST-AFT13A |             |               | 1000.0,1000.0   | Y                | 2018 BUICK LaCrosse with M3G |

  @TEST:GMIOMSUS-58478
  Scenario Outline: Publish WS  - GVM - V8 Edit Category published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                  | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                    |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR15A,DV-CA-SRCTST-AFT15A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Terrain with A4F |

  @TEST:GMIOMSUS-58479
  Scenario Outline: Publish WS  - GVM - V8 New Category published through Data Viewer CA EN
    When the user has a GMV vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GMV vehicle
    Then the user should see the appropriate GMV vehicle return data from the request
    Examples:
      | Request FVD                                                      | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT16A |             |               | 1000.0          | Y                | 2017 CHEVROLET Tahoe with UE1 |