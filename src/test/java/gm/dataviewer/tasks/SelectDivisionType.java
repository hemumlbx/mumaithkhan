package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectDivisionType implements Task {

    private String division;

    private SelectDivisionType(String division) {
        this.division = division;
    }

    static public SelectDivisionType named(String division) {
        return new SelectDivisionType(division);
    }

    @Step("{0} selects division type #division")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.DIVISION_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(division), isVisible()).forNoMoreThan(05).seconds(),
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(division))
        );
    }
}
