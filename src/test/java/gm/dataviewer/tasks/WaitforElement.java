package gm.dataviewer.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitforElement implements Task {


    public static WaitforElement certainTime() {
        return instrumented(WaitforElement.class);

    }

    @Step("{0} wait time# **#time**")
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
