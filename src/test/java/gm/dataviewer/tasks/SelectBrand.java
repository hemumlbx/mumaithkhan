package gm.dataviewer.tasks;

import gm.dataviewer.pages.ProgramSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectBrand implements Task {

    private final String value;

    public SelectBrand(String value) {
        this.value = value;
    }

    public static SelectBrand called(String value) {
        return instrumented(SelectBrand.class, value);
    }

    public <T extends Actor> void performAs(T actor) {

        if ((value.equals("All") || value.equals("Tous"))) {
            theActorInTheSpotlight().attemptsTo(
                    Click.on(ProgramSummaryPage.MODEL_CHECKBOX.of(value)));
        } else {
            String[] brands = value.split(", ");
            for (String chosenBrand : brands) {
                theActorInTheSpotlight().attemptsTo(
                        Click.on(ProgramSummaryPage.VEHICLE_BRAND.of(chosenBrand))
                );
            }
        }
    }
}





