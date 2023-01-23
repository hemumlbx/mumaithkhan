package gm.dataviewer.dataTableTypes;

public class DataviewerPublishFeatureDescriptions {
    String division;
    String model;
    String year;
    String category;
    String status;
    String featureValue;
    String englishIncentiveDescription;
    String englishOfferDescription;
    String frenchIncentiveDescription;
    String frenchOfferDescription;

    public DataviewerPublishFeatureDescriptions(String division, String model, String year, String category, String status, String featureValue, String englishIncentiveDescription, String englishOfferDescription, String frenchIncentiveDescription, String frenchOfferDescription) {
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
        if (category == null) {
            throw new IllegalArgumentException("category should not be null");
        }
        if (status == null) {
            throw new IllegalArgumentException("status should not be null");
        }
        if (featureValue == null) {
            throw new IllegalArgumentException("featureValue should not be null");
        }

        this.division = division;
        this.model = model;
        this.year = year;
        this.category = category;
        this.status = status;
        this.featureValue = featureValue;
        this.englishIncentiveDescription = englishIncentiveDescription;
        this.englishOfferDescription = englishOfferDescription;
        this.frenchIncentiveDescription = frenchIncentiveDescription;
        this.frenchOfferDescription = frenchOfferDescription;
    }

    public String getDivision() {
        return division;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public String getFeatureValue() {
        return featureValue;
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

}
