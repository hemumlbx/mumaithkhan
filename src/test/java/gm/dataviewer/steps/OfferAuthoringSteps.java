package gm.dataviewer.steps;

import domain.Attribute;
import domain.AttributeInclusion;
import gm.dataviewer.dataTableTypes.IncentiveAuthoringVehicleSelection;
import gm.dataviewer.interactions.WaitAndClick;
import gm.dataviewer.pages.CommonElements;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.questions.AuthoringQuestion;
import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.tasks.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static gm.dataviewer.questions.BrandsTabQuestions.*;
import static gm.dataviewer.questions.TextQuestions.checkVehicleAttributeExistsAuthoring;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class OfferAuthoringSteps {

    @When("^s?he edits an existing offer (.*) from (.*) folder$")
    public void heEditsAnExistingOfferFromDraftFolder(String offerName, String folder) {
        theActorInTheSpotlight().remember("Offer Name", offerName);
        theActorInTheSpotlight().attemptsTo(
                SelectOffer.withName(offerName)
        );
    }

    @Then("^s?he should verify the offer descriptions for the following vehicle selection for (.*) using program (.*)$")
    public void heShouldVerifyTheOfferVehicleDescriptions(String fvd, String programNUmber, IncentiveAuthoringVehicleSelection attributes) {
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
        String offerName = theActorInTheSpotlight().recall("Offer Name");
        String country = theActorInTheSpotlight().recall("country");
        String fileName = offerName + "-0";
        theActorInTheSpotlight().attemptsTo(
                SwitchTab.titled("Define Vehicles"),
                WaitforElement.certainTime()
        );
        theActorInTheSpotlight().attemptsTo(
                OpenVehicleOverlay.open()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOnOverlayButton.called("Delete")
        );
        theActorInTheSpotlight().attemptsTo(
                SelectOfferVehicleAndAttributes.searchVehicle(year, division, nameplate, brand, attributeCategory, attributeValue, attributeType));
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
                theActorInTheSpotlight().should(eventually(seeThat(offerVehicleDescription(), containsString(brand + " " + description))));
            } else {
                theActorInTheSpotlight().should(eventually(seeThat(offerVehicleDescription(), containsString(brand + " " + "w/" + description))));
            }
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(offerVehicleDescription(), containsString(nameplate))));
        }
        theActorInTheSpotlight().attemptsTo(
                SelectProgram.click(programNUmber));
        theActorInTheSpotlight().attemptsTo(
                SetDefineOffer.defineOffer("35000"));
        theActorInTheSpotlight().attemptsTo(
                OfferAuthoringDraftView.draftViewDescription(year, division, brand, frenchBrand, nameplate, frenchNameplate, description, frenchDescription, country, attributeType));
        theActorInTheSpotlight().attemptsTo(
                OfferDescriptionActiveView.activeViewDescription(year, division, brand, nameplate, description, offerName, attributeType));
        theActorInTheSpotlight().attemptsTo(
                OfferAuthoringActivePDF.activePDFDescription(brand, nameplate, description, offerName, fileName, attributeType));
    }

    @Then("^s?he should verify archived offer features should not be present$")
    public void heShouldVerifyArchivedOfferFeaturesShouldNotBePresent(IncentiveAuthoringVehicleSelection attributes) {
        theActorInTheSpotlight().attemptsTo(
                SwitchTab.titled("Define Vehicles"),
                WaitforElement.certainTime()
        );
        theActorInTheSpotlight().attemptsTo(
                OpenVehicleOverlay.open()
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOnOverlayButton.called("Delete")
        );
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
