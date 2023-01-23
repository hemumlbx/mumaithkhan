package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.*;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DVDataTableTypeDefinitions {

    @DataTableType
    public DataviewerSearchFeature defineFeatureSearchInformation(Map<String, String> entry) {
        return new DataviewerSearchFeature
                (entry.get("Year"), entry.get("Division"), entry.get("Brand"), entry.get("Category"), entry.get("Status"));
    }
    @DataTableType
    public DataviewerSearchCategory defineCategorySearchInformation(Map<String, String> entry) {
        return new DataviewerSearchCategory
                (entry.get("Year"), entry.get("Division"), entry.get("Brand"), entry.get("Category"), entry.get("Status"));
    }
    @DataTableType
    public DataviewerDeltaBrandsList defineDeltaBrandsList(Map<String, String> entry) {
        return new DataviewerDeltaBrandsList
                (entry.get("status"), entry.get("newField"), entry.get("original"));
    }
    @DataTableType
    public DataviewerSelectVehicle defineVehicleSelection(Map<String, String> entry) {
        return new DataviewerSelectVehicle
                (entry.get("brand"), entry.get("division"), entry.get("status"));
    }
}
