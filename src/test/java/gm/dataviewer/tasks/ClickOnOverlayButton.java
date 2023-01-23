package gm.dataviewer.tasks;

import gm.dataviewer.interactions.*;
import gm.dataviewer.pages.CommonElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnOverlayButton implements Task {

    private Target target;
    boolean waitAndClick = false;

    public ClickOnOverlayButton(Target target) {
        this.target = target;
    }

    public ClickOnOverlayButton(Target target, boolean waitAndClick) {
        this.target = target;
        this.waitAndClick = waitAndClick;
    }


    public static ClickOnOverlayButton called(String button) {
        switch (button) {
            case "Close":
                return instrumented(ClickOnOverlayButton.class, CommonElements.CLOSE_OVERLAY);
            case "Help":
                return instrumented(ClickOnOverlayButton.class, CommonElements.HELP_OVERLAY);
            case "OK":
                return instrumented(ClickOnOverlayButton.class, CommonElements.OVERLAY_BUTTON.of(button), true);
            case "Edit":
                return instrumented(ClickOnOverlayButton.class, CommonElements.OVERLAY_BUTTON.of(button), true);
            default:
                if (button.contains("Action"))
                    return instrumented(ClickOnOverlayButton.class, CommonElements.ACTION_BUTTON_OVERLAY.of(button.replace("Action ", "")));
                else
                    return instrumented(ClickOnOverlayButton.class, CommonElements.OVERLAY_BUTTON.of(button));
        }
    }

    @Step("{0} clicks on Overlay button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                waitAndClick ?
                        WaitAndClick.on(target) :
                        StaleClick.onElement(target)
        );
    }
}
