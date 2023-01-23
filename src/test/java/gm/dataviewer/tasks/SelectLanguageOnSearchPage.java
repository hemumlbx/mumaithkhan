package gm.dataviewer.tasks;

import gm.dataviewer.pages.ProgramSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectLanguageOnSearchPage implements Task {

    private final String value;

    public SelectLanguageOnSearchPage(String value) {
        this.value = value;
    }

    public static SelectLanguageOnSearchPage ofChoice(String value) {
        return instrumented(SelectLanguageOnSearchPage.class, value);
    }

    public <T extends Actor> void performAs(T actor) {

        String language = "empty";
        if (value.equals("English")) {
            language = "English";
        } else if (value.equals("French")) {
            language = "Français";
        }

        theActorInTheSpotlight().attemptsTo(
                Click.on(ProgramSummaryPage.LANGUAGE_TOGGLE),
                Click.on(ProgramSummaryPage.LANGUAGE_OPTION.of(language))
        );
    }
}