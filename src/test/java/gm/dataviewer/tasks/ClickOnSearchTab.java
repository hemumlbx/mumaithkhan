package gm.dataviewer.tasks;

import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.pages.SearchTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnSearchTab implements Task {

    private Target target;

    public ClickOnSearchTab(Target target) {
        this.target = target;
    }

    public static ClickOnSearchTab subtab(String tabName) {
        return instrumented(ClickOnSearchTab.class, SearchTabPage.SUB_TAB_SPECIFIC.of(tabName));
    }
    public static ClickOnSearchTab languageDropdown() {
        return instrumented(ClickOnSearchTab.class, SearchTabPage.LANGUAGE_DROP_DOWN);
    }
    public static ClickOnSearchTab byCodeLanguage() {
        return instrumented(ClickOnSearchTab.class, SearchTabPage.BY_CODE_LANGUAGE_DROPDOWN);
    }
    public static ClickOnSearchTab byFeaturesLanguage() {
        return instrumented(ClickOnSearchTab.class, SearchTabPage.BY_FEATURES_LANGUAGE_DROPDOWN);
    }
    public static ClickOnSearchTab byRPOLanguage() {
        return instrumented(ClickOnSearchTab.class, SearchTabPage.BY_RPO_LANGUAGE_DROPDOWN);
    }
    public static ClickOnSearchTab printButton() {
        return instrumented(ClickOnSearchTab.class, SearchTabPage.PRINT_BUTTON);
    }
    public static ClickOnSearchTab codePrintButton() {
        return instrumented(ClickOnSearchTab.class, SearchTabPage.CODE_PRINT_BUTTON);
    }
    public static ClickOnSearchTab editSelected() {
        return instrumented(ClickOnSearchTab.class, DVPublishPage.EDIT_SELECTED);
    }

    @Override
    @Step("{0} clicks on element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target)
        );
    }
}
