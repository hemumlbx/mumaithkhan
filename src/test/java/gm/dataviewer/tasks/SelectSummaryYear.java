package gm.dataviewer.tasks;

import gm.dataviewer.pages.ProgramSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectSummaryYear implements Task {

    private final String value;
    private final String language;

    public SelectSummaryYear(String value, String language) {
        this.value = value;
        this.language = language;
    }

    public static SelectSummaryYear called(String value, String language) {
        return instrumented(SelectSummaryYear.class, value, language);
    }

    public <T extends Actor> void performAs(T actor) {
        String[] modelYears = value.split(", ");
        for (String chosenYear : modelYears) {
            if (language.equalsIgnoreCase("English")) {
                theActorInTheSpotlight().attemptsTo(
                        Click.on(ProgramSummaryPage.YEAR_CHECKBOX.of("All")),
                        Click.on(ProgramSummaryPage.YEAR_CHECKBOX.of("All")),
                        Click.on(ProgramSummaryPage.YEAR_CHECKBOX.of(chosenYear))
                );
            } else {
                theActorInTheSpotlight().attemptsTo(
                        Click.on(ProgramSummaryPage.YEAR_CHECKBOX.of("Tous")),
                        Click.on(ProgramSummaryPage.YEAR_CHECKBOX.of("Tous")),
                        Click.on(ProgramSummaryPage.YEAR_CHECKBOX.of(chosenYear))
                );
            }
        }
    }
}