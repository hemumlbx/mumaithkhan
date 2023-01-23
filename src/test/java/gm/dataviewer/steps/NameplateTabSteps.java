package gm.dataviewer.steps;

import gm.dataviewer.pages.NameplateTabPage;
import gm.dataviewer.questions.NameplateTabQuestions;
import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.tasks.ClickOnNameplateTabElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.awt.*;

import static gm.dataviewer.pages.NameplateTabPage.NAMEPLATE_ERROR_ICON;
import static gm.dataviewer.pages.NameplateTabPage.SELECTED_ERROR_ICON;
import static gm.dataviewer.questions.NameplateTabQuestions.*;
import static gm.dataviewer.tasks.GetPreviousAndCurrentYear.getCurrentYear;
import static gm.dataviewer.tasks.GetPreviousAndCurrentYear.getPreviousYear;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class NameplateTabSteps {

    @When("^s?he navigates to (.*) tab$")
    public void heNavigatesToNameplateTab(String tabName) {
        theActorInTheSpotlight().remember("tab name", tabName);
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(NameplateTabPage.PAGE_TAB.of(tabName), isVisible()).forNoMoreThan(5).seconds(),
                ClickOnNameplateTabElement.theTabCalled(tabName),
                WaitUntil.the(NameplateTabPage.PAGE_TITLE.of(tabName), isVisible()).forNoMoreThan(5).seconds()
        );
    }

    @Then("^s?he should verify the Nameplate layout using (.*)$")
    public void heShouldVerifyTheNameplateLayout(String divisions) {
        String[] divisionList = divisions.split(",");
        String label = theActorInTheSpotlight().recall("tab name");
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().should(eventually(
                seeThat(thePageTitle(), equalToIgnoringCase(label))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(thePageLabel(), equalToIgnoringCase("Division" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theSearchPageButton(), is(true))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theNewNameplateButton(), is(true))
        ));
        theActorInTheSpotlight().attemptsTo(
                ClickOnNameplateTabElement.divisionDropdown()
        );
        for (String division : divisionList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(NameplateTabPage.DROPDOWN_VALUES), hasItems(division.trim()))).waitingForNoLongerThan(05).seconds()
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOnNameplateTabElement.languageDropdown());

        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(NameplateTabPage.DROPDOWN_VALUES), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(NameplateTabPage.DROPDOWN_VALUES), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(NameplateTabPage.DROPDOWN_VALUES), hasItems("English"))
            ));
        }
    }

    @And("^s?he (.*) using division (.*)$")
    public void heSearchUsingDivision(String search, String division) {
        theActorInTheSpotlight().attemptsTo(ClickOnNameplateTabElement.divisionDropdown());
        theActorInTheSpotlight().attemptsTo(ClickOnNameplateTabElement.theBrandValue(division));
        theActorInTheSpotlight().attemptsTo(ClickOnNameplateTabElement.nameplateSearchButton(search));
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(NameplateTabPage.GRID_RESULTS.of(division), isVisible()).forNoMoreThan(5).seconds());
    }

    @Then("^s?he should see list of (.*) returned$")
    public void heShouldSeeListOfBrandsReturned(String brands) {
        String[] brandsList = brands.split(",");
        for (String brand : brandsList) {
            theActorInTheSpotlight().should(eventually(seeThat(NameplateTabQuestions.trimBrandValues(NameplateTabPage.BRAND_RESULTS), hasItems(brand.trim()))).waitingForNoLongerThan(05).seconds()
            );
        }
    }

    @When("^s?he clicks on (.*) button$")
    public void heClicksOnAddNewNameplateButton(String button) {
        theActorInTheSpotlight().attemptsTo(
                ClickOnNameplateTabElement.addNewNameplateButton(button),
                WaitUntil.the(NameplateTabPage.OVERLAY_HEADER, isVisible()).forNoMoreThan(5).seconds());
    }

    @Then("^s?he should verify the Add New Nameplate layout$")
    public void heShouldVerifyTheAddNewNameplateLayout() {

        theActorInTheSpotlight().should(eventually(
                seeThat(theLanguageLabel(), equalToIgnoringCase("Language" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theNameplateLabel(), equalToIgnoringCase("*Nameplate Name" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theYearLabel(), equalToIgnoringCase("Year" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theDivisionLabel(), equalToIgnoringCase("Division" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddButton(), is(true))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theCancelButton(), is(true))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAvailableText(), equalToIgnoringCase("Available"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theSelectedText(), equalToIgnoringCase("Selected"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theRightCursor(), is(true))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theLeftCursor(), is(true))
        ));
    }

    @And("^s?he should verify the dropdown values using (.*)$")
    public void heShouldVerifyTheDropdownValues(String divisions) {
        String[] divisionList = divisions.split(",");
        String country = theActorInTheSpotlight().recall("country");

        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(NameplateTabPage.DIVISION_DROPDOWN_BUTTON.of(divisions), isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo(ClickOnNameplateTabElement.divisionDropdownButton());
        for (String division : divisionList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(NameplateTabPage.DROPDOWN_VALUES), hasItems(division.trim()))).waitingForNoLongerThan(05).seconds()
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOnNameplateTabElement.languageDropdownButton());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(yearDropdownValues(), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(yearDropdownValues(), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(yearDropdownValues(), hasItems("English"))
            ));
        }
        theActorInTheSpotlight().attemptsTo(ClickOnNameplateTabElement.yearDropdownButton());
        theActorInTheSpotlight().should(eventually(seeThat(yearDropdownValues(), hasItems(getPreviousYear()))).waitingForNoLongerThan(05).seconds()
        );
        theActorInTheSpotlight().should(eventually(seeThat(yearDropdownValues(), hasItems(getCurrentYear()))).waitingForNoLongerThan(05).seconds()
        );
    }


    @Then("^s?he clicks on (.*) button and should verify the error messages displayed$")
    public void heClicksOnAddButton(String add) {
        theActorInTheSpotlight().attemptsTo(ClickOnNameplateTabElement.addButton());
        theActorInTheSpotlight().attemptsTo(MoveMouse.to(NAMEPLATE_ERROR_ICON));
        theActorInTheSpotlight().should(eventually(
                seeThat(theNameplateErrorMessage(), equalToIgnoringCase("This field is required"))));
        theActorInTheSpotlight().attemptsTo(MoveMouse.to(SELECTED_ERROR_ICON));
        theActorInTheSpotlight().should(seeThat(theSelectedErrorMessage(), equalToIgnoringCase("The value in this field is invalid")));

    }

    @Then("^s?he should verify the list of (.*) returned$")
    public void heShouldVerifyTheListOfModelsReturned(String models) {
        String[] modelsList = models.split(",");
        theActorInTheSpotlight().attemptsTo(ClickOnNameplateTabElement.EquinoxBrand());
        for (String model : modelsList) {
            theActorInTheSpotlight().should(eventually(seeThat(modelListValues(), hasItems(model.trim()))).waitingForNoLongerThan(05).seconds()
            );
        }
    }
}