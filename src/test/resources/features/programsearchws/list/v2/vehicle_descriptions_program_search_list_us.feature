@USOnly @TEST:GMIOMSUS-57757
Feature: Program Search WS - V2 List - Vehicles Published through different tabs using Data Viewer in US EN

  Background:
    Given John has access to the search api at V2 in US

  @TEST:GMIOMSUS-57741
  Scenario Outline: Program Search WS - V2 Search By Features Descriptions Added through Search Tab in Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                   | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR01A,DV-US-SRCTST-AFT01A | Y                |

  @TEST:GMIOMSUS-57742
  Scenario Outline: Program Search WS - V2 Search By RPO Descriptions using Single Edit in Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                         | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=Traverse+RPOCODE=PCV | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR02A,DV-US-SRCTST-AFT02A | Y                |

  @TEST:GMIOMSUS-57743
  Scenario Outline: Program Search WS - V2 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                       | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=Impala+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR03A,DV-US-SRCTST-AFT03A | Y                |

  @TEST:GMIOMSUS-57744
  Scenario Outline: Program Search WS - V2 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                       | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=Impala+RPOCODE=LFR | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR03B,DV-US-SRCTST-AFT03B | Y                |

  @TEST:GMIOMSUS-57745
  Scenario Outline: Program Search WS - V2 Edited Nameplate published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                          | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR04A,DV-US-SRCTST-AFT04A | Y                |

  @TEST:GMIOMSUS-57746
  Scenario Outline: Program Search WS - V2 New Nameplate published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                       | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=US+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-US-SRCTST-AFT05A | Y                |

  @TEST:GMIOMSUS-57747
  Scenario Outline: Program Search WS - V2 Edited Brand published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                             | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR06A,DV-US-SRCTST-AFT06A | Y                |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57748
  Scenario Outline: Program Search WS - V2 Added Brand published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                        | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-US-SRCTST-AFT07A | Y                |

  @issue:GMIOMSUS-57220 @TEST:GMIOMSUS-57749
  Scenario Outline: Program Search WS - V2 Edited Features published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                    | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=AWD | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR08A,DV-US-SRCTST-AFT08A | Y                |

  @TEST:GMIOMSUS-57750
  Scenario Outline: Program Search WS - V2 Edit RPO Tab - Single RPO - 1 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                   | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR10A,DV-US-SRCTST-AFT10A | Y                |

  @TEST:GMIOMSUS-57751
  Scenario Outline: Program Search WS - V2 Added RPO - Single RPO - 1 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                         | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=Suburban+RPOCODE=AA1 | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-US-SRCTST-AFT11A | Y                |

  @TEST:GMIOMSUS-57752
  Scenario Outline: Program Search WS - V2 Edit Multiple RPOs 1 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                 | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR12A,DV-US-SRCTST-AFT12A | Y                |

  @TEST:GMIOMSUS-57753
  Scenario Outline: Program Search WS - V2 Edit Multiple RPOs 2 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                 | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR12B,DV-US-SRCTST-AFT12B | Y                |

  @TEST:GMIOMSUS-57754
  Scenario Outline:  Program Search WS - V2 Added RPO - Single RPO - 2 published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                     | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2018+DIVISION=BUICK+BRAND=LaCrosse+RPOCODE=M3G | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR13A,DV-US-SRCTST-AFT13A | Y                |

  @TEST:GMIOMSUS-57755
  Scenario Outline: Program Search WS - V2 Edit Category published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                         | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=COLORADO+RPOCODE=FVX | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR15A,DV-US-SRCTST-AFT15A | Y                |

  @TEST:GMIOMSUS-57756
  Scenario Outline: Program Search WS - V2 New Category published through Data Viewer US EN
    When he makes a program search list request to the api for the country US using EN
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                      | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=Tahoe+RPOCODE=UE1 | +COUNTRY=US+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-US-SRCTST-AFT16A | Y                |