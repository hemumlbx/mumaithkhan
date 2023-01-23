package gm.dataviewer.model;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import java.util.List;
import java.util.Map;

public class ObjectRequestBuilder {

    private String requestFVD;
    private String requestFGD;
    private String programId;
    private List<String> startDate;
    private List<String> endDate;
    private String programGvd;
    private String fvdIncentive;
    private String incentiveVal;
    private String header;
    private Map<String, Object> jsonAsMap;
    private RequestSpecification requestSpecification;
    private Response response;
    private ValidatableResponse json;
    private String programReturnResponse;
    private String lowerLimit;
    private String upperLimit;
    private String mustBeMet;
    private String programLowerLimit;
    private String programUpperLimit;

    private String campaignID;
    private String customerID;
    private String vin;

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
    private String offerType;
    private String offerReturned;
    private String offerID;



    private String offerName;

    public ObjectRequestBuilder(String requestFVD, String requestFGD, List<String> startDates, List<String> endDates,
                                String programId, String programGvd, String fvdIncentive, String incentiveVal, String programReturnResponse,
                                Map<String, Object> jsonAsMap,
                                RequestSpecification requestSpecification, Response response, ValidatableResponse json) {
        this.requestFVD = requestFVD;
        this.requestFGD = requestFGD;
        this.programId = programId;
        this.programGvd = programGvd;
        this.fvdIncentive = fvdIncentive;
        this.incentiveVal = incentiveVal;
        this.jsonAsMap = jsonAsMap;
        this.requestSpecification = requestSpecification;
        this.response = response;
        this.json = json;
        this.programReturnResponse = programReturnResponse;
        this.startDate = startDates;
        this.endDate = endDates;
    }

    public ObjectRequestBuilder(String offerName, String offerReturned, String requestFVD, String requestGVD, String audience, String consumerVisibility,
                                String displayRegion, String purchaseType, String offerType,
                                String deliveryType, String inventoryStatus, String orderType, String financialProvider,
                                String modelYears, String customerType, String conquestVehicleList,
                                String loyaltyVehicleList,
                                Map<String, Object> jsonAsMap,
                                RequestSpecification requestSpecification, Response response, ValidatableResponse json) {
        this.jsonAsMap = jsonAsMap;
        this.requestSpecification = requestSpecification;
        this.response = response;
        this.json = json;
        this.requestFVD = requestFVD;
        this.programReturnResponse = offerReturned;
        this.requestGVD = requestGVD;
        this.audience = audience;
        this.consumerVisibility = consumerVisibility;
        this.displayRegion = displayRegion;
        this.purchaseType = purchaseType;
        this.offerType = offerType;
        this.deliveryType = deliveryType;
        this.inventoryStatus = inventoryStatus;
        this.orderType = orderType;
        this.financialProvider = financialProvider;
        this.modelYears = modelYears;
        this.customerType = customerType;
        this.conquestVehicleList = conquestVehicleList;
        this.loyaltyVehicleList = loyaltyVehicleList;
        this.offerName = offerName;
        this.offerReturned = offerReturned;
    }

    public ObjectRequestBuilder(String requestFVD, String requestFGD, String programId, String programGvd,
                                String fvdIncentive, String incentiveVal, String programReturnResponse, String header,
                                Map<String, Object> jsonAsMap,
                                RequestSpecification requestSpecification, Response response, ValidatableResponse json) {
        this.requestFVD = requestFVD;
        this.requestFGD = requestFGD;
        this.programId = programId;
        this.programGvd = programGvd;
        this.fvdIncentive = fvdIncentive;
        this.incentiveVal = incentiveVal;
        this.header = header;
        this.jsonAsMap = jsonAsMap;
        this.requestSpecification = requestSpecification;
        this.response = response;
        this.json = json;
        this.programReturnResponse = programReturnResponse;
    }

    public ObjectRequestBuilder(String requestFVD, String requestGGD,
                                String programId, String programGvd, String fvdIncentive, String incentiveVal, String programReturnResponse,
                                Map<String, Object> jsonAsMap,
                                RequestSpecification requestSpecification, Response response, ValidatableResponse json) {
        this.requestFVD = requestFVD;
        this.requestFGD = requestGGD;
        this.programId = programId;
        this.programGvd = programGvd;
        this.fvdIncentive = fvdIncentive;
        this.incentiveVal = incentiveVal;
        this.jsonAsMap = jsonAsMap;
        this.requestSpecification = requestSpecification;
        this.response = response;
        this.json = json;
        this.programReturnResponse = programReturnResponse;
    }

    public ObjectRequestBuilder(String requestFVD,
                                String programId, String vin, String customerID, String campaignID, String programReturnResponse,
                                Map<String, Object> jsonAsMap,
                                RequestSpecification requestSpecification) {
        this.requestFVD = requestFVD;
        this.programId = programId;
        this.vin = vin;
        this.customerID = customerID;
        this.campaignID = campaignID;
        this.jsonAsMap = jsonAsMap;
        this.requestSpecification = requestSpecification;
        this.programReturnResponse = programReturnResponse;
    }

    public ObjectRequestBuilder(String requestFVD, String programId, String audience, String consumerVisibility,
                                String displayRegion, String recipient, String programType, String purchaseType,
                                String deliveryType, String inventoryStatus, String orderType, String financialProvider,
                                String tieredRateList, String modelYears, String customerType, String conquestVehicleList,
                                String loyaltyVehicleList, String mileageType, String programReturnResponse,
                                Map<String, Object> jsonAsMap, RequestSpecification requestSpecification,
                                Response response, ValidatableResponse json) {
        this.requestFVD = requestFVD;
        this.programId = programId;
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
        this.jsonAsMap = jsonAsMap;
        this.requestSpecification = requestSpecification;
        this.response = response;
        this.json = json;
        this.programReturnResponse = programReturnResponse;
    }

