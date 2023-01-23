package gm.dataviewer.tasks;

import gm.dataviewer.pages.ProgramSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSummaryDivision implements Task {

    private final String division;

    @Step("{0} enters Postal Code# **#code**")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProgramSummaryPage.VEHICLE_DIVISION_DROPDOWN),
                Click.on(ProgramSummaryPage.DROPDOWN_OPTION.of(division))

        );
    }

    public static SelectSummaryDivision fromDropdown(String division){
        return instrumented(SelectSummaryDivision.class, division);
    }

    public SelectSummaryDivision(String division){
        this.division = division;
    }

}
