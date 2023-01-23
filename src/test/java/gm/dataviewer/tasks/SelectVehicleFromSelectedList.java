package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.questions.TextQuestions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectVehicleFromSelectedList implements Task {

    private String vehicle;

    private SelectVehicleFromSelectedList(String vehicle) {
        this.vehicle = vehicle;
    }

    static public SelectVehicleFromSelectedList named(String vehicle) {
        return new SelectVehicleFromSelectedList(vehicle);
    }

    @Step("{0} selects vehicle #vehicle")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(TextQuestions.checkVehicleExists(vehicle))
                        .andIfSo(
                                Click.on(DVPublishPage.SELECTED_VEHICLES.of(vehicle)),
                                Click.on(DVPublishPage.LEFT_ARROW),
                                WaitUntil.the(DVPublishPage.AVAILABLE_VEHICLES.of(vehicle), isVisible()).forNoMoreThan(5).seconds(),
                                ClickOn.featureVehicleOverlayAction("Save"),
                                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(50).seconds()
                        ).otherwise(
                                ClickOn.featureVehicleOverlayAction("Cancel")
                        ));
    }
}
