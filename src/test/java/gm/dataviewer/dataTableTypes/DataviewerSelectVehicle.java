package gm.dataviewer.dataTableTypes;

public class DataviewerSelectVehicle {
    String brand;
    String division;
    String status;

    public DataviewerSelectVehicle(String brand, String division, String status) {
        if (brand == null) {
            throw new IllegalArgumentException("brand should not be null");
        }
        if (division == null) {
            throw new IllegalArgumentException("division should not be null");
        }
        if (status == null) {
            throw new IllegalArgumentException("status should not be null");
        }

        this.brand = brand;
        this.division = division;
        this.status = status;
    }

    public String brand() {
        return brand;
    }

    public String division() {
        return division;
    }

    public String status() {
        return status;
    }

}
