package gm.dataviewer.tasks;

import gm.dataviewer.pages.IncentivesTab;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class WaitUntilClickable implements Task {

    private Target target;

    public WaitUntilClickable(Target target) {
        this.target = target;
    }

    public static WaitUntilClickable forIncentiveProgram() {
        return instrumented(WaitUntilClickable.class, IncentivesTab.PROGRAM.of("1"));
    }

    @Step("{0} waits until element is clickable")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isClickable()).forNoMoreThan(10).seconds()
        );
    }
}
