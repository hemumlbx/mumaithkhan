package gm.dataviewer.tasks;

import gm.dataviewer.interactions.WaitAndClick;
import gm.dataviewer.pages.CommonElements;
import gm.dataviewer.questions.AuthoringQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectOffer implements Task {

    private String name;

    public SelectOffer(String name) {
        this.name = name;
    }

    public static SelectOffer withName(String name) {
        return instrumented(SelectOffer.class, name);
    }

    @Step("{0} selects offer with name #name")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(AuthoringQuestion.offerExistsForName(name))
                        .andIfSo(
                                SelectOfferByName.select(name),
                                WaitAndClick.on(CommonElements.ACTION_BUTTON.of("Edit"))
                        ).otherwise(
                                SelectOfferByName.select(name)
                        )
        );
    }
}
