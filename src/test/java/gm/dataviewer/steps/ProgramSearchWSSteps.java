package gm.dataviewer.steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.ErrorHandler;
import gm.dataviewer.dataTableTypes.GetIncentiveProgramDetailsData;
import gm.dataviewer.model.ObjectRequestBuilder;
import gm.dataviewer.tasks.*;
import gm.dataviewer.utils.*;
import io.cucumber.java.Before;
import io.cucumber.java.DefaultDataTableCellTransformer;
import io.cucumber.java.DefaultDataTableEntryTransformer;
import io.cucumber.java.DefaultParameterTransformer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.lang.reflect.Type;
import java.util.HashMap;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.*;

public class ProgramSearchWSSteps {
    private PublishGvdRequest readCsvData = new PublishGvdRequest();
    private ObjectRequestBuilder objectRequestBuilder;

    final static EnvironmentSpecificConfiguration environmentVariables = EnvironmentSpecificConfiguration.from(SystemEnvironmentVariables.createEnvironmentVariables());

    private final ObjectMapper objectMapper = new ObjectMapper();

    @DefaultParameterTransformer
    @DefaultDataTableEntryTransformer
    @DefaultDataTableCellTransformer
    public Object transformer(Object fromValue, Type toValueType) {
        return objectMapper.convertValue(fromValue, objectMapper.constructType(toValueType));
    }

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) has access to the search api at (V4|V3|V2) in (CA|US)$")
    public void endpointSetupDetails(String name, String endpoint, String country) {
        String url;
        if ("V4".equals(endpoint)) {
            url = "CA".equals(country) ?
                    environmentVariables.getProperty("restapi.baseurl.ca.search.v4") :
                    environmentVariables.getProperty("restapi.baseurl.us.search.v4");
        } else if ("V3".equals(endpoint)) {
            url = "CA".equals(country) ?
                    environmentVariables.getProperty("restapi.baseurl.ca.search.v3") :
                    environmentVariables.getProperty("restapi.baseurl.us.search.v3");
        } else if ("V2".equals(endpoint)) {
            url = "CA".equals(country) ?
                    environmentVariables.getProperty("restapi.baseurl.ca.search.v2") :
                    environmentVariables.getProperty("restapi.baseurl.us.search.v2");
        } else {
            throw new RuntimeException("undefined endpoint");
        }

        theActorCalled(name).whoCan(CallAnApi.at(url)).remember("country", country);
        theActorInTheSpotlight().remember("baseUrl", url);
    }

    @When("^s?he makes a program search list request to the api for the country (.*) using (.*)$")
    public void theUserHasProgramSearchListRequestToTheApi(String country, String language, ProgramFilterRequestInformation requestFileData) {
        objectRequestBuilder = readCsvData.getProgramSearchListResponse(requestFileData,
                theActorInTheSpotlight().recall("baseUrl") + "/json/getIncentiveProgramList.json", country, language);

    }

    @Then("^s?he should see the appropriate program id returned from the request$")
    public void theUserShouldSeeProgramIDReturned() {
        theActorInTheSpotlight().should(
                seeThatResponse("status code should be success for request " + objectRequestBuilder.getRequestFVD() + " and " + theActorInTheSpotlight().recall("country"),
                        resp -> resp.statusCode(200)
                )
        );
        HashMap<String, String> errorPath = lastResponse().then().extract().path("ErrorMessagesType");
        if (errorPath == null) {
            if (objectRequestBuilder.getProgramReturnedResponse().equals("Y")) {
                theActorInTheSpotlight().should(
                        seeThatResponse("Program IDs should return",
                                resp -> resp.assertThat().body("GetIncentiveProgramListResponseType.incentiveProgramPayload.programIdentificationList.programId.flatten()", hasItems(objectRequestBuilder.getProgramId().split(","))
                                )
                        )
                );
            } else {
                theActorInTheSpotlight().should(
                        seeThatResponse("Program IDs should not return",
                                resp -> resp.assertThat().body("GetIncentiveProgramListResponseType.incentiveProgramPayload.programIdentificationList.programId.flatten()", not(hasItems(objectRequestBuilder.getProgramId().split(",")))
                                )
                        )
                );
            }
        } else {
            if (objectRequestBuilder.getProgramReturnedResponse().equals("N")) return;
            theActorInTheSpotlight().attemptsTo(
                    ErrorHandler.because("Empty Input Data Set!")
            );
        }
    }

    @When("^s?he submits a get Incentive Program Details request$")
    public void heSubmitsAGetIncentiveProgramDetailsRequest(GetIncentiveProgramDetailsData reqData) {
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                MakeTheIncentiveProgramDetailsRequest.usingTheProgramID(
                                reqData.getRequestProgramID())
                        .andRevisionNumber(reqData.getRequestRevisionNumber())
                        .andCountry(country)
                        .andLanguage(reqData.getLanguage())
        );
        theActorInTheSpotlight().remember("program name", reqData.getRequestProgramID());
        theActorInTheSpotlight().remember("revision", reqData.getRequestRevisionNumber());
    }

    @And("^s?he should see vehicle incentive list along with filters '(.*)' with description '(.*)' and change indicator '(.*)' in the response$")
    public void heShouldSeeVehicleListWithVehicleDescriptions(String vehicleValue, String vehicleDesc, String autoChangeInd) {
        HashMap<String, String> errorPath = SerenityRest.lastResponse().path("ErrorMessagesType");
        if (errorPath == null) {
            theActorInTheSpotlight().should(
                    seeThatResponse("vehicle Filter String returned is : ",
                            res ->
                                    res.assertThat().body("GetIncentiveProgramDetailsResponseType.incentiveProgramPayload.vehicleIncentiveList[0].vehicleFilterString", equalToCompressingWhiteSpace(vehicleValue)
                                    )
                    )
            );
            theActorInTheSpotlight().should(
                    seeThatResponse("Vehicle Description returned is : ",
                            res ->
                                    res.assertThat().body("GetIncentiveProgramDetailsResponseType.incentiveProgramPayload.vehicleIncentiveList[0].vehicleDescription", equalToCompressingWhiteSpace(vehicleDesc)
                                    )
                    )
            );
            theActorInTheSpotlight().should(
                    seeThatResponse("Vehicle auto change indicator returned is : ",
                            res ->
                                    res.assertThat().body("GetIncentiveProgramDetailsResponseType.incentiveProgramPayload.vehicleIncentiveList[0].vehicleAutoChangeInd", equalTo(Boolean.parseBoolean(autoChangeInd))
                                    )
                    )
            );
        } else {
            theActorInTheSpotlight().attemptsTo(
                    ErrorHandler.because("Empty Input Data Set!")
            );
        }
    }
}
