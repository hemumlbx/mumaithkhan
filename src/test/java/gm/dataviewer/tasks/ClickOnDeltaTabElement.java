package gm.dataviewer.tasks;

import gm.dataviewer.pages.DeltaTabLayoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnDeltaTabElement implements Task {

    private Target target;

    public ClickOnDeltaTabElement(Target target) {
        this.target = target;
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theTabCalled(String DeltaTab) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_PAGE_TAB.of(DeltaTab));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theDeltaTabs(String tab) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_TABS.of(tab));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theDeltaTabsExpanderIcon(String icon) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_TAB_EXPANDER_ICON.of(icon));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theDeltaSpecificVehicleExpanderIcon(String brand, String division, String status) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_SPECIFIC_VEHICLE_VALUES.of(brand, division, status));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theDeltaSubVehicleListExpanderIcon(String subList) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_VEHICLE_SUB_LIST_VALUES.of(subList));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theDeltaSpecificVehicleEditIcon(String status, String division, String brand) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_BRANDS_SPECIFIC_EDIT_ICON.of(status, division, brand));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theEditVehicleDropdown() {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_EDIT_VEHICLE_LANGUAGE_DROPDOWN);
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theDeltaActionsIconButton(String status, String division, String brand) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_BRANDS_SPECIFIC_ACTIONS_IGNORE_ICON.of(status, division, brand));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theFeaturesTabSpecificVehicle(String brand) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.FEATURES_TAB_SPECIFIC_VEHICLE_VALUE.of(brand));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theDeltaButton(String button) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_BRANDS_BUTTONS.of(button));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theRPOsButton(String button) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.DELTA_RPOs_BUTTONS.of(button));
    }

    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theFeaturesIgnoreActionButton(String brand) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.FEATURES_ACTIONS_ICON.of(brand));
    }
    public static gm.dataviewer.tasks.ClickOnDeltaTabElement theRPOsIgnoreActionButton(String vehicle) {
        return instrumented(gm.dataviewer.tasks.ClickOnDeltaTabElement.class, DeltaTabLayoutPage.RPOs_ACTIONS_ICON.of(vehicle));
    }

    @Override
    @Step("{0} clicks on element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target)
        );
    }
}