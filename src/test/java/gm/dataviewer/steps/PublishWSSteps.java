package gm.dataviewer.steps;

import domain.ErrorHandler;
import gm.dataviewer.model.ObjectRequestBuilder;
import gm.dataviewer.questions.ValueQuestion;
import gm.dataviewer.utils.GVDRequestInformation;
import gm.dataviewer.utils.GVORequestInformation;
import gm.dataviewer.utils.PublishGvdRequest;
import io.appium.java_client.android.GsmVoiceState;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.util.ArrayList;
import java.util.HashMap;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.*;

public class PublishWSSteps {
    private PublishGvdRequest readCsvData = new PublishGvdRequest();
    private ObjectRequestBuilder objectRequestBuilder;
    private String theRestApiBaseUrl;
    private Actor actor;
    private Response response;
    private String countryVal;

    final static EnvironmentSpecificConfiguration environmentVariables = EnvironmentSpecificConfiguration.from(SystemEnvironmentVariables.createEnvironmentVariables());

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) has access to the vehicle api for country (.*) using (.*)$")
    public void anAuthorizedUserToAccessToTheApi(String name, String country, String endpoint) {
        if (country.equals("US") && endpoint.equalsIgnoreCase("v7")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.us.v7.publish");
        } else if (country.equals("US") && endpoint.equalsIgnoreCase("v6")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.us.v6.publish");
        } else if (country.equals("US") && endpoint.equalsIgnoreCase("v5")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.us.v5.publish");
        } else if (country.equals("US") && endpoint.equalsIgnoreCase("v4")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.us.v4.publish");
        } else if (country.equals("US") && endpoint.equalsIgnoreCase("v8")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.us.v8.publish");
        } else if (country.equals("CA") && endpoint.equalsIgnoreCase("v7")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.ca.v7.publish");
        } else if (country.equals("CA") && endpoint.equalsIgnoreCase("v6")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.ca.v6.publish");
        } else if (country.equals("CA") && endpoint.equalsIgnoreCase("v5")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.ca.v5.publish");
        } else if (country.equals("CA") && endpoint.equalsIgnoreCase("v4")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.ca.v4.publish");
        } else if (country.equals("CA") && endpoint.equalsIgnoreCase("v8")) {
            theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl.ca.v8.publish");
        }
        RestAssured.baseURI = theRestApiBaseUrl;
        actor = theActorCalled(name).whoCan(CallAnApi.at(theRestApiBaseUrl));
    }

    @Given("^the user has a GVD vehicle request to the api for the country (.*) using (.*)$")
    public void theUserHasAGVDRequestToTheApi(String country, String language, GVDRequestInformation requestFileData) {
        if (country.equals("US")) {
            objectRequestBuilder = readCsvData.getGVDRequest(requestFileData, theRestApiBaseUrl + "/json/getValidDeal.json", country, language);
        } else if (country.equals("CA")) {
            objectRequestBuilder = readCsvData.getGVDRequest(requestFileData, theRestApiBaseUrl + "/json/getValidDeal.json", country, language);
        }
    }

    @Given("^the user has a GMV vehicle request to the api for the country (.*) using (.*)$")
    public void theUserHasAMultipleVehicleRequestToTheApiForTheUSRegion(String country, String language, GVDRequestInformation requestFileData) {
        countryVal = country;
        if (country.equals("US")) {
            objectRequestBuilder = readCsvData.getMVResponse(requestFileData, theRestApiBaseUrl + "/json/getValidMultipleVehicleIncentive.json", country, language);
        } else if (country.equals("CA")) {
            objectRequestBuilder = readCsvData.getMVResponse(requestFileData, theRestApiBaseUrl + "/json/getValidMultipleVehicleIncentive.json", country, language);
        }
    }

    @Given("^the user has a GVD Permutation vehicle request to make to the api for the country (.*) using (.*)$")
    public void theUserHasAGVDPermutationRequestToMakeToTheApi(String country, String language, GVDRequestInformation requestFileData) {
        countryVal = country;
        if (country.equals("US")) {
            objectRequestBuilder = readCsvData.getGVDPermutationResponse(requestFileData, theRestApiBaseUrl + "/json/getValidDealPermutations.json", country, language);
        } else if (country.equals("CA")) {
            objectRequestBuilder = readCsvData.getGVDPermutationResponse(requestFileData, theRestApiBaseUrl + "/json/getValidDealPermutations.json", country, language);
        }
    }

    @Given("^the user has a GVO vehicle request to the api for the country (.*) using (.*)$")
    public void theUserHasAGVORequestToTheApi(String country, String language, GVORequestInformation requestFileData) {
        countryVal = country;
        if (country.equals("US")) {
            objectRequestBuilder = readCsvData.getGVORequest(requestFileData, theRestApiBaseUrl + "/json/getValidOffer.json", country, language);
        } else if (country.equals("CA")) {
            objectRequestBuilder = readCsvData.getGVORequest(requestFileData, theRestApiBaseUrl + "/json/getValidOffer.json", country, language);
        }
    }

    @When("^the user makes a request for GVD vehicle$")
    public void theUserMakesARequestForGVD() {
        response = lastResponse();
        actor.should(
                seeThatResponse("status code should be success for request " + objectRequestBuilder.getRequestFVD() + " and " + countryVal,
                        resp -> response.then().statusCode(200)
                )
        );
    }

    @When("^the user makes a request for GMV vehicle$")
    public void theUserMakesARequestForMultipleVehicle() {
        response = lastResponse();
        actor.should(
                seeThatResponse("status code should be success for request " + objectRequestBuilder.getRequestFVD() + " and " + countryVal,
                        resp -> response.then().statusCode(200)
                )
        );
    }

    @When("^the user makes a GVD Permutation vehicle request$")
    public void theUserMakesAGVDPermutationRequest() {
        response = lastResponse();
        actor.should(
                seeThatResponse("status code should be success for request " + objectRequestBuilder.getRequestFVD() + " and " + countryVal,
                        resp -> response.then().statusCode(200)
                )
        );
    }

    @When("^the user makes a request for GVO vehicle$")
    public void theUserMakesARequestForGVO() {
        response = lastResponse();
        actor.should(
                seeThatResponse("status code should be success for request " + objectRequestBuilder.getRequestFVD() + " and " + countryVal,
                        resp -> response.then().statusCode(200)
                )
        );
    }

    @And("^the user should see the appropriate GVD vehicle data return from the request$")
    public void theUserShouldSeeTheGVDData() {
        HashMap<String, String> errorPath = response.then().extract().path("ErrorMessagesType");
        if (errorPath == null) {
            String[] expectedPrograms = objectRequestBuilder.getProgramId().split(",");
            String[] expectedCashValues = objectRequestBuilder.getIncentiveVal().split(",");
            if (objectRequestBuilder.getProgramReturnedResponse().equals("Y")) {
                actor.should(
                        seeThatResponse("Program IDs should return under correct Vehicle header",
                                res -> response.then().assertThat().body("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                        "dealResponseList.incentiveInDealList.programIdentification.programId.flatten()", hasItems(expectedPrograms)
                                )
                        )
                );
                for (int i = 0; i < expectedPrograms.length; i++) {
                    String expectedProgram = expectedPrograms[i];
                    String expectedCashValue = expectedCashValues[i];
                    actor.should(
                            seeThatResponse("Program IDs should return with expected cash value",
                                    res -> response.then().assertThat().body("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                            "dealResponseList.findAll { it.incentiveInDealList.findAll { it.programIdentification.programId.toString().contains(\"" + expectedProgram + "\") } }.incentiveInDealList.findAll { it.programIdentification.programId.toString().contains(\"" + expectedProgram + "\") }." +
                                            "incentiveValue.cashValue.flatten().collect { value -> value.toString() }", hasItems(expectedCashValue)
                                    )
                            )
                    );
                }
            } else {
                ArrayList<String> actualPrograms = response.jsonPath().get("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                        "dealResponseList.incentiveInDealList.programIdentification.programId.flatten()");
                boolean found = false;
                for (int i = 0; i < expectedPrograms.length; i++) {
                    String expectedProgram = expectedPrograms[i];
                    String expectedCashValue = expectedCashValues[i];
                    if (actualPrograms.stream().anyMatch(actualProgram -> actualProgram == expectedProgram)) {
                        found = true;
                        actor.should(
                                seeThatResponse("Program IDs should not return with expected cash value",
                                        res -> response.then().assertThat().body("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                                "dealResponseList.findAll { it.incentiveInDealList.findAll { it.programIdentification.programId.toString().contains(\"" + expectedProgram + "\") } }.incentiveInDealList.findAll { it.programIdentification.programId.toString().contains(\"" + expectedProgram + "\") }." +
                                                "incentiveValue.cashValue.flatten().collect { value -> value.toString() }", not(hasItems(expectedCashValue))
                                        )
                                )
                        );
                    }
                }
                if (!found) {
                    actor.should(
                            seeThatResponse("Program IDs should not return under expected Vehicle header",
                                    res -> response.then().assertThat().body("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                            "dealResponseList.incentiveInDealList.programIdentification.programId.flatten()", not(hasItems(expectedPrograms))
                                    )
                            )
                    );
                }
            }
        } else {
            if (objectRequestBuilder.getProgramReturnedResponse().equals("N")) return;
            actor.attemptsTo(
                    ErrorHandler.because("Empty Input Data Set!")
            );
        }
    }

    @And("^the user should see the appropriate GMV vehicle return data from the request$")
    public void theUserShouldSeeTheMultipleVehicleData() {
        HashMap<String, String> errorPath = response.then().extract().path("ErrorMessagesType");
        if (errorPath == null) {
            ArrayList<String> dealResponseIdList = response.jsonPath().get("GetValidMultipleVehicleIncentiveResponseType.vehicleIncentiveDetail.vehicleRowList.find { it.vehicleDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }.dealReferenceIdList");
            String[] expectedPrograms = objectRequestBuilder.getProgramId().split(",");
            String[] expectedCashValues = objectRequestBuilder.getIncentiveVal().split(",");
            HashMap<String, ArrayList<String>> expectedMap = new HashMap<>();
            HashMap<String, ArrayList<String>> actualMap = new HashMap<>();

            if (objectRequestBuilder.getProgramReturnedResponse().equals("Y")) {
                actor.should(
                        seeThatResponse("Program IDs should return under correct Vehicle header",
                                res -> response.then().assertThat().body("GetValidMultipleVehicleIncentiveResponseType.vehicleIncentiveDetail.vehicleRowList.find { it.vehicleDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                        "dealReferenceIdList.flatten().unique().collect { programId -> programId.substring(0, programId.indexOf('|')) }", hasItems(objectRequestBuilder.getProgramId().split(","))
                                )
                        )
                );
                for (int i = 0; i < expectedPrograms.length; i++) {
                    ArrayList<String> expectedValues = expectedMap.get(expectedPrograms[i]);
                    if (expectedValues == null) {
                        expectedValues = new ArrayList<>();
                    }
                    expectedValues.add(expectedCashValues[i]);
                    expectedMap.put(expectedPrograms[i], expectedValues);
                }
                for (String dealResponseId : dealResponseIdList) {
                    String actualProgram = dealResponseId.substring(0, dealResponseId.indexOf('|'));
                    ArrayList<String> actualValues = actualMap.get(actualProgram);
                    ArrayList<String> additionalValues = response.jsonPath().get("GetValidMultipleVehicleIncentiveResponseType.vehicleIncentiveDetail.dealResponseList.find { it.dealReferenceId." +
                            "equalsIgnoreCase(\"" + dealResponseId + "\") }.incentiveInDealList.programIdentification.incentiveValue.cashValue.collect { value -> value.toString() }");
                    if (actualValues == null) {
                        actualValues = new ArrayList<>();
                    }
                    if (additionalValues != null) actualValues.addAll(additionalValues);
                    actualMap.put(actualProgram, actualValues);
                }
                for (String expectedProgram : expectedPrograms) {
                    ArrayList<String> actualValues = actualMap.get(expectedProgram);
                    String[] expectedValues = expectedMap.get(expectedProgram).toArray(new String[0]);
                    for (String expectedValue : expectedValues) {
                        actor.should(
                                seeThat("Program IDs should return with expected cash value",
                                        ValueQuestion.getValues(actualValues), hasItem(expectedValue))
                        );
                    }
                }
            } else {
                ArrayList<String> foundPrograms = new ArrayList<>();
                boolean found = false;
                for (int i = 0; i < expectedPrograms.length; i++) {
                    String expectedProgram = expectedPrograms[i];
                    if (dealResponseIdList == null) break;
                    if (dealResponseIdList.stream().anyMatch(dealResponseId -> dealResponseId.substring(0, dealResponseId.indexOf('|')) == expectedProgram)) {
                        found = true;
                        foundPrograms.add(expectedProgram);
                        ArrayList<String> expectedValues = expectedMap.get(expectedProgram);
                        if (expectedValues == null) {
                            expectedValues = new ArrayList<>();
                        }
                        expectedValues.add(expectedCashValues[i]);
                        expectedMap.put(expectedProgram, expectedValues);
                    }
                }
                if (!found) {
                    actor.should(
                            seeThatResponse("Program IDs should not return under expected Vehicle header",
                                    res -> response.then().assertThat().body("GetValidMultipleVehicleIncentiveResponseType.vehicleIncentiveDetail.vehicleRowList.find { it.vehicleDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                            "dealReferenceIdList.flatten().unique().collect { programId -> programId.substring(0, programId.indexOf('|')) }", not(hasItems(objectRequestBuilder.getProgramId().split(",")))
                                    )
                            )
                    );
                } else {
                    for (String dealResponseId : dealResponseIdList) {
                        String actualProgram = dealResponseId.substring(0, dealResponseId.indexOf('|'));
                        if (foundPrograms.stream().anyMatch(foundProgram -> foundProgram == actualProgram)) {
                            ArrayList<String> actualValues = actualMap.get(actualProgram);
                            ArrayList<String> additionalValues = response.jsonPath().get("GetValidMultipleVehicleIncentiveResponseType.vehicleIncentiveDetail.dealResponseList.find { it.dealReferenceId." +
                                    "equalsIgnoreCase(\"" + dealResponseId + "\") }.incentiveInDealList.programIdentification.incentiveValue.cashValue.collect { value -> value.toString() }");
                            if (actualValues == null) {
                                actualValues = new ArrayList<>();
                            }
                            if (additionalValues != null) actualValues.addAll(additionalValues);
                            actualMap.put(actualProgram, actualValues);
                        }
                    }
                    for (String expectedProgram : expectedPrograms) {
                        ArrayList<String> actualValues = actualMap.get(expectedProgram);
                        String[] expectedValues = expectedMap.get(expectedProgram).toArray(new String[0]);
                        for (String expectedValue : expectedValues) {
                            actor.should(
                                    seeThat("Program IDs should not return with expected cash value",
                                            ValueQuestion.getValues(actualValues), not(hasItem(expectedValue)))
                            );
                        }
                    }
                }
            }
        } else {
            if (objectRequestBuilder.getProgramReturnedResponse().equals("N")) return;
            actor.attemptsTo(
                    ErrorHandler.because("Empty Input Data Set!")
            );
        }
    }

    @And("^the user should see the appropriate GVD Permutation vehicle return data from the request$")
    public void theUserShouldSeeTheGVDPermutationData() {
        HashMap<String, String> errorPath = response.then().extract().path("ErrorMessagesType");
        if (errorPath == null) {
            String[] expectedPrograms = objectRequestBuilder.getProgramId().split(",");
            String[] expectedCashValues = objectRequestBuilder.getIncentiveVal().split(",");
            if (objectRequestBuilder.getProgramReturnedResponse().equals("Y")) {
                actor.should(
                        seeThatResponse("Program IDs should return under correct Vehicle header",
                                res -> response.then().assertThat().body("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                        "dealResponseList.incentiveInDealList.programIdentification.programId.flatten()", hasItems(expectedPrograms)
                                )
                        )
                );
                for (int i = 0; i < expectedPrograms.length; i++) {
                    String expectedProgram = expectedPrograms[i];
                    String expectedCashValue = expectedCashValues[i];
                    actor.should(
                            seeThatResponse("Program IDs should return with expected cash value",
                                    res -> response.then().assertThat().body("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                            "dealResponseList.findAll { it.incentiveInDealList.findAll { it.programIdentification.programId.toString().contains(\"" + expectedProgram + "\") } }.incentiveInDealList.findAll { it.programIdentification.programId.toString().contains(\"" + expectedProgram + "\") }." +
                                            "incentiveValue.cashValue.flatten().collect { value -> value.toString() }", hasItems(expectedCashValue)
                                    )
                            )
                    );
                }
            } else {
                ArrayList<String> actualPrograms = response.jsonPath().get("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                        "dealResponseList.incentiveInDealList.programIdentification.programId.flatten()");
                boolean found = false;
                for (int i = 0; i < expectedPrograms.length; i++) {
                    String expectedProgram = expectedPrograms[i];
                    String expectedCashValue = expectedCashValues[i];
                    if (actualPrograms.stream().anyMatch(actualProgram -> actualProgram == expectedProgram)) {
                        found = true;
                        actor.should(
                                seeThatResponse("Program IDs should not return with expected cash value",
                                        res -> response.then().assertThat().body("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                                "dealResponseList.findAll { it.incentiveInDealList.findAll { it.programIdentification.programId.toString().contains(\"" + expectedProgram + "\") } }.incentiveInDealList.findAll { it.programIdentification.programId.toString().contains(\"" + expectedProgram + "\") }." +
                                                "incentiveValue.cashValue.flatten().collect { value -> value.toString() }", not(hasItems(expectedCashValue))
                                        )
                                )
                        );
                    }
                }
                if (!found) {
                    actor.should(
                            seeThatResponse("Program IDs should not return under expected Vehicle header",
                                    res -> response.then().assertThat().body("GetValidDealResponseType.vehicleIncentiveDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + objectRequestBuilder.getHeader() + "\") }." +
                                            "dealResponseList.incentiveInDealList.programIdentification.programId.flatten()", not(hasItems(expectedPrograms))
                                    )
                            )
                    );
                }
            }
        } else {
            if (objectRequestBuilder.getProgramReturnedResponse().equals("N")) return;
            actor.attemptsTo(
                    ErrorHandler.because("Empty Input Data Set!")
            );
        }
    }

    @Then("the user should see the appropriate GVO vehicle data return from the request")
    public void theUserShouldSeeTheAppropriateGVOVehicleDataReturnFromTheRequest(GVORequestInformation attributes) {
        HashMap<String, String> errorPath = response.then().extract().path("ErrorMessagesType");
        if (errorPath == null) {
            if (attributes.getProgramReturned().equals("Y")) {
                actor.should(
                        seeThatResponse("Offer IDs should return under correct Vehicle Header",
                                res -> response.then().assertThat().body("GetValidOfferResponseType.vehicleOfferDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + attributes.getOfferHeader() + "\") }." +
                                        "offerResponseList.offerHeader.offerName.flatten()", hasItems(attributes.getOfferName().split(","))
                                )
                        ));
                actor.should(
                        seeThatResponse("Program ID's should return under Offers",
                                res -> response.then().assertThat().body("GetValidOfferResponseType.vehicleOfferDetailList.find { it.vehicleFilterStringDescription.equalsIgnoreCase(\"" + attributes.getOfferHeader() + "\") }." +
                                        "offerResponseList.findAll { it.offerHeader.offerName.toString().equalsIgnoreCase(\"" + attributes.getOfferName() + "\")  }." +
                                        "offerHeader.associatedIncentiveList.programID.flatten().collect { value -> value.toString() }", hasItem(attributes.getProgramName())
                                )
                        ));
            } else {
                actor.should(
                        seeThatResponse("Offer IDs should not return",
                                res -> response.then().assertThat().body("GetValidOfferResponseType.vehicleOfferDetailList.offerResponseList.offerHeader.offerName.flatten()", not(hasItems(attributes.getOfferName().split(",")))
                                )
                        )
                );
            }
        } else {
            if (attributes.getProgramReturned().equals("N")) return;
            actor.attemptsTo(
                    ErrorHandler.because("Empty Input Data Set!")
            );
        }
    }
}
