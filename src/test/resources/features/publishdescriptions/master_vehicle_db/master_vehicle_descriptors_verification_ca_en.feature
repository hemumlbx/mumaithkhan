@CanadaOnly @Master_Vehicle_DB
Feature: Publish ETL - Master Vehicle Database Descriptors Verification CA EN

  @TEST:GMIOMSUS-57914
  Scenario Outline: Publish Tab - Master Vehicle Database Search By Feature Descriptions CA EN
    When John queries to the database in CA for language English
      | Division | Model       | Year | Category | Category Type |
      | GMC      | Sierra 1500 | 2017 | cab      | crew          |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | CrewIncDescEng       | CrewOfrDescEng   |

  @TEST:GMIOMSUS-57915
  Scenario Outline: Publish Tab - Master Vehicle Database Search By RPO Descriptions using Single Edit CA EN
    When John queries to the database in CA for language English
      | Division  | Model    | Year | Category | Category Type |
      | Chevrolet | Traverse | 2018 | RPOCODE  | PCV           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | PCVIncDescEng        | PCVOfrDescEng    |

  @TEST:GMIOMSUS-57916
  Scenario Outline: Publish Tab - Master Vehicle Database Search By RPO Descriptions using Multiple Edits 1 CA EN
    When John queries to the database in CA for language English
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2017 | RPOCODE  | LFR           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescEng     | EngineOfrDescEng |

  @TEST:GMIOMSUS-57917
  Scenario Outline: Publish Tab - Master Vehicle Database Search By RPO Descriptions using Multiple Edits 2 CA EN
    When John queries to the database in CA for language English
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2018 | RPOCODE  | LCV           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescEng     | EngineOfrDescEng |

  @TEST:GMIOMSUS-57918
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Nameplate CA EN
    When John queries to the database in CA for language English
      | Division | Model | Year | Category  | Category Type |
      | Buick    | Regal | 2017 | NAMEPLATE | REGAL         |
    Then he should see chrome description <Chrome Description> added through publish ETL
    Examples:
      | Chrome Description |
      | Regal SedanEng     |

  @TEST:GMIOMSUS-57918
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Nameplate CA EN
    When John queries to the database in CA for language English
      | Division | Model           | Year | Category  | Category Type   |
      | Cadillac | ESCALADE ESVENG | 2019 | NAMEPLATE | ESCALADE ESVENG |
    Then he should see chrome description <Chrome Description> added through publish ETL
    Examples:
      | Chrome Description |
      | Escalade ESVEng    |

  @TEST:GMIOMSUS-57919
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Brand CA EN
    When John queries to the database in CA for language English
      | Division | Model     | Year | Category | Category Type |
      | Cadillac | CTS Sedan | 2017 | BRAND    | CTS SEDAN     |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription    |
      | CTS SedanIncDescEng  | CTS SedanOfrDescEng |

  @TEST:GMIOMSUS-57920
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Added Brand CA EN
    When John queries to the database in CA for language English
      | Division  | Model               | Year | Category | Category Type       |
      | CHEVROLET | SUBURBAN COMMERCIAL | 2018 | BRAND    | SUBURBAN COMMERCIAL |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    And he should see chrome description <Chrome Description> added through publish ETL
    Examples:
      | IncentiveDescription          | OfferDescription              | Chrome Description  |
      | Suburban CommercialIncDescEng | Suburban CommercialOfrDescEng | Suburban Commercial |

  @TEST:GMIOMSUS-57921
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Feature CA EN
    When John queries to the database in CA for language English
      | Division | Model  | Year | Category   | Category Type   |
      | GMC      | Acadia | 2018 | DRIVETRAIN | ALL WHEEL DRIVE |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription      | OfferDescription          |
      | All Wheel DriveIncDescEng | All Wheel DriveOfrDescEng |

  @TEST:GMIOMSUS-57922
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Single RPO 1 CA EN
    When John queries to the database in CA for language English
      | Division | Model    | Year | Category | Category Type |
      | GMC      | Yukon XL | 2017 | RPOCODE  | MYC           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | MYCIncDescEng        | MYCOfrDescEng    |

  @TEST:GMIOMSUS-57923
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Added Single RPO 1 CA EN
    When John queries to the database in CA for language English
      | Division  | Model    | Year | Category | Category Type |
      | Chevrolet | Suburban | 2018 | RPOCODE  | AA1           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | AA1IncDescEng        | AA1OfrDescEng    |

  @TEST:GMIOMSUS-57924
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Multiple RPOs 1 CA EN
    When John queries to the database in CA for language English
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | RPOCODE  | LWN           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescEng     | EngineOfrDescEng |

  @TEST:GMIOMSUS-57925
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Multiple RPOs 2 CA EN
    When John queries to the database in CA for language English
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | RPOCODE  | LCV           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescEng     | EngineOfrDescEng |

  @TEST:GMIOMSUS-57926
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Single RPOs CA EN
    When John queries to the database in CA for language English
      | Division | Model    | Year | Category | Category Type |
      | Buick    | LaCrosse | 2018 | RPOCODE  | M3G           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | M3GIncDescEng        | M3GOfrDescEng    |

  @TEST:GMIOMSUS-57927
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Category CA EN
    When John queries to the database in CA for language English
      | Division | Model   | Year | Category | Category Type |
      | GMC      | Terrain | 2017 | RPOCODE  | A4F           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | A4FIncDescEng        | A4FOfrDescEng    |

  @TEST:GMIOMSUS-57928
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Added New Category CA EN
    When John queries to the database in CA for language English
      | Division  | Model | Year | Category | Category Type |
      | Chevrolet | Tahoe | 2017 | RPOCODE  | UE1           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | UE1IncDescEng        | UE1OfrDescEng    |