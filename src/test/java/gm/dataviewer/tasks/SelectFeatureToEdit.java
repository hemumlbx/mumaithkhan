package gm.dataviewer.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectFeatureToEdit implements Task {
    private String category;
    private String value;

    private SelectFeatureToEdit( String category, String value) {
        this.category = category;
        this.value= value;

    }
    static public SelectFeatureToEdit featureToEdit(String category, String value) {
        return new SelectFeatureToEdit(category, value);
    }

    @Step("{0} select Edit Selected Button")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureFeatureListValue(category));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureSubFeatureCheckBox(value));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.featuresButton("Edit Selected"));
    }
}
