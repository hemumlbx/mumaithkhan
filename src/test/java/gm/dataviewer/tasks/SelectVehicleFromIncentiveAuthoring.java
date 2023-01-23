package gm.dataviewer.tasks;

import gm.dataviewer.pages.BrandsTabPage;
import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.util.Locale;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectVehicleFromIncentiveAuthoring implements Task {

    private String year;
    private String division;
    private String nameplate;
    private String brand;

    public SelectVehicleFromIncentiveAuthoring(String year, String division, String nameplate, String brand) {
        this.year = year;
        this.division = division;
        this.nameplate = nameplate;
        this.brand = brand;
    }

    public static SelectVehicleFromIncentiveAuthoring withValue(String year,
                                                                String division,
                                                                String nameplate,
                                                                String brand) {
        return instrumented(SelectVehicleFromIncentiveAuthoring.class, year, division, nameplate, brand);
    }

    @Step("{0} selects a #year #division #nameplate #brand")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DVPublishPage.AUTHORING_YEAR_DROPDOWN, isVisible()),
                Click.on(DVPublishPage.AUTHORING_YEAR_DROPDOWN),
                WaitUntil.the(DVPublishPage.DROPDOWN_ITEM.of((year)), isVisible()),
                Click.on(DVPublishPage.DROPDOWN_ITEM.of((year))),
                Click.on(DVPublishPage.DIVISION_DROPDOWN)
        );
        if (!division.equalsIgnoreCase("GMC")) {
            actor.attemptsTo(
                    Click.on(DVPublishPage.DROPDOWN_ITEM.of(division.substring(0, 1).toUpperCase() + division.substring(1).toLowerCase()))
            );
        } else {
            actor.attemptsTo(
                    Click.on(DVPublishPage.DROPDOWN_ITEM.of(division))
            );
        }
        if (brand.equalsIgnoreCase("null")) {
            actor.attemptsTo(
                    Click.on(DVPublishPage.NAMEPLATE.of(nameplate))
            );
        } else {
            actor.attemptsTo(
                    Click.on(DVPublishPage.EXPAND_NAMEPLATE.of(nameplate)),
                    WaitUntil.the(DVPublishPage.BRAND.of(brand), isVisible()).forNoMoreThan(5).seconds()
            );
            actor.attemptsTo(
                    Click.on(DVPublishPage.BRAND.of(brand))
            );
        }
    }
}
