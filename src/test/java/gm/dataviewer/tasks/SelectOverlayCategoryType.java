package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectOverlayCategoryType implements Task {

    private String categoryType;

    private SelectOverlayCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    static public SelectOverlayCategoryType named(String categoryType) {
        return new SelectOverlayCategoryType(categoryType);
    }

    @Step("{0} selects overlay category type #categoryType")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.RPO_CATEGORY_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(categoryType), isVisible()).forNoMoreThan(20).seconds(),
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(categoryType))
        );
    }
}
