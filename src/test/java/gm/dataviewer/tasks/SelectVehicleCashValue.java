package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectVehicleCashValue implements Task {

    private final String year;
    private final String division;
    private final String brand;
    private final String nameplate;
    private final String description;
    private final String attributeType;

    private SelectVehicleCashValue(String year, String division, String brand, String nameplate, String description, String attributeType) {
        this.year = year;
        this.division = division;
        this.brand = brand;
        this.nameplate = nameplate;
        this.description = description;
        this.attributeType = attributeType;
    }

    static public SelectVehicleCashValue searchVehicle(String year, String division, String brand, String nameplate, String description, String attributeType) {
        return new SelectVehicleCashValue(year, division, brand, nameplate, description, attributeType);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight()
                .attemptsTo(
                        WaitforElement.certainTime(),
                        ClickOn.selectIncentiveValues());
        if (!brand.equalsIgnoreCase("null")) {
            if (attributeType.equalsIgnoreCase("Vehicle Feature Codes")) {
                theActorInTheSpotlight().attemptsTo(
                        WaitUntil.the(DVPublishPage.MODEL_CHECKBOX.of(year + " " + division + " " + brand), isVisible()));
                theActorInTheSpotlight()
                        .attemptsTo(ClickOn.selectModelVehicle(year + " " + division + " " + brand));
            } else {
                theActorInTheSpotlight().attemptsTo(
                        WaitUntil.the(DVPublishPage.MODEL_CHECKBOX.of(year + " " + division + " " + brand), isVisible()));
                theActorInTheSpotlight()
                        .attemptsTo(ClickOn.selectModelVehicle(year + " " + division + " " + brand));
            }
        } else {
            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(DVPublishPage.MODEL_CHECKBOX.of(year + " " + division + " " + nameplate), isVisible()));
            theActorInTheSpotlight()
                    .attemptsTo(ClickOn.selectModelVehicle(year + " " + division + " " + nameplate));
        }
        theActorInTheSpotlight().attemptsTo(
                EnterVehicleCashValue.intoCashField("1000")
        );
        theActorInTheSpotlight().attemptsTo(
                EnterVehicleFootNote.intoNoteField(""));
        theActorInTheSpotlight().attemptsTo(
                ClickOn.saveAndCloseButton());
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}
