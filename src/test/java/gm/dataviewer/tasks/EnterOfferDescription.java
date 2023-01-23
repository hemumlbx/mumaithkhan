package gm.dataviewer.tasks;
import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterOfferDescription implements Task {

    private String value;
    private Target target;

    public EnterOfferDescription(String value, Target target) {
        this.value = value;
        this.target = target;
    }

    public static EnterOfferDescription featureTypeField(String value) {
        return instrumented(EnterOfferDescription.class, value, DVPublishPage.OFFER_DESCRIPTION_TEXT_FIELD);
    }

    @Step("{0} enters value into Data Viewer element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(target),
                Enter.theValue(value).into(target)
        );
    }
}
