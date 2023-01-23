@USOnly @TEST:GMIOMSUS-57479
Feature: Search Tab Functionality US

  Background:
    Given John logs into Data Viewer application for US

  @TEST:GMIOMSUS-57466
  Scenario Outline: Search Tab - Sub Tabs Verification US
    When he navigates to Search tab
    Then he should verify the <tabs> in the search page
    Examples:
      | tabs                                      |
      | By Vehicle, By Codes, By Features, By RPO |

  @TEST:GMIOMSUS-57467
  Scenario: Search Tab - By Vehicle Layout Verification US
    When he navigates to Search tab
    Then he should verify the By Vehicle layout

  @TEST:GMIOMSUS-57468
  Scenario: Search Tab - By Codes Layout Verification US
    When he navigates to Search tab
    Then he should verify the By Codes layout

  @TEST:GMIOMSUS-57469
  Scenario: Search Tab - By Features Layout Verification US
    When he navigates to Search tab
    Then he should verify the By Features layout

  @TEST:GMIOMSUS-57470
  Scenario: Search Tab - By RPO Layout Verification US
    When he navigates to Search tab
    Then he should verify the By RPO layout

  @TEST:GMIOMSUS-57471
  Scenario: Search Tab - By Vehicle Functionality US
    When he navigates to Search tab
    Then he should verify the Search function using following vehicles
      | Year | Division  | Brand    |
      | 2021 | Chevrolet | Colorado |

  @TEST:GMIOMSUS-57472
  Scenario: Search Tab - By Codes using Chrome ID Functionality US
    When he navigates to Search tab
    Then he should verify the By Codes using CHROMEID 413298
      | Year | Division  | Brand            |
      | 2021 | Chevrolet | Silverado 3500HD |

  @TEST:GMIOMSUS-57473
  Scenario: Search Tab - By Codes using MMC Functionality US
    When he navigates to Search tab
    Then he should verify the By Codes using MMC CC30943
      | Year | Division  | Brand            |
      | 2021 | Chevrolet | Silverado 3500HD |

  @TEST:GMIOMSUS-57474
  Scenario Outline: Search Tab - By Code Print Functionality US
    When he navigates to Search tab
    Then he should verify the By Code print <pdf text> functionality using CHROMEID 416592
      | Year | Division | Brand   |
      | 2021 | Buick    | Enclave |
    Examples:
      | pdf text                                                                                                                                                                                             |
      | 2021 Buick Enclave,CHROMEID,Code,FVD Replacement String,416592,Incentive Vehicle Description,Offer Vehicle Description,English: US 2021 Buick Enclave 2WD 120.9 w/ Essence Preferred Equipment Group |

  @TEST:GMIOMSUS-57475
  Scenario Outline: Search Tab - By Features using feature text field US
    When he navigates to Search tab
    Then he should verify feature values returned using <features> through search field
    Examples:
      | features |
      | AWD,Crew |

  @TEST:GMIOMSUS-57476
  Scenario Outline: Search Tab - By Features Dropdown values US
    When he navigates to Search tab
    Then he should verify feature dropdown values <feature types>
    Examples:
      | feature types                                |
      | body,boxType,cab,drivetrain,series,wheelbase |

  @TEST:GMIOMSUS-57477
  Scenario: Search Tab - Error Message using Edit Selected US
    When he navigates to Search tab
    Then he should verify the error popup No editable records have been selected. displayed when nothing selected

  @TEST:GMIOMSUS-57478
  Scenario Outline: Search Tab - By RPO Dropdown values US
    When he navigates to Search tab
    Then he should verify rpo dropdown values <rpo types>
    Examples:
      | rpo types                                                  |
      | Body Code,Engine,Fleet Incentive,NO OPTION KIND,Wheel Type |
