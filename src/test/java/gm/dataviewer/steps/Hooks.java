package gm.dataviewer.steps;

import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.pages.DeltaTabPage;
import gm.dataviewer.tasks.ClickOn;
import io.cucumber.java.After;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Hooks {

    @After("@publishPrepNeededCA")
    public void deltaLoadPrepCA() {
        //Go to Search Tab
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(DeltaTabPage.BRANDS_RECORDS, isVisible()).forNoMoreThan(100).seconds(),
                ClickOn.navigationButton("Search"),
                WaitUntil.the(DVPublishPage.NAVIGATION_TAB_PAGE_HEADERS.of("Search"), isVisible()).forNoMoreThan(05).seconds());

        //Go to By Features
        theActorInTheSpotlight().attemptsTo(
                ClickOn.searchButtonTabs("By Features"),
                WaitUntil.the(DVPublishPage.FEATURE_SEARCH_BUTTON, isVisible()).forNoMoreThan(05).seconds());

        //Enter Feature and Feature Type
        theActorInTheSpotlight().attemptsTo(
                ClickOn.searchButtonTabs("By Features"),
                WaitUntil.the(DVPublishPage.FEATURE_SEARCH_BUTTON, isVisible()).forNoMoreThan(05).seconds());
    }
}
