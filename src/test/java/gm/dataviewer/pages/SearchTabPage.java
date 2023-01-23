package gm.dataviewer.pages;

import net.serenitybdd.screenplay.targets.Target;

public class SearchTabPage {

    public static final Target SUB_TAB_LIST = Target.the("Sub Tab List")
            .locatedBy("//ul[@class='x-tab-strip x-tab-strip-top']//li");

    public static final Target SUB_TAB_SPECIFIC = Target.the("Sub Tab Specific")
            .locatedBy("//ul[@class='x-tab-strip x-tab-strip-top']//li[contains(., '{0}')]");

    public static final Target PRINT_BUTTON = Target.the("Print Button")
            .locatedBy("//span[@id='prntButton']");

    public static final Target LANGUAGE_DROP_DOWN = Target.the("Language Dropdown")
            .locatedBy("//div[contains(.,'')]//input[contains(@name,'languageCode')]//following-sibling::img");

    public static final Target BY_CODE_LANGUAGE_DROPDOWN = Target.the("By Code Language Dropdown")
            .locatedBy("//input[@name='vehicleCode']/parent::div/following-sibling::div//img");

    public static final Target BY_FEATURES_LANGUAGE_DROPDOWN = Target.the("By Features Language Dropdown")
            .locatedBy("//input[@name='featureType']/parent::div/following-sibling::div//img");

    public static final Target BY_RPO_LANGUAGE_DROPDOWN = Target.the("By RPO Language Dropdown")
            .locatedBy("//input[@name='categoryCode']/parent::div/following-sibling::div//img");

    public static final Target BY_FEATURES_COLUMN_NAMES = Target.the("By Features Column Values")
            .locatedBy("//span[@class='x-grid3-hd-desc']");

    public static final Target BY_VEHICLE_RESULT_TEXT = Target.the("By Vehicle Result")
            .locatedBy("//div[contains(@class, 'col-veh')]");

    public static final Target BY_VEHICLE_RESULT_SPECIFIC = Target.the("By Vehicle Result Specific")
            .locatedBy("//div[contains(@class, 'col-veh')][contains(., '{0}')]");

    public static final Target BY_VEHICLE_RESULT_EXPANDER = Target.the("By Vehicle Result Expander")
            .locatedBy("//div[contains(@class, 'col-veh')]/parent::td/preceding-sibling::td");

    public static final Target BY_SPECIFIC_VEHICLE_RESULT_EXPANDER = Target.the("By Specific Vehicle Result Expander")
            .locatedBy("//div[contains(@class, 'col-veh')][contains(., '{0}')]/parent::td/preceding-sibling::td");

    public static final Target VEHICLE_OPTIONS = Target.the("Vehicle Options")
            .locatedBy("//table[@class='gmdv-sublist-title-layout']//td/following-sibling::td");

    public static final Target CODE_TEXT_FIELD = Target.the("Code Text Field")
            .locatedBy("//input[@name='code']");

    public static final Target FEATURE_TEXT_FIELD = Target.the("Feature Text Field")
            .locatedBy("//input[@name='feature']");

    public static final Target CODE_PRINT_BUTTON = Target.the("Code Print Button")
            .locatedBy("//span[@id='printButton']");
}
