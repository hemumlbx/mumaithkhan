package gm.dataviewer.tasks;
import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterRPOCode implements Task {

    private String value;
    private Target target;

    public EnterRPOCode(String value, Target target) {
        this.value = value;
        this.target = target;
    }

    public static EnterRPOCode rpoTextField(String value) {
        return instrumented(EnterRPOCode.class, value, DVPublishPage.ADD_RPO_TEXT_FIELD);
    }

    @Step("{0} enters value into rpo field element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(target),
                Enter.theValue(value).into(target)
        );
    }
}
