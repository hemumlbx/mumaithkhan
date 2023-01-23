package gm.dataviewer.tasks;

import gm.dataviewer.pages.NameplateTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnNameplateTabElement implements Task {

    private Target target;

    public ClickOnNameplateTabElement(Target target) {
        this.target = target;
    }

    public static ClickOnNameplateTabElement theTabCalled(String tabName) {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.PAGE_TAB.of(tabName));
    }
    public static ClickOnNameplateTabElement divisionDropdown() {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.DIVISION_DROPDOWN_BUTTON);
    }
    public static ClickOnNameplateTabElement languageDropdown() {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.LANGUAGE_DROPDOWN_BUTTON);
    }
    public static ClickOnNameplateTabElement nameplateSearchButton(String button) {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.BUTTON.of(button));
    }
    public static ClickOnNameplateTabElement theBrandValue(String brand) {
            return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.BRAND_DROPDOWN_VALUES.of(brand));
    }
    public static ClickOnNameplateTabElement addNewNameplateButton(String button) {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.BUTTON.of(button));
    }
    public static ClickOnNameplateTabElement divisionDropdownButton() {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.DIVISION_DROPDOWN);
    }
    public static ClickOnNameplateTabElement languageDropdownButton() {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.LANGUAGE_DROPDOWN);
    }
    public static ClickOnNameplateTabElement yearDropdownButton() {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.YEAR_DROPDOWN);
    }
    public static ClickOnNameplateTabElement addButton() {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.ADD_BUTTON.of("Add"));
    }
    public static ClickOnNameplateTabElement EquinoxBrand() {
        return instrumented(ClickOnNameplateTabElement.class, NameplateTabPage.EQUINOX_BRAND.of("Equinox"));
    }

    @Override
    @Step("{0} clicks on element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target)
        );
    }
}
