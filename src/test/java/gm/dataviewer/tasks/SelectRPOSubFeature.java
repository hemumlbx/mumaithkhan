package gm.dataviewer.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectRPOSubFeature implements Task {
    private String category;
    private String value;
    private SelectRPOSubFeature( String category, String value) {
        this.category = category;
        this.value= value;

    }

    static public SelectRPOSubFeature RPOSubFeatureToEdit(String category, String value) {
        return new SelectRPOSubFeature(category, value);

    }

    @Step("{0} select Feature")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsFeatureListValue(category));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsSubFeatureCheckBox(value));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsButton("Edit Selected"));
    }
}
