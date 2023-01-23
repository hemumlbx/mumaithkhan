package gm.dataviewer.tasks;

import gm.dataviewer.pages.DealerSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDealerSummaryDivision implements Task {

    private final String value;

    public SelectDealerSummaryDivision(String value) {
        this.value = value;
    }

    public static SelectDealerSummaryDivision forName(String value) {
        return instrumented(SelectDealerSummaryDivision.class, value);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DealerSummaryPage.DROP_DOWN_BOX.of("division")),
                Click.on(DealerSummaryPage.SELECTION_DROP_DOWN_VISIBLE.of(value))
        );
    }
}