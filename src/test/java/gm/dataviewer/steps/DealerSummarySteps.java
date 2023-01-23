package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.*;
import gm.dataviewer.questions.PublishQuestions;
import gm.dataviewer.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class DealerSummarySteps {

    @When("^s?he do a search using following vehicle$")
    public void heDoADetailedSearchUsingFollowingVehicle(ProgramSearchVehicleInformation attributes) {
        String year = attributes.getYear();
        String division = attributes.getDivision();
        String brand = attributes.getModel();
        theActorInTheSpotlight().attemptsTo(
                EnterSearchInformation.intoCorrectField(year, division, brand),
                ClickSubmit.button()
        );
    }

    @Then("^s?he should verify the (.*) returned in the dealer summary results page under (.*)$")
    public void heShouldVerifyTheProgramsReturnedInTheDealerSummaryResultsPage(String programs, String programHeader) {
        String[] programsList = programs.split(",");
        for (String program : programsList) {
            theActorInTheSpotlight().should(eventually(
                    seeThat(PublishQuestions.programsUnderHeader(programHeader, program), containsString(program)))
            );
        }
    }

    @And("^s?he selects the (.*) language$")
    public void heSelectsTheLanguage(String language) {
        theActorInTheSpotlight().attemptsTo(
                SelectPageLanguage.named(language),
                WaitforElement.certainTime()
        );
    }
}
