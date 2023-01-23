@CanadaOnly @TEST:GMIOMSUS-59028
Feature: Staging ETL - Vehicle Status and CFD descriptions under Delta Tab US

  Background:
    Given John logs into Data Viewer application for US

  @Pending @TEST:GMIOMSUS-59011
  Scenario Outline: New Feature CFD added to Chrome File US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59012
  Scenario Outline: New RPO CFD added to Chrome File US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle                | code | category       | status | Original English Description | Original French Description | English Original CFD | French Original CFD | New English Description | New French Description | English New CFD | French New CFD |
      | 2021 Cadillac Escalade | PDB  | NO OPTION KIND | EDITED | LPO, Onyx Package            | APL, groupe onyx            | LPO, Onyx Package    | APL, groupe onyx    | Onyx Package            | Groupe onyx            | Onyx Package    | Groupe onyx    |

  @Pending @TEST:GMIOMSUS-59013
  Scenario Outline: Existing Feature CFD edited in Chrome File US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59014
  Scenario Outline: Existing RPO CFD edited in Chrome File US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59015
  Scenario Outline: Existing Feature CFD removed in Chrome File US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59016
  Scenario Outline: Existing RPO CFD removed in Chrome File US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59017
  Scenario Outline: Feature has no Consumer Friendly, Incentive or Offer Description US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59018
  Scenario Outline: RPO has no Consumer Friendly, Incentive or Offer Description US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59019
  Scenario Outline: Feature has no Consumer Friendly or Offer Description US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59020
  Scenario Outline: RPO has no Consumer Friendly or Offer Description US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59021
  Scenario Outline: Feature has Chrome and Consumer Friendly Description but no Incentive or Offer description US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59022
  Scenario Outline: RPO has Chrome and Consumer Friendly Description but no Incentive or Offer description US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59023
  Scenario Outline: Feature has Chrome and Offer Description but no Consumer Friendly or Incentive Description US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59024
  Scenario Outline: RPO has Chrome and Offer Description but no Consumer Friendly or Incentive Description US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59025
  Scenario Outline: Feature has Chrome and Consumer Friendly Description but no Incentive and Offer Description US
    When he opens the Features under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59026
  Scenario Outline: RPO has Chrome and Consumer Friendly Description but no Incentive and Offer Description US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

  @Pending @TEST:GMIOMSUS-59027
  Scenario Outline: RPO has Chrome, Consumer Friendly, Incentive and Offer Description US
    When he opens the RPOs under Delta Tab
    Then he should see <vehicle> for <code> and <category> with <status> in original column with <Original English Description> and <Original French Description> with <English Original CFD> and <French Original CFD>
    And he should see <vehicle> for <code> and <category> with <status> in new column with <New English Description> and <New French Description> with <English New CFD> and <French New CFD>
    Examples:
      | vehicle             | code | category | status | Original English Description      | Original French Description              | English Original CFD | French Original CFD | New English Description           | New French Description                   | English New CFD | French New CFD |
      | 2022 Buick Envision | 1SL  | PEG      | EDITED | Essence Preferred Equipment Group | Groupe d'équipements privilégiés Essence | null                 | null                | Essence Preferred equipment group | Groupe d'équipements privilégiés Essence | null            | null           |

