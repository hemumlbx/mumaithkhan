package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.ProgramSearchVehicleInformation;
import gm.dataviewer.pages.*;
import gm.dataviewer.tasks.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ProgramSummarySteps {

    @When("^s?he do a search using following vehicle in program summary using (.*) language$")
    public void heDoADetailedSearchUsingFollowingVehicleProgramSummary(String language, ProgramSearchVehicleInformation attributes) {
        String year = attributes.getYear();
        String division = attributes.getDivision();
        String brand = attributes.getModel();
        theActorInTheSpotlight().attemptsTo(
                SelectLanguageOnSearchPage.ofChoice(language),
                SelectSummaryYear.called(year, language),
                SelectSummaryDivision.fromDropdown(division),
                SelectBrand.called(brand)
        );
        theActorInTheSpotlight().attemptsTo(
                Click.on(ProgramSummaryPage.SUBMIT));
    }

    @Then("^s?he should verify the (.*) returned in the program summary results page under (.*)$")
    public void heShouldVerifyTheProgramsReturnedInTheDealerSummaryResultsPage(String programs, String programHeader) {
        String[] programsList = programs.split(",");
        theActorInTheSpotlight().attemptsTo(
                ClickOn.vehicleHeaderExpand(programHeader),
                WaitforElement.certainTime()
        );
        for (String program : programsList) {
            theActorInTheSpotlight().should(
                    eventually(
                            seeThat(the(ProgramSummaryPage.PROGRAM_ROW.of(program)), WebElementStateMatchers.isVisible()))
                            .waitingForNoLongerThan(10).seconds());
        }
    }
}
