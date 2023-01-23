package gm.dataviewer.dataTableTypes;

public class DataviewerPublishDescriptions {
    String englishIncentiveDescription;
    String englishOfferDescription;
    String frenchIncentiveDescription;
    String frenchOfferDescription;

    public DataviewerPublishDescriptions(String englishIncentiveDescription, String englishOfferDescription, String frenchIncentiveDescription, String frenchOfferDescription) {
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

        this.englishIncentiveDescription = englishIncentiveDescription;
        this.englishOfferDescription = englishOfferDescription;
        this.frenchIncentiveDescription = frenchIncentiveDescription;
        this.frenchOfferDescription = frenchOfferDescription;
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
