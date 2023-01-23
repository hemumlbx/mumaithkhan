@CanadaOnly @TEST:GMIOMSUS-58013
Feature: Publish ETL - Publish Tab functionality CA

  Background:
    Given John logs into Data Viewer application for CA

  @TEST:GMIOMSUS-57995
  Scenario: Publish Tab - Publish changes through Search By Features Descriptions CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model       | Year | Category | Category Type |
      | GMC      | Sierra 1500 | 2017 | cab      | FEATURE       |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-57996
  Scenario: Publish Tab - Publish changes through Search By RPO Descriptions using Single Edit CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model    | Year | Category       | Category Type |
      | Chevrolet | Traverse | 2018 | NO OPTION KIND | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-57997
  Scenario: Publish Tab - Publish changes through Search By RPO Descriptions using Multiple Edits 1 CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2017 | Engine   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-57998
  Scenario: Publish Tab - Publish changes through Search By RPO Descriptions using Multiple Edits 2 CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2018 | Engine   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-57999
  Scenario Outline: Publish Tab - Publish changes of Edited Nameplate CA
    When he navigates to Publish Tab
    And he publish the nameplate <NamePlate> through Publish Nameplates tab
    Then he should see the nameplates published <NamePlate> under Pending Publish Queue tab
    Examples:
      | NamePlate      |
      | Regal SedanEng |

  @TEST:GMIOMSUS-58000
  Scenario Outline: Publish Tab - Publish changes of Added Nameplate CA
    When he navigates to Publish Tab
    And he publish the nameplate <NamePlate> through Publish Nameplates tab
    Then he should see the nameplates published <NamePlate> under Pending Publish Queue tab
    Examples:
      | NamePlate       |
      | Escalade ESVEng |

  @TEST:GMIOMSUS-58001
  Scenario Outline: Publish Tab - Publish changes of Edited Brand CA
    When he navigates to Publish Tab
    And he publish the brand <Brands> through Publish Models tab using <year> and <division>
    Then he should see the published Models data under the Pending Publish Queue
    Examples:
      | Brands    | year | division |
      | CTS Sedan | 2017 | Cadillac |

  @TEST:GMIOMSUS-58002
  Scenario Outline: Publish Tab - Publish changes of Added Brand CA
    When he navigates to Publish Tab
    And he publish the brand <Brands> through Publish Models tab using <year> and <division>
    Then he should see the published Models data under the Pending Publish Queue
    Examples:
      | Brands              | year | division  |
      | Suburban Commercial | 2018 | Chevrolet |

  @TEST:GMIOMSUS-58003
  Scenario: Publish Tab - Publish changes of Edited Feature CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model  | Year | Category   | Category Type |
      | GMC      | Acadia | 2018 | drivetrain | FEATURE       |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58004
  Scenario: Publish Tab - Publish changes of Archived Feature CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model             | Year | Category  | Category Type |
      | Chevrolet | Express Passenger | 2017 | wheelbase | FEATURE       |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58005
  Scenario: Publish Tab - Publish changes through Edited Single RPO 1 CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model    | Year | Category     | Category Type |
      | GMC      | Yukon XL | 2017 | Transmission | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58006
  Scenario: Publish Tab - Publish changes through Added Single RPO 1 CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model    | Year | Category     | Category Type |
      | Chevrolet | Suburban | 2018 | Transmission | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58007
  Scenario: Publish Tab - Publish changes through Edited Multiple RPOs 1 CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | Engine   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58008
  Scenario: Publish Tab - Publish changes through Edited Multiple RPOs 2 CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | Engine   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58009
  Scenario: Publish Tab - Publish changes through Edited Single RPOs CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model    | Year | Category     | Category Type |
      | Buick    | LaCrosse | 2018 | Transmission | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58010
  Scenario: Publish Tab - Publish changes through Archived RPO CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model   | Year | Category       | Category Type |
      | Chevrolet | Equinox | 2017 | NO OPTION KIND | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58011
  Scenario: Publish Tab - Publish changes of Edited Category CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division | Model   | Year | Category              | Category Type |
      | GMC      | Terrain | 2017 | Fleet Incentive Model | RPO           |
    Then he should see the published Models data under the Pending Publish Queue

  @TEST:GMIOMSUS-58012
  Scenario: Publish Tab - Publish changes of Added New Category CA
    When he navigates to Publish Tab
    And he publish the following changes through Publish Models tab
      | Division  | Model | Year | Category | Category Type |
      | Chevrolet | Tahoe | 2017 | OnStar   | RPO           |
    Then he should see the published Models data under the Pending Publish Queue