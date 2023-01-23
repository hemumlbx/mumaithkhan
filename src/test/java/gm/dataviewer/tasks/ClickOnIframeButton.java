package gm.dataviewer.tasks;

import gm.dataviewer.interactions.WaitAndClick;
import gm.dataviewer.pages.CommonElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnIframeButton implements Task {

    private Target target;

    public ClickOnIframeButton(Target target) {
        this.target = target;
    }

    public static ClickOnIframeButton called(String button) {
        return instrumented(ClickOnIframeButton.class, CommonElements.IFRAME_BUTTON.of(button));
    }

    @Step("{0} clicks on Iframe button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitAndClick.on(target)
        );
    }
}
