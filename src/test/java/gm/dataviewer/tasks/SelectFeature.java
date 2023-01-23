package gm.dataviewer.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectFeature implements Task {
    private String category;
    private String value;
    private SelectFeature( String category, String value) {
        this.category = category;
        this.value= value;

    }

    static public SelectFeature featureToEdit(String category, String value) {
        return new SelectFeature(category, value);

    }

    @Step("{0} select Feature")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureFeatureListValue(category));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureSubFeatureCheckBox(value));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresButton("Edit Selected"));
    }
}
