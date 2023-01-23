@CanadaOnly @TEST:GMIOMSUS-59010
Feature: Staging ETL - Vehicle Status and CFD descriptions under Delta Tab CA

  Background:
    Given John logs into Data Viewer application for CA

  @Pending @TEST:GMIOMSUS-58993
  Scenario Outline: New Feature CFD added to Chrome File CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-58994
  Scenario Outline: New RPO CFD added to Chrome File CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle                | code | category       | status | Original English Description | Original French Description | English Original CFD | French Original CFD | New English Description | New French Description | English New CFD | French New CFD |
      | 2021 Cadillac Escalade | PDB  | NO OPTION KIND | EDITED | LPO, Onyx Package            | APL, groupe onyx            | LPO, Onyx Package    | APL, groupe onyx    | Onyx Package            | Groupe onyx            | Onyx Package    | Groupe onyx    |

  @Pending @TEST:GMIOMSUS-58995
  Scenario Outline: Existing Feature CFD edited in Chrome File CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-58996
  Scenario Outline: Existing RPO CFD edited in Chrome File CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-58997
  Scenario Outline: Existing Feature CFD removed in Chrome File CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-58998
  Scenario Outline: Existing RPO CFD removed in Chrome File CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-58999
  Scenario Outline: Feature has no Consumer Friendly, Incentive or Offer Description CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59000
  Scenario Outline: RPO has no Consumer Friendly, Incentive or Offer Description CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59001
  Scenario Outline: Feature has no Consumer Friendly or Offer Description CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59002
  Scenario Outline: RPO has no Consumer Friendly or Offer Description CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59003
  Scenario Outline: Feature has Chrome and Consumer Friendly Description but no Incentive or Offer description CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59004
  Scenario Outline: RPO has Chrome and Consumer Friendly Description but no Incentive or Offer description CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59005
  Scenario Outline: Feature has Chrome and Offer Description but no Consumer Friendly or Incentive Description CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59006
  Scenario Outline: RPO has Chrome and Offer Description but no Consumer Friendly or Incentive Description CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59007
  Scenario Outline: Feature has Chrome and Consumer Friendly Description but no Incentive and Offer Description CA
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59008
  Scenario Outline: RPO has Chrome and Consumer Friendly Description but no Incentive and Offer Description CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59009
  Scenario Outline: RPO has Chrome, Consumer Friendly, Incentive and Offer Description CA
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |




