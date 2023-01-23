package gm.dataviewer.dataTableTypes;

public class SearchTabVehicleInformation {
    String year;
    String division;
    String brand;

    public SearchTabVehicleInformation(String year, String division, String brand) {
        if (year == null) {
            throw new IllegalArgumentException("Year should not be null");
        }
        if (division == null) {
            throw new IllegalArgumentException("Division should not be null");
        }
        if (brand == null) {
            throw new IllegalArgumentException("Brand should not be null");
        }
        this.year = year;
        this.division = division;
        this.brand = brand;
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

}
