package gm.dataviewer.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SaveOffer implements Task {

    public static SaveOffer save() {
        return instrumented(SaveOffer.class);
    }

    @Step("{0} saves offer")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickOnActionButton.called("Save")
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
