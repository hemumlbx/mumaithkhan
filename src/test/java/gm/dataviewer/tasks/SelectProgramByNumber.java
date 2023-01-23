package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectProgramByNumber implements Task {

    private final String name;

    public SelectProgramByNumber(String name) {
        this.name = name;
    }

    public static SelectProgramByNumber select(String name){
        return instrumented(SelectProgramByNumber.class, name);
    }

    @Override
    @Step("{0} selects program by number")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitforElement.certainTime(),
                WaitUntil.the(DVPublishPage.PROGRAM_ROW_BY_NUMBER.of(name), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DVPublishPage.PROGRAM_ROW_BY_NUMBER.of(name)),
                WaitforElement.certainTime()
        );
    }
}
