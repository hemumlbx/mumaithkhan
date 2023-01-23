package gm.dataviewer.tasks;

import gm.dataviewer.pages.BrandsTabPage;
import gm.dataviewer.pages.FeaturesTabPage;
import gm.dataviewer.pages.RPOsTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchCategoryType implements Task {

    private String year;
    private String division;
    private String brand;
    private String category;
    private String status;

    private SearchCategoryType(String year, String division, String brand, String category,String status) {
        this.year = year;
        this.division = division;
        this.brand = brand;
        this.category = category;
        this.status = status;
    }

    static public SearchCategoryType searchCategory(String year, String division, String brand, String category, String status) {
        return new SearchCategoryType(year, division, brand, category, status);
    }

    @Step("{0} search using feature year and division and brand and category and status")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("modelYearCode"));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsSpecificYearDropdownValue(year));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("division"));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsDivisionValue(division));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("modelUID"));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsBrandValue(brand));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("categoryCode"));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsCategoryValue(category));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("status"));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsStatusValue(status));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsButton("Search")
        );
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(RPOsTabPage.RPOs_RPOs_LIST.of(category), isVisible()).forNoMoreThan(5).seconds());
    }
}
