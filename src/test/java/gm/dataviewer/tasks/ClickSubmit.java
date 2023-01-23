package gm.dataviewer.tasks;

import gm.dataviewer.pages.DealerSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ClickSubmit implements Task {

    public static ClickSubmit button() {
        return instrumented(ClickSubmit.class);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DealerSummaryPage.SUBMIT_BUTTON),
                WaitUntil.the(DealerSummaryPage.VIEWING_PAGE, isClickable()).forNoMoreThan(60).seconds()
        );
    }
}