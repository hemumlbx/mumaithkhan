package infranova.main.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;


public class ClickOn implements Task {

    private Target target;

    public ClickOn(Target target) {
        this.target = target;
    }

    @Override
    @Step("{0} clicks on element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target)
        );
    }
}
