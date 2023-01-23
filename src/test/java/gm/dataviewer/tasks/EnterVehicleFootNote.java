package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterVehicleFootNote implements Task {

    private final String footNote;


    public EnterVehicleFootNote(String footNote) {
        this.footNote = footNote;
    }

    public static EnterVehicleFootNote intoNoteField(String footNote) {
        return instrumented(EnterVehicleFootNote.class, footNote);

    }

    @Step("{0} enters footnote# **#note**")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(footNote).into(DVPublishPage.VEHICLE_FOOTNOTE_TEXT)
        );
    }
}
