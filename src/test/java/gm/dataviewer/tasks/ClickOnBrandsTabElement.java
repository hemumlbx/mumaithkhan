package gm.dataviewer.tasks;

import gm.dataviewer.pages.BrandsTabPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnBrandsTabElement implements Task {

    private Target target;

    public ClickOnBrandsTabElement(Target target) {
        this.target = target;
    }

    public static ClickOnBrandsTabElement theTabCalled(String brandsTab) {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.BRAND_PAGE_TAB.of(brandsTab));
    }
    public static ClickOnBrandsTabElement yearDropdownButton() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.DROPDOWN_BUTTON.of("modelYearCode"));
    }
    public static ClickOnBrandsTabElement yearDropdownValues() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.BRAND_LAYOUT_DROPDOWN_VALUES);
    }
    public static ClickOnBrandsTabElement divisionDropdownButton() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.DROPDOWN_BUTTON.of("divisionCode"));
    }
    public static ClickOnBrandsTabElement languageDropdownButton() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.DROPDOWN_BUTTON.of("languageCode"));
    }
    public static ClickOnBrandsTabElement theYearDropdownValue(String year) {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.DROPDOWN_VALUES.of(year));
    }
    public static ClickOnBrandsTabElement theDivisionDropdownValue(String division) {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.DROPDOWN_VALUES.of(division));
    }
    public static ClickOnBrandsTabElement theBrandsSearchButton(String search) {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.BUTTON.of(search));
    }
    public static ClickOnBrandsTabElement addNewBrandNameButton(String button) {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.BUTTON.of(button));
    }
    public static ClickOnBrandsTabElement CanyonBrand() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.CANYON_BRAND.of("Canyon"));
    }
    public static ClickOnBrandsTabElement addBrandLanguageDropdownButton() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.ADD_BRAND_DROPDOWN.of("languageCode"));
    }
    public static ClickOnBrandsTabElement addBrandYearDropdownButton() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.ADD_BRAND_DROPDOWN.of("modelYearCode"));
    }
    public static ClickOnBrandsTabElement addBrandSpecificYearValue() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.ADD_BRAND_SPECIFIC_VALUE.of("2021"));
    }
    public static ClickOnBrandsTabElement addBrandDivisionDropdownButton() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.ADD_BRAND_DROPDOWN.of("divisionCode"));
    }
    public static ClickOnBrandsTabElement addBrandChromeDropdownButton() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.ADD_BRAND_DROPDOWN.of("modelUID"));
    }
    public static ClickOnBrandsTabElement addBrandSpecificDivisionValue() {
        return instrumented(ClickOnBrandsTabElement.class, BrandsTabPage.ADD_BRAND_SPECIFIC_VALUE.of("Buick"));
    }
    @Override
    @Step("{0} clicks on element")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target)
        );
    }
}
