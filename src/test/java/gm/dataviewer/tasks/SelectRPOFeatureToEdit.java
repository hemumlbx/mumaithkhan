package gm.dataviewer.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectRPOFeatureToEdit implements Task {
    private String category;
    private String value;

    private SelectRPOFeatureToEdit(String category, String value) {
        this.category = category;
        this.value = value;

    }

    static public SelectRPOFeatureToEdit RPOFeatureToEdit(String category, String value) {
        return new SelectRPOFeatureToEdit(category, value);

    }

    @Step("{0} select Feature")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsFeatureListValue(category));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsSubFeatureCheckBox(value));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOEditIcon());
    }
}
