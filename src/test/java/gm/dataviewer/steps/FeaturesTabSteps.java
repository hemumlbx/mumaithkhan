package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.DataviewerSearchFeature;
import gm.dataviewer.pages.FeaturesTabPage;
import gm.dataviewer.questions.FeaturesTabQuestions;
import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static gm.dataviewer.questions.FeaturesTabQuestions.*;
import static gm.dataviewer.tasks.GetPreviousAndCurrentYear.getPreviousYear;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasItems;

public class FeaturesTabSteps {
    @When("^s?he clicks on (.*) Tab$")
    public void heNavigatesToFeaturesTab(String featuresTab) {
        theActorInTheSpotlight().remember("featuresTab", featuresTab);
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(FeaturesTabPage.FEATURE_PAGE_TAB.of(featuresTab),
                isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theTabCalled(featuresTab),
                WaitUntil.the(FeaturesTabPage.FEATURE_PAGE_TITLE.of(featuresTab), isVisible()).forNoMoreThan(5).seconds());
    }

    @Then("^s?he should verify the Features layout$")
    public void heShouldVerifyTheFeaturesLayout() {
        String label = theActorInTheSpotlight().recall("featuresTab");
        theActorInTheSpotlight().should(
                eventually(seeThat("FeaturesPageTitle", theFeaturesPageTitle(), equalToIgnoringCase(label))),
                eventually(seeThat("FeaturesYearLabel", theFeaturesLabel("Year"), containsString("Year" + ":"))),
                eventually(seeThat("FeaturesDivisionLabel", theFeaturesLabel("Division"), containsString("Division" + ":"))),
                eventually(seeThat("FeaturesBrandLabel", theFeaturesLabel("Brand"), containsString("Brand" + ":"))),
                eventually(seeThat("FeaturesCategoryLabel", theFeaturesLabel("Category"), containsString("Category" + ":"))),
                eventually(seeThat("FeaturesStatusLabel", theFeaturesLabel("Status"), containsString("Status" + ":"))),
                eventually(seeThat("FeaturesFeatureLabel", theFeaturesFeatureLabel("Feature"), containsString("Feature"))),
                eventually(seeThat("FeaturesChromeDescriptionLabel", theFeaturesFeatureLabel("Chrome Description"), containsString("Chrome Description"))),
                eventually(seeThat("FeaturesIncentiveDescriptionLabel", theFeaturesFeatureLabel("Incentive Description"), containsString("Incentive Description"))),
                eventually(seeThat("FeaturesOfferDescriptionLabel", theFeaturesFeatureLabel("Offer Description"), containsString("Offer Description"))),
                eventually(seeThat("FeaturesStatusLabel", theFeaturesFeatureLabel("Status"), containsString("Status"))),
                eventually(seeThat("FeaturesActionLabel", theFeaturesFeatureLabel("Action"), containsString("Action"))),
                eventually(seeThat("FeaturesSearchButton", theFeaturesButton("Search"), is(true))),
                eventually(seeThat("FeaturesEditSelectedButton", theFeaturesButton("Edit Selected"), is(true))),
                eventually(seeThat("FeaturesCheckBox", theFeaturesCheckBox(), is(true))));
    }

