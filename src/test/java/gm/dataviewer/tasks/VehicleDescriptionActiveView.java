package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.questions.TextQuestions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.is;

public class VehicleDescriptionActiveView implements Task {

    private final String year;
    private final String division;
    private final String brand;
    private final String nameplate;
    private final String description;
    private final String programNumber;
    private final String attributeType;

    private VehicleDescriptionActiveView(String year, String division, String brand, String nameplate, String description, String programNumber, String attributeType) {
        this.year = year;
        this.division = division;
        this.brand = brand;
        this.nameplate = nameplate;
        this.description = description;
        this.programNumber = programNumber;
        this.attributeType = attributeType;
    }

    static public VehicleDescriptionActiveView activeViewDescription(String year, String division, String brand, String nameplate, String description, String programNumber, String attributeType) {
        return new VehicleDescriptionActiveView(year, division, brand, nameplate, description, programNumber, attributeType);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                WaitforElement.certainTime(),
                SelectProgramAction.titled("Ready to Review"),
                ClickOn.warningOkButton(),
                WaitforElement.certainTime(),
                ClickOn.programActive("Ready For Review"),
                WaitforElement.certainTime(),
                SelectProgramByNumber.select(programNumber),
                SelectProgramAction.titled("Production"),
                WaitforElement.certainTime());
        theActorInTheSpotlight().attemptsTo(
                ClickOn.warningOkPostButton(),
                WaitforElement.certainTime());
        theActorInTheSpotlight().attemptsTo(
                WaitforElement.certainTime(),
                ClickOn.programActive("Active"),
                WaitforElement.certainTime(),
                WaitUntil.the(DVPublishPage.PROGRAM_ROW_BY_NUMBER.of(programNumber), isVisible()),
                SelectProgramByNumber.select(programNumber),
                SelectProgramAction.titled("View"),
                WaitforElement.certainTime());
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
