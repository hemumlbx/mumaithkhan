@USOnly @Master_Vehicle_DB
Feature: Publish ETL - Master Vehicle Database Descriptors Verification US

  @TEST:GMIOMSUS-57944
  Scenario Outline: Publish Tab - Master Vehicle Database Search By Feature Descriptions US
    When John queries to the database in US for language English
      | Division | Model       | Year | Category | Category Type |
      | GMC      | Sierra 1500 | 2017 | cab      | crew          |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | CrewIncDescEng       | CrewOfrDescEng   |

  @TEST:GMIOMSUS-57945
  Scenario Outline: Publish Tab - Master Vehicle Database Search By RPO Descriptions using Single Edit US
    When John queries to the database in US for language English
      | Division  | Model    | Year | Category | Category Type |
      | Chevrolet | Traverse | 2018 | RPOCODE  | PCV           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | PCVIncDescEng        | PCVOfrDescEng    |

  @TEST:GMIOMSUS-57946
  Scenario Outline: Publish Tab - Master Vehicle Database Search By RPO Descriptions using Multiple Edits 1 US
    When John queries to the database in US for language English
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2017 | RPOCODE  | LFR           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescEng     | EngineOfrDescEng |

  @TEST:GMIOMSUS-57947
  Scenario Outline: Publish Tab - Master Vehicle Database Search By RPO Descriptions using Multiple Edits 2 US
    When John queries to the database in US for language English
      | Division  | Model  | Year | Category | Category Type |
      | Chevrolet | Impala | 2018 | RPOCODE  | LCV           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescEng     | EngineOfrDescEng |

  @TEST:GMIOMSUS-57948
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Nameplate US
    When John queries to the database in US for language English
      | Division | Model | Year | Category  | Category Type |
      | Buick    | Regal | 2017 | NAMEPLATE | REGAL         |
    Then he should see chrome description <Chrome Description> added through publish ETL
    Examples:
      | Chrome Description |
      | Regal SedanEng     |

  @TEST:GMIOMSUS-57948
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Nameplate US
    When John queries to the database in US for language English
      | Division | Model           | Year | Category  | Category Type   |
      | Cadillac | ESCALADE ESVENG | 2019 | NAMEPLATE | ESCALADE ESVENG |
    Then he should see chrome description <Chrome Description> added through publish ETL
    Examples:
      | Chrome Description |
      | Escalade ESVEng    |

  @TEST:GMIOMSUS-57949
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Brand US
    When John queries to the database in US for language English
      | Division | Model     | Year | Category | Category Type |
      | Cadillac | CTS Sedan | 2017 | BRAND    | CTS SEDAN     |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription    |
      | CTS SedanIncDescEng  | CTS SedanOfrDescEng |

  @TEST:GMIOMSUS-57950
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Added Brand US
    When John queries to the database in US for language English
      | Division  | Model               | Year | Category | Category Type       |
      | CHEVROLET | SUBURBAN COMMERCIAL | 2018 | BRAND    | SUBURBAN COMMERCIAL |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    And he should see chrome description <Chrome Description> added through publish ETL
    Examples:
      | IncentiveDescription          | OfferDescription              | Chrome Description  |
      | Suburban CommercialIncDescEng | Suburban CommercialOfrDescEng | Suburban Commercial |

  @TEST:GMIOMSUS-57951
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Feature US
    When John queries to the database in US for language English
      | Division | Model  | Year | Category   | Category Type |
      | GMC      | Acadia | 2018 | DRIVETRAIN | AWD           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | AWDIncDescEng        | AWDOfrDescEng    |

  @TEST:GMIOMSUS-57952
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Single RPO 1 US
    When John queries to the database in US for language English
      | Division | Model    | Year | Category | Category Type |
      | GMC      | Yukon XL | 2017 | RPOCODE  | MYC           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | MYCIncDescEng        | MYCOfrDescEng    |

  @TEST:GMIOMSUS-57953
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Added Single RPO 1 US
    When John queries to the database in US for language English
      | Division  | Model    | Year | Category | Category Type |
      | Chevrolet | Suburban | 2018 | RPOCODE  | AA1           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | AA1IncDescEng        | AA1OfrDescEng    |

  @TEST:GMIOMSUS-57954
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Multiple RPOs 1 US
    When John queries to the database in US for language English
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | RPOCODE  | LWN           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescEng     | EngineOfrDescEng |

  @TEST:GMIOMSUS-57955
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Multiple RPOs 2 US
    When John queries to the database in US for language English
      | Division | Model  | Year | Category | Category Type |
      | GMC      | Canyon | 2017 | RPOCODE  | LCV           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | EngineIncDescEng     | EngineOfrDescEng |

  @TEST:GMIOMSUS-57956
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes through Edited Single RPOs US
    When John queries to the database in US for language English
      | Division | Model    | Year | Category | Category Type |
      | Buick    | LaCrosse | 2018 | RPOCODE  | M3G           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | M3GIncDescEng        | M3GOfrDescEng    |

  @TEST:GMIOMSUS-57957
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Edited Category US
    When John queries to the database in US for language English
      | Division  | Model    | Year | Category | Category Type |
      | CHEVROLET | COLORADO | 2017 | RPOCODE  | FVX           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | FVXIncDescEng        | FVXOfrDescEng    |

  @TEST:GMIOMSUS-57958
  Scenario Outline: Publish Tab - Master Vehicle Database Publish changes of Added New Category US
    When John queries to the database in US for language English
      | Division  | Model | Year | Category | Category Type |
      | Chevrolet | Tahoe | 2017 | RPOCODE  | UE1           |
    Then he should see <IncentiveDescription> and <OfferDescription> added through publish ETL
    Examples:
      | IncentiveDescription | OfferDescription |
      | UE1IncDescEng        | UE1OfrDescEng    |