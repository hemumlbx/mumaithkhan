package gm.dataviewer.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectFeatureToArchive implements Task {
    private String category;
    private String value;
    private SelectFeatureToArchive( String category, String value) {
        this.category = category;
        this.value= value;

    }
    static public SelectFeatureToArchive featureToArchive(String category, String value) {
        return new SelectFeatureToArchive(category,value); }

    @Step("{0} select Feature")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureFeatureListValue(category));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.theFeatureSubFeatureCheckBox(value));
        theActorInTheSpotlight().attemptsTo(ClickOnFeaturesTabElement.editSelectedArchiveFolder(value));
    }
}
