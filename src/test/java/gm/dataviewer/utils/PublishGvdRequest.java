package gm.dataviewer.utils;

import gm.dataviewer.model.*;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

import java.util.Map;

public class PublishGvdRequest {

    public ObjectRequestBuilder getProgramSearchListResponse(ProgramFilterRequestInformation requestData, String restAPIbaseUrl, String country, String language) {

        RequestSpecification request;
        ObjectRequestBuilder csVObjBuilder;
        Map<String, Object> jsonAsMap;


        String reqestFVD = String.valueOf(requestData.getRequestFVD());
        String reqestGVD = String.valueOf(requestData.getRequestGVD());
        String idProgram = String.valueOf(requestData.getProgramID());
        String programResponse = String.valueOf(requestData.getProgramReturned());

        String audience = String.valueOf(requestData.getAudience());
        String consumerVisibility = String.valueOf(requestData.getConsumerVisibility());
        String displayRegion = String.valueOf(requestData.getDisplayRegion());
        String recipient = String.valueOf(requestData.getRecipient());
        String programType = String.valueOf(requestData.getProgramType());
        String purchaseType = String.valueOf(requestData.getPurchaseType());
        String deliveryType = String.valueOf(requestData.getDeliveryType());
        String inventoryStatus = String.valueOf(requestData.getInventoryStatus());
        String orderType = String.valueOf(requestData.getOrderType());
        String financialProvider = String.valueOf(requestData.getFinancialProvider());
        String tieredRateList = String.valueOf(requestData.getTieredRateList());
        String modelYears = String.valueOf(requestData.getModelYears());
        String customerType = String.valueOf(requestData.getCustomerType());
        String conquestVehicleList = String.valueOf(requestData.getConquestVehicleList());
        String loyaltyVehicleList = String.valueOf(requestData.getLoyaltyVehicleList());

        BuildRequestObject buildRequestObject = new BuildRequestObject();

        jsonAsMap = buildRequestObject.createJsonRequestBuilderSearchList(country, language, reqestFVD, reqestGVD,
                audience, consumerVisibility, displayRegion, recipient,
                programType, purchaseType, deliveryType, inventoryStatus, orderType,
                financialProvider, tieredRateList, modelYears, customerType,
                conquestVehicleList, loyaltyVehicleList);


        request = SerenityRest.rest().request().baseUri(restAPIbaseUrl)
                .header("username", AuthorizedUser.ASC_USER.toString())
                .header("password", AuthorizedUser.ASC_PASSWORD.toString())
                .header("Content-Type", "application/json")
                .body(jsonAsMap);
        request.post();


        csVObjBuilder = new ObjectRequestBuilder(reqestFVD, idProgram, audience, consumerVisibility, displayRegion, recipient,
                programType, purchaseType, deliveryType, inventoryStatus, orderType,
                financialProvider, tieredRateList, modelYears, customerType,
                conquestVehicleList, loyaltyVehicleList, null, programResponse, jsonAsMap, request, null, null);
        return csVObjBuilder;
    }

    public ObjectRequestBuilder getGVDRequest(GVDRequestInformation requestData, String restAPIbaseUrl, String country, String language) {
        RequestSpecification request;
        ObjectRequestBuilder csVObjBuilder;
        Map<String, Object> jsonAsMap;

        String reqestFVD = String.valueOf(requestData.getRequestFVD());
        String reqestFGD = String.valueOf(requestData.getRequestFGD());

        String idProgram = String.valueOf(requestData.getProgramID());
        String gvdProgram = String.valueOf(requestData.getProgramGVD());
        String fvdIncentive = String.valueOf(requestData.getIncentiveFVD());
        String incentiveVal = String.valueOf(requestData.getIncentiveValue());
        String programResponse = String.valueOf(requestData.getProgramReturned());
        String header = String.valueOf(requestData.getHeader());
        BuildRequestObject buildRequestObject = new BuildRequestObject();
        jsonAsMap = buildRequestObject.createJsonRequestBuilder(new ProcessDates().getCurrentDate(), new ProcessDates().getCurrentDate(), country, language,
                reqestFVD,
                reqestFGD);
        request = SerenityRest.rest().request().baseUri(restAPIbaseUrl)
                .header("username", AuthorizedUser.ASC_USER.toString())
                .header("password", AuthorizedUser.ASC_PASSWORD.toString())
                .header("Content-Type", "application/json")
                .body(jsonAsMap);
        request.post();
        csVObjBuilder = new ObjectRequestBuilder(reqestFVD, reqestFGD, idProgram, gvdProgram, fvdIncentive, incentiveVal, programResponse, header, jsonAsMap, request, null, null);
        return csVObjBuilder;
    }
    public ObjectRequestBuilder getMVResponse(GVDRequestInformation requestData, String restAPIbaseUrl, String country, String language) {
        RequestSpecification request;
        ObjectRequestBuilder csVObjBuilder;
        Map<String, Object> jsonAsMap;

        String reqestFVD = String.valueOf(requestData.getRequestFVD());
        String reqestGVD = String.valueOf(requestData.getRequestFGD());
        String idProgram = String.valueOf(requestData.getProgramID());
        String gvdProgram = String.valueOf(requestData.getProgramGVD());
        String fvdIncentive = String.valueOf(requestData.getProgramFVD());
        String incentiveVal = String.valueOf(requestData.getIncentiveValue());
        String programResponse = String.valueOf(requestData.getProgramReturned());
        String header = String.valueOf(requestData.getHeader());
        BuildRequestObject buildRequestObject = new BuildRequestObject();
        jsonAsMap = buildRequestObject.createJsonRequestMultipleVehicleBuilder(new ProcessDates().getCurrentDate(), new ProcessDates().getCurrentDate(), country, language,
                reqestFVD,
                reqestGVD);
        request = SerenityRest.rest().request().baseUri(restAPIbaseUrl)
                .header("username", AuthorizedUser.ASC_USER.toString())
                .header("password", AuthorizedUser.ASC_PASSWORD.toString())
                .header("Content-Type", "application/json")
                .body(jsonAsMap);
        request.post();
        csVObjBuilder = new ObjectRequestBuilder(reqestFVD, reqestGVD, idProgram, gvdProgram, fvdIncentive, incentiveVal, programResponse, header, jsonAsMap, request, null, null);
        return csVObjBuilder;
    }

