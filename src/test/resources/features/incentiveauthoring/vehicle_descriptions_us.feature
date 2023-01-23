@USOnly @TEST:GMIOMSUS-57363
Feature: Incentive Authoring - Vehicles Published through different tabs using Data Viewer in US EN

  Background:
    Given John logs into Incentive Authoring application for US

  @TEST:GMIOMSUS-57345
  Scenario Outline: Incentive Authoring - Search By Features Descriptions Added through Search Tab in Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT01A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand       | French Brand | Attribute Type        | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | GMC      | Sierra    | null             | Sierra 1500 | Sierra 1500  | Vehicle Feature Codes | cab                | Crew            | CrewIncDescEng      | CrewIncDescFré     |
    Examples:
      | FVD                                                           |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW |

  @TEST:GMIOMSUS-57346
  Scenario Outline: Incentive Authoring - Search By RPO Descriptions using Single Edit in Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT02A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2018 | CHEVROLET | Traverse  | null             | Traverse | Traverse     | Option (RPO) Codes | NO OPTION KIND     | PCV - PCVIncDescEng | PCV                 | PCV                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV |

  @TEST:GMIOMSUS-57347
  Scenario Outline: Incentive Authoring - Search By RPO Descriptions using Multiple Edits 1 in Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT03A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2018 | CHEVROLET | Impala    | null             | Impala | Impala       | Option (RPO) Codes | Engine             | LCV - EngineIncDescEng | LCV                 | LCV                |
    Examples:
      | FVD                                                               |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV |

  @TEST:GMIOMSUS-57348
  Scenario Outline: Incentive Authoring - Search By RPO Descriptions using Multiple Edits 2 in Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT03B from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2017 | CHEVROLET | Impala    | null             | Impala | Impala       | Option (RPO) Codes | Engine             | LFR - EngineIncDescEng | LFR                 | LFR                |
    Examples:
      | FVD                                                               |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR |

  @TEST:GMIOMSUS-57349
  Scenario Outline: Incentive Authoring - Edited Nameplate published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT04A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate      | French Nameplate | Brand | French Brand | Attribute Type | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | BUICK    | Regal SedanEng | Regal SedanFré   | null  | null         | null           | null               | null            | null                | null               |
    Examples:
      | FVD                                                  |
      | +COUNTRY=US+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL |

  @TEST:GMIOMSUS-57350
  Scenario Outline: Incentive Authoring - New Nameplate published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT05A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate       | French Nameplate | Brand | French Brand | Attribute Type | Attribute Category | Attribute Value | English Description | French Description |
      | 2019 | CADILLAC | Escalade ESVEng | Escalade ESVFré  | null  | null         | null           | null               | null            | null                | null               |
    Examples:
      | FVD                                                               |
      | +COUNTRY=US+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG |

  @TEST:GMIOMSUS-57351
  Scenario Outline: Incentive Authoring - Edited Brand published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT06A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand               | French Brand        | Attribute Type     | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | CADILLAC | CTS       | CTS              | CTS SedanIncDescEng | CTS SedanIncDescFré | Option (RPO) Codes | Engine             | LF3             | LF3                 | LF3                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57352
  Scenario Outline: Incentive Authoring - Added Brand published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT07A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand               | French Brand        | Attribute Type     | Attribute Category | Attribute Value | English Description | French Description |
      | 2018 | CHEVROLET | Suburban  | Suburban         | Suburban Commercial | Suburban Commercial | Option (RPO) Codes | Engine             | L83             | L83                 | L83                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=US+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 |

  @TEST:GMIOMSUS-57353
  Scenario Outline: Incentive Authoring - Edited Features published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT08A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type        | Attribute Category | Attribute Value | English Description | French Description |
      | 2018 | GMC      | Acadia    | Acadia           | Acadia | Acadia       | Vehicle Feature Codes | drivetrain         | AWDIncDescEng   | AWDIncDescEng       | AWDIncDescFré      |
    Examples:
      | FVD                                                            |
      | +COUNTRY=US+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=AWD |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57354
  Scenario: Incentive Authoring - Archived Features published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT09A from Draft folder
    Then he should verify archived features should not be present
      | Year | Division  | Nameplate | French Nameplate | Brand             | French Brand      | Attribute Type        | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | CHEVROLET | Express   | Express          | Express Passenger | Express Passenger | Vehicle Feature Codes | wheelbase          | 155.00          | 155.00              | 155.00             |

  @TEST:GMIOMSUS-57355
  Scenario Outline: Incentive Authoring - Edit RPO Tab - Single RPO - 1 published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT10A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2017 | GMC      | Yukon XL  | Yukon XL         | Yukon XL | Yukon XL     | Option (RPO) Codes | Transmission       | MYC - MYCIncDescEng | MYC                 | MYC                |
    Examples:
      | FVD                                                           |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC |

  @TEST:GMIOMSUS-57356
  Scenario Outline: Incentive Authoring - Added RPO - Single RPO - 1 published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT11A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2018 | CHEVROLET | Suburban  | Suburban         | Suburban | Suburban     | Option (RPO) Codes | Transmission       | AA1 - AA1IncDescEng | AA1                 | AA1                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=US+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 |

  @TEST:GMIOMSUS-57357
  Scenario Outline: Incentive Authoring - Edit Multiple RPOs 1 published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT12A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2017 | GMC      | Canyon    | Canyon           | Canyon | Canyon       | Option (RPO) Codes | Engine             | LCV - EngineIncDescEng | LCV                 | LCV                |
    Examples:
      | FVD                                                         |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV |

  @TEST:GMIOMSUS-57358
  Scenario Outline: Incentive Authoring - Edit Multiple RPOs 2 published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT12B from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand  | French Brand | Attribute Type     | Attribute Category | Attribute Value        | English Description | French Description |
      | 2017 | GMC      | Canyon    | Canyon           | Canyon | Canyon       | Option (RPO) Codes | Engine             | LWN - EngineIncDescEng | LWN                 | LWN                |
    Examples:
      | FVD                                                         |
      | +COUNTRY=US+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN |

  @TEST:GMIOMSUS-57359
  Scenario Outline: Incentive Authoring - Added RPO - Single RPO - 2 published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT13A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2018 | BUICK    | LaCrosse  | LaCrosse         | LaCrosse | LaCrosse     | Option (RPO) Codes | Transmission       | M3G - M3GIncDescEng | M3G                 | M3G                |
    Examples:
      | FVD                                                             |
      | +COUNTRY=US+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G |

  @TEST:GMIOMSUS-57360
  Scenario: Incentive Authoring - Archived RPO published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT14A from Draft folder
    Then he should verify archived features should not be present
      | Year | Division  | Nameplate | French Nameplate | Brand   | French Brand | Attribute Type     | Attribute Category | Attribute Value | English Description | French Description |
      | 2017 | CHEVROLET | Equinox   | Equinox          | Equinox | Equinox      | Option (RPO) Codes | NO OPTION KIND     | PDD             | PDD                 | PDD                |

  @TEST:GMIOMSUS-57361
  Scenario Outline: Incentive Authoring - Edit Category published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT15A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand    | French Brand | Attribute Type     | Attribute Category    | Attribute Value     | English Description | French Description |
      | 2017 | CHEVROLET | Colorado  | Colorado         | Colorado | Colorado     | Option (RPO) Codes | Fleet Incentive Model | FVX - FVXIncDescEng | FVX                 | FVX                |
    Examples:
      | FVD                                                                 |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=COLORADO+RPOCODE=FVX |

  @TEST:GMIOMSUS-57362
  Scenario Outline: Incentive Authoring - New Category published through Data Viewer US EN
    When he edits an existing program DV-US-SRCTST-AFT16A from Draft folder
    Then he should verify the descriptions for the following vehicle selection for <FVD>
      | Year | Division  | Nameplate | French Nameplate | Brand | French Brand | Attribute Type     | Attribute Category | Attribute Value     | English Description | French Description |
      | 2017 | CHEVROLET | Tahoe     | Tahoe            | Tahoe | Tahoe        | Option (RPO) Codes | OnStar             | UE1 - UE1IncDescEng | UE1                 | UE1                |
    Examples:
      | FVD                                                              |
      | +COUNTRY=US+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 |