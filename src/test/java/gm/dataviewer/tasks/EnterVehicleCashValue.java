package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterVehicleCashValue implements Task {

    private final String cashValue;


    public EnterVehicleCashValue(String cashValue) {
        this.cashValue = cashValue;
    }

    public static EnterVehicleCashValue intoCashField(String cashValue) {
        return instrumented(EnterVehicleCashValue.class, cashValue);

    }

    @Step("{0} enters cashvalue# **#cash**")
    public <T extends Actor> void performAs(T actor) {
        WaitforElement.certainTime();
        actor.attemptsTo(
                Enter.theValue(cashValue).into(DVPublishPage.CASH_TEXTBOX)
        );
    }
}
