package gm.dataviewer.tasks;

import domain.Attribute;
import domain.AttributeInclusion;
import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.questions.TextQuestions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class SelectVehicleAndAttributes implements Task {

    private final String year;
    private final String division;
    private final String nameplate;
    private final String brand;
    private final String attributeCategory;
    private final String attributeValue;
    private final String attributeType;

    private SelectVehicleAndAttributes(String year, String division, String nameplate, String brand, String attributeCategory, String attributeValue, String attributeType) {
        this.year = year;
        this.division = division;
        this.nameplate = nameplate;
        this.brand = brand;
        this.attributeCategory = attributeCategory;
        this.attributeValue = attributeValue;
        this.attributeType = attributeType;
    }

    static public SelectVehicleAndAttributes searchVehicle(String year, String division, String nameplate, String brand, String attributeCategory, String attributeValue, String attributeType) {
        return new SelectVehicleAndAttributes(year, division, nameplate, brand, attributeCategory, attributeValue, attributeType);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight()
                .should(eventually(seeThat(TextQuestions.getText(DVPublishPage.HEADER_LABEL.of("Vehicles")), is("Eligibility Criteria: Vehicles"))).waitingForNoLongerThan(10).seconds());
        theActorInTheSpotlight()
                .attemptsTo(ClickOn.selectVehiclesButton());
        theActorInTheSpotlight().attemptsTo(
                ClickOn.vehicleActionOverlayButton("Add New"));
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
        theActorInTheSpotlight()
                .attemptsTo(ClickOn.vehicleActionButton("Save"));
    }
}
