package gm.dataviewer.tasks;

import gm.dataviewer.pages.RPOsTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnRPOsTabElement implements Task {

    private Target target;

    public ClickOnRPOsTabElement(Target target) {
        this.target = target;
    }

    public static gm.dataviewer.tasks.ClickOnRPOsTabElement theTabCalled(String RPOsTab) {
        return instrumented(gm.dataviewer.tasks.ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_PAGE_TAB.of(RPOsTab));
    }

    public static gm.dataviewer.tasks.ClickOnRPOsTabElement theRPOsCategoriesTab() {
        return instrumented(gm.dataviewer.tasks.ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_LAYOUT_TABS_TEXT.of("Categories"));
    }

    public static ClickOnRPOsTabElement RPOsDropdownButton(String button) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_DROPDOWN_BUTTON.of(button));
    }

    public static ClickOnRPOsTabElement theRPOsSpecificYearDropdownValue(String year) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_SPECIFIC_DROPDOWN_VALUES.of(year));
    }

    public static ClickOnRPOsTabElement theRPOsDivisionValue(String division) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_SPECIFIC_DROPDOWN_VALUES.of(division));
    }

    public static ClickOnRPOsTabElement theRPOsBrandValue(String brand) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_SPECIFIC_DROPDOWN_VALUES.of(brand));
    }

    public static ClickOnRPOsTabElement theRPOsCategoryValue(String category) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_SPECIFIC_DROPDOWN_VALUES.of(category));
    }

    public static ClickOnRPOsTabElement theRPOsStatusValue(String status) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_SPECIFIC_DROPDOWN_VALUES.of(status));
    }

    public static ClickOnRPOsTabElement RPOsButton(String RPOsButton) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_BUTTON.of(RPOsButton));
    }

    public static ClickOnRPOsTabElement RPOsAddCategoryButton(String Button) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.ADD_CATEGORY_BUTTON.of(Button));
    }

    public static ClickOnRPOsTabElement RPOsEditCategoryButton(String Button) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.EDIT_CATEGORY_BUTTON.of(Button));
    }

    public static ClickOnRPOsTabElement theRPOsFeatureListValue(String category) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_RPOs_LIST.of(category));
    }

    public static ClickOnRPOsTabElement theRPOsSubFeatureCheckBox(String value) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPOs_SUB_LIST_CHECKER.of(value));
    }

    public static ClickOnRPOsTabElement theEditRPODropdownButton() {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.EDIT_RPO_DROPDOWN_BUTTON);
    }

    public static ClickOnRPOsTabElement theAddRPODropdownButton(String button) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.ADD_RPO_DROPDOWN_BUTTON.of(button));
    }

    public static ClickOnRPOsTabElement theRPOArchiveFolder() {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPO_ARCHIVE_FOLDER);
    }

    public static ClickOnRPOsTabElement theRPOEditIcon() {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.RPO_EDIT_ICON);
    }

    public static ClickOnRPOsTabElement theCategoryTabList(String category) {
        return instrumented(ClickOnRPOsTabElement.class, RPOsTabPage.CATEGORY_TAB_LIST.of(category));
    }

    @Override
    @Step("{0} clicks on element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target)
        );
    }
}