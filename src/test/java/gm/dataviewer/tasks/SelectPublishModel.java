package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectPublishModel implements Task {

    private String year;
    private String division;

    private SelectPublishModel(String year, String division) {
        this.year = year;
        this.division = division;
    }

    static public SelectPublishModel named(String year, String division) {
        return new SelectPublishModel(year, division);
    }

    @Override
    @Step("{0} search using year and division #year #division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                SelectYear.named(year),
                SelectDivisionType.named(division),
                WaitforElement.certainTime(),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
    }
}
