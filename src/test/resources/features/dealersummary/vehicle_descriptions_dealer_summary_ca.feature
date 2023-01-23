@CanadaOnly @TEST:GMIOMSUS-57289
Feature: Dealer Summary UI - Vehicles Published through different tabs using Data Viewer in Canada EN

  Background:
    Given John logs into Dealer Summary application for CA

  @TEST:GMIOMSUS-57272
  Scenario Outline: Dealer Summary UI - Search By Features Descriptions Added through Search Tab in Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand       |
      | 2017 | GMC      | Sierra 1500 |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                          |
      | DV-SRCTST-BFR01A,DV-CA-SRCTST-AFT01A | 2017 GMC Sierra 1500 CrewIncDescEng CAB |

  @TEST:GMIOMSUS-57273
  Scenario Outline: Dealer Summary UI - Search By RPO Descriptions using Single Edit in Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Traverse |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                   |
      | DV-SRCTST-BFR02A,DV-CA-SRCTST-AFT02A | 2018 CHEVROLET Traverse with PCV |

  @TEST:GMIOMSUS-57274
  Scenario Outline: Dealer Summary UI - Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division  | Brand  |
      | 2018 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                 |
      | DV-SRCTST-BFR03A,DV-CA-SRCTST-AFT03A | 2018 CHEVROLET Impala with LCV |

  @TEST:GMIOMSUS-57275
  Scenario Outline: Dealer Summary UI - Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division  | Brand  |
      | 2017 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                 |
      | DV-SRCTST-BFR03B,DV-CA-SRCTST-AFT03B | 2017 CHEVROLET Impala with LFR |

  @TEST:GMIOMSUS-57276
  Scenario Outline: Dealer Summary UI - Edited Nameplate published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand |
      | 2017 | BUICK    | Regal |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header   |
      | DV-SRCTST-BFR04A,DV-CA-SRCTST-AFT04A | 2017 BUICK Regal |

  @TEST:GMIOMSUS-57277
  Scenario Outline: Dealer Summary UI - New Nameplate published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand        |
      | 2019 | CADILLAC | Escalade ESV |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs            | Program Header             |
      | DV-CA-SRCTST-AFT05A | 2019 CADILLAC Escalade ESV |

  @TEST:GMIOMSUS-57278
  Scenario Outline: Dealer Summary UI - Edited Brand published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand               |
      | 2017 | CADILLAC | CTS SedanIncDescEng |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                             |
      | DV-SRCTST-BFR06A,DV-CA-SRCTST-AFT06A | 2017 CADILLAC CTS SedanIncDescEng with LF3 |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57279
  Scenario Outline: Dealer Summary UI - Added Brand published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division  | Brand               |
      | 2017 | CHEVROLET | Suburban Commercial |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs            | Program Header                     |
      | DV-CA-SRCTST-AFT07A | 2017 CHEVROLET Suburban Commercial |

  @issue:GMIOMSUS-57220 @TEST:GMIOMSUS-57280
  Scenario Outline: Dealer Summary UI - Edited Features published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand  |
      | 2018 | GMC      | Acadia |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header                            |
      | DV-SRCTST-BFR08A,DV-CA-SRCTST-AFT08A | 2018 GMC Acadia All Wheel DriveIncDescEng |

  @TEST:GMIOMSUS-57281
  Scenario Outline: Dealer Summary UI - Edit RPO Tab - Single RPO - 1 published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand    |
      | 2017 | GMC      | Yukon XL |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header             |
      | DV-SRCTST-BFR10A,DV-CA-SRCTST-AFT10A | 2017 GMC Yukon XL with MYC |

  @TEST:GMIOMSUS-57282
  Scenario Outline: Dealer Summary UI - Added RPO - Single RPO - 1 published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Suburban |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs            | Program Header                   |
      | DV-CA-SRCTST-AFT11A | 2018 CHEVROLET Suburban with AA1 |

  @TEST:GMIOMSUS-57283
  Scenario Outline: Dealer Summary UI - Edit Multiple RPOs 1 published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header           |
      | DV-SRCTST-BFR12A,DV-CA-SRCTST-AFT12A | 2017 GMC Canyon with LCV |

  @TEST:GMIOMSUS-57284
  Scenario Outline: Dealer Summary UI - Edit Multiple RPOs 2 published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header           |
      | DV-SRCTST-BFR12B,DV-CA-SRCTST-AFT12B | 2017 GMC Canyon with LWN |

  @TEST:GMIOMSUS-57285
  Scenario Outline: Dealer Summary UI - Added RPO - Single RPO - 2 published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand    |
      | 2018 | BUICK    | LaCrosse |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header               |
      | DV-SRCTST-BFR13A,DV-CA-SRCTST-AFT13A | 2018 BUICK LaCrosse with M3G |

  @TEST:GMIOMSUS-57286
  Scenario Outline: Dealer Summary UI - Archived RPO published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division  | Brand   |
      | 2017 | CHEVROLET | Equinox |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs         | Program Header                  |
      | DV-SRCTST-BFR14A | 2017 CHEVROLET Equinox with PDR |

  @TEST:GMIOMSUS-57287
  Scenario Outline: Dealer Summary UI - Edit Category published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division | Brand   |
      | 2017 | GMC      | Terrain |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs                             | Program Header            |
      | DV-SRCTST-BFR15A,DV-CA-SRCTST-AFT15A | 2017 GMC Terrain with A4F |

  @TEST:GMIOMSUS-57288
  Scenario Outline: Dealer Summary UI - New Category published through Data Viewer CA EN
    When he do a search using following vehicle
      | Year | Division  | Brand |
      | 2017 | CHEVROLET | Tahoe |
    Then he should verify the <programs> returned in the dealer summary results page under <Program Header>
    Examples:
      | programs            | Program Header                |
      | DV-CA-SRCTST-AFT16A | 2017 CHEVROLET Tahoe with UE1 |