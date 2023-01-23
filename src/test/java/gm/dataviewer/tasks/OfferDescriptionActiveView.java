package gm.dataviewer.tasks;

import gm.dataviewer.interactions.WaitAndClick;
import gm.dataviewer.pages.AuthoringPage;
import gm.dataviewer.pages.CommonElements;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.questions.TextQuestions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static gm.dataviewer.questions.PublishQuestions.offerNumberValue;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class OfferDescriptionActiveView implements Task {

    private final String year;
    private final String division;
    private final String brand;
    private final String nameplate;
    private final String description;
    private final String offerName;
    private final String attributeType;

    private OfferDescriptionActiveView(String year, String division, String brand, String nameplate, String description, String offerName, String attributeType) {
        this.year = year;
        this.division = division;
        this.brand = brand;
        this.nameplate = nameplate;
        this.description = description;
        this.offerName = offerName;
        this.attributeType = attributeType;
    }

    static public OfferDescriptionActiveView activeViewDescription(String year, String division, String brand, String nameplate, String description, String offerName, String attributeType) {
        return new OfferDescriptionActiveView(year, division, brand, nameplate, description, offerName, attributeType);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                ClickOnActionButton.called("Ready For Review"),
                ClickOnTabButton.called("OK"),
                SelectOfferType.titled("Ready For Review"),
                SelectOfferByName.select(offerName)
        );
        theActorInTheSpotlight().remember("Offer Number", offerNumberValue());
        theActorInTheSpotlight().attemptsTo(
                WaitAndClick.on(CommonElements.ACTION_BUTTON.of("Post To")),
                WaitAndClick.on(CommonElements.CONFIRM_BUTTON.of("OK")),
                SelectOfferType.titled("Failed to Post"),
                SelectOfferType.titled("Recently Expired"),
                SelectOfferType.titled("Active")
        );
        theActorInTheSpotlight().attemptsTo(
                SelectOfferByName.select(offerName),
                ClickOnActionButton.called("View")
        );
        String country = theActorInTheSpotlight().recall("country");
        if (!brand.equalsIgnoreCase("null")) {
            if (attributeType.equalsIgnoreCase("Vehicle Feature Codes")) {
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.REVIEW_ITEMS_LIST), hasItem(year + " " + division + " " + brand + " " + description)));
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.getText(AuthoringPage.MESSAGE_SECTION_VEHICLE), containsString(year + " " + division + " " + brand + " " + description)));
                if (country.equalsIgnoreCase("CA")) {
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.LOTS_LIST), hasItem("<span class=\"IOM_regular\">" + " " + year + " " + division + " " + brand + " " + description + " " + "</span>")));
                } else {
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.LOTS_LIST), hasItem("<span class=\"IOM_regular\">" + year + " " + division + " " + brand + " " + description + "</span>")));
                }
            } else {
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.REVIEW_ITEMS_LIST), hasItem(year + " " + division + " " + brand + " " + "w/" + description)));
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.getText(AuthoringPage.MESSAGE_SECTION_VEHICLE), containsString(year + " " + division + " " + brand + " " + "w/" + description)));
                if (country.equalsIgnoreCase("CA")) {
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.LOTS_LIST), hasItem("<span class=\"IOM_regular\">" + " " + year + " " + division + " " + brand + " " + "w/" + description + " " + "</span>")));
                } else {
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.LOTS_LIST), hasItem("<span class=\"IOM_regular\">" + year + " " + division + " " + brand + " " + "w/" + description + "</span>")));
                }
            }
        } else {
            theActorInTheSpotlight()
                    .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.REVIEW_ITEMS_LIST), hasItem(year + " " + division + " " + nameplate)));
            theActorInTheSpotlight()
                    .should(seeThat(TextQuestions.getText(AuthoringPage.MESSAGE_SECTION_VEHICLE), containsString(year + " " + division + " " + nameplate)));
            if (country.equalsIgnoreCase("CA")) {
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.LOTS_LIST), hasItem("<span class=\"IOM_regular\">" + " " + year + " " + division + " " + nameplate + " " + "</span>")));
            } else {
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.LOTS_LIST), hasItem("<span class=\"IOM_regular\">" + year + " " + division + " " + nameplate + "</span>")));
            }
        }
    }
}
