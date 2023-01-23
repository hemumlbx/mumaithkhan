package gm.dataviewer.tasks;

import gm.dataviewer.pages.BrandsTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectVehicle implements Task {

    private String year;
    private String division;
    private String button;

    private SelectVehicle(String year, String division, String button) {
        this.year = year;
        this.division = division;
        this.button = button;
    }

    static public SelectVehicle searchVehicle(String year, String division, String button) {
        return new SelectVehicle(year, division, button);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                ClickOnBrandsTabElement.yearDropdownButton(),
                ClickOnBrandsTabElement.theYearDropdownValue(year),
                ClickOnBrandsTabElement.divisionDropdownButton(),
                ClickOnBrandsTabElement.theDivisionDropdownValue(division),
                ClickOnBrandsTabElement.theBrandsSearchButton(button)
        );
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(BrandsTabPage.BRAND_GRID_VALUES.of(division), isVisible()).forNoMoreThan(5).seconds());
    }
}
