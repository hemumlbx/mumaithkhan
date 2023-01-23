@CanadaOnly @TEST:GMIOMSUS-57498
Feature: Offer Authoring - Vehicles Published through different tabs using Data Viewer in Canada EN

  Background:
    Given John logs into Offer Authoring application for CA

  @TEST:GMIOMSUS-57480
  Scenario Outline: Offer Authoring - Search By Features Descriptions Added through Search Tab in Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT01A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT01A
      | Year | Division | Nameplate | French Nameplate | Brand       | French Brand | Attribute Type        | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | GMC      | Sierra    | null             | Sierra 1500 | Sierra 1500  | Vehicle Feature Codes | cab                | Crew            | CrewOfrDescEng      | CrewOfrDescFré     |
    Examples:
      | FVD                                                           |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW |

  @TEST:GMIOMSUS-57481
  Scenario Outline: Offer Authoring - Search By RPO Descriptions using Single Edit in Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT02A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT02A
      | Year | Division  | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2018 | CHEVROLET | Traverse  | null             | Traverse | Traverse     | Option (RPO) Codes | NO OPTION KIND     | PCV - PCVOfrDescEng | PCVOfrDescEng       | PCVOfrDescFré      |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV |

  @TEST:GMIOMSUS-57482
  Scenario Outline: Offer Authoring - Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT03A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT03A
      | Year | Division  | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2018 | CHEVROLET | Impala    | null             | Impala | Impala       | Option (RPO) Codes | Engine             | LCV - EngineOfrDescEng | EngineOfrDescEng    | EngineOfrDescFré   |
    Examples:
      | FVD                                                               |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV |

  @TEST:GMIOMSUS-57483
  Scenario Outline: Offer Authoring - Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT03B from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT03B
      | Year | Division  | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2017 | CHEVROLET | Impala    | null             | Impala | Impala       | Option (RPO) Codes | Engine             | LFR - EngineOfrDescEng | EngineOfrDescEng    | EngineOfrDescFré   |
    Examples:
      | FVD                                                               |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR |

  @TEST:GMIOMSUS-57484
  Scenario Outline: Offer Authoring - Edited Nameplate published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT04A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT04A
      | Year | Division | Nameplate      | French Nameplate | Brand | French Brand | Attribute Type | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | BUICK    | Regal SedanEng | Regal SedanFré   | null  | null         | null           | null               | null            | null                | null               |
    Examples:
      | FVD                                                  |
      | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL |

  @TEST:GMIOMSUS-57485
  Scenario Outline: Offer Authoring - New Nameplate published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT05A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT05A
      | Year | Division | Nameplate       | French Nameplate | Brand | French Brand | Attribute Type | Attribute Category | Attribute Value | English Description | French Description |
      | 2019 | CADILLAC | Escalade ESVEng | Escalade ESVFré  | null  | null         | null           | null               | null            | null                | null               |
    Examples:
      | FVD                                                               |
      | +COUNTRY=CA+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG |

  @TEST:GMIOMSUS-57486
  Scenario Outline: Offer Authoring - Edited Brand published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT06A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT06A
      | Year | Division | Nameplate | French Nameplate | Brand               | French Brand        | Attribute Type     | Attribute Category | Attribute Value | English Description       | French Description         |
      | 2017 | CADILLAC | CTS       | CTS              | CTS SedanOfrDescEng | CTS SedanOfrDescFré | Option (RPO) Codes | Engine             | LF3             | 3.6L V6 Twin Turbo engine | Moteur V6 biturbo de 3,6 L |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57487
  Scenario Outline: Offer Authoring - Added Brand published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT07A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT07A
      | Year | Division  | Nameplate | French Nameplate | Brand               | French Brand        | Attribute Type     | Attribute Category | Attribute Value | English Description | French Description |
      | 2018 | CHEVROLET | Suburban  | Suburban         | Suburban Commercial | Suburban Commercial | Option (RPO) Codes | Engine             | L83             | L83                 | L83                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 |

  @TEST:GMIOMSUS-57488
  Scenario Outline: Offer Authoring - Edited Features published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT08A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT08A
      | Year | Division | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type        | Attribute Category | Attribute Value           | English Description       | French Description        |
      | 2018 | GMC      | Acadia    | Acadia           | Acadia | Acadia       | Vehicle Feature Codes | drivetrain         | All Wheel DriveOfrDescEng | All Wheel DriveOfrDescEng | All Wheel DriveOfrDescFré |
    Examples:
      | FVD                                                                        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57489
  Scenario: Offer Authoring - Archived Features published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT09A from Draft folder
    Then he should verify archived offer features should not be present
      | Year | Division  | Nameplate | French Nameplate | Brand             | French Brand      | Attribute Type        | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | CHEVROLET | Express   | Express          | Express Passenger | Express Passenger | Vehicle Feature Codes | wheelbase          | 155.0           | 155.0               | 155.0              |

  @TEST:GMIOMSUS-57490
  Scenario Outline: Offer Authoring - Edit RPO Tab - Single RPO - 1 published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT10A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT10A
      | Year | Division | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2017 | GMC      | Yukon XL  | Yukon XL         | Yukon XL | Yukon XL     | Option (RPO) Codes | Transmission       | MYC - MYCOfrDescEng | MYCOfrDescEng       | MYCOfrDescFré      |
    Examples:
      | FVD                                                           |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC |

  @TEST:GMIOMSUS-57491
  Scenario Outline: Offer Authoring - Added RPO - Single RPO - 1 published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT11A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT11A
      | Year | Division  | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2018 | CHEVROLET | Suburban  | Suburban         | Suburban | Suburban     | Option (RPO) Codes | Transmission       | AA1 - AA1OfrDescEng | AA1OfrDescEng       | AA1OfrDescFré      |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 |

  @TEST:GMIOMSUS-57492
  Scenario Outline: Offer Authoring - Edit Multiple RPOs 1 published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT12A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT12A
      | Year | Division | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2017 | GMC      | Canyon    | Canyon           | Canyon | Canyon       | Option (RPO) Codes | Engine             | LCV - EngineOfrDescEng | EngineOfrDescEng    | EngineOfrDescFré   |
    Examples:
      | FVD                                                         |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV |

  @TEST:GMIOMSUS-57493
  Scenario Outline: Offer Authoring - Edit Multiple RPOs 2 published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT12B from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT12B
      | Year | Division | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2017 | GMC      | Canyon    | Canyon           | Canyon | Canyon       | Option (RPO) Codes | Engine             | LWN - EngineOfrDescEng | EngineOfrDescEng    | EngineOfrDescFré   |
    Examples:
      | FVD                                                         |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN |

  @TEST:GMIOMSUS-57494
  Scenario Outline: Offer Authoring - Added RPO - Single RPO - 2 published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT13A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT13A
      | Year | Division | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2018 | BUICK    | LaCrosse  | LaCrosse         | LaCrosse | LaCrosse     | Option (RPO) Codes | Transmission       | M3G - M3GOfrDescEng | M3GOfrDescEng       | M3GOfrDescFré      |
    Examples:
      | FVD                                                             |
      | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G |

  @TEST:GMIOMSUS-57495
  Scenario: Offer Authoring - Archived RPO published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT14A from Draft folder
    Then he should verify archived offer features should not be present
      | Year | Division  | Nameplate | French Nameplate | Brand   | French Brand | Attribute Type     | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | CHEVROLET | Equinox   | Equinox          | Equinox | Equinox      | Option (RPO) Codes | NO OPTION KIND     | PDR             | PDR                 | PDR                |

  @TEST:GMIOMSUS-57496
  Scenario Outline: Offer Authoring - Edit Category published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT15A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT15A
      | Year | Division | Nameplate | French Nameplate | Brand   | French Brand | Attribute Type     | Attribute Category    | Attribute Value     | English Description | French Description |
      | 2017 | GMC      | Terrain   | Terrain          | Terrain | Terrain      | Option (RPO) Codes | Fleet Incentive Model | A4F - A4FOfrDescEng | A4FOfrDescEng       | A4FOfrDescFré      |
    Examples:
      | FVD                                                          |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F |

  @TEST:GMIOMSUS-57497
  Scenario Outline: Offer Authoring - New Category published through Data Viewer CA EN
    When he edits an existing offer DV-CA-OFFER-AFT16A from Draft folder
    Then he should verify the offer descriptions for the following vehicle selection for <FVD> using program DV-CA-SRCTST-AFT16A
      | Year | Division  | Nameplate | French Nameplate | Brand | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2017 | CHEVROLET | Tahoe     | Tahoe            | Tahoe | Tahoe        | Option (RPO) Codes | OnStar             | UE1 - UE1OfrDescEng | UE1OfrDescEng       | UE1OfrDescFré      |
    Examples:
      | FVD                                                              |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 |