package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectFeatureType implements Task {

    private String featureType;

    private SelectFeatureType(String featureType) {
        this.featureType = featureType;
    }

    static public SelectFeatureType named(String featureType) {
        return new SelectFeatureType(featureType);
    }

    @Step("{0} select feature type #featureType")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(featureType), isVisible()).forNoMoreThan(05).seconds(),
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(featureType))
        );
    }
}
