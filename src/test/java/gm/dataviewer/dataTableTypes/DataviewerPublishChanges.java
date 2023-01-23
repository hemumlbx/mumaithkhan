package gm.dataviewer.dataTableTypes;

public class DataviewerPublishChanges {
    String division;
    String model;
    String year;
    String category;
    String categoryType;

    public DataviewerPublishChanges(String division, String model, String year, String category, String categoryType) {
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
        if (categoryType == null) {
            throw new IllegalArgumentException("categoryType should not be null");
        }

        this.division = division;
        this.model = model;
        this.year = year;
        this.category = category;
        this.categoryType = categoryType;
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

    public String getCategoryType() {
        return categoryType;
    }

}