    public ObjectRequestBuilder getGVDPermutationResponse(GVDRequestInformation requestData, String restAPIbaseUrl, String country, String language) {
        RequestSpecification request;
        ObjectRequestBuilder csVObjBuilder;
        Map<String, Object> jsonAsMap;

        String reqestFVD = String.valueOf(requestData.getRequestFVD());
        String reqestGVD = String.valueOf(requestData.getRequestFGD());
        String idProgram = String.valueOf(requestData.getProgramID());
        String gvdProgram = String.valueOf(requestData.getProgramGVD());
        String fvdIncentive = String.valueOf(requestData.getProgramFVD());
        String incentiveVal = String.valueOf(requestData.getIncentiveValue());
        String programResponse = String.valueOf(requestData.getProgramReturned());
        String header = String.valueOf(requestData.getHeader());
        BuildRequestObject buildRequestObject = new BuildRequestObject();
        jsonAsMap = buildRequestObject.createJsonRequestPermutationBuilder(new ProcessDates().getCurrentDate(), new ProcessDates().getCurrentDate(), country, language,
                reqestFVD,
                reqestGVD);
        request = SerenityRest.rest().request().baseUri(restAPIbaseUrl)
                .header("username", AuthorizedUser.ASC_USER.toString())
                .header("password", AuthorizedUser.ASC_PASSWORD.toString())
                .header("Content-Type", "application/json")
                .body(jsonAsMap);
        request.post();
        csVObjBuilder = new ObjectRequestBuilder(reqestFVD, reqestGVD, idProgram, gvdProgram, fvdIncentive, incentiveVal, programResponse, header, jsonAsMap, request, null, null);
        return csVObjBuilder;
    }

    public ObjectRequestBuilder getGVORequest(GVORequestInformation requestData, String restAPIbaseUrl, String country,
                                              String language) {
        RequestSpecification request;
        ObjectRequestBuilder csVObjBuilder;
        Map<String, Object> jsonAsMap;

        String reqestFVD = String.valueOf(requestData.getRequestFVD());
        String reqestFGD = String.valueOf(requestData.getRequestFGD());
        String offerName = String.valueOf(requestData.getOfferName());
        String programResponse = String.valueOf(requestData.getProgramReturned());
        BuildRequestObject buildRequestObject = new BuildRequestObject();
        jsonAsMap = buildRequestObject
                .createJsonRequestGVOBuilder(new ProcessDates().getCurrentDate(), new ProcessDates().getCurrentDate(), country, language,
                        reqestFVD,
                        reqestFGD);
        request = SerenityRest.rest().request().baseUri(restAPIbaseUrl)
                .header("username", AuthorizedUser.ASC_USER.toString())
                .header("password", AuthorizedUser.ASC_PASSWORD.toString())
                .header("Content-Type", "Application/json")
                .body(jsonAsMap);
        request.post();

        csVObjBuilder = new ObjectRequestBuilder(reqestFVD, reqestFGD, offerName, programResponse,
                jsonAsMap, request, null, null);
        return csVObjBuilder;
    }
}
