package gm.dataviewer.tasks;

import domain.*;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.pages.DeltaTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static gm.dataviewer.pages.DVPublishPage.*;
import static gm.dataviewer.questions.PublishQuestions.categoryText;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.hasItem;

public class AddAttribute implements Task {

    private Target attribute;
    private String key;
    private String value;
    private AttributeInclusion inclusion;

    public AddAttribute(Attribute attribute,
                        String key,
                        String value,
                        AttributeInclusion inclusion) {
        switch (attribute) {
            case Feature:
                this.attribute = RADIO_BUTTON.of("Vehicle Feature Codes");
                break;
            case RPO:
                this.attribute = RADIO_BUTTON.of("Option (RPO) Codes");
                break;
            default:
                throw new IllegalArgumentException("No attrribute Target for getAttributeOfTarget " + attribute);
        }
        this.key = key;
        this.value = value;
        this.inclusion = inclusion;
    }

    public static AddAttribute withValue(Attribute attribute,
                                         String feature,
                                         String value,
                                         AttributeInclusion inclusion) {
        return instrumented(AddAttribute.class, attribute, feature, value, inclusion);
    }

    @Step("{0} #inclusion #value #key")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitforElement.certainTime(),
                Click.on(attribute)
        );
        WaitforElement.certainTime();
        actor.attemptsTo(
                Click.on(DVPublishPage.ATTRIBUTE_DROPDOWN)
        );
        WaitforElement.certainTime();
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(DVPublishPage.DROPDOWN_ITEM.of(key), isVisible()).forNoMoreThan(50).seconds());
        actor.attemptsTo(
                Click.on(DVPublishPage.DROPDOWN_ITEM.of(key))
        );
        switch (inclusion) {
            case includes:
                actor.attemptsTo(
                        Click.on(DVPublishPage.RADIO_BUTTON.of("Include"))
                );
                break;
            case excludes:
                actor.attemptsTo(
                        Click.on(DVPublishPage.RADIO_BUTTON.of("Exclude"))
                );
                break;
            default:
                throw new IllegalArgumentException("Invalid case for Attribute Inclusion");
        }
        actor.attemptsTo(
                WaitUntil.the(DVPublishPage.CHECKBOX.of(value), isVisible()).forNoMoreThan(50).seconds(),
                Click.on(DVPublishPage.CHECKBOX.of(value)));
    }
}
