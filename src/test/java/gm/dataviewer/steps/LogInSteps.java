package gm.dataviewer.steps;

import gm.dataviewer.tasks.LogIn;
import gm.dataviewer.utils.enums.DataViewerApplicationEnum;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogInSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) logs into (Data Viewer|Incentive Authoring|Offer Authoring|Dealer Summary|Program Summary|Program Search) application for (CA|US)$")
    public void logIntoVISAdmin(String name, String applicationString, String country) {
        DataViewerApplicationEnum application;
        switch (applicationString) {
            case "Data Viewer":
                application = DataViewerApplicationEnum.DATA_VIEWER;
                break;
            case "Incentive Authoring":
                application = DataViewerApplicationEnum.INCENTIVE_AUTHORING;
                break;
            case "Offer Authoring":
                application = DataViewerApplicationEnum.OFFER_AUTHORING;
                break;
            case "Dealer Summary":
                application = DataViewerApplicationEnum.DEALER_SUMMARY;
                break;
            case "Program Summary":
                application = DataViewerApplicationEnum.PROGRAM_SUMMARY;
                break;
            case "Program Search":
                application = DataViewerApplicationEnum.PROGRAM_SEARCH_UI;
                break;
            default:
                throw new RuntimeException("unrecognized application name");
        }
        theActorCalled(name).attemptsTo(
                "John".equals(name) ?
                        LogIn.toApplication(application).asJohn().forTheCountry(country) :
                        LogIn.toApplication(application).asJane().forTheCountry(country)
        );
        theActorInTheSpotlight().remember("country", country);
    }
}
