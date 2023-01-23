package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProgramSummaryPage extends PageObject {

    public static final Target LANGUAGE_TOGGLE = Target.the("Language Toggle")
            .locatedBy("//div[@id='lang']//span[@class='x-menu-item-text']");

    public static final Target LANGUAGE_OPTION = Target.the("Language Option")
            .locatedBy("//a[contains(.,'{0}')]");

    public static final Target YEAR_CHECKBOX = Target.the("Vehicle Year Checkbox")
            .locatedBy("//div[@id='modelYear']//li//div[contains(.,'{0}')]//input");

    public static final Target VEHICLE_DIVISION_DROPDOWN = Target.the("Vehicle Division Dropdown")
            .locatedBy("//div[@class='layout-horizontal']//div//img");

    public static final Target DROPDOWN_OPTION = Target.the("Dropdown Option")
            .locatedBy("//div//div//div[contains(.,'{0}')]");

    public static final Target MODEL_CHECKBOX = Target.the("Vehicle Model Checkbox")
            .locatedBy("//div[@id='modelTree']//li//div[contains(.,'{0}')]//input");

    public static final Target VEHICLE_BRAND = Target.the("Vehicle Brand")
            .locatedBy("//span[text()='{0}']/ancestor::a/preceding-sibling::input[@type='checkbox']");

    public static final Target SUBMIT = Target.the("English Submit Button")
            .locatedBy("//span[@id='btnSubmit']//button");

    public static final Target VEHICLE_HEADER_EXPAND = Target.the("Vehicle Header Expand Button")
            .locatedBy("//td[contains(@class, 'cell-last')][contains(., '{0}')]/preceding-sibling::td");

    public static final Target PROGRAM_ROW = Target.the("Program Row")
            .locatedBy("//td//div[contains(.,'{0}')]");

    public static final Target RESULTS_VISIBILITY = Target.the("Results Page Visibility")
            .locatedBy("//td[contains(@class, 'x-grid3-hd x-grid3-cell x-grid3-td-programName x-grid3-cell-first')]");

}
