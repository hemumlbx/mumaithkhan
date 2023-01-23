package gm.dataviewer.tasks;

import gm.dataviewer.pages.AuthoringPage;
import gm.dataviewer.pages.CommonElements;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchTab implements Task {

    private final String tabTitle;

    public SwitchTab(final String tabTitle) {
        this.tabTitle = tabTitle;
    }

    public static SwitchTab titled(final String tabTitle) {
        return instrumented(SwitchTab.class, tabTitle);
    }

    @Step("{0} switches to tab #tabTitle")
    public <T extends Actor> void performAs(T actor) {
        int attempts = 0;
        while (attempts++ < 20) {
            try {
                WebElementFacade webElementFacade = AuthoringPage.TAB.of(tabTitle).resolveFor(actor);
                webElementFacade.click();
                try {
                    WebElementFacade tabConfirm = CommonElements.TAB_BUTTON.of("Continue").resolveFor(actor);
                    tabConfirm.click();
                } catch (NoSuchElementException | ElementShouldBeEnabledException | ElementNotInteractableException e) {
                }

                WebElementFacade webElementFacade1 = AuthoringPage.ACTIVE_TAB.resolveFor(actor);
                while (!webElementFacade1.getText().equals(tabTitle)) webElementFacade.click();
                if (tabTitle.equals("Define Offer")) {
                    WebElementFacade webElementFacade2 = AuthoringPage.GENERAL_LABEL.resolveFor(actor);
                    webElementFacade2.waitUntilClickable();
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            } catch (NoSuchElementException | StaleElementReferenceException | ElementShouldBeEnabledException | ElementNotInteractableException | JavascriptException | JavaScriptException e) {
                String asd = e.getMessage();
            }
        }
    }
}
