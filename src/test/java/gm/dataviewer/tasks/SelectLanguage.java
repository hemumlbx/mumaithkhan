package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectLanguage implements Task {

    private String language;

    private SelectLanguage(String language) {
        this.language = language;
    }

    static public SelectLanguage named(String language) {
        return new SelectLanguage(language);
    }

    @Step("{0} selects language #language")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DVPublishPage.LANGUAGE_DROPDOWN),
                WaitUntil.the(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(this.language), isClickable()).forNoMoreThan(5).seconds()
        );
        actor.attemptsTo(
                Click.on(DVPublishPage.FEATURE_TYPE_DROPDOWN_VALUE.of(this.language))
        );
    }
}
