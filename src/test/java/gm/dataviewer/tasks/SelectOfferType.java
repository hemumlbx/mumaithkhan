package gm.dataviewer.tasks;

import gm.dataviewer.interactions.StaleClick;
import gm.dataviewer.pages.AuthoringPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SelectOfferType implements Task {

    private final String offerType;

    public SelectOfferType(String offerType) {
        this.offerType = offerType;
    }

    public static SelectOfferType titled(String offerType) {
        return instrumented(SelectOfferType.class, offerType);
    }

    @Step("{0} selects offer type #offerType")
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                WaitUntil.the(AuthoringPage.FOLDER.of(offerType), isClickable()),
                StaleClick.onElement(AuthoringPage.FOLDER.of(offerType)),
                WaitUntil.the(AuthoringPage.FOLDER.of(offerType), isClickable()),
                StaleClick.onElement(AuthoringPage.FOLDER.of(offerType))
        );
    }
}
