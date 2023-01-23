package gm.dataviewer.dataTableTypes;

public class DataviewerPublishBrandDescriptions {
    String division;
    String model;
    String year;
    String englishIncentiveDescription;
    String englishOfferDescription;
    String frenchIncentiveDescription;
    String frenchOfferDescription;
    String chromeEnglishDescription;
    String chromeFrenchDescription;

    public DataviewerPublishBrandDescriptions(String division, String model, String year, String englishIncentiveDescription, String englishOfferDescription, String frenchIncentiveDescription, String frenchOfferDescription, String chromeEnglishDescription, String chromeFrenchDescription) {
        if (englishIncentiveDescription == null) {
            throw new IllegalArgumentException("EnglishIncentiveDescription should not be null");
        }
        if (englishOfferDescription == null) {
            throw new IllegalArgumentException("EnglishOfferDescription should not be null");
        }
        if (frenchIncentiveDescription == null) {
            throw new IllegalArgumentException("FrenchIncentiveDescription should not be null");
        }
        if (frenchOfferDescription == null) {
            throw new IllegalArgumentException("FrenchOfferDescription should not be null");
        }
        if (division == null) {
            throw new IllegalArgumentException("division should not be null");
        }
        if (model == null) {
            throw new IllegalArgumentException("model should not be null");
        }
        if (year == null) {
            throw new IllegalArgumentException("year should not be null");
        }
        if (chromeEnglishDescription == null) {
            throw new IllegalArgumentException("chromeEnglishDescription should not be null");
        }
        if (chromeFrenchDescription == null) {
            throw new IllegalArgumentException("chromeFrenchDescription should not be null");
        }

        this.division = division;
        this.model = model;
        this.year = year;
        this.englishIncentiveDescription = englishIncentiveDescription;
        this.englishOfferDescription = englishOfferDescription;
        this.frenchIncentiveDescription = frenchIncentiveDescription;
        this.frenchOfferDescription = frenchOfferDescription;
        this.chromeEnglishDescription = chromeEnglishDescription;
        this.chromeFrenchDescription = chromeFrenchDescription;
    }

    public String division() {
        return division;
    }

    public String model() {
        return model;
    }

    public String year() {
        return year;
    }

    public String getEnglishIncentiveDescription() {
        return englishIncentiveDescription;
    }

    public String getEnglishOfferDescription() {
        return englishOfferDescription;
    }

    public String getFrenchIncentiveDescription() {
        return frenchIncentiveDescription;
    }

    public String getFrenchOfferDescription() {
        return frenchOfferDescription;
    }

    public String chromeEnglishDescription() {
        return chromeEnglishDescription;
    }

    public String chromeFrenchDescription() {
        return chromeFrenchDescription;
    }

}
