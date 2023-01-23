package gm.dataviewer.steps;

import gm.dataviewer.pages.BrandsTabPage;
import gm.dataviewer.questions.BrandsTabQuestions;
import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.tasks.ClickOnBrandsTabElement;
import gm.dataviewer.tasks.SelectVehicle;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static gm.dataviewer.questions.BrandsTabQuestions.*;
import static gm.dataviewer.tasks.GetPreviousAndCurrentYear.getCurrentYear;
import static gm.dataviewer.tasks.GetPreviousAndCurrentYear.getPreviousYear;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class BrandsTabSteps {
    @When("^s?he selects (.*) Tab$")
    public void heNavigatesToBrandsTab(String brandsTab) {
        theActorInTheSpotlight().remember("brandsTab", brandsTab);
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(BrandsTabPage.BRAND_PAGE_TAB.of(brandsTab),
                isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo(ClickOnBrandsTabElement.theTabCalled(brandsTab),
                WaitUntil.the(BrandsTabPage.BRAND_PAGE_TITLE.of(brandsTab), isVisible()).forNoMoreThan(5).seconds());
    }

    @Then("^s?he should verify the Brands layout using (.*) and (.*)$")
    public void he_should_verify_the_brands_layout_using_year(String year, String divisions) {
        String[] yearList = year.split(",");
        String[] divisionsList = divisions.split(",");
        String label = theActorInTheSpotlight().recall("brandsTab");
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().should(eventually(
                seeThat(theBrandsPageTitle(), equalToIgnoringCase(label))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theBrandsSearchButton(), is(true))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddNewBrandNameButton(), is(true))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theBrandMmcLabel(), equalToIgnoringCase("Brand / MMC"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theRpoLabel(), equalToIgnoringCase("RPO"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theVehicleDetailLabel(), equalToIgnoringCase("Vehicle Detail"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theIncentiveDescriptionLabel(), equalToIgnoringCase("Incentive Description"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theOfferDescriptionLabel(), equalToIgnoringCase("Offer Description"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theStatusLabel(), equalToIgnoringCase("Status"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theActionsLabel(), equalToIgnoringCase("Actions"))
        ));
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.yearDropdownButton()
        );
        for (String years : yearList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(BrandsTabPage.BRAND_LAYOUT_DROPDOWN_VALUES),
                    hasItems(years.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.yearDropdownValues()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.divisionDropdownButton()
        );
        for (String division : divisionsList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(BrandsTabPage.BRAND_LAYOUT_DROPDOWN_VALUES),
                    hasItems(division.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.languageDropdownButton());

        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(BrandsTabPage.BRAND_LAYOUT_DROPDOWN_VALUES), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(BrandsTabPage.BRAND_LAYOUT_DROPDOWN_VALUES), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(BrandsTabPage.BRAND_LAYOUT_DROPDOWN_VALUES), hasItems("English"))
            ));
        }
    }

    @And("^s?he (.*) using year (.*) and division (.*)$")
    public void heSearchUsingYearAndDivision(String button, String year, String division) {
        theActorInTheSpotlight().attemptsTo(
                SelectVehicle.searchVehicle(year, division, button)
        );
    }

    @Then("^s?he should verify the (.*) list returned$")
    public void heShouldVerifyTheNameplateListReturned(String nameplates) {
        String[] nameplateList = nameplates.split(",");
        for (String nameplate : nameplateList) {
            theActorInTheSpotlight().should(eventually(seeThat(BrandsTabQuestions.trimMmcValues(BrandsTabPage.BRAND_GRID_VALUES), hasItems(nameplate.trim()))).waitingForNoLongerThan(05).seconds()
            );
        }
    }

    @And("^s?he clicks on (.*) Button$")
    public void heClicksOnAddNewBrandNameButton(String button) {
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.addNewBrandNameButton(button),
                WaitUntil.the(BrandsTabPage.ADD_BRAND_HEADER.of("Add Brand"), isVisible()).forNoMoreThan(5).seconds());
    }

    @Then("^s?he should verify the Add Brand layout$")
    public void heShouldVerifyTheAddBrandLayout() {
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandLanguageLabel(), equalToIgnoringCase("Language" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandModelYearLabel(), equalToIgnoringCase("Model Year" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandDivisionLabel(), equalToIgnoringCase("Division" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandChromeDescriptionLabel(), equalToIgnoringCase("Chrome Description" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandChromeBrandNameLabel(), equalToIgnoringCase("Chrome Brand Name" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandOfferDescriptionLabel(), equalToIgnoringCase("Offer Description" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandIncentiveDescriptionLabel(), equalToIgnoringCase("Incentive Description" + ":"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandAvailableTextHeader(), equalToIgnoringCase("Available"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandSelectedTextHeader(), equalToIgnoringCase("Selected"))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandRightCursor(), is(true))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandLeftCursor(), is(true))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandCancelButton(), is(true))
        ));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddBrandAddButton(), is(true))
        ));
    }

    @Then("^s?he should see the list of (.*)returned$")
    public void heShouldSeeTheListOfDealsReturned(String models) {
        String[] modelsList = models.split(",");
        theActorInTheSpotlight().attemptsTo(ClickOnBrandsTabElement.CanyonBrand());
        for (String model : modelsList) {
            theActorInTheSpotlight().should(eventually(seeThat(dealListValues(), hasItems(model.trim()))).waitingForNoLongerThan(05).seconds()
            );
        }
    }

    @Then("^s?he should verify the (.*) and (.*) Dropdown Values of Add Brand layout$")
    public void heShouldVerifyTheYearAndDivisionDropdownValues(String brands, String divisions) {
        String[] divisionList = divisions.split(",");
        String[] brandList = brands.split(",");
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.addBrandLanguageDropdownButton());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(languageDropdownValues(), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(languageDropdownValues(), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(languageDropdownValues(), hasItems("English"))
            ));
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.addBrandLanguageDropdownButton());
        theActorInTheSpotlight().attemptsTo(ClickOnBrandsTabElement.addBrandYearDropdownButton());
        theActorInTheSpotlight().should(eventually(seeThat(addBrandYearDropdownValues(), hasItems(getPreviousYear()))).waitingForNoLongerThan(05).seconds()
        );
        theActorInTheSpotlight().should(eventually(seeThat(addBrandYearDropdownValues(), hasItems(getCurrentYear()))).waitingForNoLongerThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.addBrandSpecificYearValue()
        );

        theActorInTheSpotlight().attemptsTo(ClickOnBrandsTabElement.addBrandDivisionDropdownButton());
        for (String division : divisionList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(BrandsTabPage.ADD_BRAND_DROPDOWN_VALUES), hasItems(division.trim()))).waitingForNoLongerThan(05).seconds()
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.addBrandSpecificDivisionValue()
        );
        theActorInTheSpotlight().attemptsTo(ClickOnBrandsTabElement.addBrandChromeDropdownButton());
        for (String brand : brandList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(BrandsTabPage.ADD_BRAND_DROPDOWN_VALUES), hasItems(brand.trim()))).waitingForNoLongerThan(05).seconds()
            );
        }
    }
}


