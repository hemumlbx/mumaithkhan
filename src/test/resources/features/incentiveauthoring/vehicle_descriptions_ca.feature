@CanadaOnly @TEST:GMIOMSUS-57344
Feature: Incentive Authoring - Vehicles Published through different tabs using Data Viewer in Canada EN

  Background:
    Given John logs into Incentive Authoring application for CA

  @TEST:GMIOMSUS-57326
  Scenario Outline: Incentive Authoring - Search By Features Descriptions Added through Search Tab in Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT01A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand       | French Brand | Attribute Type        | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | GMC      | Sierra    | null             | Sierra 1500 | Sierra 1500  | Vehicle Feature Codes | cab                | Crew            | CrewIncDescEng      | CrewIncDescFré     |
    Examples:
      | FVD                                                           |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW |

  @TEST:GMIOMSUS-57327
  Scenario Outline: Incentive Authoring - Search By RPO Descriptions using Single Edit in Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT02A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2018 | CHEVROLET | Traverse  | null             | Traverse | Traverse     | Option (RPO) Codes | NO OPTION KIND     | PCV - PCVIncDescEng | PCV                 | PCV                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV |

  @TEST:GMIOMSUS-57328
  Scenario Outline: Incentive Authoring - Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT03A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2018 | CHEVROLET | Impala    | null             | Impala | Impala       | Option (RPO) Codes | Engine             | LCV - EngineIncDescEng | LCV                 | LCV                |
    Examples:
      | FVD                                                               |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV |

  @TEST:GMIOMSUS-57329
  Scenario Outline: Incentive Authoring - Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT03B from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2017 | CHEVROLET | Impala    | null             | Impala | Impala       | Option (RPO) Codes | Engine             | LFR - EngineIncDescEng | LFR                 | LFR                |
    Examples:
      | FVD                                                               |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR |

  @TEST:GMIOMSUS-57330
  Scenario Outline: Incentive Authoring - Edited Nameplate published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT04A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate      | French Nameplate | Brand | French Brand | Attribute Type | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | BUICK    | Regal SedanEng | Regal SedanFré   | null  | null         | null           | null               | null            | null                | null               |
    Examples:
      | FVD                                                  |
      | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL |

  @TEST:GMIOMSUS-57331
  Scenario Outline: Incentive Authoring - New Nameplate published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT05A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate       | French Nameplate | Brand | French Brand | Attribute Type | Attribute Category | Attribute Value | English Description | French Description |
      | 2019 | CADILLAC | Escalade ESVEng | Escalade ESVFré  | null  | null         | null           | null               | null            | null                | null               |
    Examples:
      | FVD                                                               |
      | +COUNTRY=CA+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG |

  @TEST:GMIOMSUS-57332
  Scenario Outline: Incentive Authoring - Edited Brand published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT06A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand               | French Brand        | Attribute Type     | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | CADILLAC | CTS       | CTS              | CTS SedanIncDescEng | CTS SedanIncDescFré | Option (RPO) Codes | Engine             | LF3             | LF3                 | LF3                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57333
  Scenario Outline: Incentive Authoring - Added Brand published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT07A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand               | French Brand        | Attribute Type     | Attribute Category | Attribute Value | English Description | French Description |
      | 2018 | CHEVROLET | Suburban  | Suburban         | Suburban Commercial | Suburban Commercial | Option (RPO) Codes | Engine             | L83             | L83                 | L83                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 |

  @TEST:GMIOMSUS-57334
  Scenario Outline: Incentive Authoring - Edited Features published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT08A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type        | Attribute Category | Attribute Value           | English Description       | French Description        |
      | 2018 | GMC      | Acadia    | Acadia           | Acadia | Acadia       | Vehicle Feature Codes | drivetrain         | All Wheel DriveIncDescEng | All Wheel DriveIncDescEng | All Wheel DriveIncDescFré |
    Examples:
      | FVD                                                                        |
      | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57335
  Scenario: Incentive Authoring - Archived Features published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT09A from Draft folder
    Then he should verify archived features should not be present
      | Year | Division  | Nameplate | French Nameplate | Brand             | French Brand      | Attribute Type        | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | CHEVROLET | Express   | Express          | Express Passenger | Express Passenger | Vehicle Feature Codes | wheelbase          | 155.0           | 155.0               | 155.0              |

  @TEST:GMIOMSUS-57336
  Scenario Outline: Incentive Authoring - Edit RPO Tab - Single RPO - 1 published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT10A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2017 | GMC      | Yukon XL  | Yukon XL         | Yukon XL | Yukon XL     | Option (RPO) Codes | Transmission       | MYC - MYCIncDescEng | MYC                 | MYC                |
    Examples:
      | FVD                                                           |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC |

  @TEST:GMIOMSUS-57337
  Scenario Outline: Incentive Authoring - Added RPO - Single RPO - 1 published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT11A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2018 | CHEVROLET | Suburban  | Suburban         | Suburban | Suburban     | Option (RPO) Codes | Transmission       | AA1 - AA1IncDescEng | AA1                 | AA1                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 |

  @TEST:GMIOMSUS-57338
  Scenario Outline: Incentive Authoring - Edit Multiple RPOs 1 published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT12A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2017 | GMC      | Canyon    | Canyon           | Canyon | Canyon       | Option (RPO) Codes | Engine             | LCV - EngineIncDescEng | LCV                 | LCV                |
    Examples:
      | FVD                                                         |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV |

  @TEST:GMIOMSUS-57339
  Scenario Outline: Incentive Authoring - Edit Multiple RPOs 2 published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT12B from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2017 | GMC      | Canyon    | Canyon           | Canyon | Canyon       | Option (RPO) Codes | Engine             | LWN - EngineIncDescEng | LWN                 | LWN                |
    Examples:
      | FVD                                                         |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN |

  @TEST:GMIOMSUS-57340
  Scenario Outline: Incentive Authoring - Added RPO - Single RPO - 2 published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT13A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2018 | BUICK    | LaCrosse  | LaCrosse         | LaCrosse | LaCrosse     | Option (RPO) Codes | Transmission       | M3G - M3GIncDescEng | M3G                 | M3G                |
    Examples:
      | FVD                                                             |
      | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G |

  @TEST:GMIOMSUS-57341
  Scenario: Incentive Authoring - Archived RPO published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT14A from Draft folder
    Then he should verify archived features should not be present
      | Year | Division  | Nameplate | French Nameplate | Brand   | French Brand | Attribute Type     | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | CHEVROLET | Equinox   | Equinox          | Equinox | Equinox      | Option (RPO) Codes | NO OPTION KIND     | PDR             | PDR                 | PDR                |

  @TEST:GMIOMSUS-57342
  Scenario Outline: Incentive Authoring - Edit Category published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT15A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand   | French Brand | Attribute Type     | Attribute Category    | Attribute Value     | English Description | French Description |
      | 2017 | GMC      | Terrain   | Terrain          | Terrain | Terrain      | Option (RPO) Codes | Fleet Incentive Model | A4F - A4FIncDescEng | A4F                 | A4F                |
    Examples:
      | FVD                                                          |
      | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F |

  @TEST:GMIOMSUS-57343
  Scenario Outline: Incentive Authoring - New Category published through Data Viewer CA EN
    When he edits an existing program DV-CA-SRCTST-AFT16A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2017 | CHEVROLET | Tahoe     | Tahoe            | Tahoe | Tahoe        | Option (RPO) Codes | OnStar             | UE1 - UE1IncDescEng | UE1                 | UE1                |
    Examples:
      | FVD                                                              |
      | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 |