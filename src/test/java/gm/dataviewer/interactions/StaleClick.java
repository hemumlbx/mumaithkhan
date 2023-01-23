package gm.dataviewer.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StaleClick implements Interaction {

    private Target element;

    public StaleClick(Target element) {
        this.element = element;
    }

    public static StaleClick onElement(Target element) {
        return instrumented(StaleClick.class, element);
    }

    @Step("{0} clicks on element")
    public <T extends Actor> void performAs(T actor) {
        int attempts = 0;
        while (attempts++ < 10) {
            try {
                WebElementFacade webElementFacade = element.resolveFor(actor);
                webElementFacade.click();
                break;
            } catch (StaleElementReferenceException | ElementNotInteractableException | ElementShouldBeEnabledException e) {
            } catch (NoSuchElementException e) {
                break;
            }
        }
    }
}
