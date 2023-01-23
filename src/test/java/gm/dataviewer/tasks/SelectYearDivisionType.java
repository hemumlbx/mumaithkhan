package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectYearDivisionType implements Task {

    private String division;

    private SelectYearDivisionType(String division) {
        this.division = division;
    }

    static public SelectYearDivisionType named(String division) {
        return new SelectYearDivisionType(division);
    }

    @Step("{0} selects division type #division")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.NAMEPLATE_DIVISION_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(division), isVisible()).forNoMoreThan(05).seconds(),
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(division))
        );
    }
}
