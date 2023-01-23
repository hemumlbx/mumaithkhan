@CanadaOnly @TEST:GMIOMSUS-57369
Feature: Brands Tab Functionality CA

  Background:
    Given John logs into Data Viewer application for CA

  @TEST:GMIOMSUS-57364
  Scenario Outline: Brands - Verification of Brands Tab layout CA
    When he selects Brands Tab
    Then he should verify the Brands layout using <year> and <division>
    Examples:
      | year             | division                        |
      | 2022, 2021, 2020 | Buick, Cadillac, Chevrolet, GMC |

  @TEST:GMIOMSUS-57365
  Scenario Outline: Brands - Verification of Division Search Functionality CA
    When he navigates to Brands Tab
    And he Search using year 2021 and division Chevrolet
    Then he should verify the <brand> list returned
    Examples:
      | brand                         |
      | Bolt EV, Equinox, Spark, Trax |

  @TEST:GMIOMSUS-57366
  Scenario: Brands - Verification of Add Brand Layout CA
    When he navigates to Brands Tab
    And he clicks on Add New Brand Name Button
    Then he should verify the Add Brand layout

  @TEST:GMIOMSUS-57367
  Scenario Outline: Brands - Verification of Models in Division Search Functionality CA
    When he navigates to Brands Tab
    And he Search using year 2021 and division GMC
    Then he should see the list of <models> returned
    Examples:
      | models                            |
      | T2M43, T2M53, T2N43, T2V43, T2P43 |

  @TEST:GMIOMSUS-57368
  Scenario Outline: Brands - Verification of Dropdown Values of Add Brand Layout CA
    When he navigates to Brands Tab
    And he clicks on Add New Brand Name Button
    Then he should verify the <brand> and <Division> Dropdown Values of Add Brand layout
    Examples:
      | Division                        | brand                                |
      | Buick, Cadillac, Chevrolet, GMC | Enclave, Encore, Encore GX, Envision |
