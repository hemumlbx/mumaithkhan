package gm.dataviewer.tasks;

import gm.dataviewer.pages.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterSearchInformation implements Task {

    private final String year;
    private final String brand;
    private final String division;

    public EnterSearchInformation(String year, String division, String brand) {
        this.division = division;
        this.year = year;
        this.brand = brand;
    }

    public static EnterSearchInformation intoCorrectField(String year, String division, String brand) {
        return instrumented(EnterSearchInformation.class, year, division, brand);
    }

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(DealerSummaryPage.DETAILED_SEARCH),
                Click.on(DealerSummaryPage.RESET_BUTTON),
                SelectDealerSummaryVehicle
                        .forYear(year),
                SelectDealerSummaryDivision
                        .forName(division.toUpperCase()),
                SelectDealerSummaryBrand
                        .called(brand)
        );
    }
}