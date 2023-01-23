@CanadaOnly @TEST:GMIOMSUS-57895
Feature: Program Summary UI - Vehicles Published through different tabs using Data Viewer in Canada FR

  Background:
    Given John logs into Program Summary application for CA
    And he selects the Français language

  @TEST:GMIOMSUS-57878
  Scenario Outline: Program Summary UI - Search By Features Descriptions Added through Search Tab in Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand       |
      | 2017 | GMC      | Sierra 1500 |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                          |
      | DV-SRCTST-BFR01A,DV-CA-SRCTST-AFT01A | 2017 GMC Sierra 1500 CrewIncDescFré CAB |

  @TEST:GMIOMSUS-57879
  Scenario Outline: Program Summary UI - Search By RPO Descriptions using Single Edit in Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Traverse |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                   |
      | DV-SRCTST-BFR02A,DV-CA-SRCTST-AFT02A | 2018 CHEVROLET Traverse avec PCV |

  @TEST:GMIOMSUS-57880
  Scenario Outline: Program Summary UI - Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division  | Brand  |
      | 2018 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                 |
      | DV-SRCTST-BFR03A,DV-CA-SRCTST-AFT03A | 2018 CHEVROLET Impala avec LCV |

  @TEST:GMIOMSUS-57881
  Scenario Outline: Program Summary UI - Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division  | Brand  |
      | 2017 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                 |
      | DV-SRCTST-BFR03B,DV-CA-SRCTST-AFT03B | 2017 CHEVROLET Impala avec LFR |

  @TEST:GMIOMSUS-57882
  Scenario Outline: Program Summary UI - Edited Nameplate published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand |
      | 2017 | BUICK    | Regal |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header   |
      | DV-SRCTST-BFR04A,DV-CA-SRCTST-AFT04A | 2017 BUICK Regal |

  @TEST:GMIOMSUS-57883
  Scenario Outline: Program Summary UI - New Nameplate published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand        |
      | 2019 | CADILLAC | Escalade ESV |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs            | Program Header             |
      | DV-CA-SRCTST-AFT05A | 2019 CADILLAC Escalade ESV |

  @TEST:GMIOMSUS-57884
  Scenario Outline: Program Summary UI - Edited Brand published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand               |
      | 2017 | CADILLAC | CTS SedanIncDescFré |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                             |
      | DV-SRCTST-BFR06A,DV-CA-SRCTST-AFT06A | 2017 CADILLAC CTS SedanIncDescFré avec LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57885
  Scenario Outline: Program Summary UI - Added Brand published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division  | Brand               |
      | 2017 | CHEVROLET | Suburban Commercial |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs            | Program Header                     |
      | DV-CA-SRCTST-AFT07A | 2017 CHEVROLET Suburban Commercial |

  @issue:GMIOMSUS-57220 @TEST:GMIOMSUS-57886
  Scenario Outline: Program Summary UI - Edited Features published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand  |
      | 2018 | GMC      | Acadia |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                            |
      | DV-SRCTST-BFR08A,DV-CA-SRCTST-AFT08A | 2018 GMC Acadia All Wheel DriveIncDescFré |

  @TEST:GMIOMSUS-57887
  Scenario Outline: Program Summary UI - Edit RPO Tab - Single RPO - 1 published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand    |
      | 2017 | GMC      | Yukon XL |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header             |
      | DV-SRCTST-BFR10A,DV-CA-SRCTST-AFT10A | 2017 GMC Yukon XL avec MYC |

  @TEST:GMIOMSUS-57888
  Scenario Outline: Program Summary UI - Added RPO - Single RPO - 1 published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Suburban |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs            | Program Header                   |
      | DV-CA-SRCTST-AFT11A | 2018 CHEVROLET Suburban avec AA1 |

  @TEST:GMIOMSUS-57889
  Scenario Outline: Program Summary UI - Edit Multiple RPOs 1 published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header           |
      | DV-SRCTST-BFR12A,DV-CA-SRCTST-AFT12A | 2017 GMC Canyon avec LCV |

  @TEST:GMIOMSUS-57890
  Scenario Outline: Program Summary UI - Edit Multiple RPOs 2 published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header           |
      | DV-SRCTST-BFR12B,DV-CA-SRCTST-AFT12B | 2017 GMC Canyon avec LWN |

  @TEST:GMIOMSUS-57891
  Scenario Outline: Program Summary UI - Added RPO - Single RPO - 2 published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand    |
      | 2018 | BUICK    | LaCrosse |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header               |
      | DV-SRCTST-BFR13A,DV-CA-SRCTST-AFT13A | 2018 BUICK LaCrosse avec M3G |

  @TEST:GMIOMSUS-57892
  Scenario Outline: Program Summary UI - Archived RPO published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division  | Brand   |
      | 2017 | CHEVROLET | Equinox |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs         | Program Header                  |
      | DV-SRCTST-BFR14A | 2017 CHEVROLET Equinox avec PDR |

  @TEST:GMIOMSUS-57893
  Scenario Outline: Program Summary UI - Edit Category published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division | Brand   |
      | 2017 | GMC      | Terrain |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs                             | Program Header            |
      | DV-SRCTST-BFR15A,DV-CA-SRCTST-AFT15A | 2017 GMC Terrain avec A4F |

  @TEST:GMIOMSUS-57894
  Scenario Outline: Program Summary UI - New Category published through Data Viewer CA FR
    When he do a search using following vehicle in program summary using French language
      | Year | Division  | Brand |
      | 2017 | CHEVROLET | Tahoe |
    Then he should verify the <programs> returned in the program summary results page under <Program Header>
    Examples:
      | programs            | Program Header                |
      | DV-CA-SRCTST-AFT16A | 2017 CHEVROLET Tahoe avec UE1 |