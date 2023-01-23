@CanadaOnly @TEST:GMIOMSUS-57465
Feature: Search Tab Functionality CA

  Background:
    Given John logs into Data Viewer application for CA

  @TEST:GMIOMSUS-57452
  Scenario Outline: Search Tab - Sub Tabs Verification CA EN
    When he navigates to Search tab
    Then he should verify the <tabs> in the search page
    Examples:
      | tabs                                      |
      | By Vehicle, By Codes, By Features, By RPO |

  @TEST:GMIOMSUS-57453
  Scenario: Search Tab - By Vehicle Layout Verification CA EN
    When he navigates to Search tab
    Then he should verify the By Vehicle layout

  @TEST:GMIOMSUS-57454
  Scenario: Search Tab - By Codes Layout Verification CA EN
    When he navigates to Search tab
    Then he should verify the By Codes layout

  @TEST:GMIOMSUS-57455
  Scenario: Search Tab - By Features Layout Verification CA EN
    When he navigates to Search tab
    Then he should verify the By Features layout

  @TEST:GMIOMSUS-57456
  Scenario: Search Tab - By RPO Layout Verification CA EN
    When he navigates to Search tab
    Then he should verify the By RPO layout

  @TEST:GMIOMSUS-57457
  Scenario: Search Tab - By Vehicle Functionality CA EN
    When he navigates to Search tab
    Then he should verify the Search function using following vehicles
      | Year | Division  | Brand    |
      | 2021 | Chevrolet | Colorado |

  @TEST:GMIOMSUS-57458
  Scenario Outline: Search Tab - By Vehicle Print Functionality CA EN
    When he navigates to Search tab
    Then he should verify the Search function print <pdf text> functionality using following vehicles
      | Year | Division  | Brand    |
      | 2021 | Chevrolet | Colorado |
    Examples:
      | pdf text                                                                                                                                                                               |
      | 2021 Chevrolet Colorado,MMC,CHROMEID,Features,RPOS,Code,FVD Replacement String,Description,Chrome Description,Incentive Description,Offer Description,12M43,412385,cab,Crew,Engine,LWN |

  @TEST:GMIOMSUS-57459
  Scenario: Search Tab - By Codes using Chrome ID Functionality CA EN
    When he navigates to Search tab
    Then he should verify the By Codes using CHROMEID 388300
      | Year | Division  | Brand            |
      | 2017 | Chevrolet | Silverado 3500HD |

  @TEST:GMIOMSUS-57460
  Scenario: Search Tab - By Codes using MMC Functionality CA EN
    When he navigates to Search tab
    Then he should verify the By Codes using MMC CC35743
      | Year | Division  | Brand            |
      | 2017 | Chevrolet | Silverado 3500HD |

  @TEST:GMIOMSUS-57461
  Scenario Outline: Search Tab - By Features using feature text field CA EN
    When he navigates to Search tab
    Then he should verify feature values returned using <features> through search field
    Examples:
      | features             |
      | All Wheel Drive,Crew |

  @TEST:GMIOMSUS-57462
  Scenario Outline: Search Tab - By Features Dropdown values CA EN
    When he navigates to Search tab
    Then he should verify feature dropdown values <feature Types>
    Examples:
      | feature Types                                |
      | body,boxType,cab,drivetrain,series,wheelbase |

  @TEST:GMIOMSUS-57463
  Scenario: Search Tab - Error Message using Edit Selected CA EN
    When he navigates to Search tab
    Then he should verify the error popup No editable records have been selected. displayed when nothing selected

  @TEST:GMIOMSUS-57464
  Scenario Outline: Search Tab - By RPO Dropdown values CA EN
    When he navigates to Search tab
    Then he should verify rpo dropdown values <rpo types>
    Examples:
      | rpo types                                                  |
      | Body Code,Engine,Fleet Incentive,NO OPTION KIND,Wheel Type |
