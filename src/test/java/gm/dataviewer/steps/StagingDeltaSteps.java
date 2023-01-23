package gm.dataviewer.steps;

import gm.dataviewer.pages.DeltaTabPage;
import gm.dataviewer.tasks.ClickOn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static gm.dataviewer.questions.DeltaTabQuestions.*;
import static gm.dataviewer.questions.TextQuestions.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class StagingDeltaSteps {

    @When("^s?he opens the (.*) under Delta Tab$")
    public void heOpensTheBrandsUnderDeltaTab(String tabName) {
        if (tabName.equalsIgnoreCase("Brands")) {
            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(DeltaTabPage.BRANDS_RECORDS, isVisible()).forNoMoreThan(100).seconds(),
                    ClickOn.deltaTab(tabName),
                    WaitUntil.the(DeltaTabPage.BRANDS_RECORDS, isVisible()).forNoMoreThan(100).seconds());

        } else if (tabName.equalsIgnoreCase("Features")) {
            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(DeltaTabPage.BRANDS_RECORDS, isVisible()).forNoMoreThan(100).seconds(),
                    ClickOn.deltaTab(tabName),
                    WaitUntil.the(DeltaTabPage.FEATURES_RECORDS, isVisible()).forNoMoreThan(100).seconds());

        } else if (tabName.equalsIgnoreCase("RPOs")) {
            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(DeltaTabPage.BRANDS_RECORDS, isVisible()).forNoMoreThan(100).seconds(),
                    ClickOn.deltaTab(tabName),
                    WaitUntil.the(DeltaTabPage.RPO_RECORDS, isVisible()).forNoMoreThan(100).seconds());
        }
        theActorInTheSpotlight().remember("tab name", tabName);
    }

    @Then("^s?he should see (.*) with (.*) and Original column with English: (.*) and French: (.*)$")
    public void heShouldSeeVehicleWithStatusForBrands(String vehicle, String status, String engDescription, String frenchDescription) {

        theActorInTheSpotlight().should(
                eventually(seeThat(brandVehicleStatus(vehicle), equalToIgnoringCase(status)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(brandVehicleEnglishDescription(vehicle), containsStringIgnoringCase("English: " + engDescription)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(brandVehicleFrenchDescription(vehicle), containsStringIgnoringCase("French: " + frenchDescription)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he should see (.*) with (.*) and original column with English: (.*)$")
    public void heShouldSeeVehicleWithStatusForBrandsUS(String vehicle, String status, String engDescription) {

        theActorInTheSpotlight().should(
                eventually(seeThat(brandVehicleStatus(vehicle), equalToIgnoringCase(status)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(brandVehicleEnglishDescription(vehicle), equalToIgnoringCase("English: " + engDescription)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he should see (.*) for (.*) and (.*) with (.*) under original column with (.*) and (.*)$")
    public void heShouldSeeDescriptionsForFeaturesTabOriginal(String vehicle, String code, String category, String status, String engDescription, String freDescription) {

        String attributeName = theActorInTheSpotlight().recall("tab name");
        if (attributeName.equalsIgnoreCase("RPOs")) {
            attributeName = "rpo";
        } else {
            attributeName = "feature";
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.vehicleExpandButton(attributeName, vehicle));
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleStatus(attributeName, vehicle, code), equalToIgnoringCase(status)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleCategory(attributeName, vehicle, code), equalToIgnoringCase(category)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleOriginalEnglishDescription(attributeName, vehicle, code), equalToIgnoringCase("English: " + engDescription)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleOriginalFrenchDescription(attributeName, vehicle, code), equalToIgnoringCase("French: " + freDescription)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he should see (.*) for (.*) and (.*) with (.*) under Original column with (.*)$")
    public void heShouldSeeDescriptionsForFeaturesTabOriginalUS(String vehicle, String code, String category, String status, String engDescription) {

        String attributeName = theActorInTheSpotlight().recall("tab name");
        if (attributeName.equalsIgnoreCase("RPOs")) {
            attributeName = "rpo";
        } else {
            attributeName = "feature";
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.vehicleExpandButton(attributeName, vehicle));
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleStatus(attributeName, vehicle, code), equalToIgnoringCase(status)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleCategory(attributeName, vehicle, code), equalToIgnoringCase(category)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleOriginalEnglishDescription(attributeName, vehicle, code), equalToIgnoringCase("English: " + engDescription)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he should see (.*) for (.*) and (.*) with (.*) under new column with (.*) and (.*)$")
    public void heShouldSeeDescriptionsForFeaturesTabNew(String vehicle, String code, String category, String status, String engDescription, String freDescription) {

        String attributeName = theActorInTheSpotlight().recall("tab name");
        if (attributeName.equalsIgnoreCase("RPOs")) {
            attributeName = "rpo";
        } else {
            attributeName = "feature";
        }
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleNewEnglishDescription(attributeName, vehicle, code), equalToIgnoringCase("English: " + engDescription)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleNewFrenchDescription(attributeName, vehicle, code), equalToIgnoringCase("French: " + freDescription)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he should see (.*) for (.*) and (.*) with (.*) under New column with (.*)$")
    public void heShouldSeeDescriptionsForFeaturesTabNewUS(String vehicle, String code, String category, String status, String engDescription) {

        String attributeName = theActorInTheSpotlight().recall("tab name");
        if (attributeName.equalsIgnoreCase("RPOs")) {
            attributeName = "rpo";
        } else {
            attributeName = "feature";
        }
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleNewEnglishDescription(attributeName, vehicle, code), equalToIgnoringCase("English: " + engDescription)))
                        .waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he should see (.*) for (.*) and (.*) with (.*) in original column with (.*) and (.*) with (.*) and (.*)$")
    public void heShouldSeeVehicleOriginalCFDCA(String vehicle, String code, String category, String status, String originalEnglishDesc, String originalFrenchDesc, String originalCFDEnglish, String originalCFDFrench) {
        String attributeName = theActorInTheSpotlight().recall("tab name");
        if (attributeName.equalsIgnoreCase("RPOs")) {
            attributeName = "rpo";
        } else {
            attributeName = "feature";
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.vehicleExpandButton(attributeName, vehicle));
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleStatus(attributeName, vehicle, code), equalToIgnoringCase(status)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleCategory(attributeName, vehicle, code), equalToIgnoringCase(category)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleOriginalEnglishDescription(attributeName, vehicle, code), equalToIgnoringCase("English: " + originalEnglishDesc)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleOriginalFrenchDescription(attributeName, vehicle, code), equalToIgnoringCase("French: " + originalFrenchDesc)))
                        .waitingForNoLongerThan(05).seconds());
        if (originalCFDEnglish.equalsIgnoreCase("null")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat(checkEnglishOriginalCFDexists(attributeName, vehicle, code), is(false)))
                            .waitingForNoLongerThan(05).seconds());
        } else {
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureVehicleOriginalEnglishCFD(attributeName, vehicle, code), equalToIgnoringCase("English CFD: " + originalCFDEnglish)))
                            .waitingForNoLongerThan(05).seconds());
        }
        if (originalCFDFrench.equalsIgnoreCase("null")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat(checkFrenchOriginalCFDexists(attributeName, vehicle, code), is(false)))
                            .waitingForNoLongerThan(05).seconds());
        } else {
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureVehicleOriginalFrenchCFD(attributeName, vehicle, code), equalToIgnoringCase("French CFD: " + originalCFDFrench)))
                            .waitingForNoLongerThan(05).seconds());
        }
    }

    @Then("^s?he should see (.*) for (.*) and (.*) with (.*) in new column with (.*) and (.*) with (.*) and (.*)$")
    public void heShouldSeeVehicleNewCFDCA(String vehicle, String code, String category, String status, String newEnglishDesc, String newFrenchDesc, String newCFDEnglish, String newCFDFrench) {
        String attributeName = theActorInTheSpotlight().recall("tab name");
        if (attributeName.equalsIgnoreCase("RPOs")) {
            attributeName = "rpo";
        } else {
            attributeName = "feature";
        }
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleStatus(attributeName, vehicle, code), equalToIgnoringCase(status)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleCategory(attributeName, vehicle, code), equalToIgnoringCase(category)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleNewEnglishDescription(attributeName, vehicle, code), equalToIgnoringCase("English: " + newEnglishDesc)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleOriginalFrenchDescription(attributeName, vehicle, code), equalToIgnoringCase("French: " + newFrenchDesc)))
                        .waitingForNoLongerThan(05).seconds());
        if (newCFDEnglish.equalsIgnoreCase("null")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat(checkEnglishNewCFDexists(attributeName, vehicle, code), is(false)))
                            .waitingForNoLongerThan(05).seconds());
        } else {
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureVehicleNewEnglishCFD(attributeName, vehicle, code), equalToIgnoringCase("English CFD: " + newCFDEnglish)))
                            .waitingForNoLongerThan(05).seconds());
        }
        if (newCFDFrench.equalsIgnoreCase("null")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat(checkFrenchNewCFDexists(attributeName, vehicle, code), is(false)))
                            .waitingForNoLongerThan(05).seconds());
        } else {
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureVehicleNewFrenchCFD(attributeName, vehicle, code), equalToIgnoringCase("French CFD: " + newCFDFrench)))
                            .waitingForNoLongerThan(05).seconds());
        }
    }

    @Then("^s?he should see (.*) for (.*) and (.*) with (.*) for original column with (.*) and (.*)$")
    public void heShouldSeeVehicleOriginalCFDUS(String vehicle, String code, String category, String status, String originalEnglishDesc, String originalCFDEnglish) {
        String attributeName = theActorInTheSpotlight().recall("tab name");
        if (attributeName.equalsIgnoreCase("RPOs")) {
            attributeName = "rpo";
        } else {
            attributeName = "feature";
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOn.vehicleExpandButton(attributeName, vehicle));
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleStatus(attributeName, vehicle, code), equalToIgnoringCase(status)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleCategory(attributeName, vehicle, code), equalToIgnoringCase(category)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleOriginalEnglishDescription(attributeName, vehicle, code), equalToIgnoringCase("English: " + originalEnglishDesc)))
                        .waitingForNoLongerThan(05).seconds());
        if (originalCFDEnglish.equalsIgnoreCase("null")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat(checkEnglishOriginalCFDexists(attributeName, vehicle, code), is(false)))
                            .waitingForNoLongerThan(01).seconds());
        }
        else {
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureVehicleOriginalEnglishCFD(attributeName, vehicle, code), equalToIgnoringCase("English CFD: " + originalCFDEnglish)))
                            .waitingForNoLongerThan(05).seconds());
        }
    }

    @Then("^s?he should see (.*) for (.*) and (.*) with (.*) for new column with (.*) and (.*)$")
    public void heShouldSeeVehicleNewCFDUS(String vehicle, String code, String category, String status, String newEnglishDesc, String newCFDEnglish) {
        String attributeName = theActorInTheSpotlight().recall("tab name");
        if (attributeName.equalsIgnoreCase("RPOs")) {
            attributeName = "rpo";
        } else {
            attributeName = "feature";
        }
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleStatus(attributeName, vehicle, code), equalToIgnoringCase(status)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleCategory(attributeName, vehicle, code), equalToIgnoringCase(category)))
                        .waitingForNoLongerThan(05).seconds());
        theActorInTheSpotlight().should(
                eventually(seeThat(featureVehicleNewEnglishDescription(attributeName, vehicle, code), equalToIgnoringCase("English: " + newEnglishDesc)))
                        .waitingForNoLongerThan(05).seconds());
        if (newCFDEnglish.equalsIgnoreCase("null")) {
            theActorInTheSpotlight().should(
                    eventually(seeThat(checkEnglishNewCFDexists(attributeName, vehicle, code), is(false)))
                            .waitingForNoLongerThan(05).seconds());
        } else {
            theActorInTheSpotlight().should(
                    eventually(seeThat(featureVehicleNewEnglishCFD(attributeName, vehicle, code), equalToIgnoringCase("English CFD: " + newCFDEnglish)))
                            .waitingForNoLongerThan(05).seconds());
        }
    }
}
