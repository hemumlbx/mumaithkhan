package gm.dataviewer.tasks;

import gm.dataviewer.pages.EditProgramTabs;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectTab implements Task {

    private final String tabTitle;

    public SelectTab(final String tabTitle) {
        this.tabTitle = tabTitle;
    }

    @Override
    @Step("{0} selects #tabTitle tab")
    public <T extends Actor> void performAs(T actor) {
        final Target tab = EditProgramTabs.TAB.of(tabTitle);
        actor.attemptsTo(
                WaitUntil.the(tab, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(tab)
        );
        try {
            Thread.sleep(2500);
        } catch (Exception e) {
        }
    }

    public static SelectTab titled(final String tabTitle) {
        return instrumented(SelectTab.class, tabTitle);
    }
}
