package gm.dataviewer.tasks;

import gm.dataviewer.pages.BrandsTabPage;
import gm.dataviewer.pages.FeaturesTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchFeatureType implements Task {

    private String year;
    private String division;
    private String brand;
    private String category;
    private String status;

    private SearchFeatureType(String year, String division, String brand, String category,String status) {
        this.year = year;
        this.division = division;
        this.brand = brand;
        this.category = category;
        this.status = status;
    }

    static public SearchFeatureType searchFeature(String year, String division, String brand, String category, String status) {
        return new SearchFeatureType(year, division, brand, category, status);
    }

    @Step("{0} search using feature year and division and brand and category and status")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("modelYearCode"));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureYearDropdownValue(year));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("division"));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureDivisionDropdownValue(division));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("modelUID"));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureBrandDropdownValue(brand));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("feature"));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureCategoryDropdownValue(category));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresDropdownButton("status"));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureStatusDropdownValue(status));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresButton("Search")
        );
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(FeaturesTabPage.FEATURE_LIST.of(category), isVisible()).forNoMoreThan(5).seconds());
    }
}
