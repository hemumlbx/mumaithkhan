package gm.dataviewer.tasks;

import gm.dataviewer.pages.AuthoringPage;
import gm.dataviewer.pages.CommonElements;
import gm.dataviewer.questions.VisibilityQuestion;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;

import static gm.dataviewer.pages.VehiclesTab.SELECT_VEHICLE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class OpenVehicleOverlay implements Task {

    public static OpenVehicleOverlay open() {
        return instrumented(OpenVehicleOverlay.class);
    }

    @Step("{0} opens Vehicle Overlay")
    public <T extends Actor> void performAs(T actor) {
        int attempts = 0;
        while (attempts++ < 10) {
            try {
                WebElementFacade webElementFacade = SELECT_VEHICLE_BUTTON.resolveFor(actor);
                webElementFacade.click();
                if (!VisibilityQuestion.forElement(CommonElements.OVERLAY).answeredBy(actor)) {
                    String offerName = AuthoringPage.OFFER_TAB_TEXT.resolveFor(actor).getText();
                    getDriver().navigate().refresh();
                    actor.attemptsTo(
                            SelectOfferByName.select(offerName),
                            ClickOnActionButton.called("Edit"),
                            SwitchTab.titled("Define Vehicles")
                    );
                    continue;
                }
                break;
            } catch (StaleElementReferenceException | ElementNotInteractableException e) {
            }
        }
    }
}
