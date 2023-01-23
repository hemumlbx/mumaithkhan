@CanadaOnly @TEST:GMIOMSUS-57535
Feature: Program Search UI - Vehicles Published through different tabs using Data Viewer in Canada EN

  Background:
    Given John logs into Program Search application for CA

  @TEST:GMIOMSUS-57518
  Scenario Outline: Program Search UI - Search By Features Descriptions Added through Search Tab in Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand       |
      | 2017 | GMC      | Sierra 1500 |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR01A,DV-CA-SRCTST-AFT01A |

  @TEST:GMIOMSUS-57519
  Scenario Outline: Program Search UI - Search By RPO Descriptions using Single Edit in Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Traverse |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR02A,DV-CA-SRCTST-AFT02A |

  @TEST:GMIOMSUS-57520
  Scenario Outline: Program Search UI - Search By RPO Descriptions using Multiple Edits 1 in Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand  |
      | 2018 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR03A,DV-CA-SRCTST-AFT03A |

  @TEST:GMIOMSUS-57521
  Scenario Outline: Program Search UI - Search By RPO Descriptions using Multiple Edits 2 in Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand  |
      | 2017 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR03B,DV-CA-SRCTST-AFT03B |

  @TEST:GMIOMSUS-57522
  Scenario Outline: Program Search UI - Edited Nameplate published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand |
      | 2017 | BUICK    | Regal |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR04A,DV-CA-SRCTST-AFT04A |

  @TEST:GMIOMSUS-57523
  Scenario Outline: Program Search UI - New Nameplate published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand        |
      | 2019 | CADILLAC | Escalade ESV |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs            |
      | DV-CA-SRCTST-AFT05A |

  @TEST:GMIOMSUS-57524
  Scenario Outline: Program Search UI - Edited Brand published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand               |
      | 2017 | CADILLAC | CTS SedanIncDescEng |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR06A,DV-CA-SRCTST-AFT06A |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57525
  Scenario Outline: Program Search UI - Added Brand published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand               |
      | 2017 | CHEVROLET | Suburban Commercial |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs            |
      | DV-CA-SRCTST-AFT07A |

  @TEST:GMIOMSUS-57526
  Scenario Outline: Program Search UI - Edited Features published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand  |
      | 2018 | GMC      | Acadia |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR08A,DV-CA-SRCTST-AFT08A |

  @TEST:GMIOMSUS-57527
  Scenario Outline: Program Search UI - Edit RPO Tab - Single RPO - 1 published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand    |
      | 2017 | GMC      | Yukon XL |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR10A,DV-CA-SRCTST-AFT10A |

  @TEST:GMIOMSUS-57528
  Scenario Outline: Program Search UI - Added RPO - Single RPO - 1 published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Suburban |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs            |
      | DV-CA-SRCTST-AFT11A |

  @TEST:GMIOMSUS-57529
  Scenario Outline: Program Search UI - Edit Multiple RPOs 1 published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR12A,DV-CA-SRCTST-AFT12A |

  @TEST:GMIOMSUS-57530
  Scenario Outline: Program Search UI - Edit Multiple RPOs 2 published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR12B,DV-CA-SRCTST-AFT12B |

  @TEST:GMIOMSUS-57531
  Scenario Outline: Program Search UI - Added RPO - Single RPO - 2 published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand    |
      | 2018 | BUICK    | LaCrosse |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR13A,DV-CA-SRCTST-AFT13A |

  @TEST:GMIOMSUS-57532
  Scenario Outline: Program Search UI - Archived RPO published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand   |
      | 2017 | CHEVROLET | Equinox |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs         |
      | DV-SRCTST-BFR14A |

  @TEST:GMIOMSUS-57533
  Scenario Outline: Program Search UI - Edit Category published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand   |
      | 2017 | GMC      | Terrain |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR15A,DV-CA-SRCTST-AFT15A |

  @TEST:GMIOMSUS-57534
  Scenario Outline: Program Search UI - New Category published through Data Viewer CA EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand |
      | 2017 | CHEVROLET | Tahoe |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs            |
      | DV-CA-SRCTST-AFT16A |