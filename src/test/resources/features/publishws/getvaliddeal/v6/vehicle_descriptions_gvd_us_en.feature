@USOnly @TEST:GMIOMSUS-58176
Feature: Publish WS GVD - V6 Vehicles Published through different tabs using Data Viewer in US EN

  Background:
    Given John has access to the vehicle api for country US using V6

  @TEST:GMIOMSUS-58161
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Search By Features Descriptions Added through Search Tab in Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                   | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                        |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR01A,DV-US-SRCTST-AFT01A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Sierra 1500  includes CrewIncDescEng |

  @TEST:GMIOMSUS-58162
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Search By RPO Descriptions using Single Edit in Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR02A,DV-US-SRCTST-AFT02A |             |               | 1000.0,1000.0   | Y                | 2018 CHEVROLET Traverse  includes PCV |

  @TEST:GMIOMSUS-58163
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                              |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR03A,DV-US-SRCTST-AFT03A |             |               | 1000.0,1000.0   | Y                | 2018 CHEVROLET Impala  includes LCV |

  @TEST:GMIOMSUS-58164
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                              |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR03B,DV-US-SRCTST-AFT03B |             |               | 1000.0,1000.0   | Y                | 2017 CHEVROLET Impala  includes LFR |

  @TEST:GMIOMSUS-58165
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Edited Nameplate published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                          | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header           |
      | +COUNTRY=US+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR04A,DV-US-SRCTST-AFT04A |             |               | 1000.0,1000.0   | Y                | 2017 BUICK Regal |

  @TEST:GMIOMSUS-58166
  Scenario Outline: Publish WS  - Get Valid Deal - V6 New Nameplate published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                     |
      | +COUNTRY=US+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=US+REGION=NATIONAL | DV-US-SRCTST-AFT05A |             |               | 1000.0,1000.0   | Y                | 2019 CADILLAC Escalade ESV |

  @TEST:GMIOMSUS-58167
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Edited Brand published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                          |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN             | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR06A                     |             |               | 1000.0          | Y                | 2017 CADILLAC CTS SedanIncDescEng               |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR06A,DV-US-SRCTST-AFT06A |             |               | 1000.0,1000.0   | Y                | 2017 CADILLAC CTS SedanIncDescEng  includes LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-58168
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Added Brand published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                        | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                             |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=US+REGION=NATIONAL | DV-US-SRCTST-AFT07A |             |               | 1000.0          | Y                | 2017 CHEVROLET Suburban Commercial |

  @TEST:GMIOMSUS-58169
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Edited Features published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                    | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                  |
      | +COUNTRY=US+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=AWD | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR08A,DV-US-SRCTST-AFT08A |             |               | 1000.0,1000.0   | Y                | 2018 GMC Acadia  includes AWDIncDescEng |

  @TEST:GMIOMSUS-58170
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Edit RPO Tab - Single RPO - 1 published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                   | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                          |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR10A,DV-US-SRCTST-AFT10A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Yukon XL  includes MYC |

  @TEST:GMIOMSUS-58171
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Added RPO - Single RPO - 1 published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 | +COUNTRY=US+REGION=NATIONAL | DV-US-SRCTST-AFT11A |             |               | 1000.0          | Y                | 2018 CHEVROLET Suburban  includes AA1 |

  @TEST:GMIOMSUS-58172
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Edit Multiple RPOs 1 published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                 | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                        |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR12A,DV-US-SRCTST-AFT12A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Canyon  includes LCV |

  @TEST:GMIOMSUS-58172
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Edit Multiple RPOs 1 published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                 | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                        |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR12B,DV-US-SRCTST-AFT12B |             |               | 1000.0,1000.0   | Y                | 2017 GMC Canyon  includes LWN |

  @TEST:GMIOMSUS-58173
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Added RPO - Single RPO - 2 published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                     | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                            |
      | +COUNTRY=US+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR13A,DV-US-SRCTST-AFT13A |             |               | 1000.0,1000.0   | Y                | 2018 BUICK LaCrosse  includes M3G |

  @TEST:GMIOMSUS-58174
  Scenario Outline: Publish WS  - Get Valid Deal - V6 Edit Category published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=COLORADO+RPOCODE=FVX | +COUNTRY=US+REGION=NATIONAL | DV-SRCTST-BFR15A,DV-US-SRCTST-AFT15A |             |               | 1000.0,1000.0   | Y                | 2017 CHEVROLET Colorado  includes FVX |

  @TEST:GMIOMSUS-58175
  Scenario Outline: Publish WS  - Get Valid Deal - V6 New Category published through Data Viewer US EN
    When the user has a GVD vehicle request to the api for the country US using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a request for GVD vehicle
    Then the user should see the appropriate GVD vehicle data return from the request
    Examples:
      | Request FVD                                                      | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                             |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 | +COUNTRY=US+REGION=NATIONAL | DV-US-SRCTST-AFT16A |             |               | 1000.0          | Y                | 2017 CHEVROLET Tahoe  includes UE1 |