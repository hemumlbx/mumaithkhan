package gm.dataviewer.tasks;

import gm.dataviewer.pages.DealerSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDealerSummaryVehicle implements Task {

    private final String value;

    public SelectDealerSummaryVehicle(String value) {
        this.value = value;
    }

    public static SelectDealerSummaryVehicle forYear(String value) {
        return instrumented(SelectDealerSummaryVehicle.class, value);
    }

    public <T extends Actor> void performAs(T actor) {
        if (value.equals("All") || value.equals("Tout")) {
            actor.attemptsTo(
                    Click.on(DealerSummaryPage.VEHICLE_CHECKBOX_ALL)
            );
        } else {
            actor.attemptsTo(
                    Click.on(DealerSummaryPage.CHECKBOX_DATE_BRAND.of(value))
            );
        }
    }
}