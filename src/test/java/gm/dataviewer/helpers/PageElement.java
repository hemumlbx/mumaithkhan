package gm.dataviewer.helpers;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class PageElement {

    public static Long countVisible (List<WebElementFacade> webElementFacades) {
        return webElementFacades.stream().filter(WebElementFacade::isDisplayed).count();
    }


    public static Boolean allVisible (List<Target> pageElements, Actor actor) {
        return pageElements.stream().allMatch(target -> target.resolveFor(actor).isVisible());
    }
}
