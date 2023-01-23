package gm.dataviewer.tasks;

import gm.dataviewer.pages.ProgramSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectVehicleDivision implements Task {

    private final String vehicle;

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProgramSearchPage.VEHICLE_DIVISION_DROPDOWN),
                Click.on(ProgramSearchPage.SELECTION_TARGET.of(vehicle, vehicle))
        );
    }

    public static SelectVehicleDivision setDivision(String vehicle) {
        return instrumented(SelectVehicleDivision.class, vehicle);
    }

    public SelectVehicleDivision(String vehicle) {
        this.vehicle = vehicle;
    }
}
