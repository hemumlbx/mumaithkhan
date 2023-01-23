package gm.dataviewer.tasks;

import domain.Tab;
import gm.dataviewer.pages.AuthoringPage;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.questions.AuthoringQuestion;
import gm.dataviewer.questions.TextQuestions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class OfferAuthoringDraftView implements Task {

    private final String year;
    private final String division;
    private final String brand;
    private final String frenchBrand;
    private final String nameplate;
    private final String frenchNameplate;
    private final String description;
    private final String frenchDesc;
    private final String country;
    private final String attributeType;

    private OfferAuthoringDraftView(String year, String division, String brand, String frenchBrand, String nameplate, String frenchNameplate, String description, String frenchDesc, String country, String attributeType) {
        this.year = year;
        this.division = division;
        this.brand = brand;
        this.frenchBrand = frenchBrand;
        this.nameplate = nameplate;
        this.frenchNameplate = frenchNameplate;
        this.description = description;
        this.frenchDesc = frenchDesc;
        this.country = country;
        this.attributeType = attributeType;
    }

    static public OfferAuthoringDraftView draftViewDescription(String year, String division, String brand, String frenchBrand, String nameplate, String frenchNameplate, String description, String frenchDesc, String country, String attributeType) {
        return new OfferAuthoringDraftView(year, division, brand, frenchBrand, nameplate, frenchNameplate, description, frenchDesc, country, attributeType);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                SelectTab.titled(Tab.SelectTab.valueOf("REVIEW").selectTabValue())
        );
        theActorInTheSpotlight().remember("Offer Number", AuthoringQuestion.offerNumberValue());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectAuthoringLanguage.named("Français"),
                    WaitforElement.certainTime()
            );
            if (!brand.equalsIgnoreCase("null")) {
                if (attributeType.equalsIgnoreCase("Vehicle Feature Codes")) {
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.REVIEW_ITEMS_LIST), hasItem(year + " " + division + " " + brand + " " + frenchDesc)));
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.getText(AuthoringPage.MESSAGE_SECTION_VEHICLE), containsString(year + " " + division + " " + brand + " " + frenchDesc)));
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.LOTS_LIST), hasItem("<span class=\"IOM_regular\">" + " " + year + " " + division + " " + brand + " " + frenchDesc + " " + "</span>")));
                } else {
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.REVIEW_ITEMS_LIST), hasItem(year + " " + division + " " + frenchBrand + " " + "avec " + frenchDesc)));
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.getText(AuthoringPage.MESSAGE_SECTION_VEHICLE), containsString(year + " " + division + " " + frenchBrand + " " + "avec " + frenchDesc)));
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.LOTS_LIST), hasItem("<span class=\"IOM_regular\">" + " " + year + " " + division + " " + frenchBrand + " " + "avec " + frenchDesc + " " + "</span>")));
                }
            } else {
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.REVIEW_ITEMS_LIST), hasItem(year + " " + division + " " + frenchNameplate)));
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.getText(AuthoringPage.MESSAGE_SECTION_VEHICLE), containsString(year + " " + division + " " + frenchNameplate)));
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.textFromAllOccurrences(AuthoringPage.LOTS_LIST), hasItem("<span class=\"IOM_regular\">" + " " + year + " " + division + " " + frenchNameplate + " " + "</span>")));
            }
        }
        theActorInTheSpotlight().attemptsTo(
                SelectAuthoringLanguage.named("English"),
                WaitforElement.certainTime()
        );
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
