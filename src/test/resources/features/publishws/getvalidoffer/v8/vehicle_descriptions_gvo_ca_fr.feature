@CanadaOnly @TEST:GMIOMSUS-58736
Feature: Publish WS GVO - V8 Vehicles Published through different tabs using Data Viewer in Canada FR

  Background:
    Given John has access to the vehicle api for country CA using V8

  @TEST:GMIOMSUS-58721
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Search By Features Descriptions Added through Search Tab in Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                   | Request FGD                 | Offer Name             | Offer Returned | Offer Header                        | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT01A-Fré | Y              | 2017 GMC Sierra 1500 CrewOfrDescFré | DV-CA-SRCTST-AFT01A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR01A-Fré    | Y              | 2017 GMC Sierra 1500 CrewOfrDescFré | DV-SRCTST-BFR01A    |

  @TEST:GMIOMSUS-58722
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Search By RPO Descriptions using Single Edit in Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name             | Offer Returned | Offer Header                               | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT02A-Fré | Y              | 2018 CHEVROLET Traverse avec PCVOfrDescFré | DV-CA-SRCTST-AFT02A |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR02A-Fré    | Y              | 2018 CHEVROLET Traverse avec PCVOfrDescFré | DV-SRCTST-BFR02A    |

  @TEST:GMIOMSUS-58723
  Scenario Outline: Scenario Outline: Publish WS  - Get Valid Offer - V8 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                       | Request FGD                 | Offer Name             | Offer Returned | Offer Header                                | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT03A-Fré | Y              | 2018 CHEVROLET Impala avec EngineOfrDescFré | DV-CA-SRCTST-AFT03A |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR03A-Fré    | Y              | 2018 CHEVROLET Impala avec EngineOfrDescFré | DV-SRCTST-BFR03A    |

  @TEST:GMIOMSUS-58724
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                       | Request FGD                 | Offer Name             | Offer Returned | Offer Header                                | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT03B-Fré | Y              | 2017 CHEVROLET Impala avec EngineOfrDescFré | DV-CA-SRCTST-AFT03B |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR03B-Fré    | Y              | 2017 CHEVROLET Impala avec EngineOfrDescFré | DV-SRCTST-BFR03B    |

  @TEST:GMIOMSUS-58725
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edited Nameplate published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                          | Request FGD                 | Offer Name             | Offer Returned | Offer Header              | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT04A-Fré | Y              | 2017 BUICK Regal SedanFré | DV-CA-SRCTST-AFT04A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR04A-Fré    | Y              | 2017 BUICK Regal SedanFré | DV-SRCTST-BFR04A    |

  @TEST:GMIOMSUS-58726
  Scenario Outline: Publish WS  - Get Valid Offer - V8 New Nameplate published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                       | Request FGD                 | Offer Name             | Offer Returned | Offer Header                  | Program Name        |
      | +COUNTRY=CA+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT05A-Fré | Y              | 2019 CADILLAC Escalade ESVFré | DV-CA-SRCTST-AFT05A |

  @TEST:GMIOMSUS-58727
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edited Brand published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name             | Offer Returned | Offer Header                                                      | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT06A-Fré | Y              | 2017 CADILLAC CTS SedanOfrDescFré avec Moteur V6 biturbo de 3,6 L | DV-CA-SRCTST-AFT06A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN             | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR06A-Fré    | Y              | 2017 CADILLAC CTS SedanOfrDescFré                                 | DV-SRCTST-BFR06A    |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-58728
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Added Brand published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                        | Request FGD                 | Offer Name             | Offer Returned | Offer Header                       | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT07A-Fré | Y              | 2017 CHEVROLET Suburban Commercial | DV-CA-SRCTST-AFT07A |

  @TEST:GMIOMSUS-58729
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edited Features published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                                | Request FGD                 | Offer Name             | Offer Returned | Offer Header                              | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT08A-Fré | Y              | 2018 GMC Acadia All Wheel DriveOfrDescFré | DV-CA-SRCTST-AFT08A |
      | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR08A-Fré    | Y              | 2018 GMC Acadia All Wheel DriveOfrDescFré | DV-SRCTST-BFR08A    |

  @TEST:GMIOMSUS-58730
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edit RPO Tab - Single RPO - 1 published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                   | Request FGD                 | Offer Name             | Offer Returned | Offer Header                         | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT10A-Fré | Y              | 2017 GMC Yukon XL avec MYCOfrDescFré | DV-CA-SRCTST-AFT10A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR10A-Fré    | Y              | 2017 GMC Yukon XL avec MYCOfrDescFré | DV-SRCTST-BFR10A    |

  @TEST:GMIOMSUS-58731
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Added RPO - Single RPO - 1 published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name             | Offer Returned | Offer Header                               | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT11A-Fré | Y              | 2018 CHEVROLET Suburban avec AA1OfrDescFré | DV-CA-SRCTST-AFT11A |

  @TEST:GMIOMSUS-58732
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edit Multiple RPOs 1 published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                 | Request FGD                 | Offer Name             | Offer Returned | Offer Header                          | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT12A-Fré | Y              | 2017 GMC Canyon avec EngineOfrDescFré | DV-CA-SRCTST-AFT12A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR12A-Fré    | Y              | 2017 GMC Canyon avec EngineOfrDescFré | DV-SRCTST-BFR12A    |

  @TEST:GMIOMSUS-58732
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edit Multiple RPOs 1 published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                 | Request FGD                 | Offer Name             | Offer Returned | Offer Header                          | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT12B-Fré | Y              | 2017 GMC Canyon avec EngineOfrDescFré | DV-CA-SRCTST-AFT12B |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR12B-Fré    | Y              | 2017 GMC Canyon avec EngineOfrDescFré | DV-SRCTST-BFR12B    |

  @TEST:GMIOMSUS-58733
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Added RPO - Single RPO - 2 published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                     | Request FGD                 | Offer Name             | Offer Returned | Offer Header                           | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT13A-Fré | Y              | 2018 BUICK LaCrosse avec M3GOfrDescFré | DV-CA-SRCTST-AFT13A |
      | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR13A-Fré    | Y              | 2018 BUICK LaCrosse avec M3GOfrDescFré | DV-SRCTST-BFR13A    |

  @TEST:GMIOMSUS-58734
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edit Category published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                  | Request FGD                 | Offer Name             | Offer Returned | Offer Header                        | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT15A-Fré | Y              | 2017 GMC Terrain avec A4FOfrDescFré | DV-CA-SRCTST-AFT15A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR15A-Fré    | Y              | 2017 GMC Terrain avec A4FOfrDescFré | DV-SRCTST-BFR15A    |

  @TEST:GMIOMSUS-58735
  Scenario Outline: Publish WS  - Get Valid Offer - V8 New Category published through Data Viewer CA FR
    When the user has a GVO vehicle request to the api for the country CA using FR
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                      | Request FGD                 | Offer Name             | Offer Returned | Offer Header                            | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT16A-Fré | Y              | 2017 CHEVROLET Tahoe avec UE1OfrDescFré | DV-CA-SRCTST-AFT16A |
