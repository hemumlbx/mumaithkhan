@CanadaOnly @Master_Vehicle_DB
Feature: Publish ETL - Master Vehicle Database Descriptors Verification CA FR

  @TEST:GMIOMSUS-57929
  Scenario Outline: Publish Tab - Master Vehicle Database Search By Feature Descriptions CA FR
    When John queries to the database in CA for language French
      | Division | Model       | Year | Category | Category Type |
      | GMC      | Sierra 1500 | 2017 | cab      | crew          |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | CrewIncDescFré       | CrewOfrDescFré   |

  @TEST:GMIOMSUS-57930
  Scenario Outline: Publish Tab - Master Vehicle Database Search By RPO Descriptions using Single Edit CA FR
    When John queries to the database in CA for language French
      | Division  | Model    | Year | Category | Category Type |
      | Chevrolet | Traverse | 2018 | RPOCODE  | PCV           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | PCVIncDescFré        | PCVOfrDescFré    |

  @TEST:GMIOMSUS-57931
  Scenario Outline: Publish Tab - Master Vehicle Database Search By RPO Descriptions using Multiple Edits 1 CA FR
    When John queries to the database in CA for language French
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2017 | RPOCODE  | LFR           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescFré     | EngineOfrDescFré |

  @TEST:GMIOMSUS-57932
  Scenario Outline: Publish Tab - Master Vehicle Database Search By RPO Descriptions using Multiple Edits 2 CA FR
    When John queries to the database in CA for language French
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2018 | RPOCODE  | LCV           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescFré     | EngineOfrDescFré |

  @TEST:GMIOMSUS-57933
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Nameplate CA FR
    When John queries to the database in CA for language French
      | Division | Model | Year | Category  | Category Type |
      | Buick    | Regal | 2017 | NAMEPLATE | REGAL         |
    Then he should see chrome description <Chrome Description> added through publish ETL
    Examples:
      | Chrome Description |
      | Regal SedanFré     |

  @TEST:GMIOMSUS-57933
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Nameplate CA FR
    When John queries to the database in CA for language French
      | Division | Model           | Year | Category  | Category Type   |
      | Cadillac | ESCALADE ESVENG | 2019 | NAMEPLATE | ESCALADE ESVENG |
    Then he should see chrome description <Chrome Description> added through publish ETL
    Examples:
      | Chrome Description |
      | Escalade ESVFré    |

  @TEST:GMIOMSUS-57934
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Brand CA FR
    When John queries to the database in CA for language French
      | Division | Model     | Year | Category | Category Type |
      | Cadillac | CTS Sedan | 2017 | BRAND    | CTS SEDAN     |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription    |
      | CTS SedanIncDescFré  | CTS SedanOfrDescFré |

  @TEST:GMIOMSUS-57935
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Added Brand CA FR
    When John queries to the database in CA for language French
      | Division  | Model               | Year | Category | Category Type       |
      | CHEVROLET | SUBURBAN COMMERCIAL | 2018 | BRAND    | SUBURBAN COMMERCIAL |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    And he should see chrome description <Chrome Description> added through publish ETL
    Examples:
      | IncentiveDescription          | OfferDescription              | Chrome Description  |
      | Suburban CommercialIncDescFré | Suburban CommercialOfrDescFré | Suburban Commercial |

  @TEST:GMIOMSUS-57936
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Feature CA FR
    When John queries to the database in CA for language French
      | Division | Model  | Year | Category   | Category Type   |
      | GMC      | Acadia | 2018 | DRIVETRAIN | ALL WHEEL DRIVE |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription      | OfferDescription          |
      | All Wheel DriveIncDescFré | All Wheel DriveOfrDescFré |

  @TEST:GMIOMSUS-57937
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Single RPO 1 CA FR
    When John queries to the database in CA for language French
      | Division | Model    | Year | Category | Category Type |
      | GMC      | Yukon XL | 2017 | RPOCODE  | MYC           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | MYCIncDescFré        | MYCOfrDescFré    |

  @TEST:GMIOMSUS-57938
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Added Single RPO 1 CA FR
    When John queries to the database in CA for language French
      | Division  | Model    | Year | Category | Category Type |
      | Chevrolet | Suburban | 2018 | RPOCODE  | AA1           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | AA1IncDescFré        | AA1OfrDescFré    |

  @TEST:GMIOMSUS-57939
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Multiple RPOs 1 CA FR
    When John queries to the database in CA for language French
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | RPOCODE  | LWN           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescFré     | EngineOfrDescFré |

  @TEST:GMIOMSUS-57940
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Multiple RPOs 2 CA FR
    When John queries to the database in CA for language French
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | RPOCODE  | LCV           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescFré     | EngineOfrDescFré |

  @TEST:GMIOMSUS-57941
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Single RPOs CA FR
    When John queries to the database in CA for language French
      | Division | Model    | Year | Category | Category Type |
      | Buick    | LaCrosse | 2018 | RPOCODE  | M3G           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | M3GIncDescFré        | M3GOfrDescFré    |

  @TEST:GMIOMSUS-57942
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Category CA FR
    When John queries to the database in CA for language French
      | Division | Model   | Year | Category | Category Type |
      | GMC      | Terrain | 2017 | RPOCODE  | A4F           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | A4FIncDescFré        | A4FOfrDescFré    |

  @TEST:GMIOMSUS-57943
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Added New Category CA FR
    When John queries to the database in CA for language French
      | Division  | Model | Year | Category | Category Type |
      | Chevrolet | Tahoe | 2017 | RPOCODE  | UE1           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | UE1IncDescFré        | UE1OfrDescFré    |