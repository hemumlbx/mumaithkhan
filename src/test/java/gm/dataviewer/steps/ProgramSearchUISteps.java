package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.ProgramSearchVehicleInformation;
import gm.dataviewer.pages.ProgramSearchPage;
import gm.dataviewer.questions.PublishQuestions;
import gm.dataviewer.tasks.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class ProgramSearchUISteps {

    @When("^s?he do a detailed search using following vehicle$")
    public void heDoADetailedSearchUsingFollowingVehicle(ProgramSearchVehicleInformation attributes) {
        String year = attributes.getYear();
        String division = attributes.getDivision();
        String brand = attributes.getModel();
        theActorInTheSpotlight().attemptsTo(
                SelectProgramSearchVehicle.setDivision(year, division, brand)
        );
    }

    @Then("^s?he should verify the (.*) returned in the results page$")
    public void heShouldVerifyTheProgramsReturnedInTheResultsPage(String programs) {
        String[] programsList = programs.split(",");
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ProgramSearchPage.ALL_PROGRAM_ROWS, isVisible()).forNoMoreThan(60).seconds()
        );
        theActorInTheSpotlight().should(eventually(
                seeThat(PublishQuestions.programsAreReturnedRegardlessOfRevisions(), hasItems(programsList)))
        );
    }
}
