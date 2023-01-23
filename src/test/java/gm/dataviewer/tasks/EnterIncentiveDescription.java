package gm.dataviewer.tasks;
import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterIncentiveDescription implements Task {

    private String value;
    private Target target;

    public EnterIncentiveDescription(String value, Target target) {
        this.value = value;
        this.target = target;
    }

    public static EnterIncentiveDescription featureTypeField(String value) {
        return instrumented(EnterIncentiveDescription.class, value, DVPublishPage.INCENTIVE_DESCRIPTION_TEXT_FIELD);
    }

    @Step("{0} enters value into category field")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(target),
                Enter.theValue(value).into(target)
        );
    }
}
