package gm.dataviewer.dataTableTypes;

public class DataviewerSearchFeature {
    String year;
    String division;
    String brand;
    String category;
    String status;

    public DataviewerSearchFeature(String year, String division, String brand, String category, String status) {
        if (year == null) {
            throw new IllegalArgumentException("year should not be null");
        }
        if (division == null) {
            throw new IllegalArgumentException("division should not be null");
        }
        if (brand == null) {
            throw new IllegalArgumentException("brand should not be null");
        }
        if (category == null) {
            throw new IllegalArgumentException("category should not be null");
        }
        if (status == null) {
            throw new IllegalArgumentException("status should not be null");
        }

        this.year = year;
        this.division = division;
        this.brand = brand;
        this.category = category;
        this.status = status;
    }

    public String year() {
        return year;
    }

    public String division() {
        return division;
    }

    public String brand() {
        return brand;
    }

    public String category() {
        return category;
    }

    public String status() {
        return status;
    }

}
