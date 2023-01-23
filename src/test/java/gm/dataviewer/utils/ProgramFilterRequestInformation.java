package gm.dataviewer.utils;

public class ProgramFilterRequestInformation {

    private String requestFVD;
    private String requestGVD;
    private String audience;
    private String consumerVisibility;
    private String displayRegion;
    private String recipient;
    private String programType;
    private String purchaseType;
    private String deliveryType;
    private String inventoryStatus;
    private String orderType;
    private String financialProvider;
    private String tieredRateList;
    private String modelYears;
    private String customerType;
    private String conquestVehicleList;
    private String loyaltyVehicleList;
    private String mileageType;
    private String programID;
    private String programReturned;

    public ProgramFilterRequestInformation(String requestFVD, String requestGVD, String audience, String consumerVisibility,
                                           String displayRegion, String recipient, String programType, String purchaseType,
                                           String deliveryType, String inventoryStatus, String orderType, String financialProvider,
                                           String tieredRateList, String modelYears, String customerType, String conquestVehicleList,
                                           String loyaltyVehicleList, String mileageType, String programID, String programReturned) {
        this.requestFVD = requestFVD;
        this.requestGVD = requestGVD;
        this.audience = audience;
        this.consumerVisibility = consumerVisibility;
        this.displayRegion = displayRegion;
        this.recipient = recipient;
        this.programType = programType;
        this.purchaseType = purchaseType;
        this.deliveryType = deliveryType;
        this.inventoryStatus = inventoryStatus;
        this.orderType = orderType;
        this.financialProvider = financialProvider;
        this.tieredRateList = tieredRateList;
        this.modelYears = modelYears;
        this.customerType = customerType;
        this.conquestVehicleList = conquestVehicleList;
        this.loyaltyVehicleList = loyaltyVehicleList;
        this.mileageType = mileageType;
        this.programID = programID;
        this.programReturned = programReturned;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getConsumerVisibility() {
        return consumerVisibility;
    }

    public void setConsumerVisibility(String consumerVisibility) {
        this.consumerVisibility = consumerVisibility;
    }

    public String getDisplayRegion() {
        return displayRegion;
    }

    public void setDisplayRegion(String displayRegion) {
        this.displayRegion = displayRegion;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(String programType) {
        this.programType = programType;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getFinancialProvider() {
        return financialProvider;
    }

    public void setFinancialProvider(String financialProvider) {
        this.financialProvider = financialProvider;
    }

    public String getTieredRateList() {
        return tieredRateList;
    }

    public void setTieredRateList(String tieredRateList) {
        this.tieredRateList = tieredRateList;
    }

    public String getModelYears() {
        return modelYears;
    }

    public void setModelYears(String modelYears) {
        this.modelYears = modelYears;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getConquestVehicleList() {
        return conquestVehicleList;
    }

    public void setConquestVehicleList(String conquestVehicleList) {
        this.conquestVehicleList = conquestVehicleList;
    }

    public String getLoyaltyVehicleList() {
        return loyaltyVehicleList;
    }

    public void setLoyaltyVehicleList(String loyaltyVehicleList) {
        this.loyaltyVehicleList = loyaltyVehicleList;
    }

    public String getMileageType() {
        return mileageType;
    }

    public void setMileageType(String mileageType) {
        this.mileageType = mileageType;
    }

    public String getRequestFVD() {
        return requestFVD;
    }

    public void setRequestFVD(String requestFVD) {
        this.requestFVD = requestFVD;
    }

    public String getRequestGVD() {
        return requestGVD;
    }

    public void setRequestGVD(String requestGVD) {
        this.requestGVD = requestGVD;
    }

    public String getProgramID() {
        return programID;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public String getProgramReturned() {
        return programReturned;
    }

    public void setProgramReturned(String programReturned) {
        this.programReturned = programReturned;
    }

}
