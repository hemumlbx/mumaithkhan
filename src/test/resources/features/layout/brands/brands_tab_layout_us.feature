@USOnly @TEST:GMIOMSUS-57375
Feature: Brands Tab Functionality US

  Background:
    Given John logs into Data Viewer application for US

  @TEST:GMIOMSUS-57370
  Scenario Outline: Brands - Verification of Brands Tab layout US
    When he selects Brands Tab
    Then he should verify the Brands layout using <year> and <division>
    Examples:
      | year             | division                        |
      | 2022, 2021, 2020 | Buick, Cadillac, Chevrolet, GMC |

  @TEST:GMIOMSUS-57371
  Scenario Outline: Brands - Verification of Division Search Functionality US
    When he navigates to Brands Tab
    And he Search using year 2021 and division Chevrolet
    Then he should verify the <nameplate> list returned
    Examples:
      | nameplate                     |
      | Bolt EV, Equinox, Spark, Trax |

  @TEST:GMIOMSUS-57372
  Scenario: Brands - Verification of Add Brand Layout US
    When he navigates to Brands Tab
    And he clicks on Add New Brand Name Button
    Then he should verify the Add Brand layout

  @TEST:GMIOMSUS-57373
  Scenario Outline: Brands - Verification of Deals in Division Search Functionality US
    When he navigates to Brands Tab
    And he Search using year 2021 and division GMC
    Then he should see the list of <models> returned
    Examples:
      | models                            |
      | T2M43, T2M53, T2N43, T2V43, T2P43 |

  @TEST:GMIOMSUS-57374
  Scenario Outline: Brands - Verification of Dropdown Values of Add Brand Layout US
    When he navigates to Brands Tab
    And he clicks on Add New Brand Name Button
    Then he should verify the <brand> and <Division> Dropdown Values of Add Brand layout
    Examples:
      | Division                        | brand                                |
      | Buick, Cadillac, Chevrolet, GMC | Enclave, Encore, Encore GX, Envision |
