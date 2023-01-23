package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectFeatureStatus implements Task {

    private String status;

    private SelectFeatureStatus(String status) {
        this.status = status;
    }

    static public SelectFeatureStatus selectStatus(String status) {
        return new SelectFeatureStatus(status);
    }

    @Step("{0} selects feature vehicle status")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(DVPublishPage.FEATURE_STATUS_DROPDOWN),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(status), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(status)),
                ClickOn.divisionTypeSearchButton(),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE, isVisible()).forNoMoreThan(05).seconds()
        );
    }
}
