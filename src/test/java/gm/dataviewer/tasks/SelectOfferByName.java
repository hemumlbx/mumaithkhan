package gm.dataviewer.tasks;

import gm.dataviewer.pages.AuthoringPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectOfferByName implements Task {

    private String name;
    private String vehicle;
    private boolean search = false;

    public SelectOfferByName(String name) {
        this.name = name;
    }

    public static SelectOfferByName select(String name) {
        return instrumented(SelectOfferByName.class, name);
    }

    public SelectOfferByName withVehicle(String vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public SelectOfferByName forSearch() {
        this.search = true;
        return this;
    }

    @Step("{0} clicks on offer by name #name and vehicle #vehicle")
    public <T extends Actor> void performAs(T actor) {
        if (search) {
            actor.attemptsTo(
                    WaitUntil.the(AuthoringPage.SEARCH_OFFER_ROW_BY_NAME.of(name), isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(AuthoringPage.SEARCH_OFFER_ROW_BY_NAME.of(name))
            );
            return;
        }
        if (vehicle == null) {
            actor.attemptsTo(
                    WaitUntil.the(AuthoringPage.OFFER_ROW_BY_NAME.of(name), isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(AuthoringPage.OFFER_ROW_BY_NAME.of(name))
            );
        } else {
            actor.attemptsTo(
                    WaitUntil.the(AuthoringPage.OFFER_ROW_BY_NAME_WITH_VEHICLE.of(name, vehicle), isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(AuthoringPage.OFFER_ROW_BY_NAME_WITH_VEHICLE.of(name, vehicle))
            );
        }
    }
}
