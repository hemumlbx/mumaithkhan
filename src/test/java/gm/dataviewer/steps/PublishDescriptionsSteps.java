package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.*;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.pages.DeltaTabPage;
import gm.dataviewer.questions.QuickQuestion;
import gm.dataviewer.tasks.*;
import gm.dataviewer.utils.MasterVehicleDB;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Steps;

import static gm.dataviewer.questions.PublishQuestions.*;
import static gm.dataviewer.questions.TextQuestions.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class PublishDescriptionsSteps {

    private String incentiveDescription;
    private String offerDescription;
    private String chromeDescription;

    @Steps
    private MasterVehicleDB masterVehicleFromDB;

    @When("^s?he navigates to (.*) Tab$")
    public void heNavigatesTheSearchTab(String tabName) {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(DeltaTabPage.BRANDS_RECORDS, isVisible()).forNoMoreThan(100).seconds(),
                ClickOn.navigationButton(tabName),
                WaitUntil.the(DVPublishPage.NAVIGATION_TAB_PAGE_HEADERS.of(tabName), isVisible()).forNoMoreThan(05).seconds());
    }

    @When("^s?he navigates to sub tab called (.*)$")
    public void heNavigatesToSubTab(String tabName) {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.navigationButton(tabName),
                WaitUntil.the(DVPublishPage.NAVIGATION_TAB_PAGE_HEADERS.of(tabName), isVisible()).forNoMoreThan(05).seconds());
    }

    @And("^s?he enters description for (.*) using (.*) under search tab for feature type (.*) and feature (.*)$")
    public void heEntersDescriptionUsingByFeaturesUnderSearchTab(String vehicle, String tab, String featureType, String feature, DataviewerPublishDescriptions descriptions) {
        theActorInTheSpotlight().remember("feature", feature);
        theActorInTheSpotlight().remember("vehicle", vehicle);
        theActorInTheSpotlight().attemptsTo(
                ClickOn.searchButtonTabs(tab),
                WaitUntil.the(DVPublishPage.FEATURE_SEARCH_BUTTON, isVisible()).forNoMoreThan(05).seconds(),
                SelectFeatureType.named(featureType),
                EnterIntoDataviewer.featureTypeField(feature),
                ClickOn.featureTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(15).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureTypeResultsExpand(feature),
                WaitUntil.the(DVPublishPage.FEATURE_VEHICLE_CHECKBOX.of(feature, vehicle), isVisible()).forNoMoreThan(05).seconds(),
                ClickOn.featureVehicleCheckbox(feature, vehicle),
                ClickOn.featureVehicleEdit(feature, vehicle)
        );
        theActorInTheSpotlight().should(
                eventually(seeThat(warningOverlayText(), equalToIgnoringCase("Feature description will be updated for all the selected vehicles.\nAre you sure you want to continue?")))
                        .waitingForNoLongerThan(05).seconds());

        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Yes"),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                EnterIncentiveDescription.featureTypeField(descriptions.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(descriptions.getEnglishOfferDescription())
        );
        String country = theActorInTheSpotlight().recall("country");
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterIncentiveDescription.featureTypeField(descriptions.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(descriptions.getFrenchOfferDescription())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitUntil.the(DVPublishPage.INCENTIVE_DESCRIPTION_LANDING_PAGE.of(feature, vehicle), isVisible()).forNoMoreThan(05).seconds()
        );
    }

    @Then("^s?he should see the added (.*) and (.*) in the Landing Page$")
    public void heShouldSeeTheAddedDescriptionsInTheLandingPage(String incDescription, String offerDescription) {
        String feature = theActorInTheSpotlight().recall("feature");
        String vehicle = theActorInTheSpotlight().recall("vehicle");
        theActorInTheSpotlight().should(
                eventually(seeThat(incentiveDescriptionText(feature, vehicle), equalToIgnoringCase(incDescription)))
                        .waitingForNoLongerThan(20).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(offerDescriptionText(feature, vehicle), equalToIgnoringCase(offerDescription)))
                        .waitingForNoLongerThan(20).seconds());
    }

    @And("^s?he enters description for (.*) using (.*) under search tab for category type (.*) and RPO (.*)$")
    public void heEntersDescriptionUsingByRPOUnderSearchTab(String vehicle, String tab, String categoryType, String rpo, DataviewerPublishDescriptions descriptions) {
        theActorInTheSpotlight().remember("feature", rpo);
        theActorInTheSpotlight().remember("vehicle", vehicle);
        theActorInTheSpotlight().attemptsTo(
                ClickOn.searchButtonTabs(tab),
                WaitUntil.the(DVPublishPage.CATEGORY_SEARCH_BUTTON, isVisible()).forNoMoreThan(05).seconds(),
                SelectCategoryType.named(categoryType),
                EnterIntoRPOField.rpoTypeField("PCV"),
                ClickOn.categoryTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(15).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.rpoTypeResultsExpand(rpo),
                WaitUntil.the(DVPublishPage.FEATURE_VEHICLE_CHECKBOX.of(rpo, vehicle), isVisible()).forNoMoreThan(05).seconds(),
                ClickOn.featureVehicleCheckbox(rpo, vehicle),
                ClickOn.featureVehicleEdit(rpo, vehicle),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                EnterIncentiveDescription.featureTypeField(descriptions.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(descriptions.getEnglishOfferDescription())
        );
        String country = theActorInTheSpotlight().recall("country");
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterIncentiveDescription.featureTypeField(descriptions.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(descriptions.getFrenchOfferDescription())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitUntil.the(DVPublishPage.INCENTIVE_DESCRIPTION_LANDING_PAGE.of(rpo, vehicle), isVisible()).forNoMoreThan(05).seconds()
        );
    }

    @And("^s?he selects multiple (.*) under rpo category (.*) using (.*) under search tab for type (.*)")
    public void heSelectsMultipleVehiclesForMultipleRPOs(String vehicles, String rpos, String tab, String categoryType) {
        String[] vehicleList = vehicles.split(";");
        String[] rpoList = rpos.split(";");
        theActorInTheSpotlight().remember("feature", rpoList[0]);
        theActorInTheSpotlight().remember("vehicle", vehicleList[0]);
        int counter = 0;
        theActorInTheSpotlight().attemptsTo(
                ClickOn.searchButtonTabs(tab),
                WaitUntil.the(DVPublishPage.CATEGORY_SEARCH_BUTTON, isVisible()).forNoMoreThan(05).seconds(),
                SelectCategoryType.named(categoryType),
                ClickOn.categoryTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(50).seconds()
        );
        for (String rpo : rpoList) {
            theActorInTheSpotlight().attemptsTo(
                    ClickOn.rpoTypeResultsExpand(rpo),
                    ClickOn.featureVehicleCheckbox(rpo, vehicleList[counter])
            );
            counter++;
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Edit Selected"),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
    }

    @And("^s?he enters the descriptions for Multiple Edits$")
    public void heEntersTheDescriptionsForMultipleEdits(DataviewerPublishDescriptions descriptions) {
        theActorInTheSpotlight().attemptsTo(
                EnterIncentiveDescription.featureTypeField(descriptions.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(descriptions.getEnglishOfferDescription())
        );
        String country = theActorInTheSpotlight().recall("country");
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterIncentiveDescription.featureTypeField(descriptions.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(descriptions.getFrenchOfferDescription())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(50).seconds()
        );
    }

    @And("^s?he edit nameplate for a vehicle using Nameplate Tab")
    public void heEditNameplateForAVehicleUsingNameplateTab(DataviewerPublishNameplateDescriptions attributes) {
        theActorInTheSpotlight().attemptsTo(
                SelectDivisionType.named(attributes.getDivision()),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(15).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.nameplateEdit(attributes.getModel()),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                EnterNewNamePlate.nameplateTextField(attributes.getEnglishNameplate())
        );
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterNewNamePlate.nameplateTextField(attributes.getFrenchNameplate())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(50).seconds()
        );
    }

    @Then("^s?he should see nameplate modified to (.*)$")
    public void heShouldSeeNameplateModifiedTo(String nameplate) {
        theActorInTheSpotlight().should(
                eventually(seeThat(modifiedNameplate(nameplate), containsString(nameplate)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he should see new brand name (.*) from the brand list$")
    public void heShouldSeeBrandName(String brand) {
        String year = theActorInTheSpotlight().recall("vehicleYear");
        String division = theActorInTheSpotlight().recall("vehicleDivision");
        theActorInTheSpotlight().attemptsTo(
                SelectYear.named(year),
                SelectDivisionType.named(division),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(15).seconds()
        );
        theActorInTheSpotlight().should(
                eventually(seeThat(modifiedNameplate(brand), containsString(brand)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he should see brand modified to (.*)$")
    public void heShouldSeeBrandModifiedTo(String brand) {
        theActorInTheSpotlight().should(
                eventually(seeThat(modifiedNameplate(brand), containsString(brand)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @And("^s?he removes (.*) (.*) (.*) (.*) from the selected nameplate list$")
    public void heRemovesVehicleFromTheSelectedNameplateList(String year, String division, String brand, String code) {
        theActorInTheSpotlight().remember("vehicleYear", year);
        theActorInTheSpotlight().remember("vehicleDivision", division);
        theActorInTheSpotlight().remember("vehicleBrand", brand);
        theActorInTheSpotlight().remember("vehicleCode", code);
        theActorInTheSpotlight().attemptsTo(
                SelectDivisionType.named(division),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(15).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.nameplateEdit(brand),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                SelectYear.named(year),
                SelectVehicleFromSelectedList.named(year + " " + division + " " + brand + " " + code)
        );
    }

    @And("^s?he add new nameplate for a vehicle using nameplate tab$")
    public void heAddNewNameplateForAVehicleUsingNameplateTab(DataviewerPublishNameplateDescriptions attributes) {
        String year = theActorInTheSpotlight().recall("vehicleYear");
        String division = theActorInTheSpotlight().recall("vehicleDivision");
        String brand = theActorInTheSpotlight().recall("vehicleBrand");
        String code = theActorInTheSpotlight().recall("vehicleCode");
        theActorInTheSpotlight().attemptsTo(
                SelectDivisionType.named(attributes.getDivision()),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(06).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.addNewNamePlate(),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                SelectYear.named(attributes.getYear()),
                SelectYearDivisionType.named(attributes.getDivision()),
                EnterNewNamePlate.nameplateTextField(attributes.getEnglishNameplate())
        );
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    SelectYear.named(attributes.getYear()),
                    SelectYearDivisionType.named(attributes.getDivision()),
                    EnterNewNamePlate.nameplateTextField(attributes.getFrenchNameplate())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                Click.on(DVPublishPage.AVAILABLE_VEHICLES.of(year + " " + division + " " + brand + " " + code)),
                Click.on(DVPublishPage.RIGHT_ARROW),
                WaitUntil.the(DVPublishPage.SELECTED_VEHICLES.of(year + " " + division + " " + brand + " " + code), isVisible()).forNoMoreThan(5).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.overlayButton("Add"),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    @And("^s?he edit brand for a vehicle using Brand Tab")
    public void heEditBrandForAVehicleUsingBrandTab(DataviewerPublishBrandDescriptions attributes) {
        theActorInTheSpotlight().attemptsTo(
                SelectYear.named(attributes.year()),
                SelectDivisionType.named(attributes.division()),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.nameplateEdit(attributes.model()),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                EnterIncentiveDescription.featureTypeField(attributes.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(attributes.getEnglishOfferDescription())
        );
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterIncentiveDescription.featureTypeField(attributes.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(attributes.getFrenchOfferDescription())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(50).seconds()
        );
    }

    @And("^s?he add new brand for a vehicle using brand tab using styles (.*)$")
    public void heAddBrandForAVehicleUsingBrandTab(String styles, DataviewerPublishBrandDescriptions attributes) {

        theActorInTheSpotlight().remember("vehicleYear", attributes.year());
        theActorInTheSpotlight().remember("vehicleDivision", attributes.division());
        String[] styleList = styles.split(",");
        theActorInTheSpotlight().attemptsTo(
                ClickOn.addNewBrandName(),
                WaitforElement.certainTime(),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                SelectBrandOverlayYear.named(attributes.year()),
                SelectBrandOverlayDivisionType.named(attributes.division()),
                SelectChromeBrandName.named(attributes.model()),
                EnterChromeDescription.chromeTextField(attributes.chromeEnglishDescription()),
                EnterIncentiveDescription.featureTypeField(attributes.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(attributes.getEnglishOfferDescription())
        );
        String country = theActorInTheSpotlight().recall("country");
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français"),
                    EnterChromeDescription.chromeTextField(attributes.chromeFrenchDescription()),
                    EnterIncentiveDescription.featureTypeField(attributes.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(attributes.getFrenchOfferDescription())
            );
        }
        for (String style : styleList) {
            theActorInTheSpotlight().attemptsTo(
                    Click.on(DVPublishPage.AVAILABLE_VEHICLES.of(style)),
                    Click.on(DVPublishPage.RIGHT_ARROW),
                    WaitUntil.the(DVPublishPage.SELECTED_VEHICLES.of(style), isVisible()).forNoMoreThan(5).seconds()
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.overlayButton("Add"),
                WaitforElement.certainTime()
        );
    }

    @And("^s?he edit feature for a vehicle using Feature Tab")
    public void heEditFeatureForAVehicleUsingFeatureTab(DataviewerPublishFeatureDescriptions attributes) {
        theActorInTheSpotlight().remember("incentive description", attributes.getEnglishIncentiveDescription());
        theActorInTheSpotlight().remember("offer description", attributes.getEnglishOfferDescription());
        theActorInTheSpotlight().remember("feature value", attributes.getFeatureValue());
        theActorInTheSpotlight().attemptsTo(
                SelectVehicleFeature.feature(attributes.getYear(), attributes.getDivision(), attributes.getModel(), attributes.getCategory(), attributes.getStatus()),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureTypeResultsExpand(attributes.getCategory()),
                ClickOn.featureTypeValue(attributes.getCategory(), attributes.getFeatureValue()),
                ClickOn.featureTypeEdit(attributes.getCategory(), attributes.getFeatureValue())
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Yes"),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                EnterIncentiveDescription.featureTypeField(attributes.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(attributes.getEnglishOfferDescription())
        );
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterIncentiveDescription.featureTypeField(attributes.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(attributes.getFrenchOfferDescription())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(50).seconds()
        );
    }

    @Then("^s?he should see the added descriptions")
    public void heShouldSeeDescriptionsAddUnderFeatures() {
        String incentiveDesc = theActorInTheSpotlight().recall("incentive description");
        String offerDesc = theActorInTheSpotlight().recall("offer description");
        String feature = theActorInTheSpotlight().recall("feature value");
        String[] rpoList = feature.split(",");
        for (String rpo : rpoList) {
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureIncentiveDescription(rpo), containsString(incentiveDesc)))
                            .waitingForNoLongerThan(05).seconds());
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureOfferDescription(rpo), containsString(offerDesc)))
                            .waitingForNoLongerThan(05).seconds());
        }
    }

    @Then("^s?he should see descriptions are not present under original RPO")
    public void heShouldSeeDescriptionsAreNotPresent() {
        String incentiveDesc = theActorInTheSpotlight().recall("incentive description");
        String offerDesc = theActorInTheSpotlight().recall("offer description");
        String feature = theActorInTheSpotlight().recall("feature value");
        String[] rpoList = feature.split(",");
        WaitforElement.certainTime();
        for (String rpo : rpoList) {
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureIncentiveDescription(rpo), not(containsString(incentiveDesc))))
                            .waitingForNoLongerThan(05).seconds());
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureOfferDescription(rpo), not(containsString(offerDesc))))
                            .waitingForNoLongerThan(05).seconds());
        }
    }

    @Then("^s?he should see the newly added RPO descriptions")
    public void heShouldSeeRPODescriptions() {
        String incentiveDesc = theActorInTheSpotlight().recall("incentive description");
        String offerDesc = theActorInTheSpotlight().recall("offer description");
        String chromeDesc = theActorInTheSpotlight().recall("chrome description");
        String rpo = theActorInTheSpotlight().recall("rpo");
        String year = theActorInTheSpotlight().recall("year");
        String division = theActorInTheSpotlight().recall("division");
        String brand = theActorInTheSpotlight().recall("brand");
        String category = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().attemptsTo(
                SelectRPOCategory.feature(year, division, brand, category, "Active"),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds(),
                ClickOn.featureTypeResultsExpand(category)
        );
        theActorInTheSpotlight().should(
                eventually(seeThat(featureIncentiveDescription(rpo), containsString(incentiveDesc)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureOfferDescription(rpo), containsString(offerDesc)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(chromeDescription(rpo), containsString(chromeDesc)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @And("^s?he archive the feature using the following vehicle information$")
    public void heArchiveTheFeatureUsingTheFollowingVehicleInformation(DataviewerPublishFeatureDescriptions attributes) {
        theActorInTheSpotlight().remember("feature value", attributes.getFeatureValue());
        theActorInTheSpotlight().attemptsTo(
                SelectVehicleFeature.feature(attributes.getYear(), attributes.getDivision(), attributes.getModel(), attributes.getCategory(), attributes.getStatus()),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureTypeResultsExpand(attributes.getCategory()),
                ClickOn.featureTypeValue(attributes.getCategory(), attributes.getFeatureValue()),
                ClickOn.featureTypeArchive(attributes.getCategory(), attributes.getFeatureValue())
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Yes"),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
    }

    @Then("^s?he should not see (.*) feature under Active status$")
    public void heShouldNotSeeArchivedFeatureUnderActiveStatus(String status) {
        String category = theActorInTheSpotlight().recall("feature value");
        theActorInTheSpotlight().should(
                eventually(seeThat(featureTypeValue(), not(hasItem(category))))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().attemptsTo(
                SelectFeatureStatus.selectStatus(status)
        );
        theActorInTheSpotlight().should(
                eventually(seeThat(featureTypeValue(), hasItem(category)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he should not see (.*) rpo under Active status$")
    public void heShouldNotSeeArchivedRPOUnderActiveStatus(String status) {
        String featureValue = theActorInTheSpotlight().recall("feature value");
        String year = theActorInTheSpotlight().recall("year");
        String division = theActorInTheSpotlight().recall("division");
        String brand = theActorInTheSpotlight().recall("brand");
        String category = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().should(
                eventually(seeThat(rpoValues(), not(hasItem(featureValue))))
                        .waitingForNoLongerThan(05).seconds());
        WaitforElement.certainTime();
        theActorInTheSpotlight().attemptsTo(
                SelectRPOCategory.feature(year, division, brand, category, status),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().should(
                eventually(seeThat(rpoValues(), hasItem(featureValue)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @And("^s?he edit RPO for a vehicle using RPOs Tab using category (.*)$")
    public void heEditRPOForAVehicleUsingRPOTab(String category, DataviewerPublishFeatureDescriptions attributes) {
        theActorInTheSpotlight().remember("incentive description", attributes.getEnglishIncentiveDescription());
        theActorInTheSpotlight().remember("offer description", attributes.getEnglishOfferDescription());
        theActorInTheSpotlight().remember("feature value", attributes.getFeatureValue());
        theActorInTheSpotlight().attemptsTo(
                SelectRPOCategory.feature(attributes.getYear(), attributes.getDivision(), attributes.getModel(), attributes.getCategory(), attributes.getStatus()),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureTypeResultsExpand(attributes.getCategory()),
                ClickOn.featureTypeValue(attributes.getCategory(), attributes.getFeatureValue()),
                ClickOn.featureTypeEdit(attributes.getCategory(), attributes.getFeatureValue())
        );
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                EnterIncentiveDescription.featureTypeField(attributes.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(attributes.getEnglishOfferDescription())
        );
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterIncentiveDescription.featureTypeField(attributes.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(attributes.getFrenchOfferDescription())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(50).seconds(),
                WaitforElement.certainTime()
        );
    }

    @And("^s?he (.*) (.*) for a vehicle using category (.*) under RPOs Tab")
    public void heAddNewRPOForAVehicleUsingRPOTab(String button, String rpo, String category, DataviewerPublishBrandDescriptions attributes) {
        theActorInTheSpotlight().remember("incentive description", attributes.getEnglishIncentiveDescription());
        theActorInTheSpotlight().remember("offer description", attributes.getEnglishOfferDescription());
        theActorInTheSpotlight().remember("chrome description", attributes.chromeEnglishDescription());
        theActorInTheSpotlight().remember("year", attributes.year());
        theActorInTheSpotlight().remember("division", attributes.division());
        theActorInTheSpotlight().remember("brand", attributes.model());
        theActorInTheSpotlight().remember("category", category);
        theActorInTheSpotlight().remember("rpo", rpo);
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction(button),
                WaitUntil.the(DVPublishPage.DESCRIPTION_OVERLAY_LANGUAGE_LABEL, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                AddNewRPO.feature(attributes.year(), attributes.division(), attributes.model(), category, rpo)
        );
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                EnterChromeDescription.chromeTextField(attributes.chromeEnglishDescription()),
                EnterIncentiveDescription.featureTypeField(attributes.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(attributes.getEnglishOfferDescription())
        );
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterChromeDescription.chromeTextField(attributes.chromeFrenchDescription()),
                    EnterIncentiveDescription.featureTypeField(attributes.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(attributes.getFrenchOfferDescription())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.overlayButton("Add")
        );
    }

    @And("^s?he edit multiple RPOs for a vehicle using RPOs Tab")
    public void heEditMultipleRPOForAVehicleUsingRPOTab(DataviewerPublishFeatureDescriptions attributes) {
        theActorInTheSpotlight().remember("incentive description", attributes.getEnglishIncentiveDescription());
        theActorInTheSpotlight().remember("offer description", attributes.getEnglishOfferDescription());
        theActorInTheSpotlight().remember("feature value", attributes.getFeatureValue());
        theActorInTheSpotlight().attemptsTo(
                SelectRPOCategory.feature(attributes.getYear(), attributes.getDivision(), attributes.getModel(), attributes.getCategory(), attributes.getStatus()),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureTypeResultsExpand(attributes.getCategory())
        );
        String[] rpoList = attributes.getFeatureValue().split(",");
        for (String rpo : rpoList) {
            theActorInTheSpotlight().attemptsTo(
                    ClickOn.featureTypeValue(attributes.getCategory(), rpo)
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.rpoEditSelected("Edit Selected")
        );
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                EnterIncentiveDescription.featureTypeField(attributes.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(attributes.getEnglishOfferDescription())
        );
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterIncentiveDescription.featureTypeField(attributes.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(attributes.getFrenchOfferDescription())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitforElement.certainTime(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(50).seconds()
        );
    }

    @And("^s?he edit RPO for a vehicle using RPOs Tab with category (.*)$")
    public void heEditRPOForAVehicleCategory(String category, DataviewerPublishFeatureDescriptions attributes) {
        theActorInTheSpotlight().remember("incentive description", attributes.getEnglishIncentiveDescription());
        theActorInTheSpotlight().remember("offer description", attributes.getEnglishOfferDescription());
        theActorInTheSpotlight().remember("feature value", attributes.getFeatureValue());
        theActorInTheSpotlight().attemptsTo(
                SelectRPOCategory.feature(attributes.getYear(), attributes.getDivision(), attributes.getModel(), attributes.getCategory(), attributes.getStatus()),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureTypeResultsExpand(attributes.getCategory()),
                ClickOn.featureTypeValue(attributes.getCategory(), attributes.getFeatureValue()),
                ClickOn.featureTypeEdit(attributes.getCategory(), attributes.getFeatureValue())
        );
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(
                SelectOverlayCategoryType.named(category),
                EnterIncentiveDescription.featureTypeField(attributes.getEnglishIncentiveDescription()),
                EnterOfferDescription.featureTypeField(attributes.getEnglishOfferDescription())
        );
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectLanguage.named("Français")
            );
            theActorInTheSpotlight().attemptsTo(
                    EnterIncentiveDescription.featureTypeField(attributes.getFrenchIncentiveDescription()),
                    EnterOfferDescription.featureTypeField(attributes.getFrenchOfferDescription())
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(50).seconds(),
                WaitforElement.certainTime()
        );
    }

    @And("^s?he archive the RPO using the following vehicle information$")
    public void heArchiveTheRPOUsingTheFollowingVehicleInformation(DataviewerPublishFeatureDescriptions attributes) {
        theActorInTheSpotlight().remember("feature value", attributes.getFeatureValue());
        theActorInTheSpotlight().remember("year", attributes.getYear());
        theActorInTheSpotlight().remember("division", attributes.getDivision());
        theActorInTheSpotlight().remember("brand", attributes.getModel());
        theActorInTheSpotlight().remember("category", attributes.getCategory());
        theActorInTheSpotlight().attemptsTo(
                SelectRPOCategory.feature(attributes.getYear(), attributes.getDivision(), attributes.getModel(), attributes.getCategory(), attributes.getStatus()),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureTypeResultsExpand(attributes.getCategory()),
                ClickOn.featureTypeValue(attributes.getCategory(), attributes.getFeatureValue()),
                ClickOn.featureTypeArchive(attributes.getCategory(), attributes.getFeatureValue())
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.featureVehicleOverlayAction("Yes"),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
    }

    @And("^s?he edit (.*) to (.*) under (.*) tab$")
    public void heEditCategoryToModifyCategoryUnderCategoriesTab(String originalCategory, String newCategory, String tabName) {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.deltaTab(tabName),
                WaitUntil.the(DVPublishPage.RPO_CATEGORY_RESULTS, isVisible()).forNoMoreThan(05).seconds());
        theActorInTheSpotlight().attemptsTo(
                ClickOn.rpoCategoryEdit(originalCategory),
                WaitUntil.the(DVPublishPage.OVERLAY_WINDOW_HEADER_TEXT.of("Edit Category"), isVisible()).forNoMoreThan(05).seconds());
        theActorInTheSpotlight().attemptsTo(
                EnterNewCategory.categoryField(newCategory),
                ClickOn.featureVehicleOverlayAction("Save"),
                WaitUntil.the(DVPublishPage.RPO_CATEGORY_RESULTS, isVisible()).forNoMoreThan(05).seconds()
        );
        WaitforElement.certainTime();
    }

    @And("^s?he add new category (.*) using (.*) tab$")
    public void heAddNewCategory(String newCategory, String tabName) {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.deltaTab(tabName),
                WaitUntil.the(DVPublishPage.RPO_CATEGORY_RESULTS, isVisible()).forNoMoreThan(05).seconds());
        theActorInTheSpotlight().attemptsTo(
                ClickOn.addNewCategory(),
                WaitUntil.the(DVPublishPage.OVERLAY_WINDOW_HEADER_TEXT.of("Add Category"), isVisible()).forNoMoreThan(05).seconds());
        theActorInTheSpotlight().attemptsTo(
                EnterNewCategory.categoryField(newCategory),
                ClickOn.overlayButton("Add"),
                WaitUntil.the(DVPublishPage.RPO_CATEGORY_RESULTS, isVisible()).forNoMoreThan(05).seconds()
        );
        WaitforElement.certainTime();
    }

    @Then("^s?he should see (.*) added to the category list$")
    public void heShouldSeeModifyCategoryAddedToTheCategoryList(String category) {
        theActorInTheSpotlight().should(
                eventually(seeThat(categoryText(), hasItem(category)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @And("^s?he publish the following changes through (.*) tab$")
    public void hePublishTheFollowingChangesThroughSubTab(String tab, DataviewerPublishChanges attributes) {
        theActorInTheSpotlight().remember("year", attributes.getYear());
        theActorInTheSpotlight().remember("division", attributes.getDivision());
        theActorInTheSpotlight().remember("brand", attributes.getModel());
        if (tab.equalsIgnoreCase("Publish Nameplates")) {
            theActorInTheSpotlight().attemptsTo(
                    ClickOn.searchButtonTabs(tab),
                    WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(
                SelectPublishModel.named(attributes.getYear(), attributes.getDivision())
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.publishVehicleExpander(attributes.getYear() + " " + attributes.getDivision() + " " + attributes.getModel()));
        theActorInTheSpotlight().attemptsTo(
                ClickOn.selectCategory(attributes.getYear() + " " + attributes.getDivision() + " " + attributes.getModel(), attributes.getCategoryType(), attributes.getCategory()));
        WaitforElement.certainTime();
        theActorInTheSpotlight().attemptsTo(
                ClickOn.publishSelected("Publish Selected"),
                ClickOn.publishSelected("Yes"),
                ClickOn.publishSelected("OK"));
    }

    @And("^s?he publish the nameplate (.*) through (.*) tab$")
    public void hePublishTheNameplate(String nameplate, String tab) {
        if (tab.equalsIgnoreCase("Publish Nameplates")) {
            theActorInTheSpotlight().attemptsTo(
                    ClickOn.searchButtonTabs(tab),
                    WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.publishVehicleChecker(nameplate));
        theActorInTheSpotlight().attemptsTo(
                ClickOn.nameplatePublishSelected(),
                ClickOn.publishSelected("Yes"),
                ClickOn.publishSelected("OK"));
    }

    @And("^s?he publish the brand (.*) through (.*) tab using (.*) and (.*)$")
    public void hePublishTheBrands(String brand, String tab, String year, String division) {
        theActorInTheSpotlight().remember("year", year);
        theActorInTheSpotlight().remember("division", division);
        theActorInTheSpotlight().remember("brand", brand);
        if (tab.equalsIgnoreCase("Publish Nameplates")) {
            theActorInTheSpotlight().attemptsTo(
                    ClickOn.searchButtonTabs(tab),
                    WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(
                SelectPublishModel.named(year, division),
                ClickOn.publishVehicleChecker(year + " " + division + " " + brand)
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOn.publishSelected("Publish Selected"),
                ClickOn.publishSelected("Yes"),
                ClickOn.publishSelected("OK"));
    }

    @Then("^s?he should see the published (.*) data under the (.*)$")
    public void heShouldSeeThePublishedDataUnderPublishQueue(String modelTab, String tab) {
        String year = theActorInTheSpotlight().recall("year");
        String division = theActorInTheSpotlight().recall("division");
        String brand = theActorInTheSpotlight().recall("brand");
        theActorInTheSpotlight().attemptsTo(
                ClickOn.navigationButton(tab),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(10).seconds());
        if (tab.equalsIgnoreCase("Nameplates")) {
            theActorInTheSpotlight().attemptsTo(
                    ClickOn.searchButtonTabs(modelTab),
                    WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds());
        }
        theActorInTheSpotlight().should(
                eventually(seeThat(checkVehicleExistsUnderPublishQueue(year + " " + division + " " + brand), is(true)))
                        .waitingForNoLongerThan(20).seconds());
    }

    @Then("^s?he should see the nameplates published (.*) under (.*) tab$")
    public void heShouldSeeThePublishedNameplateData(String nameplate, String tab) {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.navigationButton(tab),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(10).seconds());
        theActorInTheSpotlight().attemptsTo(
                ClickOn.searchButtonTabs("Nameplates"));
        theActorInTheSpotlight().should(
                eventually(seeThat(checkVehicleExistsUnderPublishQueue(nameplate), is(true)))
                        .waitingForNoLongerThan(20).seconds());
    }

    @Given("^(.*) queries to the database in (.*) for language (.*)$")
    public void logIntoDatabase(String name, String country, String language, DataviewerPublishChanges attributes) {
        theActorCalled(name);
        incentiveDescription = String.valueOf(masterVehicleFromDB.getMasterVehicleIncentiveDescription(country, language, attributes.getDivision(), attributes.getYear(), attributes.getModel(), attributes.getCategory(), attributes.getCategoryType()));
        offerDescription = String.valueOf(masterVehicleFromDB.getMasterVehicleOfferDescription(country, language, attributes.getDivision(), attributes.getYear(), attributes.getModel(), attributes.getCategory(), attributes.getCategoryType()));
        chromeDescription = String.valueOf(masterVehicleFromDB.getMasterVehicleChromeDescription(country, language, attributes.getDivision(), attributes.getYear(), attributes.getModel(), attributes.getCategory(), attributes.getCategoryType()));
        System.out.println("Incentive Description----" + incentiveDescription);
        System.out.println("Offer Description----" + offerDescription);
    }

    @Then("^s?he should see (.*) and (.*) added through publish ETL$")
    public void heShouldSeeDescriptionsAddedThroughPublishETL(String incentiveDesc, String offerDesc) {
        theActorInTheSpotlight().should(
                seeThat("Incentive Description returned from DB",
                        QuickQuestion.textOf(incentiveDescription), containsString(incentiveDesc))
        );
        theActorInTheSpotlight().should(
                seeThat("Offer Description returned from DB",
                        QuickQuestion.textOf(offerDescription), containsString(offerDesc))
        );
    }

    @Then("^s?he should see chrome description (.*) added through publish ETL$")
    public void heShouldSeeChromeDescriptionsAddedThroughPublishETL(String chromeDesc) {
        theActorInTheSpotlight().should(
                seeThat("Incentive Description returned from DB",
                        QuickQuestion.textOf(chromeDescription), containsString(chromeDesc))
        );
    }
}