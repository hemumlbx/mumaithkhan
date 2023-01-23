package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.SearchTabVehicleInformation;
import gm.dataviewer.pages.*;
import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.tasks.*;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static gm.dataviewer.questions.FeaturesTabQuestions.*;
import static gm.dataviewer.questions.SearchTabQuestions.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class SearchTabSteps {

    @Then("^s?he should verify the (.*) in the search page$")
    public void heShouldVerifyTheTabsInTheSearchPage(String tabs) {
        String[] subTabList = tabs.split(",");
        for (String tab : subTabList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(SearchTabPage.SUB_TAB_LIST), hasItem(tab.trim()))
            ));
        }
    }

    @Then("^s?he should verify the By Vehicle layout$")
    public void heShouldVerifyTheByVehicleLayout() {
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By Vehicle"));
        theActorInTheSpotlight().should(
                eventually(seeThat("ByVehicleYearLabel", theFeaturesLabel("Year"), containsString("Year" + ":"))),
                eventually(seeThat("ByVehicleDivisionLabel", theFeaturesLabel("Division"), containsString("Division" + ":"))),
                eventually(seeThat("ByVehicleBrandLabel", theFeaturesLabel("Brand"), containsString("Brand" + ":"))),
                eventually(seeThat("ByVehicleSearchButton", theFeaturesButton("Search"), is(true))));
        theActorInTheSpotlight().should(
                eventually(seeThat(TextQuestions.getAttribute(SearchTabPage.PRINT_BUTTON, "class"), containsString("x-item-disabled")))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().attemptsTo(ClickOnSearchTab.languageDropdown());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat("EnglishLanguage", languageDropdownValues(), hasItem("English"))),
                    eventually(seeThat("FrenchLanguage", languageDropdownValues(), hasItem("Français"))));
        } else {
            theActorInTheSpotlight().should(
                    eventually(seeThat("EnglishLanguage", languageDropdownValues(), hasItem("English"))));
        }
    }

    @Then("^s?he should verify the By Codes layout$")
    public void heShouldVerifyTheByCodeLayout() {
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By Codes"));
        theActorInTheSpotlight().should(
                eventually(seeThat("ByCodesSearchBy", theFeaturesLabel("Search By"), containsString("Search By" + ":"))),
                eventually(seeThat("ByCodesSearchButton", theFeaturesButton("Search"), is(true))));
        theActorInTheSpotlight().should(
                eventually(seeThat(TextQuestions.getAttribute(SearchTabPage.PRINT_BUTTON, "class"), containsString("x-item-disabled")))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().attemptsTo(ClickOnSearchTab.byCodeLanguage());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat("EnglishLanguage", languageDropdownValues(), hasItem("English"))),
                    eventually(seeThat("FrenchLanguage", languageDropdownValues(), hasItem("Français"))));
        } else {
            theActorInTheSpotlight().should(
                    eventually(seeThat("EnglishLanguage", languageDropdownValues(), hasItem("English"))));
        }
    }

    @Then("^s?he should verify the By Features layout$")
    public void heShouldVerifyTheByFeaturesLayout() {
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By Features"));
        theActorInTheSpotlight().should(
                eventually(seeThat("ByFeaturesFeature", theFeaturesLabel("Feature"), containsString("Feature" + ":"))),
                eventually(seeThat("ByFeaturesType", theFeaturesLabel("Feature Type"), containsString("Feature Type" + ":"))),
                eventually(seeThat("ByFeaturesVehicle", searchColumnNames(), hasItem("Vehicle"))),
                eventually(seeThat("ByFeaturesChromeDescription", searchColumnNames(), hasItem("Chrome Description"))),
                eventually(seeThat("ByFeaturesIncentiveDescription", searchColumnNames(), hasItem("Incentive Description"))),
                eventually(seeThat("ByFeaturesTypeOfferDescription", searchColumnNames(), hasItem("Offer Description"))),
                eventually(seeThat("ByFeaturesTypeAction", searchColumnNames(), hasItem("Action"))),
                eventually(seeThat("ByFeaturesSearchButton", theFeaturesButton("Search"), is(true))),
                eventually(seeThat("ByFeaturesEditSelectedButton", theFeaturesButton("Edit Selected"), is(true))));
        theActorInTheSpotlight().attemptsTo(ClickOnSearchTab.byFeaturesLanguage());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat("EnglishLanguage", languageDropdownValues(), hasItem("English"))),
                    eventually(seeThat("FrenchLanguage", languageDropdownValues(), hasItem("Français"))));
        } else {
            theActorInTheSpotlight().should(
                    eventually(seeThat("EnglishLanguage", languageDropdownValues(), hasItem("English"))));
        }
    }

    @Then("^s?he should verify the By RPO layout$")
    public void heShouldVerifyTheByRPOLayout() {
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By RPO"));
        theActorInTheSpotlight().should(
                eventually(seeThat("ByRPO", theFeaturesLabel("RPO"), containsString("RPO" + ":"))),
                eventually(seeThat("ByRPOCategory", theFeaturesLabel("Category"), containsString("Category" + ":"))),
                eventually(seeThat("ByFeaturesVehicle", searchColumnNames(), hasItem("Vehicle"))),
                eventually(seeThat("ByFeaturesChromeDescription", searchColumnNames(), hasItem("Chrome Description"))),
                eventually(seeThat("ByFeaturesIncentiveDescription", searchColumnNames(), hasItem("Incentive Description"))),
                eventually(seeThat("ByFeaturesTypeOfferDescription", searchColumnNames(), hasItem("Offer Description"))),
                eventually(seeThat("ByFeaturesTypeAction", searchColumnNames(), hasItem("Action"))),
                eventually(seeThat("ByFeaturesSearchButton", theFeaturesButton("Search"), is(true))),
                eventually(seeThat("ByFeaturesEditSelectedButton", theFeaturesButton("Edit Selected"), is(true))));
        theActorInTheSpotlight().attemptsTo(ClickOnSearchTab.byRPOLanguage());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat("EnglishLanguage", languageDropdownValues(), hasItem("English"))),
                    eventually(seeThat("FrenchLanguage", languageDropdownValues(), hasItem("Français"))));
        } else {
            theActorInTheSpotlight().should(
                    eventually(seeThat("EnglishLanguage", languageDropdownValues(), hasItem("English"))));
        }
    }

    @Then("^s?he should verify the Search function using following vehicles$")
    public void heShouldVerifyTheSearchFunctionUsingFollowingVehicles(SearchTabVehicleInformation descriptions) {
        String year = descriptions.year();
        String division = descriptions.division();
        String brand = descriptions.brand();
        theActorInTheSpotlight().attemptsTo(
                SelectSearchVehicleInfo.named(year, division, brand),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.SEARCH_BY_VEHICLE_RESULTS, isVisible()).forNoMoreThan(15).seconds()
        );
        theActorInTheSpotlight().should(
                eventually(seeThat("Search Results", vehicleResults(), containsString(year + " " + division + " " + brand))));
        theActorInTheSpotlight().attemptsTo(
                ClickOn.searchVehicleExpander()
        );
        theActorInTheSpotlight().should(
                eventually(seeThat("MMCLabel", vehicleOptions(), hasItem("MMC"))),
                eventually(seeThat("ChromeIDLabel", vehicleOptions(), hasItem("CHROMEID"))),
                eventually(seeThat("FeaturesLabel", vehicleOptions(), hasItem("Features"))),
                eventually(seeThat("RPOLabel", vehicleOptions(), hasItem("RPO")))
        );
    }

    @Then("^s?he should verify the Search function print (.*) functionality using following vehicles$")
    public void heShouldVerifyTheSearchFunctionPrintUsingFollowingVehicles(String text, SearchTabVehicleInformation descriptions) {
        String year = descriptions.year();
        String division = descriptions.division();
        String brand = descriptions.brand();
        theActorInTheSpotlight().attemptsTo(
                SelectSearchVehicleInfo.named(year, division, brand),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.SEARCH_BY_VEHICLE_RESULTS, isVisible()).forNoMoreThan(15).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                SearchVehiclePDF.searchPDF(text)
        );
    }

    @Then("^s?he should verify the By Code print (.*) functionality using (.*) (.*)$")
    public void heShouldVerifyTheByCodePrintUsingFollowingVehicles(String text, String codeType, String code, SearchTabVehicleInformation descriptions) {
        String year = descriptions.year();
        String division = descriptions.division();
        String brand = descriptions.brand();
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By Codes"));
        theActorInTheSpotlight().attemptsTo(
                SelectVehicleCode.named(codeType, code),
                ClickOn.codeTypeSearchButton(),
                WaitUntil.the(DVPublishPage.SEARCH_BY_VEHICLE_RESULTS, isVisible()).forNoMoreThan(15).seconds()
        );
        theActorInTheSpotlight().should(
                eventually(seeThat("Search Results", specificVehicleResults(year + " " + division + " " + brand), containsString(year + " " + division + " " + brand))));
        theActorInTheSpotlight().attemptsTo(
                SearchByCodePDF.searchPDF(text)
        );
    }

    @Then("^s?he should verify the By Codes using (.*) (.*)$")
    public void heShouldVerifyTheSearchFunctionUsingChromeID(String codeType, String chromeID, SearchTabVehicleInformation descriptions) {
        String year = descriptions.year();
        String division = descriptions.division();
        String brand = descriptions.brand();
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By Codes"));
        theActorInTheSpotlight().attemptsTo(
                SelectVehicleCode.named(codeType, chromeID),
                ClickOn.codeTypeSearchButton(),
                WaitUntil.the(DVPublishPage.SEARCH_BY_VEHICLE_RESULTS, isVisible()).forNoMoreThan(15).seconds()
        );
        theActorInTheSpotlight().should(
                eventually(seeThat("Search Results", specificVehicleResults(year + " " + division + " " + brand), containsString(year + " " + division + " " + brand))));
        theActorInTheSpotlight().attemptsTo(
                ClickOn.searchSpecificVehicleExpander(year + " " + division + " " + brand)
        );
        theActorInTheSpotlight().should(
                eventually(seeThat("Label", vehicleOptions(), hasItem(codeType)))
        );
    }

    @Then("^s?he should verify feature values returned using (.*) through search field$")
    public void heShouldVerifyFeatureTextBox(String features) {
        String[] featureList = features.split(",");
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By Features"));
        for (String feature : featureList) {
            theActorInTheSpotlight().attemptsTo(
                    Enter.theValue(feature).into(SearchTabPage.FEATURE_TEXT_FIELD),
                    ClickOn.featureTypeSearchButton(),
                    WaitforElement.certainTime(),
                    WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
            );
            theActorInTheSpotlight().should(
                    eventually(seeThat("Feature Results", featureList(), containsString(feature))));
        }
    }

    @Then("^s?he should verify feature dropdown values (.*)$")
    public void heShouldVerifyFeatureTypeDropdownValues(String featureTypes) {
        String[] featureList = featureTypes.split(",");
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By Features"));
        theActorInTheSpotlight().attemptsTo(
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN)
        );
        for (String feature : featureList) {
            theActorInTheSpotlight().should(
                    eventually(seeThat("Feature Types", featureTypelist(), hasItem(feature))));
        }
    }

    @Then("^s?he should verify rpo dropdown values (.*)$")
    public void heShouldVerifyRPODropdownValues(String featureTypes) {
        String[] featureList = featureTypes.split(",");
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By RPO"));
        theActorInTheSpotlight().attemptsTo(
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN)
        );
        for (String feature : featureList) {
            theActorInTheSpotlight().should(
                    eventually(seeThat("Feature Types", featureTypelist(), hasItem(feature))));
        }
    }

    @Then("^s?he should verify the error popup (.*) displayed when nothing selected$")
    public void heShouldVerifyerrorPopupDisplayed(String message) {
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.subtab("By Features"),
                ClickOnSearchTab.editSelected());
        theActorInTheSpotlight().should(
                eventually(seeThat("EditSelectedWarningLabel", theFeaturesEditSelectedLabel("Error"), containsString("Error"))),
                eventually(seeThat("EditSelectedOKButton", theEditSelectedButton("OK"), is(true))),
                eventually(seeThat("EditSelectedWarningText", theEditSelectedText(), containsString(message))),
                eventually(seeThat("EditSelectedCloseButton", theEditSelectedCloseButton(), is(true))));
    }
}


