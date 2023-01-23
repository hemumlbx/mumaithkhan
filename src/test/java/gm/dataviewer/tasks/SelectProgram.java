package gm.dataviewer.tasks;

import gm.dataviewer.interactions.StaleClick;
import gm.dataviewer.pages.IncentivesTab;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SelectProgram implements Task {

    private String TOD;
    private String BOD;
    private String term = "";

    public SelectProgram(String TOD, String BOD) {
        this.TOD = TOD;
        this.BOD = BOD;
    }

    public SelectProgram(String TOD) {
        this.TOD = TOD;
        this.BOD = "";
    }

    public static SelectProgram click(String TOD, String BOD) {
        return instrumented(SelectProgram.class, TOD, BOD);
    }

    public static SelectProgram click(String TOD) {
        return instrumented(SelectProgram.class, TOD);
    }

    public SelectProgram forTerm(String term) {
        this.term = term;
        return this;
    }

    @Step("{0} clicks on TOD Program #TOD")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                SwitchTab.titled("Select Incentives")
        );
        theActorInTheSpotlight().attemptsTo(
                ClickOnIframeButton.called("Select Incentives")
        );
        if ("".equals(BOD)) {
            actor.attemptsTo(
                    SelectNumberOfResults.resizeTo75(),
                    term.isEmpty() ?
                            Click.on(IncentivesTab.TOD_CHECKBOX.of(TOD)) :
                            StaleClick.onElement(IncentivesTab.TOD_CHECKBOX_TERM.of(TOD, term))
            );
        } else {
            actor.attemptsTo(
                    Click.on(IncentivesTab.BOD_CHECKBOX_TD.of(TOD, BOD))
            );
        }
        theActorInTheSpotlight().attemptsTo(
                ClickOnOverlayButton.called("Action Save & Close"),
                ClickOnOverlayButton.called("OK"),
                WaitUntilClickable.forIncentiveProgram()
        );
    }
}