package gm.dataviewer.tasks;

import gm.dataviewer.questions.TextQuestions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.*;

public class SelectProgramFromDraft implements Task {

    private String number;

    public SelectProgramFromDraft(String number) {
        this.number = number;
    }

    public static SelectProgramFromDraft withName(String number) {
        return instrumented(SelectProgramFromDraft.class, number);
    }

    @Step("{0} selects program with name #number")
    public <T extends Actor> void performAs(T actor) {
        WaitforElement.certainTime();
        actor.attemptsTo(
                Check.whether(TextQuestions.checkProgramExists(number))
                        .andIfSo(
                                SelectProgramByNumber.select(number),
                                SelectProgramAction.titled("Edit")
                        ).otherwise(
                                SelectProgramByNumber.select(number)
                        ));
    }
}
