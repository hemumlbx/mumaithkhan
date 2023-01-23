package gm.dataviewer.tasks;

import gm.dataviewer.pages.CommonElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnActionButton implements Task {

    private Target target;

    public ClickOnActionButton(Target target) {
        this.target = target;
    }

    public static ClickOnActionButton called(String button) {
        return instrumented(ClickOnActionButton.class, CommonElements.ACTION_BUTTON.of(button));
    }

    @Step("{0} clicks on Action button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to("//span[contains(.,'Incentive And Offer Management')]"),
                MoveMouse.to(target),
                JavaScriptClick.on(target)
        );
    }
}
