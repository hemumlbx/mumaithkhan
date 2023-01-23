@CanadaOnly @TEST:GMIOMSUS-58816
Feature: Publish WS GVDP - V5 Vehicles Published through different tabs using Data Viewer in Canada EN

  Background:
    Given John has access to the vehicle api for country CA using V5

  @TEST:GMIOMSUS-58801
  Scenario Outline: Publish WS  - GVDP - V5 Search By Features Descriptions Added through Search Tab in Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                   | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR01A,DV-CA-SRCTST-AFT01A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Sierra 1500  includes CrewIncDescEng |

  @TEST:GMIOMSUS-58802
  Scenario Outline: Publish WS  - GVDP - V5 Search By RPO Descriptions using Single Edit in Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR02A,DV-CA-SRCTST-AFT02A |             |               | 1000.0,1000.0   | Y                | 2018 CHEVROLET Traverse  includes PCV |

  @TEST:GMIOMSUS-58803
  Scenario Outline: Publish WS  - GVDP - V5 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                              |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR03A,DV-CA-SRCTST-AFT03A |             |               | 1000.0,1000.0   | Y                | 2018 CHEVROLET Impala  includes LCV |

  @TEST:GMIOMSUS-58804
  Scenario Outline: Publish WS  - GVDP - V5 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                              |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR03B,DV-CA-SRCTST-AFT03B |             |               | 1000.0,1000.0   | Y                | 2017 CHEVROLET Impala  includes LFR |

  @TEST:GMIOMSUS-58805
  Scenario Outline: Publish WS  - GVDP - V5 Edited Nameplate published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                          | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header           |
      | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR04A,DV-CA-SRCTST-AFT04A |             |               | 1000.0,1000.0   | Y                | 2017 BUICK Regal |

  @TEST:GMIOMSUS-58806
  Scenario Outline: Publish WS  - GVDP - V5 New Nameplate published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                       | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                     |
      | +COUNTRY=CA+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT05A |             |               | 1000.0,1000.0   | Y                | 2019 CADILLAC Escalade ESV |

  @TEST:GMIOMSUS-58807
  Scenario Outline: Publish WS  - GVDP - V5 Edited Brand published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                          |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN             | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR06A    |             |               | 1000.0          | Y                | 2017 CADILLAC CTS SedanIncDescEng               |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT06A |             |               | 1000.0,1000.0   | Y                | 2017 CADILLAC CTS SedanIncDescEng  includes LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-58808
  Scenario Outline: Publish WS  - GVDP - V5 Added Brand published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                        | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                             |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT07A |             |               | 1000.0          | Y                | 2017 CHEVROLET Suburban Commercial |

  @issue:GMIOMSUS-57220 @TEST:GMIOMSUS-58809
  Scenario Outline: Publish WS  - GVDP - V5 Edited Features published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                                | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                              |
      | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR08A,DV-CA-SRCTST-AFT08A |             |               | 1000.0,1000.0   | Y                | 2018 GMC Acadia  includes All Wheel DriveIncDescEng |

  @TEST:GMIOMSUS-58810
  Scenario Outline: Publish WS  - GVDP - V5 Edit RPO Tab - Single RPO - 1 published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                   | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                          |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR10A,DV-CA-SRCTST-AFT10A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Yukon XL  includes MYC |

  @TEST:GMIOMSUS-58811
  Scenario Outline: Publish WS  - GVDP - V5 Added RPO - Single RPO - 1 published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                         | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                                |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT11A |             |               | 1000.0          | Y                | 2018 CHEVROLET Suburban  includes AA1 |

  @TEST:GMIOMSUS-58812
  Scenario Outline: Publish WS  - GVDP - V5 Edit Multiple RPOs 1 published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                 | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR12A,DV-CA-SRCTST-AFT12A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Canyon  includes LCV |

  @TEST:GMIOMSUS-58812
  Scenario Outline: Publish WS  - GVDP - V5 Edit Multiple RPOs 1 published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                 | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR12B,DV-CA-SRCTST-AFT12B |             |               | 1000.0,1000.0   | Y                | 2017 GMC Canyon  includes LWN |

  @TEST:GMIOMSUS-58813
  Scenario Outline: Publish WS  - GVDP - V5 Added RPO - Single RPO - 2 published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                     | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                            |
      | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR13A,DV-CA-SRCTST-AFT13A |             |               | 1000.0,1000.0   | Y                | 2018 BUICK LaCrosse  includes M3G |

  @TEST:GMIOMSUS-58814
  Scenario Outline: Publish WS  - GVDP - V5 Edit Category published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                  | Request FGD                 | Program ID                           | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                         |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | +COUNTRY=CA+REGION=NATIONAL | DV-SRCTST-BFR15A,DV-CA-SRCTST-AFT15A |             |               | 1000.0,1000.0   | Y                | 2017 GMC Terrain  includes A4F |

  @TEST:GMIOMSUS-58815
  Scenario Outline: Publish WS  - GVDP - V5 New Category published through Data Viewer CA EN
    When the user has a GVD Permutation vehicle request to make to the api for the country CA using EN
      | Request FVD   | Request FGD   | Program ID   | Program GVD   | Incentive FVD   | Incentive Value   | Program Returned   | Header   |
      | <Request FVD> | <Request FGD> | <Program ID> | <Program GVD> | <Incentive FVD> | <Incentive Value> | <Program Returned> | <Header> |
    And the user makes a GVD Permutation vehicle request
    Then the user should see the appropriate GVD Permutation vehicle return data from the request
    Examples:
      | Request FVD                                                      | Request FGD                 | Program ID          | Program GVD | Incentive FVD | Incentive Value | Program Returned | Header                             |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-SRCTST-AFT16A |             |               | 1000.0          | Y                | 2017 CHEVROLET Tahoe  includes UE1 |