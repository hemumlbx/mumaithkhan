@CanadaOnly @TEST:GMIOMSUS-58720
Feature: Publish WS GVO - V8 Vehicles Published through different tabs using Data Viewer in Canada EN

  Background:
    Given John has access to the vehicle api for country CA using V8

  @TEST:GMIOMSUS-58705
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Search By Features Descriptions Added through Search Tab in Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                   | Request FGD                 | Offer Name             | Offer Returned | Offer Header                        | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT01A-Eng | Y              | 2017 GMC Sierra 1500 CrewOfrDescEng | DV-CA-SRCTST-AFT01A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR01A-Eng    | Y              | 2017 GMC Sierra 1500 CrewOfrDescEng | DV-SRCTST-BFR01A    |

  @TEST:GMIOMSUS-58706
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Search By RPO Descriptions using Single Edit in Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name             | Offer Returned | Offer Header                            | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT02A-Eng | Y              | 2018 CHEVROLET Traverse w/PCVOfrDescEng | DV-CA-SRCTST-AFT02A |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR02A-Eng    | Y              | 2018 CHEVROLET Traverse w/PCVOfrDescEng | DV-SRCTST-BFR02A    |

  @TEST:GMIOMSUS-58707
  Scenario Outline: Scenario Outline: Publish WS  - Get Valid Offer - V8 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                       | Request FGD                 | Offer Name             | Offer Returned | Offer Header                             | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT03A-Eng | Y              | 2018 CHEVROLET Impala w/EngineOfrDescEng | DV-CA-SRCTST-AFT03A |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR03A-Eng    | Y              | 2018 CHEVROLET Impala w/EngineOfrDescEng | DV-SRCTST-BFR03A    |

  @TEST:GMIOMSUS-58708
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                       | Request FGD                 | Offer Name             | Offer Returned | Offer Header                             | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT03B-Eng | Y              | 2017 CHEVROLET Impala w/EngineOfrDescEng | DV-CA-SRCTST-AFT03B |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR03B-Eng    | Y              | 2017 CHEVROLET Impala w/EngineOfrDescEng | DV-SRCTST-BFR03B    |

  @TEST:GMIOMSUS-58709
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edited Nameplate published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                          | Request FGD                 | Offer Name             | Offer Returned | Offer Header              | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT04A-Eng | Y              | 2017 BUICK Regal SedanEng | DV-CA-SRCTST-AFT04A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR04A-Eng    | Y              | 2017 BUICK Regal SedanEng | DV-SRCTST-BFR04A    |

  @TEST:GMIOMSUS-58710
  Scenario Outline: Publish WS  - Get Valid Offer - V8 New Nameplate published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                       | Request FGD                 | Offer Name             | Offer Returned | Offer Header                  | Program Name        |
      | +COUNTRY=CA+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT05A-Eng | Y              | 2019 CADILLAC Escalade ESVEng | DV-CA-SRCTST-AFT05A |

  @TEST:GMIOMSUS-58711
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edited Brand published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name             | Offer Returned | Offer Header                                                  | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT06A-Eng | Y              | 2017 CADILLAC CTS SedanOfrDescEng w/3.6L V6 Twin Turbo engine | DV-CA-SRCTST-AFT06A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN             | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR06A-Eng    | Y              | 2017 CADILLAC CTS SedanOfrDescEng                             | DV-SRCTST-BFR06A    |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-58712
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Added Brand published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                        | Request FGD                 | Offer Name             | Offer Returned | Offer Header                       | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT07A-Eng | Y              | 2017 CHEVROLET Suburban Commercial | DV-CA-SRCTST-AFT07A |

  @TEST:GMIOMSUS-58713
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edited Features published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                                | Request FGD                 | Offer Name             | Offer Returned | Offer Header                              | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT08A-Eng | Y              | 2018 GMC Acadia All Wheel DriveOfrDescEng | DV-CA-SRCTST-AFT08A |
      | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR08A-Eng    | Y              | 2018 GMC Acadia All Wheel DriveOfrDescEng | DV-SRCTST-BFR08A    |

  @TEST:GMIOMSUS-58714
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edit RPO Tab - Single RPO - 1 published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                   | Request FGD                 | Offer Name             | Offer Returned | Offer Header                      | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT10A-Eng | Y              | 2017 GMC Yukon XL w/MYCOfrDescEng | DV-CA-SRCTST-AFT10A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR10A-Eng    | Y              | 2017 GMC Yukon XL w/MYCOfrDescEng | DV-SRCTST-BFR10A    |

  @TEST:GMIOMSUS-58715
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Added RPO - Single RPO - 1 published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                         | Request FGD                 | Offer Name             | Offer Returned | Offer Header                            | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT11A-Eng | Y              | 2018 CHEVROLET Suburban w/AA1OfrDescEng | DV-CA-SRCTST-AFT11A |

  @TEST:GMIOMSUS-58716
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edit Multiple RPOs 1 published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                 | Request FGD                 | Offer Name             | Offer Returned | Offer Header                       | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT12A-Eng | Y              | 2017 GMC Canyon w/EngineOfrDescEng | DV-CA-SRCTST-AFT12A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR12A-Eng    | Y              | 2017 GMC Canyon w/EngineOfrDescEng | DV-SRCTST-BFR12A    |

  @TEST:GMIOMSUS-58716
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edit Multiple RPOs 1 published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                 | Request FGD                 | Offer Name             | Offer Returned | Offer Header                       | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT12B-Eng | Y              | 2017 GMC Canyon w/EngineOfrDescEng | DV-CA-SRCTST-AFT12B |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR12B-Eng    | Y              | 2017 GMC Canyon w/EngineOfrDescEng | DV-SRCTST-BFR12B    |

  @TEST:GMIOMSUS-58717
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Added RPO - Single RPO - 2 published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                     | Request FGD                 | Offer Name             | Offer Returned | Offer Header                        | Program Name        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT13A-Eng | Y              | 2018 BUICK LaCrosse w/M3GOfrDescEng | DV-CA-SRCTST-AFT13A |
      | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR13A-Eng    | Y              | 2018 BUICK LaCrosse w/M3GOfrDescEng | DV-SRCTST-BFR13A    |

  @TEST:GMIOMSUS-58718
  Scenario Outline: Publish WS  - Get Valid Offer - V8 Edit Category published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                  | Request FGD                 | Offer Name             | Offer Returned | Offer Header                     | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT15A-Eng | Y              | 2017 GMC Terrain w/A4FOfrDescEng | DV-CA-SRCTST-AFT15A |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | +COUNTRY=CA+REGION=NATIONAL | DV-OFFER-BFR15A-Eng    | Y              | 2017 GMC Terrain w/A4FOfrDescEng | DV-SRCTST-BFR15A    |

  @TEST:GMIOMSUS-58719
  Scenario Outline: Publish WS  - Get Valid Offer - V8 New Category published through Data Viewer CA EN
    When the user has a GVO vehicle request to the api for the country CA using EN
      | Request FVD   | Request FGD   |
      | <Request FVD> | <Request FGD> |
    And the user makes a request for GVO vehicle
    Then the user should see the appropriate GVO vehicle data return from the request
      | Offer Name   | Offer Returned   | Offer Header   | Program Name   |
      | <Offer Name> | <Offer Returned> | <Offer Header> | <Program Name> |
    Examples:
      | Request FVD                                                      | Request FGD                 | Offer Name             | Offer Returned | Offer Header                         | Program Name        |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 | +COUNTRY=CA+REGION=NATIONAL | DV-CA-OFFER-AFT16A-Eng | Y              | 2017 CHEVROLET Tahoe w/UE1OfrDescEng | DV-CA-SRCTST-AFT16A |
