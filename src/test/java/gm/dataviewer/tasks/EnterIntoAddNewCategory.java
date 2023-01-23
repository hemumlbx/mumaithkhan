package gm.dataviewer.tasks;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.pages.RPOsTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterIntoAddNewCategory implements Task {

    private String value;
    private Target target;

    public EnterIntoAddNewCategory(String value, Target target) {
        this.value = value;
        this.target = target;
    }

    public static EnterIntoAddNewCategory categoryField(String value) {
        return instrumented(EnterIntoAddNewCategory.class, value, RPOsTabPage.ADD_CATEGORY_FIELD);
    }

    @Step("{0} enters value into Data Viewer element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(target),
                Enter.theValue(value).into(target)
        );
    }
}
