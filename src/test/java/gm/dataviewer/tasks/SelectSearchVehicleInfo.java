package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectSearchVehicleInfo implements Task {

    private String division;
    private String year;
    private String brand;

    private SelectSearchVehicleInfo(String year, String division, String brand) {
        this.division = division;
        this.year = year;
        this.brand = brand;
    }

    static public SelectSearchVehicleInfo named(String year, String division, String brand) {
        return new SelectSearchVehicleInfo(year, division, brand);
    }

    @Step("{0} selects division type #division")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.YEAR_DROPDOWN),
                WaitUntil.the(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(year), isVisible()).forNoMoreThan(05).seconds(),
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(year))
        );
        actor.attemptsTo(
                Click.on(DVPublishPage.DIVISION_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(division), isVisible()).forNoMoreThan(05).seconds(),
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(division))
        );
        actor.attemptsTo(
                Click.on(DVPublishPage.BRAND_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(brand), isVisible()).forNoMoreThan(05).seconds(),
                Click.on(DVPublishPage.CATEGORY_TYPE_DROPDOWN_VALUE.of(brand))
        );
    }
}
