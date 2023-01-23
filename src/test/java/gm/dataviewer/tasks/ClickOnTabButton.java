package gm.dataviewer.tasks;

import gm.dataviewer.interactions.StaleClick;
import gm.dataviewer.pages.CommonElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnTabButton implements Task {

    private Target target;

    public ClickOnTabButton(Target target) {
        this.target = target;
    }

    public static ClickOnTabButton called(String button) {
        switch (button) {
            case "OK":
            case "Save":
                return instrumented(ClickOnTabButton.class, CommonElements.CONFIRM_BUTTON.of(button));
            default:
                return instrumented(ClickOnTabButton.class, CommonElements.TAB_BUTTON.of(button));
        }
    }

    @Step("{0} clicks on Action button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                StaleClick.onElement(target)
        );
    }
}
