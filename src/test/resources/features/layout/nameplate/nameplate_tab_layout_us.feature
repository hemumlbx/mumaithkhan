@USOnly @TEST:GMIOMSUS-57423
Feature: Nameplate Tab Functionality US

  Background:
    Given John logs into Data Viewer application for US

  @TEST:GMIOMSUS-57418
  Scenario Outline: Nameplate Tab layout US
    When he navigates to Nameplate tab
    Then he should verify the Nameplate layout using <divisions>
    Examples:
      | divisions                       |
      | Chevrolet, Buick, Cadillac, GMC |

  @TEST:GMIOMSUS-57419
  Scenario Outline: Nameplate - Division Search Button Functionality US
    When he navigates to Nameplate tab
    And he Search using division GMC
    Then he should see list of <brands> returned
    Examples:
      | brands                |
      | Acadia, Canyon, Yukon |

  @TEST:GMIOMSUS-57420
  Scenario Outline: Nameplate - Add New Nameplate Functionality US
    When he navigates to Nameplate tab
    And he clicks on Add New Nameplate button
    Then he should verify the Add New Nameplate layout
    And he should verify the dropdown values using <divisions>
    Examples:
      | divisions                       |
      | Chevrolet, Buick, Cadillac, GMC |

  @TEST:GMIOMSUS-57421
  Scenario: Nameplate - Verify the error messages in Add Nameplate layout US
    When he navigates to Nameplate tab
    And he clicks on Add New Nameplate button
    Then he clicks on Add button and should verify the error messages displayed

  @TEST:GMIOMSUS-57422
  Scenario Outline: Nameplate - Verify the brand models in Division search Functionality US
    When he navigates to Nameplate tab
    And he Search using division Chevrolet
    Then he should verify the list of <models> returned
    Examples:
      | models                                         |
      | 2021 Chevrolet Equinox, 2020 Chevrolet Equinox |