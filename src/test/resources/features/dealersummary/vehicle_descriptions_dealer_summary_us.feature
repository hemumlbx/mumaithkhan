@USOnly @TEST:GMIOMSUS-57325
Feature: Dealer Summary UI - Vehicles Published through different tabs using Data Viewer in US EN

  Background:
    Given John logs into Dealer Summary application for US

  @TEST:GMIOMSUS-57308
  Scenario Outline: Dealer Summary UI - Search By Features Descriptions Added through Search Tab in Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division | Brand       |
      | 2017 | GMC      | Sierra 1500 |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                          |
      | DV-SRCTST-BFR01A,DV-US-SRCTST-AFT01A | 2017 GMC Sierra 1500 CrewIncDescEng CAB |

  @TEST:GMIOMSUS-57309
  Scenario Outline: Dealer Summary UI - Search By RPO Descriptions using Single Edit in Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Traverse |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                   |
      | DV-SRCTST-BFR02A,DV-US-SRCTST-AFT02A | 2018 CHEVROLET Traverse with PCV |

  @TEST:GMIOMSUS-57310
  Scenario Outline: Dealer Summary UI - Search By RPO Descriptions using Multiple Edits 1 in Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division  | Brand  |
      | 2018 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                 |
      | DV-SRCTST-BFR03A,DV-US-SRCTST-AFT03A | 2018 CHEVROLET Impala with LCV |

  @TEST:GMIOMSUS-57311
  Scenario Outline: Dealer Summary UI - Search By RPO Descriptions using Multiple Edits 2 in Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division  | Brand  |
      | 2017 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                 |
      | DV-SRCTST-BFR03B,DV-US-SRCTST-AFT03B | 2017 CHEVROLET Impala with LFR |

  @TEST:GMIOMSUS-57312
  Scenario Outline: Dealer Summary UI - Edited Nameplate published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division | Brand |
      | 2017 | BUICK    | Regal |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header   |
      | DV-SRCTST-BFR04A,DV-US-SRCTST-AFT04A | 2017 BUICK Regal |

  @TEST:GMIOMSUS-57313
  Scenario Outline: Dealer Summary UI - New Nameplate published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division | Brand        |
      | 2019 | CADILLAC | Escalade ESV |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs            | Program Header             |
      | DV-US-SRCTST-AFT05A | 2019 CADILLAC Escalade ESV |

  @TEST:GMIOMSUS-57314
  Scenario Outline: Dealer Summary UI - Edited Brand published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division | Brand               |
      | 2017 | CADILLAC | CTS SedanIncDescEng |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                             |
      | DV-SRCTST-BFR06A,DV-US-SRCTST-AFT06A | 2017 CADILLAC CTS SedanIncDescEng with LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57315
  Scenario Outline: Dealer Summary UI - Added Brand published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division  | Brand               |
      | 2017 | CHEVROLET | Suburban Commercial |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs            | Program Header                     |
      | DV-US-SRCTST-AFT07A | 2017 CHEVROLET Suburban Commercial |

  @TEST:GMIOMSUS-57316
  Scenario Outline: Dealer Summary UI - Edited Features published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division | Brand  |
      | 2018 | GMC      | Acadia |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                |
      | DV-SRCTST-BFR08A,DV-US-SRCTST-AFT08A | 2018 GMC Acadia AWDIncDescEng |

  @TEST:GMIOMSUS-57317
  Scenario Outline: Dealer Summary UI - Edit RPO Tab - Single RPO - 1 published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division | Brand    |
      | 2017 | GMC      | Yukon XL |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header             |
      | DV-SRCTST-BFR10A,DV-US-SRCTST-AFT10A | 2017 GMC Yukon XL with MYC |

  @TEST:GMIOMSUS-57318
  Scenario Outline: Dealer Summary UI - Added RPO - Single RPO - 1 published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Suburban |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs            | Program Header                   |
      | DV-US-SRCTST-AFT11A | 2018 CHEVROLET Suburban with AA1 |

  @TEST:GMIOMSUS-57319
  Scenario Outline: Dealer Summary UI - Edit Multiple RPOs 1 published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header           |
      | DV-SRCTST-BFR12A,DV-US-SRCTST-AFT12A | 2017 GMC Canyon with LCV |

  @TEST:GMIOMSUS-57320
  Scenario Outline: Dealer Summary UI - Edit Multiple RPOs 2 published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header           |
      | DV-SRCTST-BFR12B,DV-US-SRCTST-AFT12B | 2017 GMC Canyon with LWN |

  @TEST:GMIOMSUS-57321
  Scenario Outline: Dealer Summary UI - Added RPO - Single RPO - 2 published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division | Brand    |
      | 2018 | BUICK    | LaCrosse |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header               |
      | DV-SRCTST-BFR13A,DV-US-SRCTST-AFT13A | 2018 BUICK LaCrosse with M3G |

  @TEST:GMIOMSUS-57322
  Scenario Outline: Dealer Summary UI - Archived RPO published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division  | Brand   |
      | 2017 | CHEVROLET | Equinox |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs         | Program Header                  |
      | DV-SRCTST-BFR14A | 2017 CHEVROLET Equinox with PDD |

  @TEST:GMIOMSUS-57323
  Scenario Outline: Dealer Summary UI - Edit Category published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division  | Brand    |
      | 2017 | CHEVROLET | Colorado |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                   |
      | DV-SRCTST-BFR15A,DV-US-SRCTST-AFT15A | 2017 CHEVROLET Colorado with FVX |

  @TEST:GMIOMSUS-57324
  Scenario Outline: Dealer Summary UI - New Category published through Data Viewer US EN
    When he do a search using following vehicle
      | Year | Division  | Brand |
      | 2017 | CHEVROLET | Tahoe |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs            | Program Header                |
      | DV-US-SRCTST-AFT16A | 2017 CHEVROLET Tahoe with UE1 |