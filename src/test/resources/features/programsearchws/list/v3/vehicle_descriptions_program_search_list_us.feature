@USOnly @TEST:GMIOMSUS-57808
Feature: Program Search WS - V3 List - Vehicles Published through different tabs using Data Viewer in US EN

  Background:
    Given John has access to the search api at V3 in US

  @TEST:GMIOMSUS-57792
  Scenario Outline: Program Search WS - V3 Search By Features Descriptions Added through Search Tab in Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                   | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR01A,DV-US-SRCTST-AFT01A | Y                |

  @TEST:GMIOMSUS-57793
  Scenario Outline: Program Search WS - V3 Search By RPO Descriptions using Single Edit in Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                         | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=Traverse+RPOCODE=PCV | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR02A,DV-US-SRCTST-AFT02A | Y                |

  @TEST:GMIOMSUS-57794
  Scenario Outline: Program Search WS - V3 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                       | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=Impala+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR03A,DV-US-SRCTST-AFT03A | Y                |

  @TEST:GMIOMSUS-57795
  Scenario Outline: Program Search WS - V3 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                       | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=Impala+RPOCODE=LFR | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR03B,DV-US-SRCTST-AFT03B | Y                |

  @TEST:GMIOMSUS-57796
  Scenario Outline: Program Search WS - V3 Edited Nameplate published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                          | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR04A,DV-US-SRCTST-AFT04A | Y                |

  @TEST:GMIOMSUS-57797
  Scenario Outline: Program Search WS - V3 New Nameplate published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                       | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=US+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-US-SRCTST-AFT05A | Y                |

  @TEST:GMIOMSUS-57798
  Scenario Outline: Program Search WS - V3 Edited Brand published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                             | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR06A,DV-US-SRCTST-AFT06A | Y                |

  @issue:GMIOMSUS-53727   @TEST:GMIOMSUS-57799
  Scenario Outline: Program Search WS - V3 Added Brand published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                        | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-US-SRCTST-AFT07A | Y                |

  @issue:GMIOMSUS-57220   @TEST:GMIOMSUS-57800
  Scenario Outline: Program Search WS - V3 Edited Features published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                    | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=AWD | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR08A,DV-US-SRCTST-AFT08A | Y                |

  @TEST:GMIOMSUS-57801
  Scenario Outline: Program Search WS - V3 Edit RPO Tab - Single RPO - 1 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                   | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR10A,DV-US-SRCTST-AFT10A | Y                |

  @TEST:GMIOMSUS-57802
  Scenario Outline: Program Search WS - V3 Added RPO - Single RPO - 1 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                         | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=Suburban+RPOCODE=AA1 | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-US-SRCTST-AFT11A | Y                |

  @TEST:GMIOMSUS-57803
  Scenario Outline: Program Search WS - V3 Edit Multiple RPOs 1 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                 | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR12A,DV-US-SRCTST-AFT12A | Y                |

  @TEST:GMIOMSUS-57804
  Scenario Outline: Program Search WS - V3 Edit Multiple RPOs 2 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                 | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR12B,DV-US-SRCTST-AFT12B | Y                |

  @TEST:GMIOMSUS-57805
  Scenario Outline:  Program Search WS - V3 Added RPO - Single RPO - 2 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                     | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=BUICK+BRAND=LaCrosse+RPOCODE=M3G | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR13A,DV-US-SRCTST-AFT13A | Y                |

  @TEST:GMIOMSUS-57806
  Scenario Outline: Program Search WS - V3 Edit Category published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                         | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=COLORADO+RPOCODE=FVX | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR15A,DV-US-SRCTST-AFT15A | Y                |

  @TEST:GMIOMSUS-57807
  Scenario Outline: Program Search WS - V3 New Category published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                      | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=Tahoe+RPOCODE=UE1 | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-US-SRCTST-AFT16A | Y                |