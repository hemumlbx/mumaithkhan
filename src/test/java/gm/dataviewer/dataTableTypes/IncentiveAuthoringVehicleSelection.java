package gm.dataviewer.dataTableTypes;

public class IncentiveAuthoringVehicleSelection {
    String year;
    String division;
    String nameplate;
    String frenchNameplate;
    String brand;
    String frenchBrand;
    String attributeType;
    String attributeCategory;
    String attributeValue;
    String description;
    String frenchDescription;

    public IncentiveAuthoringVehicleSelection(String year, String division, String nameplate, String frenchNameplate, String brand, String frenchBrand, String attributeType, String attributeCategory, String attributeValue, String description, String frenchDescription) {
        if (year == null) {
            throw new IllegalArgumentException("year should not be null");
        }
        if (division == null) {
            throw new IllegalArgumentException("division should not be null");
        }
        if (nameplate == null) {
            throw new IllegalArgumentException("nameplate should not be null");
        }
        if (frenchNameplate == null) {
            throw new IllegalArgumentException("French nameplate should not be null");
        }
        if (brand == null) {
            throw new IllegalArgumentException("brand should not be null");
        }
        if (frenchBrand == null) {
            throw new IllegalArgumentException("French brand should not be null");
        }
        if (attributeType == null) {
            throw new IllegalArgumentException("attributeType should not be null");
        }
        if (attributeCategory == null) {
            throw new IllegalArgumentException("attributeCategory should not be null");
        }
        if (attributeValue == null) {
            throw new IllegalArgumentException("attributeValue should not be null");
        }
        if (description == null) {
            throw new IllegalArgumentException("description should not be null");
        }
        if (frenchDescription == null) {
            throw new IllegalArgumentException("frenchDescription should not be null");
        }

        this.year = year;
        this.division = division;
        this.nameplate = nameplate;
        this.frenchNameplate = frenchNameplate;
        this.brand = brand;
        this.frenchBrand = frenchBrand;
        this.attributeType = attributeType;
        this.attributeCategory = attributeCategory;
        this.attributeValue = attributeValue;
        this.description = description;
        this.frenchDescription = frenchDescription;
    }

    public String getYear() {
        return year;
    }

    public String getDivision() {
        return division;
    }

    public String getNameplate() {
        return nameplate;
    }

    public String getFrenchNameplate() {
        return frenchNameplate;
    }

    public String getBrand() {
        return brand;
    }

    public String getFrenchBrand() {
        return frenchBrand;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public String getDescription() {
        return description;
    }

    public String getFrenchDescription() {
        return frenchDescription;
    }

}
