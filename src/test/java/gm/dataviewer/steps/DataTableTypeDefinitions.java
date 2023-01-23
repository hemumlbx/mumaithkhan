package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.*;
import gm.dataviewer.utils.*;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableTypeDefinitions {

    @DataTableType
    public DataviewerPublishDescriptions defineDescriptionsInformation(Map<String, String> entry) {
        return new DataviewerPublishDescriptions
                (entry.get("English Incentive Description"), entry.get("English Offer Description"), entry.get("French Incentive Description"), entry.get("French Offer Description"));
    }

    @DataTableType
    public DataviewerPublishNameplateDescriptions defineNameplateInformation(Map<String, String> entry) {
        return new DataviewerPublishNameplateDescriptions
                (entry.get("Division"), entry.get("Model"), entry.get("Year"), entry.get("English Nameplate"), entry.get("French Nameplate"));
    }

    @DataTableType
    public DataviewerPublishBrandDescriptions defineBrandDescriptions(Map<String, String> entry) {
        return new DataviewerPublishBrandDescriptions
                (entry.get("Division"), entry.get("Model"), entry.get("Year"), entry.get("English Incentive Description"), entry.get("English Offer Description"), entry.get("French Incentive Description"), entry.get("French Offer Description"), entry.get("English Chrome Description"), entry.get("French Chrome Description"));
    }

    @DataTableType
    public DataviewerPublishFeatureDescriptions defineFeatureDescriptions(Map<String, String> entry) {
        return new DataviewerPublishFeatureDescriptions
                (entry.get("Division"), entry.get("Model"), entry.get("Year"), entry.get("Category"), entry.get("Status"), entry.get("Feature Value"), entry.get("English Incentive Description"), entry.get("English Offer Description"), entry.get("French Incentive Description"), entry.get("French Offer Description"));
    }

    @DataTableType
    public DataviewerPublishChanges publishChanges(Map<String, String> entry) {
        return new DataviewerPublishChanges
                (entry.get("Division"), entry.get("Model"), entry.get("Year"), entry.get("Category"), entry.get("Category Type"));
    }

    @DataTableType
    public IncentiveAuthoringVehicleSelection authoringSelections(Map<String, String> entry) {
        return new IncentiveAuthoringVehicleSelection
                (entry.get("Year"), entry.get("Division"), entry.get("Nameplate"), entry.get("French Nameplate"), entry.get("Brand"), entry.get("French Brand"), entry.get("Attribute Type"), entry.get("Attribute Category"), entry.get("Attribute Value"), entry.get("English Description"), entry.get("French Description"));
    }

    @DataTableType
    public ProgramSearchVehicleInformation searchUsingVehicle(Map<String, String> entry) {
        return new ProgramSearchVehicleInformation
                (entry.get("Year"), entry.get("Division"), entry.get("Brand"));
    }

    @DataTableType
    public ProgramFilterRequestInformation defineProgramFilterRequestInformation(Map<String, String> entry) {
        return new ProgramFilterRequestInformation
                (entry.get("Request FVD"), entry.get("Request GVD"), entry.get("Audience"), entry.get("Consumer Visibility"), entry.get("Display Region"), entry.get("Recipient"), entry.get("Program Type"), entry.get("Purchase Type"), entry.get("Delivery Type"), entry.get("Inventory Status"), entry.get("Order Type"), entry.get("Financial Provider"), entry.get("Tiered Rate List"), entry.get("Model Years"), entry.get("Customer Type"), entry.get("Conquest Vehicle List"), entry.get("Loyalty Vehicle List"), entry.get("Mileage Type"), entry.get("Program ID"), entry.get("Program Returned"));
    }

    @DataTableType
    public GVDRequestInformation defineGVDRequestInformation(Map<String, String> entry) {
        return new GVDRequestInformation(entry.get("Request FVD"), entry.get("Request FGD"), entry.get("Program ID"), entry.get("Program GVD"), entry.get("Program FVD"), entry.get("Incentive FVD"), entry.get("Incentive Value"), entry.get("Program Returned"), entry.get("Header"));
    }

    @DataTableType
    public GVORequestInformation defineGVORequestInformation(Map<String, String> entry) {
        return new GVORequestInformation(entry.get("Request FVD"), entry.get("Request FGD"), entry.get("Offer Name"), entry.get("Offer Returned"), entry.get("Offer Header"), entry.get("Program Name"));
    }

    @DataTableType
    public SearchTabVehicleInformation defineSearchTabInformation(Map<String, String> entry) {
        return new SearchTabVehicleInformation(entry.get("Year"), entry.get("Division"), entry.get("Brand"));
    }
}
