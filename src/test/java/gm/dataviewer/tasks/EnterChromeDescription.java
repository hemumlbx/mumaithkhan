package gm.dataviewer.tasks;
import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterChromeDescription implements Task {

    private String value;
    private Target target;

    public EnterChromeDescription(String value, Target target) {
        this.value = value;
        this.target = target;
    }

    public static EnterChromeDescription chromeTextField(String value) {
        return instrumented(EnterChromeDescription.class, value, DVPublishPage.CHROME_DESCRIPTION_TEXT_FIELD);
    }

    @Step("{0} enters value into chrome description field element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(target),
                Enter.theValue(value).into(target)
        );
    }
}
