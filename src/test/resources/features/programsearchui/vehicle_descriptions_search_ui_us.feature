@USOnly @TEST:GMIOMSUS-57553
Feature: Program Search UI - Vehicles Published through different tabs using Data Viewer in US EN

  Background:
    Given John logs into Program Search application for US

  @TEST:GMIOMSUS-57536
  Scenario Outline: Program Search UI - Search By Features Descriptions Added through Search Tab in Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand       |
      | 2017 | GMC      | Sierra 1500 |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR01A,DV-US-SRCTST-AFT01A |

  @TEST:GMIOMSUS-57537
  Scenario Outline: Program Search UI - Search By RPO Descriptions using Single Edit in Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Traverse |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR02A,DV-US-SRCTST-AFT02A |

  @TEST:GMIOMSUS-57538
  Scenario Outline: Program Search UI - Search By RPO Descriptions using Multiple Edits 1 in Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand  |
      | 2018 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR03A,DV-US-SRCTST-AFT03A |

  @TEST:GMIOMSUS-57539
  Scenario Outline: Program Search UI - Search By RPO Descriptions using Multiple Edits 2 in Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand  |
      | 2017 | CHEVROLET | Impala |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR03B,DV-US-SRCTST-AFT03B |

  @TEST:GMIOMSUS-57540
  Scenario Outline: Program Search UI - Edited Nameplate published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand |
      | 2017 | BUICK    | Regal |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR04A,DV-US-SRCTST-AFT04A |

  @TEST:GMIOMSUS-57541
  Scenario Outline: Program Search UI - New Nameplate published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand        |
      | 2019 | CADILLAC | Escalade ESV |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs            |
      | DV-US-SRCTST-AFT05A |

  @TEST:GMIOMSUS-57542
  Scenario Outline: Program Search UI - Edited Brand published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand               |
      | 2017 | CADILLAC | CTS SedanIncDescEng |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR06A,DV-US-SRCTST-AFT06A |

  @issue:GMIOMSUS-53727 @TEST:GMIOMSUS-57543
  Scenario Outline: Program Search UI - Added Brand published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand               |
      | 2017 | CHEVROLET | Suburban Commercial |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs            |
      | DV-US-SRCTST-AFT07A |

  @TEST:GMIOMSUS-57544
  Scenario Outline: Program Search UI - Edited Features published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand  |
      | 2018 | GMC      | Acadia |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR08A,DV-US-SRCTST-AFT08A |

  @TEST:GMIOMSUS-57545
  Scenario Outline: Program Search UI - Edit RPO Tab - Single RPO - 1 published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand    |
      | 2017 | GMC      | Yukon XL |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR10A,DV-US-SRCTST-AFT10A |

  @TEST:GMIOMSUS-57546
  Scenario Outline: Program Search UI - Added RPO - Single RPO - 1 published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand    |
      | 2018 | CHEVROLET | Suburban |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs            |
      | DV-US-SRCTST-AFT11A |

  @TEST:GMIOMSUS-57547
  Scenario Outline: Program Search UI - Edit Multiple RPOs 1 published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR12A,DV-US-SRCTST-AFT12A |

  @TEST:GMIOMSUS-57548
  Scenario Outline: Program Search UI - Edit Multiple RPOs 2 published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand  |
      | 2017 | GMC      | Canyon |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR12B,DV-US-SRCTST-AFT12B |

  @TEST:GMIOMSUS-57549
  Scenario Outline: Program Search UI - Added RPO - Single RPO - 2 published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division | Brand    |
      | 2018 | BUICK    | LaCrosse |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR13A,DV-US-SRCTST-AFT13A |

  @TEST:GMIOMSUS-57550
  Scenario Outline: Program Search UI - Archived RPO published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand   |
      | 2017 | CHEVROLET | Equinox |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs         |
      | DV-SRCTST-BFR14A |

  @TEST:GMIOMSUS-57551
  Scenario Outline: Program Search UI - Edit Category published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand    |
      | 2017 | CHEVROLET | Colorado |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs                             |
      | DV-SRCTST-BFR15A,DV-US-SRCTST-AFT15A |

  @TEST:GMIOMSUS-57552
  Scenario Outline: Program Search UI - New Category published through Data Viewer US EN
    When he do a detailed search using following vehicle
      | Year | Division  | Brand |
      | 2017 | CHEVROLET | Tahoe |
    Then he should verify the <programs> returned in the results page
    Examples:
      | programs            |
      | DV-US-SRCTST-AFT16A |