package gm.dataviewer.tasks;

import gm.dataviewer.pages.FeaturesTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

 public class ClickOnFeaturesTabElement implements Task {

    private Target target;

    public ClickOnFeaturesTabElement(Target target) {
        this.target = target;
    }

    public static gm.dataviewer.tasks.ClickOnFeaturesTabElement theTabCalled(String featuresTab) {
        return instrumented(gm.dataviewer.tasks.ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_PAGE_TAB.of(featuresTab));
    }
     public static ClickOnFeaturesTabElement featuresDropdownButton(String button) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_DROPDOWN_BUTTON.of(button));
     }
     public static ClickOnFeaturesTabElement featuresButton(String featureButton) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_BUTTON.of(featureButton));
     }
     public static ClickOnFeaturesTabElement theFeatureYearDropdownValue(String year) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(year));
     }
     public static ClickOnFeaturesTabElement theFeatureDivisionDropdownValue(String division) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(division));
     }
     public static ClickOnFeaturesTabElement theFeatureBrandDropdownValue(String brand) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(brand));
     }
     public static ClickOnFeaturesTabElement theFeatureCategoryDropdownValue(String category) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(category));
     }
     public static ClickOnFeaturesTabElement theFeatureStatusDropdownValue(String status) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(status));
     }
     public static ClickOnFeaturesTabElement theFeatureFeatureListValue(String category) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_LIST.of(category));
     }
     public static ClickOnFeaturesTabElement theFeatureSpecificYearDropdownValue(String year) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(year));
     }
     public static ClickOnFeaturesTabElement theFeatureDivisionValue(String division) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(division));
     }
     public static ClickOnFeaturesTabElement theFeatureBrandValue(String brand) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(brand));
     }
     public static ClickOnFeaturesTabElement theFeatureCategoryValue(String category) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(category));
     }
     public static ClickOnFeaturesTabElement theFeatureStatusValue(String status) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_SPECIFIC_DROPDOWN_VALUES.of(status));
     }
     public static ClickOnFeaturesTabElement theFeatureSubFeatureCheckBox(String value) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_CATEGORY_CHECKER.of(value));
     }
     public static ClickOnFeaturesTabElement featuresEditSelectedYesButton() {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.EDIT_SELECTED_BUTTON.of("Yes"));
     }
     public static ClickOnFeaturesTabElement editFeaturesLanguageDropdownButton() {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.EDIT_FEATURE_LANGUAGE_DROPDOWN.of("languageCode"));
     }
     public static ClickOnFeaturesTabElement editSelectedArchiveFolder(String value) {
         return instrumented(ClickOnFeaturesTabElement.class, FeaturesTabPage.FEATURE_ARCHIVE_FOLDER.of(value));
     }
     @Override
     @Step("{0} clicks on element")
     public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 Click.on(target)
         );
     }
}
