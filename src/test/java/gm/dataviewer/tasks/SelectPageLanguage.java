package gm.dataviewer.tasks;

import gm.dataviewer.pages.DealerSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectPageLanguage implements Task {

    private String value;

    private SelectPageLanguage(String value) {
        this.value = value;
    }

    static public SelectPageLanguage named(String value) {
        return new SelectPageLanguage(value);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String language = "empty";

        if (value.equals("English")) {
            language = "en";
        } else if (value.equals("Français")) {
            language = "fr";

        }
        actor.attemptsTo(
                WaitforElement.certainTime(),
                WaitUntil.the(DealerSummaryPage.LANGUAGE_DROPDOWN, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DealerSummaryPage.LANGUAGE_DROPDOWN)
        );
        actor.attemptsTo(
                WaitforElement.certainTime(),
                WaitUntil.the(DealerSummaryPage.LANGUAGE_CHOICE.of(language), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DealerSummaryPage.LANGUAGE_CHOICE.of(language)),
                WaitforElement.certainTime()
        );
    }
}
