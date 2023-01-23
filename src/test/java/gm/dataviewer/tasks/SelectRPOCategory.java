package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectRPOCategory implements Task {

    private String year;
    private String division;
    private String brand;
    private String category;
    private String status;

    private SelectRPOCategory(String year, String division, String brand, String category, String status) {
        this.year = year;
        this.division = division;
        this.brand = brand;
        this.category = category;
        this.status = status;
    }

    static public SelectRPOCategory feature(String year, String division, String brand, String category, String status) {
        return new SelectRPOCategory(year, division, brand, category, status);
    }

    @Step("{0} selects feature vehicle list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.YEAR_DROPDOWN),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(year), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(year))
        );
        actor.attemptsTo(
                Click.on(DVPublishPage.DIVISION_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(division), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(division))
        );
        actor.attemptsTo(
                Click.on(DVPublishPage.BRAND_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(brand), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(brand))
        );
        actor.attemptsTo(
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(category), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(category))
        );
        actor.attemptsTo(
                Click.on(DVPublishPage.FEATURE_STATUS_DROPDOWN),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(status), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(status))
        );
    }
}
