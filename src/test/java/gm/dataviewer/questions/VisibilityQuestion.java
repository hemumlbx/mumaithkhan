package gm.dataviewer.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.openqa.selenium.NoSuchElementException;


public class VisibilityQuestion {

    public static Question<Boolean> forElement(Target element) {
        return actor -> {
            try {
                WebElementFacade elementFacade = element.resolveFor(actor);
                return elementFacade.isClickable();
            } catch (ElementShouldBeEnabledException | NoSuchElementException e) {
                return false;
            }
        };
    }
}
