package infranova.main.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitAndClick implements Task {
    Target target;
    public static WaitAndClick on(Target target){
       return instrumented(WaitAndClick.class, target);
    }

    public WaitAndClick(Target target){
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int attempts = 0;
        try {
            WebElementFacade webElementFacade = target.resolveFor(actor);
            while (attempts++ < 10 && webElementFacade.isClickable()) {
                webElementFacade.click();
                Timeout.ofSeconds(1).sleep();
            }
        } catch (StaleElementReferenceException | ElementNotInteractableException | ElementShouldBeEnabledException | NoSuchElementException e) {
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
