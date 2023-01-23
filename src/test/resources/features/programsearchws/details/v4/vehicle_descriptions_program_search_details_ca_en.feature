@CanadaOnly @TEST:GMIOMSUS-57672
Feature: Program Search WS Details - V4 Vehicles Published through different tabs using Data Viewer in Canada EN

  Background:
    Given John has access to the search api at V4 in CA

  @TEST:GMIOMSUS-57656
  Scenario Outline: Program Search WS - Details - V4 Search By Features Descriptions Added through Search Tab in Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                           | vehicleDescription                  | vehicleChangeInd |
      | DV-SRCTST-BFR01A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | 2017 GMC Sierra 1500 CrewIncDescEng | false            |
      | DV-CA-SRCTST-AFT01A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=SIERRA 1500+CAB=CREW | 2017 GMC Sierra 1500 CrewIncDescEng | false            |

  @TEST:GMIOMSUS-57657
  Scenario Outline: Program Search WS - Details - V4 Search By RPO Descriptions using Single Edit in Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                 | vehicleDescription             | vehicleChangeInd |
      | DV-SRCTST-BFR02A    | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | 2018 CHEVROLET Traverse  w/PCV | false            |
      | DV-CA-SRCTST-AFT02A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=TRAVERSE+RPOCODE=PCV | 2018 CHEVROLET Traverse  w/PCV | false            |

  @TEST:GMIOMSUS-57658
  Scenario Outline: Program Search WS - Details - V4 Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                               | vehicleDescription           | vehicleChangeInd |
      | DV-SRCTST-BFR03A    | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | 2018 CHEVROLET Impala  w/LCV | false            |
      | DV-CA-SRCTST-AFT03A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LCV | 2018 CHEVROLET Impala  w/LCV | false            |

  @TEST:GMIOMSUS-57659
  Scenario Outline: Program Search WS - Details - V4 Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                               | vehicleDescription           | vehicleChangeInd |
      | DV-SRCTST-BFR03B    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | 2017 CHEVROLET Impala  w/LFR | false            |
      | DV-CA-SRCTST-AFT03B | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=IMPALA+RPOCODE=LFR | 2017 CHEVROLET Impala  w/LFR | false            |

  @TEST:GMIOMSUS-57660
  Scenario Outline: Program Search WS - Details - V4 Edited Nameplate published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                  | vehicleDescription        | vehicleChangeInd |
      | DV-SRCTST-BFR04A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | 2017 BUICK Regal SedanEng | false            |
      | DV-CA-SRCTST-AFT04A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=BUICK+NAMEPLATE=REGAL | 2017 BUICK Regal SedanEng | false            |

  @TEST:GMIOMSUS-57661
  Scenario Outline: Program Search WS - Details - V4 New Nameplate published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                               | vehicleDescription            | vehicleChangeInd |
      | DV-CA-SRCTST-AFT05A | 0                     | +COUNTRY=CA+YEAR=2019+DIVISION=CADILLAC+NAMEPLATE=ESCALADE ESVENG | 2019 CADILLAC Escalade ESVEng | false            |

  @TEST:GMIOMSUS-57662
  Scenario Outline: Program Search WS - Details - V4 Edited Brand published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                 | vehicleDescription                       | vehicleChangeInd |
      | DV-SRCTST-BFR06A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN             | 2017 CADILLAC CTS SedanIncDescEng        | false            |
      | DV-CA-SRCTST-AFT06A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CADILLAC+BRAND=CTS SEDAN+RPOCODE=LF3 | 2017 CADILLAC CTS SedanIncDescEng  w/LF3 | false            |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57663
  Scenario Outline: Program Search WS - Details - V4 Added Brand published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                | vehicleDescription                 | vehicleChangeInd |
      | DV-CA-SRCTST-AFT07A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=SUBURBAN COMMERCIAL | 2017 CHEVROLET Suburban Commercial | false            |

  @issue:GMIOMSUS-57220 @TEST:GMIOMSUS-57664
  Scenario Outline: Program Search WS - Details - V4 Edited Features published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                        | vehicleDescription                        | vehicleChangeInd |
      | DV-SRCTST-BFR08A    | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | 2018 GMC Acadia All Wheel DriveIncDescEng | false            |
      | DV-CA-SRCTST-AFT08A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=GMC+BRAND=ACADIA+DRIVETRAIN=ALL WHEEL DRIVE | 2018 GMC Acadia All Wheel DriveIncDescEng | false            |

  @TEST:GMIOMSUS-57665
  Scenario Outline: Program Search WS - Details - V4 Edit RPO Tab - Single RPO - 1 published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                           | vehicleDescription       | vehicleChangeInd |
      | DV-SRCTST-BFR10A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | 2017 GMC Yukon XL  w/MYC | false            |
      | DV-CA-SRCTST-AFT10A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=YUKON XL+RPOCODE=MYC | 2017 GMC Yukon XL  w/MYC | false            |

  @TEST:GMIOMSUS-57666
  Scenario Outline: Program Search WS - Details - V4 Added RPO - Single RPO - 1 published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                                 | vehicleDescription             | vehicleChangeInd |
      | DV-CA-SRCTST-AFT11A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=CHEVROLET+BRAND=SUBURBAN+RPOCODE=AA1 | 2018 CHEVROLET Suburban  w/AA1 | false            |

  @TEST:GMIOMSUS-57667
  Scenario Outline: Program Search WS - Details - V4 Edit Multiple RPOs 1 published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                         | vehicleDescription     | vehicleChangeInd |
      | DV-SRCTST-BFR12A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | 2017 GMC Canyon  w/LCV | false            |
      | DV-CA-SRCTST-AFT12A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LCV | 2017 GMC Canyon  w/LCV | false            |

  @TEST:GMIOMSUS-57668
  Scenario Outline: Program Search WS - Details - V4 Edit Multiple RPOs 2 published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                         | vehicleDescription     | vehicleChangeInd |
      | DV-SRCTST-BFR12B    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | 2017 GMC Canyon  w/LWN | false            |
      | DV-CA-SRCTST-AFT12B | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=CANYON+RPOCODE=LWN | 2017 GMC Canyon  w/LWN | false            |

  @TEST:GMIOMSUS-57669
  Scenario Outline: Program Search WS - Details - V4 Added RPO - Single RPO - 2 published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                             | vehicleDescription         | vehicleChangeInd |
      | DV-SRCTST-BFR13A    | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | 2018 BUICK LaCrosse  w/M3G | false            |
      | DV-CA-SRCTST-AFT13A | 0                     | +COUNTRY=CA+YEAR=2018+DIVISION=BUICK+BRAND=LACROSSE+RPOCODE=M3G | 2018 BUICK LaCrosse  w/M3G | false            |

  @TEST:GMIOMSUS-57670
  Scenario Outline: Program Search WS - Details - V4 Edit Category published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                          | vehicleDescription      | vehicleChangeInd |
      | DV-SRCTST-BFR15A    | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | 2017 GMC Terrain  w/A4F | false            |
      | DV-CA-SRCTST-AFT15A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=GMC+BRAND=TERRAIN+RPOCODE=A4F | 2017 GMC Terrain  w/A4F | false            |

  @TEST:GMIOMSUS-57671
  Scenario Outline: Program Search WS - Details - V4 New Category published through Data Viewer CA EN
    When he submits a get Incentive Program Details request
      | requestProgramID   | requestRevisionNumber   | language |
      | <requestprogramID> | <requestrevisionNumber> | EN       |
    Then he should see vehicle incentive list along with filters '<vehicleFilterString>' with description '<vehicleDescription>' and change indicator '<vehicleChangeInd>' in the response
    Examples:
      | requestprogramID    | requestrevisionNumber | vehicleFilterString                                              | vehicleDescription          | vehicleChangeInd |
      | DV-CA-SRCTST-AFT16A | 0                     | +COUNTRY=CA+YEAR=2017+DIVISION=CHEVROLET+BRAND=TAHOE+RPOCODE=UE1 | 2017 CHEVROLET Tahoe  w/UE1 | false            |