    public ObjectRequestBuilder(String requestFVD, String requestFGD, String offerName, String programReturned,
                                Map<String, Object> jsonAsMap,
                                RequestSpecification requestSpecification, Response response, ValidatableResponse json) {
        this.requestFVD = requestFVD;
        this.requestFGD = requestFGD;
        this.offerName = offerName;
        this.programReturnResponse = programReturned;
        this.requestSpecification = requestSpecification;
        this.response = response;
        this.json = json;
        this.jsonAsMap = jsonAsMap;
    }

    public ObjectRequestBuilder(String requestFVD, String programId, String programReturnResponse,
                                Map<String, Object> jsonAsMap, RequestSpecification requestSpecification, String lowerLimit, String upperLimit) {
        this.requestFVD = requestFVD;
        this.programId = programId;
        this.jsonAsMap = jsonAsMap;
        this.requestSpecification = requestSpecification;
        this.programReturnResponse = programReturnResponse;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public ObjectRequestBuilder(String requestFVD, String programId, String programReturnResponse, RequestSpecification requestSpecification, String lowerLimit, String upperLimit) {
        this.requestFVD = requestFVD;
        this.programId = programId;
        this.requestSpecification = requestSpecification;
        this.programReturnResponse = programReturnResponse;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public ObjectRequestBuilder(String requestFVD, String programId, String mustBeMet, String programLowerLimit, String programUpperLimit, String lowerLimit, String upperLimit) {
        this.requestFVD = requestFVD;
        this.programId = programId;
        this.mustBeMet = mustBeMet;
        this.programUpperLimit = programUpperLimit;
        this.programLowerLimit = programLowerLimit;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public ObjectRequestBuilder(String requestFVD, String programId, String mustBeMet, String programLowerLimit, String programUpperLimit, String programReturnResponse, RequestSpecification requestSpecification, String lowerLimit, String upperLimit) {
        this.requestFVD = requestFVD;
        this.programId = programId;
        this.requestSpecification = requestSpecification;
        this.response = response;
        this.programReturnResponse = programReturnResponse;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.mustBeMet = mustBeMet;
        this.programLowerLimit = programLowerLimit;
        this.programUpperLimit = programUpperLimit;
    }

    public ObjectRequestBuilder(String requestFVD, String programId, String mustBeMet, String programLowerLimit, String programUpperLimit, String programReturnResponse,
                                Map<String, Object> jsonAsMap, RequestSpecification requestSpecification, String lowerLimit, String upperLimit) {
        this.requestFVD = requestFVD;
        this.programId = programId;
        this.jsonAsMap = jsonAsMap;
        this.requestSpecification = requestSpecification;
        this.programReturnResponse = programReturnResponse;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.mustBeMet = mustBeMet;
        this.programLowerLimit = programLowerLimit;
        this.programUpperLimit = programUpperLimit;
    }

    public List<String> getStartDate() {
        return startDate;
    }

    public void setStartDate(List<String> startDate) {
        this.startDate = startDate;
    }

    public List<String> getEndDate() {
        return endDate;
    }

    public void setEndDate(List<String> endDate) {
        this.endDate = endDate;
    }

    public void setRequestFVD(String requestFVD) {
        this.requestFVD = requestFVD;
    }

    public String getRequestFVD() {
        return requestFVD;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setRequestFGD(String requestFGD) {
        this.requestFGD = requestFGD;
    }

    public String getRequestFGD() {
        return requestFGD;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramGvd(String programGvd) {
        this.programGvd = programGvd;
    }

    public String getProgramGvd() {
        return programGvd;
    }

    public void setFvdIncentive(String fvdIncentive) {
        this.fvdIncentive = fvdIncentive;
    }

    public String getFvdIncentive() {
        return fvdIncentive;
    }

    public void setIncentiveVal(String incentiveVal) {
        this.incentiveVal = incentiveVal;
    }

    public String getIncentiveVal() {
        return incentiveVal;
    }

    public void setProgramReturnResponse(String responses) {
        this.programReturnResponse = responses;
    }

    public String getProgramReturnedResponse() {
        return programReturnResponse;
    }

    public Response getResponse() {
        return response;
    }

    public ValidatableResponse getJson() {
        return json;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public void setJson(ValidatableResponse json) {
        this.json = json;
    }

    public Map<String, Object> getJsonAsMap() {
        return jsonAsMap;
    }

    public void setJsonAsMap(Map<String, Object> jsonAsMap) {
        this.jsonAsMap = jsonAsMap;
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public void setRequestSpecification(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public String getRequestGVD() {
        return requestGVD;
    }

    public void setRequestGVD(String requestGVD) {
        this.requestGVD = requestGVD;
    }

    private String requestGVD;

    public String getCampaignID() {
        return campaignID;
    }

    public void setCampaignID(String campaignID) {
        this.campaignID = campaignID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerID = offerName;
    }

    public String getOfferID() {
        return offerID;
    }

    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }

    public String getMustBeMet() {
        return mustBeMet;
    }

    public String getProgramLowerLimit() {
        return programLowerLimit;
    }

    public String getProgramUpperLimit() {
        return programUpperLimit;
    }
}
