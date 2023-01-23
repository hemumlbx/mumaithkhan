package gm.dataviewer.tasks;

import gm.dataviewer.pages.IncentivesTab;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.questions.Value;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectNumberOfResults implements Task {

    public static SelectNumberOfResults resizeTo75() {
        return instrumented(SelectNumberOfResults.class);
    }

    public <T extends Actor> void performAs(T actor) {
        String number = Value.of(IncentivesTab.RESULT_NUMBER).viewedBy(actor).resolve();
        if (number.equals("75")) return;
        actor.attemptsTo(
                JavaScriptClick.on(IncentivesTab.RESULT_NUMBER_DROPDOWN)
        );
        actor.attemptsTo(
                Click.on(IncentivesTab.DROPDOWN_OPTION.of("75"))
        );
    }
}
