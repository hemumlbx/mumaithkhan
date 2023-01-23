@CanadaOnly @TEST:GMIOMSUS-57842
Feature: Program Search WS - V4 List - Vehicles Published through different tabs using Data Viewer in Canada FR

  Background:
    Given John has access to the search api at V4 in CA

  @TEST:GMIOMSUS-57826
  Scenario Outline: Program Search WS - V4 Search By Features Descriptions Added through Search Tab in Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                   | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR01A,DV-CA-SRCTST-AFT01A | Y                |

  @TEST:GMIOMSUS-57827
  Scenario Outline: Program Search WS - V4 Search By RPO Descriptions using Single Edit in Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                         | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=Traverse+RPOCODE=PCV | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR02A,DV-CA-SRCTST-AFT02A | Y                |

  @TEST:GMIOMSUS-57828
  Scenario Outline: Program Search WS - V4 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                       | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=Impala+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR03A,DV-CA-SRCTST-AFT03A | Y                |

  @TEST:GMIOMSUS-57829
  Scenario Outline: Program Search WS - V4 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                       | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=Impala+RPOCODE=LFR | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR03B,DV-CA-SRCTST-AFT03B | Y                |

  @TEST:GMIOMSUS-57830
  Scenario Outline: Program Search WS - V4 Edited Nameplate published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                          | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR04A,DV-CA-SRCTST-AFT04A | Y                |

  @TEST:GMIOMSUS-57831
  Scenario Outline: Program Search WS - V4 New Nameplate published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                       | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=CA+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-CA-SRCTST-AFT05A | Y                |

  @TEST:GMIOMSUS-57832
  Scenario Outline: Program Search WS - V4 Edited Brand published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                             | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR06A,DV-CA-SRCTST-AFT06A | Y                |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57833
  Scenario Outline: Program Search WS - V4 Added Brand published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                        | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-CA-SRCTST-AFT07A | Y                |

  @issue:GMIOMSUS-57220 @TEST:GMIOMSUS-57834
  Scenario Outline: Program Search WS - V4 Edited Features published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                                | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR08A,DV-CA-SRCTST-AFT08A | Y                |

  @TEST:GMIOMSUS-57835
  Scenario Outline: Program Search WS - V4 Edit RPO Tab - Single RPO - 1 published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                   | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR10A,DV-CA-SRCTST-AFT10A | Y                |

  @TEST:GMIOMSUS-57836
  Scenario Outline: Program Search WS - V4 Added RPO - Single RPO - 1 published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                         | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=Suburban+RPOCODE=AA1 | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-CA-SRCTST-AFT11A | Y                |

  @TEST:GMIOMSUS-57837
  Scenario Outline: Program Search WS - V4 Edit Multiple RPOs 1 published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                 | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR12A,DV-CA-SRCTST-AFT12A | Y                |

  @TEST:GMIOMSUS-57838
  Scenario Outline: Program Search WS - V4 Edit Multiple RPOs 2 published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                 | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR12B,DV-CA-SRCTST-AFT12B | Y                |

  @TEST:GMIOMSUS-57839
  Scenario Outline:  Program Search WS - V4 Added RPO - Single RPO - 2 published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                     | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LaCrosse+RPOCODE=M3G | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR13A,DV-CA-SRCTST-AFT13A | Y                |

  @TEST:GMIOMSUS-57840
  Scenario Outline: Program Search WS - V4 Edit Category published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                  | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID                           | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=Terrain+RPOCODE=A4F | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-SRCTST-BFR15A,DV-CA-SRCTST-AFT15A | Y                |

  @TEST:GMIOMSUS-57841
  Scenario Outline: Program Search WS - V4 New Category published through Data Viewer CA FR
    When he makes a program search list request to the api for the country CA using FR
      | Request FVD   | Request GVD   | Audience   | Consumer Visibility   | Display Region   | Recipient   | Program Type   | Purchase Type   | Delivery Type   | Inventory Status   | Order Type   | Financial Provider   | Tiered Rate List   | Model Years   | Customer Type   | Conquest Vehicle List   | Loyalty Vehicle List   | Program ID   | Program Returned   |
      | <Request FVD> | <Request GVD> | <Audience> | <Consumer Visibility> | <Display Region> | <Recipient> | <Program Type> | <Purchase Type> | <Delivery Type> | <Inventory Status> | <Order Type> | <Financial Provider> | <Tiered Rate List> | <Model Years> | <Customer Type> | <Conquest Vehicle List> | <Loyalty Vehicle List> | <Program ID> | <Program Returned> |
    Then he should see the appropriate program id returned from the request
    Examples:
      | Request FVD                                                      | Request GVD                 | Audience | Consumer Visibility | Display Region | Recipient | Program Type | Purchase Type | Delivery Type | Inventory Status | Order Type | Financial Provider | Tiered Rate List | Model Years | Customer Type | Conquest Vehicle List | Loyalty Vehicle List | Program ID          | Program Returned |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=Tahoe+RPOCODE=UE1 | +COUNTRY=CA+REGION=NATIONAL | All      | All                 | All            | All       | All          | All           | All           | All              | All        | All                | All              | All         | All           | All                   | All                  | DV-CA-SRCTST-AFT16A | Y                |