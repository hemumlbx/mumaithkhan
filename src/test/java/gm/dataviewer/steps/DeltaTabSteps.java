package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.DataviewerDeltaBrandsList;
import gm.dataviewer.dataTableTypes.DataviewerSelectVehicle;
import gm.dataviewer.pages.DeltaTabLayoutPage;
import gm.dataviewer.questions.DeltaTabLayoutQuestions;
import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.tasks.ClickOnDeltaTabElement;
import gm.dataviewer.tasks.WaitforElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static gm.dataviewer.pages.DeltaTabLayoutPage.*;
import static gm.dataviewer.questions.DeltaTabLayoutQuestions.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class DeltaTabSteps {
    @Then("^s?he should verify the (.*) Tab and Brands Tab Layout in Delta Landing page using following data$")
    public void heShouldVerifyTheBrandsLayout(String delta, DataviewerDeltaBrandsList attributes) {
        String[] statusList = attributes.status().split(",");
        String[] newList = attributes.newField().split(",");
        String[] originalList = attributes.original().split(",");
        theActorInTheSpotlight().remember("DeltaTab", delta);
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(DeltaTabLayoutPage.DELTA_PAGE_TAB.of(delta),
                isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo((ClickOnDeltaTabElement.theTabCalled(delta)),
                WaitUntil.the(DeltaTabLayoutPage.DELTA_PAGE_TITLE.of(delta), isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat("DeltaTitle", theDeltaPageTitle(), equalToIgnoringCase(delta))),
                eventually(seeThat("DeltaTabsTitle", theDeltaTabsTitle("Brands"), equalToIgnoringCase("Brands"))),
                eventually(seeThat("DeltaTabsTitle", theDeltaTabsTitle("Features"), equalToIgnoringCase("Features"))),
                eventually(seeThat("DeltaTabsTitle", theDeltaTabsTitle("RPOs"), equalToIgnoringCase("RPOs"))),
                eventually(seeThat("DeltaTabsVehicleLabel", theDeltaTabsVehicleLabel("Vehicle"), equalToIgnoringCase("Vehicle(s)"))),
                eventually(seeThat("DeltaBrandsTabLabel", theDeltaBrandsTabLabel("Status"), equalToIgnoringCase("Status"))),
                eventually(seeThat("DeltaBrandsTabLabel", theDeltaBrandsTabLabel("New"), equalToIgnoringCase("New"))),
                eventually(seeThat("DeltaBrandsTabLabel", theDeltaBrandsTabLabel("Original"), equalToIgnoringCase("Original"))),
                eventually(seeThat("DeltaBrandsTabLabel", theDeltaBrandsTabLabel("Custom"), equalToIgnoringCase("Custom"))),
                eventually(seeThat("DeltaBrandsTabLabel", theDeltaBrandsTabLabel("Actions"), equalToIgnoringCase("Actions"))),
                eventually(seeThat("DeltaPrintButton", theDeltaTabButton("Print"), is(true))),
                eventually(seeThat("DeltaAcceptAllButton", theDeltaTabButton("Accept All"), is(true))),
                eventually(seeThat("DeltaApproveButton", theDeltaTabButton("Approve"), is(true))));
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().should(
                eventually(seeThat("DeltaActionsIcon", theDeltaIgnoreIcon(), is(true))),
                eventually(seeThat("DeltaExpanderButton", theDeltaBrandsExpanderButton("modelDataGrid"), is(true))),
                eventually(seeThat("DeltaActionsEditIcon", theDeltaActionsEditIcon(), is(true))));

        for (String status : statusList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(DeltaTabLayoutPage.DELTA_BRANDS_LIST),
                    hasItems(status.trim()))).waitingForNoLongerThan(05).seconds());
        }
        for (String newValues : newList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(DeltaTabLayoutPage.DELTA_BRANDS_NEW_LIST),
                    hasItems(newValues.trim()))).waitingForNoLongerThan(05).seconds());
        }
        for (String original : originalList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(DeltaTabLayoutPage.DELTA_BRANDS_ORIGINAL_LIST),
                    hasItems(original.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().should(seeThat(theResultsCountMatchesTheCountOnThePage()));
    }

    @When("^s?he navigate to Features Tab$")
    public void heNavigateToFeaturesTab() {
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theDeltaTabs("Features"));
    }

    @Then("^s?he should verify the Features Tab Layout in Delta Landing page using (.*)$")
    public void heShouldVerifyTheFeaturesTabLayout(String status) {
        String[] statusList = status.split(",");
        for (String statusValues : statusList) {
            theActorInTheSpotlight().should(eventually(seeThat(DeltaTabLayoutQuestions.trimStatusValues(DELTA_FEATURES_STATUS_LIST),
                    hasItems(statusValues))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().should(
                eventually(seeThat("FeaturesTabsStatusLabel", theDeltaFeaturesTabLabel("Status"), equalToIgnoringCase("Status"))),
                eventually(seeThat("FeaturesTabsCodeLabel", theDeltaFeaturesTabLabel("Code"), equalToIgnoringCase("Code"))),
                eventually(seeThat("FeaturesTabsCategoryLabel", theDeltaFeaturesTabLabel("Category"), equalToIgnoringCase("Category"))),
                eventually(seeThat("FeaturesTabsNewLabel", theDeltaFeaturesTabLabel("New"), equalToIgnoringCase("New"))),
                eventually(seeThat("FeaturesTabsOriginalLabel", theDeltaFeaturesTabLabel("Original"), equalToIgnoringCase("Original"))),
                eventually(seeThat("FeaturesTabsCustomLabel", theDeltaFeaturesTabLabel("Custom"), equalToIgnoringCase("Custom"))),
                eventually(seeThat("FeaturesTabsActionsLabel", theDeltaFeaturesTabLabel("Actions"), equalToIgnoringCase("Actions"))),
                eventually(seeThat("FeaturesTabsLabel", theDeltaTabsVehicleLabel("Changes Accepted"), equalToIgnoringCase("Changes Accepted"))),
                eventually(seeThat("FeaturesTabsLabel", theDeltaTabsVehicleLabel("Changes Ignored"), equalToIgnoringCase("Changes Ignored"))),
                eventually(seeThat("FeaturesChangesAcceptedNumber", theFeaturesAcceptedValue(), equalToIgnoringCase("0"))),
                eventually(seeThat("FeaturesPrintButton", theFeaturesTabButton("Print"), is(true))),
                eventually(seeThat("FeaturesApproveButton", theFeaturesTabButton("Approve"), is(true))));
        theActorInTheSpotlight().should(seeThat(theFeaturesIgnoredResultsMatchesTheCountOnThePage()));
    }

    @When("^s?he navigate to RPOs Tab$")
    public void heNavigateToRPOsTab() {
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theDeltaTabs("RPOs"));
    }

    @Then("^s?he should verify the RPOs Tab Layout in Delta Landing page using (.*)$")
    public void heShouldVerifyTheRPOsTabLayout(String status) {
        theActorInTheSpotlight().remember("Status", status);
        String[] statusList = status.split(",");
        for (String statusValue : statusList) {
            theActorInTheSpotlight().should(eventually(seeThat(DeltaTabLayoutQuestions.trimStatusValues(DELTA_RPOs_STATUS_LIST),
                    hasItems(statusValue))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().should(
                eventually(seeThat("RPOsTabsStatusLabel", theDeltaRPOsTabLabel("Status"), equalToIgnoringCase("Status"))),
                eventually(seeThat("RPOsTabsCodeLabel", theDeltaRPOsTabLabel("Code"), equalToIgnoringCase("Code"))),
                eventually(seeThat("RPOsTabsCategoryLabel", theDeltaRPOsTabLabel("Category"), equalToIgnoringCase("Category"))),
                eventually(seeThat("RPOsTabsNewLabel", theDeltaRPOsTabLabel("New"), equalToIgnoringCase("New"))),
                eventually(seeThat("RPOsTabsOriginalLabel", theDeltaRPOsTabLabel("Original"), equalToIgnoringCase("Original"))),
                eventually(seeThat("RPOsTabsCustomLabel", theDeltaRPOsTabLabel("Custom"), equalToIgnoringCase("Custom"))),
                eventually(seeThat("RPOsTabsActionsLabel", theDeltaRPOsTabLabel("Actions"), equalToIgnoringCase("Actions"))),
                eventually(seeThat("RPOsCountText", theRPOsCountText("Accepted"), equalToIgnoringCase("Changes Accepted"))),
                eventually(seeThat("RPOsCountText", theRPOsCountText("Ignored"), equalToIgnoringCase("Changes Ignored"))),
                eventually(seeThat("RPOsAcceptedCountNumber", theRPOsAcceptedValue(), equalToIgnoringCase("0"))),
                eventually(seeThat("RPOsPrintButton", theRPOsTabButton("Print"), is(true))),
                eventually(seeThat("RPOsAcceptAllButton", theRPOsTabButton("Accept"), is(true))),
                eventually(seeThat("RPOsApproveButton", theRPOsTabButton("Approve"), is(true))));
        theActorInTheSpotlight().should(seeThat(theRPOsResultsMatchesTheCountOnThePage()));
    }

    @When("^s?he selects a vehicle using following information$")
    public void heSelectsAVehicle(DataviewerSelectVehicle attributes) {
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theDeltaSpecificVehicleExpanderIcon(attributes.brand(), attributes.division(), attributes.status()));
        theActorInTheSpotlight().remember("Brand", attributes.brand());
        theActorInTheSpotlight().remember("Division", attributes.division());
        theActorInTheSpotlight().remember("Status", attributes.status());
    }

    @Then("^s?he should verify the Vehicle List using (.*) and (.*) values$")
    public void heVerifiesTheCHROMEIDListValues(String chromeId, String fvd) {
        String[] chromeIdList = chromeId.split(",");
        String[] fvdList = fvd.split(",");
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theDeltaSubVehicleListExpanderIcon("CHROME"));
        theActorInTheSpotlight().should(
                eventually(seeThat("VehicleSublistHeaderCodeText", theDeltaSubListHeaderCodeText(), equalToIgnoringCase("Code"))),
                eventually(seeThat("VehicleSubListHeaderFVDText", theDeltaSubListHeaderFVDText(), equalToIgnoringCase("FVD Replacement String"))));
        for (String chrome : chromeIdList) {
            theActorInTheSpotlight().should(eventually(seeThat(DeltaTabLayoutQuestions.theDeltaSubListHeaderCodeValues(DeltaTabLayoutPage.DELTA_VEHICLE_SUB_LIST_CODES),
                    hasItems(chrome))).waitingForNoLongerThan(05).seconds());
        }
        for (String fvdValue : fvdList) {
            theActorInTheSpotlight().should(eventually(seeThat(DeltaTabLayoutQuestions.theDeltaSubListHeaderFVDValues(DeltaTabLayoutPage.DELTA_VEHICLE_SUB_LIST_FVD_VALUES.of("CODE")),
                    hasItems(fvdValue))).waitingForNoLongerThan(05).seconds());
        }
    }

    @Then("^s?he should verify the vehicle List using (.*) and (.*) values$")
    public void heVerifiesTheMMCListValues(String mmc, String fvd) {
        String[] mmcList = mmc.split(",");
        String[] fvdList = fvd.split(",");
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theDeltaSubVehicleListExpanderIcon("MMC"));
        theActorInTheSpotlight().should(
                eventually(seeThat("VehicleSublistHeaderCodeText", theDeltaSubListHeaderCodeText(), equalToIgnoringCase("Code"))),
                eventually(seeThat("VehicleSubListHeaderFVDText", theDeltaSubListHeaderFVDText(), equalToIgnoringCase("FVD Replacement String"))));
        for (String mmcValue : mmcList) {
            theActorInTheSpotlight().should(eventually(seeThat(DeltaTabLayoutQuestions.theDeltaSubListHeaderCodeValues(DeltaTabLayoutPage.DELTA_VEHICLE_SUB_LIST_CODES),
                    hasItems(mmcValue))).waitingForNoLongerThan(05).seconds());
        }
        for (String fvdValue : fvdList) {
            theActorInTheSpotlight().should(eventually(seeThat(DeltaTabLayoutQuestions.theDeltaSubListHeaderFVDValues(DeltaTabLayoutPage.DELTA_VEHICLE_SUB_LIST_FVD_VALUES.of("GMC")),
                    hasItems(fvdValue))).waitingForNoLongerThan(05).seconds());
        }
    }

    @When("^s?he clicks on Edit icon of vehicle with Status (.*) and Division (.*) and brand (.*)$")
    public void heClicksOnEditIconOfSpecificVehicle(String status, String division, String brand) {
        theActorInTheSpotlight().remember("Division", division);
        theActorInTheSpotlight().remember("Brand", brand);
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theDeltaSpecificVehicleEditIcon(status, division, brand));

    }

    @Then("^s?he should verify Edit Vehicle Layout$")
    public void heShouldVerifyEditVehicleLayout() {
        String division = theActorInTheSpotlight().recall("Division");
        String brand = theActorInTheSpotlight().recall("Brand");
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theEditVehicleDropdown());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(DeltaTabLayoutPage.EDIT_VEHICLE_DROPDOWN_VALUES), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(DeltaTabLayoutPage.EDIT_VEHICLE_DROPDOWN_VALUES), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(DeltaTabLayoutPage.EDIT_VEHICLE_DROPDOWN_VALUES), hasItems("English"))
            ));
        }
        theActorInTheSpotlight().should(
                eventually(seeThat("EditVehicleHeader", theDeltaEditVehicleHeaderText("Edit Vehicle"), equalToIgnoringCase("Edit Vehicle"))),
                eventually(seeThat("EditVehicleLanguageLabel", theDeltaEditVehicleLabels("availableLanguages"), equalToIgnoringCase("Language" + ":"))),
                eventually(seeThat("EditVehicleVehicleLabel", theDeltaEditVehicleLabels("chromeDescField"), equalToIgnoringCase("Vehicle" + ":"))),
                eventually(seeThat("EditVehicleVehicleTextValue", theEditVehicleVehicleTextValue(), equalToIgnoringCase(division + " " + brand))),
                eventually(seeThat("EditVehicleIncentiveDescription", theDeltaEditVehicleLabels("incentiveDescField"), equalToIgnoringCase("Incentive Description" + ":"))),
                eventually(seeThat("EditVehicleOfferDescription", theDeltaEditVehicleLabels("offerDescField"), equalToIgnoringCase("Offer Description" + ":"))),
                eventually(seeThat("EditVehicleSaveButton", theDeltaButtons("Save"), is(true))),
                eventually(seeThat("EditVehicleCancelButton", theDeltaButtons("Cancel"), is(true))),
                eventually(seeThat("RPOsCloseButton", theEditVehicleCloseButton(), is(true))));
    }

    @When("^s?he clicks on Actions Icon of vehicle with Status (.*) and Division (.*) and brand (.*)")
    public void heClicksOnActionsIcon(String status, String division, String brand) {
        theActorInTheSpotlight().remember("Status", status);
        theActorInTheSpotlight().remember("Division", division);
        theActorInTheSpotlight().remember("Brand", brand);
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().should(
                eventually(seeThat("IgnoreActionsButton", theDeltaSpecificActionsIgnoreButton(status, division, brand), is(true))));
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theDeltaActionsIconButton(status, division, brand));
    }

    @Then("^s?he should verify the Action change from Ignored to Accepted$")
    public void heShouldVerifyTheActionChange() {
        String status = theActorInTheSpotlight().recall("Status");
        String division = theActorInTheSpotlight().recall("Division");
        String brand = theActorInTheSpotlight().recall("Brand");
        theActorInTheSpotlight().should(eventually(seeThat("AcceptActionsButton", theDeltaSpecificActionsAcceptButton(status, division, brand), is(true))));
    }

    @Then("^s?he should verify the Actions change from Ignored to Accepted$")
    public void heShouldVerifyTheActionsChange() {
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().should(
                eventually(seeThat("DeltaBrandsIgnoreIcon", theDeltaIgnoreIcon(), is(true))));
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theDeltaButton("Accept All"));
        theActorInTheSpotlight().should(
                eventually(seeThat("DeltaBrandsAcceptIcon", theDeltaAcceptIcon(), is(true))));
    }

    @Then("^s?he should verify the Actions Icon Status Change$")
    public void heShouldVerifyTheActionStatusChange() {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(RPOs_STATUS_LIST, isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo(ClickOnDeltaTabElement.theRPOsButton("Accept All"));
        theActorInTheSpotlight().should(eventually(seeThat("RPOsAcceptIcon", theRPOsAcceptActionsIcon(), is(true))));
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().should(seeThat(theRPOsResultsMatchesTheCountOnThePage()));

    }
}
