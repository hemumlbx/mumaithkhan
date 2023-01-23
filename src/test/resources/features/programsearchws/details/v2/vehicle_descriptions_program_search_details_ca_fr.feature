@CanadaOnly @TEST:GMIOMSUS-57587
Feature: Program Search WS Details - V2 Vehicles Published through different tabs using Data Viewer in Canada FR

  Background:
    Given John has access to the search api at V2 in CA

  @TEST:GMIOMSUS-57571
  Scenario Outline: Program Search WS - Details - V2 Search By Features Descriptions Added through Search Tab in Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                           | vehicleDescription                  | vehicleChangeInd |
      | DV-SRCTST-BFR01A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | 2017 GMC Sierra 1500 CrewIncDescFré | false            |
      | DV-CA-SRCTST-AFT01A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | 2017 GMC Sierra 1500 CrewIncDescFré | false            |

  @TEST:GMIOMSUS-57572
  Scenario Outline: Program Search WS - Details - V2 Search By RPO Descriptions using Single Edit in Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                 | vehicleDescription                | vehicleChangeInd |
      | DV-SRCTST-BFR02A    | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | 2018 CHEVROLET Traverse  avec PCV | false            |
      | DV-CA-SRCTST-AFT02A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | 2018 CHEVROLET Traverse  avec PCV | false            |

  @TEST:GMIOMSUS-57573
  Scenario Outline: Program Search WS - Details - V2 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                               | vehicleDescription              | vehicleChangeInd |
      | DV-SRCTST-BFR03A    | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | 2018 CHEVROLET Impala  avec LCV | false            |
      | DV-CA-SRCTST-AFT03A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | 2018 CHEVROLET Impala  avec LCV | false            |

  @TEST:GMIOMSUS-57574
  Scenario Outline: Program Search WS - Details - V2 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                               | vehicleDescription              | vehicleChangeInd |
      | DV-SRCTST-BFR03B    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | 2017 CHEVROLET Impala  avec LFR | false            |
      | DV-CA-SRCTST-AFT03B | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | 2017 CHEVROLET Impala  avec LFR | false            |

  @TEST:GMIOMSUS-57575
  Scenario Outline: Program Search WS - Details - V2 Edited Nameplate published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                  | vehicleDescription        | vehicleChangeInd |
      | DV-SRCTST-BFR04A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | 2017 BUICK Regal SedanFré | false            |
      | DV-CA-SRCTST-AFT04A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | 2017 BUICK Regal SedanFré | false            |

  @TEST:GMIOMSUS-57576
  Scenario Outline: Program Search WS - Details - V2 New Nameplate published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                               | vehicleDescription            | vehicleChangeInd |
      | DV-CA-SRCTST-AFT05A | 0                     | +COUNTRY=CA+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | 2019 CADILLAC Escalade ESVFré | false            |

  @TEST:GMIOMSUS-57577
  Scenario Outline: Program Search WS - Details - V2 Edited Brand published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                 | vehicleDescription                          | vehicleChangeInd |
      | DV-SRCTST-BFR06A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN             | 2017 CADILLAC CTS SedanIncDescFré           | false            |
      | DV-CA-SRCTST-AFT06A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 | 2017 CADILLAC CTS SedanIncDescFré  avec LF3 | false            |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57578
  Scenario Outline: Program Search WS - Details - V2 Added Brand published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                | vehicleDescription                 | vehicleChangeInd |
      | DV-CA-SRCTST-AFT07A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | 2017 CHEVROLET Suburban Commercial | false            |

  @issue:GMIOMSUS-57220 @TEST:GMIOMSUS-57579
  Scenario Outline: Program Search WS - Details - V2 Edited Features published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                        | vehicleDescription                        | vehicleChangeInd |
      | DV-SRCTST-BFR08A    | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | 2018 GMC Acadia All Wheel DriveIncDescFré | false            |
      | DV-CA-SRCTST-AFT08A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | 2018 GMC Acadia All Wheel DriveIncDescFré | false            |

  @TEST:GMIOMSUS-57580
  Scenario Outline: Program Search WS - Details - V2 Edit RPO Tab - Single RPO - 1 published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                           | vehicleDescription          | vehicleChangeInd |
      | DV-SRCTST-BFR10A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | 2017 GMC Yukon XL  avec MYC | false            |
      | DV-CA-SRCTST-AFT10A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | 2017 GMC Yukon XL  avec MYC | false            |

  @TEST:GMIOMSUS-57581
  Scenario Outline: Program Search WS - Details - V2 Added RPO - Single RPO - 1 published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                 | vehicleDescription                | vehicleChangeInd |
      | DV-CA-SRCTST-AFT11A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 | 2018 CHEVROLET Suburban  avec AA1 | false            |

  @TEST:GMIOMSUS-57582
  Scenario Outline: Program Search WS - Details - V2 Edit Multiple RPOs 1 published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                         | vehicleDescription        | vehicleChangeInd |
      | DV-SRCTST-BFR12A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | 2017 GMC Canyon  avec LCV | false            |
      | DV-CA-SRCTST-AFT12A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | 2017 GMC Canyon  avec LCV | false            |

  @TEST:GMIOMSUS-57583
  Scenario Outline: Program Search WS - Details - V2 Edit Multiple RPOs 2 published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                         | vehicleDescription        | vehicleChangeInd |
      | DV-SRCTST-BFR12B    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | 2017 GMC Canyon  avec LWN | false            |
      | DV-CA-SRCTST-AFT12B | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | 2017 GMC Canyon  avec LWN | false            |

  @TEST:GMIOMSUS-57584
  Scenario Outline: Program Search WS - Details - V2 Added RPO - Single RPO - 2 published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                             | vehicleDescription            | vehicleChangeInd |
      | DV-SRCTST-BFR13A    | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | 2018 BUICK LaCrosse  avec M3G | false            |
      | DV-CA-SRCTST-AFT13A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | 2018 BUICK LaCrosse  avec M3G | false            |

  @TEST:GMIOMSUS-57585
  Scenario Outline: Program Search WS - Details - V2 Edit Category published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                          | vehicleDescription         | vehicleChangeInd |
      | DV-SRCTST-BFR15A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | 2017 GMC Terrain  avec A4F | false            |
      | DV-CA-SRCTST-AFT15A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | 2017 GMC Terrain  avec A4F | false            |

  @TEST:GMIOMSUS-57586
  Scenario Outline: Program Search WS - Details - V2 New Category published through Data Viewer CA FR
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | FR       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                              | vehicleDescription             | vehicleChangeInd |
      | DV-CA-SRCTST-AFT16A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 | 2017 CHEVROLET Tahoe  avec UE1 | false            |