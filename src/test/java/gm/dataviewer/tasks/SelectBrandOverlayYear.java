package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectBrandOverlayYear implements Task {

    private String year;

    private SelectBrandOverlayYear(String year) {
        this.year = year;
    }

    static public SelectBrandOverlayYear named(String year) {
        return new SelectBrandOverlayYear(year);
    }

    @Step("{0} selects year #year")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.BRAND_OVERLAY_YEAR_DROPDOWN),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(this.year), isClickable()).forNoMoreThan(5).seconds()
        );
        actor.attemptsTo(
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(this.year))
        );
    }
}
