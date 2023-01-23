package gm.dataviewer.dataTableTypes;

public class ProgramSearchVehicleInformation {
    String year;
    String division;
    String model;

    public ProgramSearchVehicleInformation(String year, String division, String model) {
        if (division == null) {
            throw new IllegalArgumentException("division should not be null");
        }
        if (model == null) {
            throw new IllegalArgumentException("model should not be null");
        }
        if (year == null) {
            throw new IllegalArgumentException("year should not be null");
        }

        this.division = division;
        this.model = model;
        this.year = year;
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

}
