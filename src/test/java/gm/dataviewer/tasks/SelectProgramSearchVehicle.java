package gm.dataviewer.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectProgramSearchVehicle implements Task {

    private final String year;
    private final String division;
    private final String brand;

    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.detailedSearch(),
                ClickOn.vehicleReset(),
                ClickOn.modelYear(year),
                SelectVehicleDivision.setDivision(division),
                ClickOn.selectAll("All"),
                ClickOn.selectAll(brand),
                ClickOn.vehicleSubmit()
        );
    }

    public static SelectProgramSearchVehicle setDivision(String year, String division, String brand) {
        return instrumented(SelectProgramSearchVehicle.class, year, division, brand);
    }

    public SelectProgramSearchVehicle(String year, String division, String brand) {
        this.year = year;
        this.division = division;
        this.brand = brand;
    }
}
