package gm.dataviewer.steps;

import domain.Attribute;
import domain.AttributeInclusion;
import gm.dataviewer.dataTableTypes.IncentiveAuthoringVehicleSelection;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.tasks.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static gm.dataviewer.questions.BrandsTabQuestions.*;
import static gm.dataviewer.questions.TextQuestions.checkVehicleAttributeExistsAuthoring;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class AuthoringSteps {

    @When("^s?he edits an existing program (.*) from (.*) folder$")
    public void heEditsAnExistingProgramFromDraftFolder(String program, String folder) {
        theActorInTheSpotlight().attemptsTo(
                WaitforElement.certainTime(),
                SelectProgramFromDraft.withName(program),
                WaitforElement.certainTime(),
                SelectTab.titled("Vehicles")
        );
        theActorInTheSpotlight().remember("program", program);
    }

    @Then("^s?he should verify the descriptions for the following vehicle selection for (.*)$")
    public void heShouldVerifyTheVehicleDescriptions(String fvd, IncentiveAuthoringVehicleSelection attributes) {
        String year = attributes.getYear();
        String division = attributes.getDivision();
        String nameplate = attributes.getNameplate();
        String frenchNameplate = attributes.getFrenchNameplate();
        String brand = attributes.getBrand();
        String frenchBrand = attributes.getFrenchBrand();
        String attributeCategory = attributes.getAttributeCategory();
        String attributeValue = attributes.getAttributeValue();
        String attributeType = attributes.getAttributeType();
        String description = attributes.getDescription();
        String frenchDescription = attributes.getFrenchDescription();
        String programNumber = theActorInTheSpotlight().recall("program");
        String country = theActorInTheSpotlight().recall("country");
        String fileName = programNumber + "-0";
        theActorInTheSpotlight().attemptsTo(
                SelectVehicleAndAttributes.searchVehicle(year, division, nameplate, brand, attributeCategory, attributeValue, attributeType));
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(DVPublishPage.VEHICLE_SHORT_DESCRIPTION, isVisible()));
        if (!brand.equalsIgnoreCase("null")) {
            if (attributeType.equalsIgnoreCase("Vehicle Feature Codes")) {
                theActorInTheSpotlight().should(eventually(seeThat(vehicleShortDescription(), equalToIgnoringCase(year + " " + division + " " + brand + " " + description))
                ));
            } else {
                theActorInTheSpotlight().should(eventually(seeThat(vehicleShortDescription(), equalToIgnoringCase(year + " " + division + " " + brand + " " + "w/" + description))));
            }
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(vehicleShortDescription(), equalToIgnoringCase(year + " " + division + " " + nameplate))));
        }
        theActorInTheSpotlight().should(eventually(seeThat(vehicleCurrentFVD(), equalToIgnoringCase(fvd))));
        theActorInTheSpotlight().attemptsTo(ClickOn.vehicleActionButton("Save & Close"));
        if (!brand.equalsIgnoreCase("null")) {
            if (attributeType.equalsIgnoreCase("Vehicle Feature Codes")) {
                theActorInTheSpotlight().should(eventually(seeThat(vehicleBrandColumn(), equalToIgnoringCase(brand + " " + description))));
            } else {
                theActorInTheSpotlight().should(eventually(seeThat(vehicleBrandColumn(), equalToIgnoringCase(brand + " " + "w/" + description))));
            }
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(vehicleBrandColumn(), equalToIgnoringCase(nameplate))));
        }
        theActorInTheSpotlight().attemptsTo(
                SelectVehicleCashValue.searchVehicle(year, division, brand, nameplate, description, attributeType));
        theActorInTheSpotlight().attemptsTo(
                VehicleDescriptionDraftView.draftViewDescription(year, division, brand, frenchBrand, nameplate, frenchNameplate, description, frenchDescription, country, attributeType));
        theActorInTheSpotlight().attemptsTo(
                VehicleDescriptionActiveView.activeViewDescription(year, division, brand, nameplate, description, programNumber, attributeType));
        theActorInTheSpotlight().attemptsTo(
                VehicleDescriptionActivePDF.activePDFDescription(brand, nameplate, description, programNumber, fileName, attributeType));
    }

    @Then("^s?he should verify archived features should not be present$")
    public void heShouldVerifyArchivedFeaturesShouldNotBePresent(IncentiveAuthoringVehicleSelection attributes) {
        theActorInTheSpotlight()
                .should(eventually(seeThat(TextQuestions.getText(DVPublishPage.HEADER_LABEL.of("Vehicles")), is("Eligibility Criteria: Vehicles"))).waitingForNoLongerThan(10).seconds());
        theActorInTheSpotlight()
                .attemptsTo(ClickOn.selectVehiclesButton());
        theActorInTheSpotlight().attemptsTo(
                ClickOn.vehicleActionOverlayButton("Add New"));
        theActorInTheSpotlight().attemptsTo(
                WaitforElement.certainTime(),
                SelectVehicleFromIncentiveAuthoring.withValue(attributes.getYear(), attributes.getDivision(), attributes.getNameplate(), attributes.getBrand()),
                WaitforElement.certainTime()
        );
        if (attributes.getAttributeType().equalsIgnoreCase("Vehicle Feature Codes")) {
            theActorInTheSpotlight().attemptsTo(
                    ArchivedAttribute.withValue(Attribute.Feature, attributes.getAttributeCategory(), attributes.getAttributeValue(), AttributeInclusion.includes)
            );
        } else {
            theActorInTheSpotlight().attemptsTo(
                    ArchivedAttribute.withValue(Attribute.RPO, attributes.getAttributeCategory(), attributes.getAttributeValue(), AttributeInclusion.includes)
            );
        }
        theActorInTheSpotlight().should(eventually(seeThat(checkVehicleAttributeExistsAuthoring(attributes.getAttributeValue()), is(false))));
    }
}
