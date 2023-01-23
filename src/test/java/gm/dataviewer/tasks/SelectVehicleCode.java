package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.pages.SearchTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectVehicleCode implements Task {

    private String code;
    private String value;

    private SelectVehicleCode(String code, String value) {
        this.code = code;
        this.value = value;
    }

    static public SelectVehicleCode named(String code, String value) {
        return new SelectVehicleCode(code, value);
    }

    @Step("{0} selects division type #division")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.CODE_DROPDOWN),
                WaitUntil.the(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(code), isVisible()).forNoMoreThan(05).seconds(),
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(code))
        );
        actor.attemptsTo(
                Enter.theValue(value).into(SearchTabPage.CODE_TEXT_FIELD)
        );
    }
}
