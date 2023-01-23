package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectAuthoringLanguage implements Task {

    private String language;

    private SelectAuthoringLanguage(String language) {
        this.language = language;
    }

    static public SelectAuthoringLanguage named(String language) {
        return new SelectAuthoringLanguage(language);
    }

    @Step("{0} selects language #language")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitforElement.certainTime(),
                WaitUntil.the(DVPublishPage.AUTHORING_LANGUAGE_DROPDOWN, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DVPublishPage.AUTHORING_LANGUAGE_DROPDOWN)
        );
        actor.attemptsTo(
                WaitforElement.certainTime(),
                WaitUntil.the(DVPublishPage.LANGUAGE.of(this.language), isClickable()).forNoMoreThan(5).seconds(),
                Click.on(DVPublishPage.LANGUAGE.of(this.language)),
                WaitforElement.certainTime()
        );
    }
}
