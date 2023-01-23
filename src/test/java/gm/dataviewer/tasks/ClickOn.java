package gm.dataviewer.tasks;

import gm.dataviewer.pages.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOn implements Task {

    private Target target;

    public ClickOn(Target target) {
        this.target = target;
    }

    public static ClickOn deltaTab(String tabName) {
        return instrumented(ClickOn.class, DeltaTabPage.DELTA_TABS.of(tabName));
    }

    public static ClickOn rpoCategoryEdit(String category) {
        return instrumented(ClickOn.class, DVPublishPage.EDIT_RPO_CATEGORY.of(category));
    }

    public static ClickOn programLink(String program) {
        return instrumented(ClickOn.class, DVPublishPage.PROGRAM_HYPERLINK.of(program));
    }

    public static ClickOn offerLink(String offerName) {
        return instrumented(ClickOn.class, DVPublishPage.OFFER_HYPERLINK.of(offerName));
    }

    public static ClickOn addNewCategory() {
        return instrumented(ClickOn.class, DVPublishPage.ADD_RPO_CATEGORY);
    }

    public static ClickOn vehicleExpandButton(String attribute, String vehicle) {
        return instrumented(ClickOn.class, DeltaTabPage.VEHICLE_EXPAND_FEATURE_TAB.of(attribute, vehicle));
    }

    public static ClickOn publishVehicleExpander(String vehicle) {
        return instrumented(ClickOn.class, DVPublishPage.PUBLISH_PAGE_EXPANDER.of(vehicle));
    }

    public static ClickOn publishVehicleChecker(String vehicle) {
        return instrumented(ClickOn.class, DVPublishPage.PUBLISH_PAGE_CHECKER.of(vehicle));
    }

    public static ClickOn publishSelected(String button) {
        return instrumented(ClickOn.class, DVPublishPage.COMMON_BUTTON_TYPE.of(button));
    }

    public static ClickOn nameplatePublishSelected() {
        return instrumented(ClickOn.class, DVPublishPage.NAMEPLATE_PUBLISH_SELECTED);
    }

    public static ClickOn selectCategory(String vehicle, String type, String category) {
        return instrumented(ClickOn.class, DVPublishPage.PUBLISH_SELECT_CATEGORY_TYPE.of(vehicle, type, category));
    }

    public static ClickOn navigationButton(String button) {
        return instrumented(ClickOn.class, DVPublishPage.NAVIGATION_TAB.of(button));
    }

    public static ClickOn searchButtonTabs(String tab) {
        return instrumented(ClickOn.class, DVPublishPage.SEARCH_BUTTON_TABS.of(tab));
    }

    public static ClickOn featureTypeSearchButton() {
        return instrumented(ClickOn.class, DVPublishPage.FEATURE_SEARCH_BUTTON);
    }

    public static ClickOn categoryTypeSearchButton() {
        return instrumented(ClickOn.class, DVPublishPage.CATEGORY_SEARCH_BUTTON);
    }

    public static ClickOn divisionTypeSearchButton() {
        return instrumented(ClickOn.class, DVPublishPage.DIVISION_SEARCH_BUTTON);
    }

    public static ClickOn codeTypeSearchButton() {
        return instrumented(ClickOn.class, DVPublishPage.CODE_SEARCH_BUTTON);
    }

    public static ClickOn searchVehicleExpander() {
        return instrumented(ClickOn.class, SearchTabPage.BY_VEHICLE_RESULT_EXPANDER);
    }

    public static ClickOn searchSpecificVehicleExpander(String vehicle) {
        return instrumented(ClickOn.class, SearchTabPage.BY_SPECIFIC_VEHICLE_RESULT_EXPANDER.of(vehicle));
    }

    public static ClickOn featureTypeResultsExpand(String feature) {
        return instrumented(ClickOn.class, DVPublishPage.FEATURE_TYPE_RESULTS_EXPAND.of(feature));
    }

    public static ClickOn rpoTypeResultsExpand(String feature) {
        return instrumented(ClickOn.class, DVPublishPage.FEATURE_TYPE_RESULTS_EXPAND.of(feature));
    }

    public static ClickOn nameplateExpand(String brand) {
        return instrumented(ClickOn.class, DVPublishPage.NAMEPLATE_BRAND_EXPAND.of(brand));
    }

    public static ClickOn nameplateEdit(String brand) {
        return instrumented(ClickOn.class, DVPublishPage.NAMEPLATE_EDIT_ICON.of(brand));
    }

    public static ClickOn addNewNamePlate() {
        return instrumented(ClickOn.class, DVPublishPage.ADD_NEW_NAMEPLATE);
    }

    public static ClickOn addNewBrandName() {
        return instrumented(ClickOn.class, DVPublishPage.ADD_NEW_BRAND);
    }

    public static ClickOn featureVehicleCheckbox(String featureType, String vehicle) {
        return instrumented(ClickOn.class, DVPublishPage.FEATURE_VEHICLE_CHECKBOX.of(featureType, vehicle));
    }

    public static ClickOn featureTypeValue(String featureType, String featureValue) {
        return instrumented(ClickOn.class, DVPublishPage.FEATURE_TYPE_VALUE.of(featureType, featureValue));
    }

    public static ClickOn featureVehicleEdit(String featureType, String vehicle) {
        return instrumented(ClickOn.class, DVPublishPage.FEATURE_VEHICLE_EDIT_ICON.of(featureType, vehicle));
    }

    public static ClickOn featureTypeEdit(String featureType, String vehicle) {
        return instrumented(ClickOn.class, DVPublishPage.FEATURE_TYPE_EDIT_ICON.of(featureType, vehicle));
    }

    public static ClickOn rpoEditSelected(String button) {
        return instrumented(ClickOn.class, DVPublishPage.OVERLAY_BUTTON.of(button));
    }

    public static ClickOn featureTypeArchive(String featureType, String vehicle) {
        return instrumented(ClickOn.class, DVPublishPage.FEATURE_TYPE_ARCHIVE_ICON.of(featureType, vehicle));
    }

    public static ClickOn featureVehicleOverlayAction(String action) {
        return instrumented(ClickOn.class, DVPublishPage.FEATURE_VEHICLE_WARNING_OVERLAY_BUTTONS.of(action));
    }

    public static ClickOn overlayButton(String action) {
        return instrumented(ClickOn.class, DVPublishPage.OVERLAY_BUTTON.of(action));
    }

    public static ClickOn selectVehiclesButton() {
        return instrumented(ClickOn.class, DVPublishPage.SELECT_VEHICLE);
    }

    public static ClickOn vehicleActionOverlayButton(String action) {
        return instrumented(ClickOn.class, DVPublishPage.VEHICLE_ACTION_BUTTON_OVERLAY.of(action));
    }

    public static ClickOn vehicleActionButton(String action) {
        return instrumented(ClickOn.class, DVPublishPage.ACTION_BUTTON_OVERLAY.of(action));
    }

    public static ClickOn selectIncentiveValues() {
        return instrumented(ClickOn.class, DVPublishPage.TOP_INPUT_INCENTIVE);
    }

    public static ClickOn selectModelVehicle(String model) {
        return instrumented(ClickOn.class, DVPublishPage.MODEL_CHECKBOX.of(model));
    }

    public static ClickOn saveAndCloseButton() {
        return instrumented(ClickOn.class, DVPublishPage.SAVE_AND_CLOSE_BUTTON);
    }

    public static ClickOn warningOkButton() {
        return instrumented(ClickOn.class, DVPublishPage.WARNING_OK_BUTTON);
    }

    public static ClickOn programActive(String status) {
        return instrumented(ClickOn.class, DVPublishPage.FOLDER_ACTION.of(status));
    }

    public static ClickOn warningOkPostButton() {
        return instrumented(ClickOn.class, DVPublishPage.WARNING_POST_BUTTON);
    }

    public static ClickOn activeTab() {
        return instrumented(ClickOn.class, DVPublishPage.ACTIVE_TAB);
    }

    public static ClickOn detailedSearch() {
        return instrumented(ClickOn.class, ProgramSearchPage.DETAILED_SEARCH);
    }

    public static ClickOn vehicleReset() {
        return instrumented(ClickOn.class, ProgramSearchPage.RESET);
    }

    public static ClickOn modelYear(String model) {
        return instrumented(ClickOn.class, ProgramSearchPage.MODEL_YEAR.of(model));
    }

    public static ClickOn selectAll(String brand) {
        return instrumented(ClickOn.class, ProgramSearchPage.VEHICLE_OPTION.of(brand));
    }

    public static ClickOn vehicleSubmit() {
        return instrumented(ClickOn.class, ProgramSearchPage.SUBMIT);
    }

    public static ClickOn vehicleHeaderExpand(String header) {
        return instrumented(ClickOn.class, ProgramSummaryPage.VEHICLE_HEADER_EXPAND.of(header));
    }

    @Override
    @Step("{0} clicks on element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target)
        );
    }
}
