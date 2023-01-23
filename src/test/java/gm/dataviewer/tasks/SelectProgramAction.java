package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProgramAction implements Task {

    private final String action;

    public SelectProgramAction(String action) {
        this.action = action;
    }

    public static SelectProgramAction titled(String action) {
        return instrumented(SelectProgramAction.class, action);
    }

    @Override
    @Step("{0} selects #action")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to("//span[contains(.,'Incentive And Offer Management')]"),
                MoveMouse.to(DVPublishPage.ACTION_BUTTON.of(action)),
                Click.on(DVPublishPage.ACTION_BUTTON.of(action))
        );
    }
}
