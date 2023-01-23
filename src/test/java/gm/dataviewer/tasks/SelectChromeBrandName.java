package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectChromeBrandName implements Task {

    private String chromeBrand;

    private SelectChromeBrandName(String chromeBrand) {
        this.chromeBrand = chromeBrand;
    }

    static public SelectChromeBrandName named(String chromeBrand) {
        return new SelectChromeBrandName(chromeBrand);
    }

    @Step("{0} selects chrome brand name #chromeBrand")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.BRAND_OVERLAY_CHROME_DROPDOWN),
                WaitUntil.the(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(chromeBrand), isVisible()).forNoMoreThan(05).seconds(),
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(chromeBrand))
        );
    }
}
