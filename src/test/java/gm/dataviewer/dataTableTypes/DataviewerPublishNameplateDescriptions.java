package gm.dataviewer.dataTableTypes;

public class DataviewerPublishNameplateDescriptions {
    String division;
    String model;
    String year;
    String englishNameplate;
    String frenchNameplate;

    public DataviewerPublishNameplateDescriptions(String division, String model, String year, String englishNameplate,String frenchNameplate) {
        if (division == null) {
            throw new IllegalArgumentException("Division should not be null");
        }
        if (model == null) {
            throw new IllegalArgumentException("Model should not be null");
        }
        if (year == null) {
            throw new IllegalArgumentException("Year should not be null");
        }
        if (englishNameplate == null) {
            throw new IllegalArgumentException("EnglishNameplate should not be null");
        }
        if (frenchNameplate == null) {
            throw new IllegalArgumentException("FrenchNameplate should not be null");
        }

        this.division = division;
        this.model = model;
        this.year = year;
        this.englishNameplate = englishNameplate;
        this.frenchNameplate = frenchNameplate;
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

    public String getEnglishNameplate() {
        return englishNameplate;
    }

    public String getFrenchNameplate() {
        return frenchNameplate;
    }

}
