package gm.dataviewer.tasks;

import domain.Tab;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.questions.TextQuestions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class VehicleDescriptionDraftView implements Task {

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

    private VehicleDescriptionDraftView(String year, String division, String brand, String frenchBrand, String nameplate, String frenchNameplate, String description, String frenchDesc, String country, String attributeType) {
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

    static public VehicleDescriptionDraftView draftViewDescription(String year, String division, String brand, String frenchBrand, String nameplate, String frenchNameplate, String description, String frenchDesc, String country, String attributeType) {
        return new VehicleDescriptionDraftView(year, division, brand, frenchBrand, nameplate, frenchNameplate, description, frenchDesc, country, attributeType);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                SelectTab.titled(Tab.SelectTab.valueOf("TEN_POINT").selectTabValue())
        );
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().attemptsTo(
                    SelectAuthoringLanguage.named("Français"),
                    WaitforElement.certainTime()
            );
            theActorInTheSpotlight()
                    .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_YEAR.of(year)), is(year + " " + "Modèle(s)")));
            theActorInTheSpotlight()
                    .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_MODEL.of(division)), is(division)));
            if (!brand.equalsIgnoreCase("null")) {
                if (attributeType.equalsIgnoreCase("Vehicle Feature Codes")) {
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_MODEL.of(frenchDesc)), is(frenchBrand + " " + frenchDesc)));
                } else {
                    theActorInTheSpotlight()
                            .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_MODEL.of(frenchDesc)), is(frenchBrand + " " + "avec " + frenchDesc)));
                }
            } else {
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_MODEL.of(frenchNameplate)), is(frenchNameplate)));
            }
        }
        theActorInTheSpotlight().attemptsTo(
                SelectAuthoringLanguage.named("English"),
                WaitforElement.certainTime()
        );
        theActorInTheSpotlight()
                .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_YEAR.of(year)), is(year + " " + "Model(s)")));
        theActorInTheSpotlight()
                .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_MODEL.of(division)), is(division)));
        if (!brand.equalsIgnoreCase("null")) {
            if (attributeType.equalsIgnoreCase("Vehicle Feature Codes")) {
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_MODEL.of(description)), is(brand + " " + description)));
            } else {
                theActorInTheSpotlight()
                        .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_MODEL.of(description)), is(brand + " " + "w/" + description)));
            }
        } else {
            theActorInTheSpotlight()
                    .should(seeThat(TextQuestions.getText(DVPublishPage.TEN_POINT_VEHICLE_MODEL.of(nameplate)), is(nameplate)));
        }
    }
}