    @Then("^s?he should verify the list of dropdown values under Feature tab$")
    public void heShouldVerifyTheListOfDropdownValues(DataviewerSearchFeature attributes) {
        String[] divisionList = attributes.division().split(",");
        String[] yearList = attributes.year().split(",");
        String[] brandList = attributes.brand().split(",");
        String[] categoryList = attributes.category().split(",");
        String[] statusList = attributes.status().split(",");
        String country = theActorInTheSpotlight().recall("country");

        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("modelYearCode"));
        for (String years : yearList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES),
                    hasItems(years.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureSpecificYearDropdownValue(getPreviousYear()));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("division"));
        for (String divisions : divisionList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES),
                    hasItems(divisions.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureDivisionValue(divisionList[2]));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("modelUID"));
        for (String brands : brandList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES),
                    hasItems(brands.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureBrandValue(brandList[2]));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("feature"));
        for (String categories : categoryList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES),
                    hasItems(categories.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureCategoryValue(categoryList[3]));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("status"));
        for (String state : statusList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES),
                    hasItems(state.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureStatusValue(statusList[0]));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("languageCode"));
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES), hasItems("English"))
            ));
        }
    }

    @And("^s?he search for feature using following information$")
    public void heSearchForFeatureUsingInfo(DataviewerSearchFeature attributes) {
        theActorInTheSpotlight().attemptsTo(SearchFeatureType.searchFeature(attributes.year(), attributes.division(), attributes.brand(), attributes.category(), attributes.status()));
        theActorInTheSpotlight().remember("year", attributes.year());
        theActorInTheSpotlight().remember("division", attributes.division());
        theActorInTheSpotlight().remember("brand", attributes.brand());
        theActorInTheSpotlight().remember("category", attributes.category());
    }

    @Then("^s?he should view the list of (.*) returned$")
    public void heShouldViewTheListOfFeaturesReturned(String category) {
        theActorInTheSpotlight().should(eventually(seeThat(FeaturesTabQuestions.trimFeaturesValues(FeaturesTabPage.FEATURE_LIST.of(category)),
                hasItems(category))).waitingForNoLongerThan(05).seconds());

    }

    @Then("^s?he must view the list of (.*) returned$")
    public void heShouldViewTheListOfDriveModesReturned(String driveMode) {
        String[] driveModesList = driveMode.split(",");
        String category = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureFeatureListValue(category));
        for (String driveModes : driveModesList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_SUB_LIST), hasItems(driveModes.trim()))).waitingForNoLongerThan(05).seconds());
        }

    }

    @When("^s?he selects (.*) Feature to Edit$")
    public void heSelectsFeatureToEdit(String value) {
        String featureType = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().attemptsTo(SelectFeatureToEdit.featureToEdit(featureType, value));
    }

    @Then("^s?he should verify the Edit Selected Layout$")
    public void heShouldVerifyTheEditSelectedLayout() {
        theActorInTheSpotlight().should(
                eventually(seeThat("EditSelectedLabel", theFeaturesEditSelectedLabel("Warning"), containsString("Warning"))),
                eventually(seeThat("EditSelectedWaringText", theEditSelectedWarningText(), containsString("Feature description will be updated for all the selected vehicles.\n" +
                        "Are you sure you want to continue?"))),
                eventually(seeThat("EditSelectedYesButton", theEditSelectedButton("Yes"), is(true))),
                eventually(seeThat("EditSelectedNoButton", theEditSelectedButton("No"), is(true))),
                eventually(seeThat("EditSelectedCloseButton", theEditSelectedCloseButton(), is(true))));
    }

    @When("^s?he clicks Edit Selected Button$")
    public void heClicksOnFeaturesEditSelectedButton() {
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresButton("Edit Selected"));
    }

    @Then("^s?he should verify the Error Popup displayed$")
    public void heShouldVerifyTheErrorPopupDisplayed() {
        theActorInTheSpotlight().should(
                eventually(seeThat("EditSelectedWarningLabel", theFeaturesEditSelectedLabel("Error"), containsString("Error"))),
                eventually(seeThat("EditSelectedOKButton", theEditSelectedButton("OK"), is(true))),
                eventually(seeThat("EditSelectedWarningText", theEditSelectedText(), containsString("No editable records have been selected."))),
                eventually(seeThat("EditSelectedCloseButton", theEditSelectedCloseButton(), is(true))));
    }

    @When("^s?he selects Feature (.*) to Edit$")
    public void heSelectsAFeatureToEdit(String value) {
        String categoryType = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().remember("drivetrain", value);
        theActorInTheSpotlight().attemptsTo(SelectFeature.featureToEdit(categoryType, value));
    }

    @Then("^s?he should verify the Edit Feature Layout$")
    public void heShouldVerifyTheEditFeatureLayout() {
        String country = theActorInTheSpotlight().recall("country");
        String year = theActorInTheSpotlight().recall("year");
        String division = theActorInTheSpotlight().recall("division");
        String brand = theActorInTheSpotlight().recall("brand");
        String drivetrain = theActorInTheSpotlight().recall("drivetrain");
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresEditSelectedYesButton());
        theActorInTheSpotlight().should(
                eventually(seeThat("FeaturesEditFeatureLabel", theFeaturesEditSelectedLabel("Edit Feature"), containsString("Edit Feature" + " " + drivetrain + " - " + year + " " + division + " " + brand))),
                eventually(seeThat("FeaturesEditFeatureLanguageLabel", theEditFeatureLanguageLabel("availableLanguages"), containsString("Language" + ":"))),
                eventually(seeThat("FeaturesEditFeatureFeatureCodeLabel", theEditFeatureLanguageLabel("ext-comp"), containsString("Feature Code" + ":"))),
                eventually(seeThat("FeaturesEditFeatureChromeDescriptionLabel", theEditFeatureLanguageLabel("chromeDesc"), containsString("Chrome Description" + ":"))),
                eventually(seeThat("FeaturesEditFeatureChromeCFDLabel", theEditFeatureLanguageLabel("consumerFriendlyDesc"), containsString("Chrome CFD" + ":"))),
                eventually(seeThat("FeaturesEditFeatureIncentiveDescriptionLabel", theEditFeatureLanguageLabel("incentiveDesc"), containsString("Incentive Description" + ":"))),
                eventually(seeThat("FeaturesEditFeatureOfferDescriptionLabel", theEditFeatureLanguageLabel("offerDesc"), containsString("Offer Description" + ":"))),
                eventually(seeThat("FeaturesEditFeaturePanelHeaderTextLabel", theEditFeaturePanelHeaderTextLabel(), containsString("History"))),
                eventually(seeThat("FeaturesEditFeatureHistoryGridDate", theEditFeatureHistoryText("Published"), containsString("Published Date" + ":"))),
                eventually(seeThat("FeaturesEditFeatureHistoryGridUser", theEditFeatureHistoryText("User"), containsString("User" + ":"))),
                eventually(seeThat("EditFeatureSaveButton", theFeaturesButton("Save"), is(true))),
                eventually(seeThat("EditFeaturePrintButton", theFeaturesButton("Print"), is(true))),
                eventually(seeThat("EditFeatureCancelButton", theEditSelectedButton("Cancel"), is(true))),
                eventually(seeThat("EditFeatureToggleArrowButton", theEditFeatureToggleArrowButton(), is(true))));

        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.editFeaturesLanguageDropdownButton());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES), hasItems("English"))
            ));
        }
    }

    @When("^s?he selects a Feature (.*) to move to Archive$")
    public void heSelectsAFeatureToMoveToArchive(String value) {
        String archiveType = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().attemptsTo(SelectFeatureToArchive.featureToArchive(archiveType, value));
    }

    @Then("^s?he should verify the Warning pop-up")
    public void heShouldVerifyTheWarningPop_up() {
        theActorInTheSpotlight().should(
                eventually(seeThat("EditSelectedWarningLabel", theFeaturesEditSelectedLabel("Warning"), containsString("Warning"))),
                eventually(seeThat("EditSelectedWaringText", theEditSelectedWarningText(), containsString("This feature may apply to multiple brands.\n" +
                        "Are you sure you want to archive this feature?\n" +
                        "If the feature is archived, it will no longer be available."))),
                eventually(seeThat("EditSelectedArchiveYesButton", theEditSelectedArchiveButton("Yes"), is(true))),
                eventually(seeThat("EditSelectedArchiveNoButton", theEditSelectedArchiveButton("No"), is(true))));
        eventually(seeThat("EditSelectedCloseButton", theEditSelectedCloseButton(), is(true)));
    }
}


