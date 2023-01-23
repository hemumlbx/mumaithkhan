package gm.dataviewer.tasks;

import domain.Attribute;
import domain.AttributeInclusion;
import gm.dataviewer.interactions.WaitAndClick;
import gm.dataviewer.pages.CommonElements;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.questions.VisibilityQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class SelectOfferVehicleAndAttributes implements Task {

    private final String year;
    private final String division;
    private final String nameplate;
    private final String brand;
    private final String attributeCategory;
    private final String attributeValue;
    private final String attributeType;

    private SelectOfferVehicleAndAttributes(String year, String division, String nameplate, String brand, String attributeCategory, String attributeValue, String attributeType) {
        this.year = year;
        this.division = division;
        this.nameplate = nameplate;
        this.brand = brand;
        this.attributeCategory = attributeCategory;
        this.attributeValue = attributeValue;
        this.attributeType = attributeType;
    }

    static public SelectOfferVehicleAndAttributes searchVehicle(String year, String division, String nameplate, String brand, String attributeCategory, String attributeValue, String attributeType) {
        return new SelectOfferVehicleAndAttributes(year, division, nameplate, brand, attributeCategory, attributeValue, attributeType);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight()
                .should(eventually(seeThat(TextQuestions.getText(DVPublishPage.HEADER_LABEL.of("Vehicles")), is("New/Edit Vehicles"))).waitingForNoLongerThan(10).seconds());
        theActorInTheSpotlight().attemptsTo(
                WaitforElement.certainTime(),
                SelectVehicleFromIncentiveAuthoring.withValue(year, division, nameplate, brand),
                WaitforElement.certainTime()
        );
        if (!attributeType.equalsIgnoreCase("null")) {
            if (attributeType.equalsIgnoreCase("Vehicle Feature Codes")) {
                theActorInTheSpotlight().attemptsTo(
                        AddAttribute.withValue(Attribute.Feature, attributeCategory, attributeValue, AttributeInclusion.includes)
                );
            } else {
                theActorInTheSpotlight().attemptsTo(
                        AddAttribute.withValue(Attribute.RPO, attributeCategory, attributeValue, AttributeInclusion.includes)
                );
            }
        }
        theActorInTheSpotlight().attemptsTo(
                WaitAndClick.on(CommonElements.ACTION_BUTTON_OVERLAY.of("Save")),
                Check.whether(VisibilityQuestion.forElement(CommonElements.OVERLAY_BUTTON.of("OK"))).andIfSo(
                        JavaScriptClick.on(CommonElements.OVERLAY_BUTTON.of("OK"))
                )
        );
        WaitforElement.certainTime();
    }
}
