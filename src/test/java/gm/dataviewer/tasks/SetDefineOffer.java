package gm.dataviewer.tasks;

import gm.dataviewer.pages.AuthoringPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.time.LocalDate;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SetDefineOffer implements Task {

    private String msrp;

    private SetDefineOffer(String msrp) {
        this.msrp = msrp;
    }

    static public SetDefineOffer defineOffer(String msrp) {
        return new SetDefineOffer(msrp);
    }

    @Step("{0} define msrp and effective date")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                SwitchTab.titled("Define Offer")
        );
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(msrp).into(AuthoringPage.MSRP_VALUE)
        );
        theActorInTheSpotlight().attemptsTo(
                Enter.theValue(LocalDate.now().toString()).into(AuthoringPage.PRICE_DATE_VALUE)
        );
        theActorInTheSpotlight().attemptsTo(
                SaveOffer.save()
        );
    }
}
