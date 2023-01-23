@USOnly @TEST:GMIOMSUS-57913
Feature: Program Summary UI - Vehicles Published through different tabs using Data Viewer in US EN

  Background:
    Given John logs into Program Summary application for US

  @TEST:GMIOMSUS-57896
  Scenario Outline: Program Summary UI - Search By Features Descriptions Added through Search Tab in Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division | Brand       |
      | 2017 | GMC      | Sierra 1500 |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                          |
      | DV-SRCTST-BFR01A,DV-US-SRCTST-AFT01A | 2017 GMC Sierra 1500 CrewIncDescEng CAB |

  @TEST:GMIOMSUS-57897
  Scenario Outline: Program Summary UI - Search By RPO Descriptions using Single Edit in Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Traverse |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                   |
      | DV-SRCTST-BFR02A,DV-US-SRCTST-AFT02A | 2018 CHEVROLET Traverse with PCV |

  @TEST:GMIOMSUS-57898
  Scenario Outline: Program Summary UI - Search By RPO Descriptions using Multiple Edits 1 in Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division  | Brand  |
      | 2018 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                 |
      | DV-SRCTST-BFR03A,DV-US-SRCTST-AFT03A | 2018 CHEVROLET Impala with LCV |

  @TEST:GMIOMSUS-57899
  Scenario Outline: Program Summary UI - Search By RPO Descriptions using Multiple Edits 2 in Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division  | Brand  |
      | 2017 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                 |
      | DV-SRCTST-BFR03B,DV-US-SRCTST-AFT03B | 2017 CHEVROLET Impala with LFR |

  @TEST:GMIOMSUS-57900
  Scenario Outline: Program Summary UI - Edited Nameplate published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division | Brand |
      | 2017 | BUICK    | Regal |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header   |
      | DV-SRCTST-BFR04A,DV-US-SRCTST-AFT04A | 2017 BUICK Regal |

  @TEST:GMIOMSUS-57901
  Scenario Outline: Program Summary UI - New Nameplate published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division | Brand        |
      | 2019 | CADILLAC | Escalade ESV |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs            | Program Header             |
      | DV-US-SRCTST-AFT05A | 2019 CADILLAC Escalade ESV |

  @TEST:GMIOMSUS-57902
  Scenario Outline: Program Summary UI - Edited Brand published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division | Brand               |
      | 2017 | CADILLAC | CTS SedanIncDescEng |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                             |
      | DV-SRCTST-BFR06A,DV-US-SRCTST-AFT06A | 2017 CADILLAC CTS SedanIncDescEng with LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57903
  Scenario Outline: Program Summary UI - Added Brand published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division  | Brand               |
      | 2017 | CHEVROLET | Suburban Commercial |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs            | Program Header                     |
      | DV-US-SRCTST-AFT07A | 2017 CHEVROLET Suburban Commercial |

  @issue:GMIOMSUS-57220 @TEST:GMIOMSUS-57904
  Scenario Outline: Program Summary UI - Edited Features published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division | Brand  |
      | 2018 | GMC      | Acadia |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                |
      | DV-SRCTST-BFR08A,DV-US-SRCTST-AFT08A | 2018 GMC Acadia AWDIncDescEng |

  @TEST:GMIOMSUS-57905
  Scenario Outline: Program Summary UI - Edit RPO Tab - Single RPO - 1 published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division | Brand    |
      | 2017 | GMC      | Yukon XL |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header             |
      | DV-SRCTST-BFR10A,DV-US-SRCTST-AFT10A | 2017 GMC Yukon XL with MYC |

  @TEST:GMIOMSUS-57906
  Scenario Outline: Program Summary UI - Added RPO - Single RPO - 1 published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Suburban |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs            | Program Header                   |
      | DV-US-SRCTST-AFT11A | 2018 CHEVROLET Suburban with AA1 |

  @TEST:GMIOMSUS-57907
  Scenario Outline: Program Summary UI - Edit Multiple RPOs 1 published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header           |
      | DV-SRCTST-BFR12A,DV-US-SRCTST-AFT12A | 2017 GMC Canyon with LCV |

  @TEST:GMIOMSUS-57908
  Scenario Outline: Program Summary UI - Edit Multiple RPOs 2 published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header           |
      | DV-SRCTST-BFR12B,DV-US-SRCTST-AFT12B | 2017 GMC Canyon with LWN |

  @TEST:GMIOMSUS-57909
  Scenario Outline: Program Summary UI - Added RPO - Single RPO - 2 published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division | Brand    |
      | 2018 | BUICK    | LaCrosse |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header               |
      | DV-SRCTST-BFR13A,DV-US-SRCTST-AFT13A | 2018 BUICK LaCrosse with M3G |

  @TEST:GMIOMSUS-57910
  Scenario Outline: Program Summary UI - Archived RPO published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division  | Brand   |
      | 2017 | CHEVROLET | Equinox |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs         | Program Header                  |
      | DV-SRCTST-BFR14A | 2017 CHEVROLET Equinox with PDD |

  @TEST:GMIOMSUS-57911
  Scenario Outline: Program Summary UI - Edit Category published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division  | Brand    |
      | 2017 | CHEVROLET | Colorado |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                   |
      | DV-SRCTST-BFR15A,DV-US-SRCTST-AFT15A | 2017 CHEVROLET Colorado with FVX |

  @TEST:GMIOMSUS-57912
  Scenario Outline: Program Summary UI - New Category published through Data Viewer US EN
    When he do a search using following vehicle in program summary using English language
      | Year | Division  | Brand |
      | 2017 | CHEVROLET | Tahoe |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs            | Program Header                |
      | DV-US-SRCTST-AFT16A | 2017 CHEVROLET Tahoe with UE1 |