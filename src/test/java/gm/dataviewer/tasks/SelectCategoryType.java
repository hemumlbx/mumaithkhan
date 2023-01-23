package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCategoryType implements Task {

    private String categoryType;

    private SelectCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    static public SelectCategoryType named(String categoryType) {
        return new SelectCategoryType(categoryType);
    }

    @Step("{0} selects category type #categoryType")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(categoryType), isVisible()).forNoMoreThan(20).seconds(),
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(categoryType))
        );
    }
}
