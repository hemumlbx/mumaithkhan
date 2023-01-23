package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DeltaTabLayoutPage extends PageObject {

    public static final Target DELTA_PAGE_TAB = Target.the("Tab")
            .locatedBy("//a[contains(., '{0}')]");

    public static final Target DELTA_PAGE_TITLE = Target.the("Title")
            .locatedBy("//div[contains(@class,'page-header')]//h3");

    public static final Target DELTA_TABS = Target.the("Delta Tabs")
            .locatedBy("//div[contains(@class,'x-tab-bwrap')][contains(.,'{0}')]");

    public static final Target DELTA_TABS_VEHICLE_LABEL = Target.the("Delta Tabs Vehicle Label")
            .locatedBy("//td[contains(@class,'label')][contains(.,'{0}')]");

    public static final Target DELTA_BRANDS_TAB_LABEL = Target.the("Delta Brands Tab Label")
            .locatedBy("//div[contains(@class,'modelDataGrid-bwrap')]//span[contains(@class,'x-grid3-hd-desc')][contains(.,'{0}')]");

    public static final Target DELTA_BRANDS_BUTTONS = Target.the("Delta Buttons")
            .locatedBy("//div[contains(@class,'modelData')]//span[contains(@class,'btn-wrap')][contains(.,'{0}')]");

    public static final Target DELTA_FEATURES_BUTTONS = Target.the("Delta Features Buttons")
            .locatedBy("//div[contains(@class,'featureData')]//span[contains(@class,'btn-wrap')][contains(.,'{0}')]");

    public static final Target DELTA_RPOs_BUTTONS = Target.the("Delta RPOs Buttons")
            .locatedBy("//div[contains(@class,'rpoData')]//span[contains(@class,'btn-wrap')][contains(.,'{0}')]");

    public static final Target DELTA_BRANDS_LIST = Target.the("Delta Brands List")
            .locatedBy("//div[contains(@class,'x-grid3-col-deltaStatus')]");

    public static final Target DELTA_BRANDS_NEW_LIST = Target.the("Delta Brands New List")
            .locatedBy("//div[contains(@class,'x-grid3-col-brandDescription')]");

    public static final Target DELTA_BRANDS_ORIGINAL_LIST = Target.the("Delta Brands Original List")
            .locatedBy("//div[contains(@class,'x-grid3-col-originalDescription')]");

    public static final Target DELTA_BRANDS_EXPANDER_BUTTON = Target.the("Delta Brands Actions List")
            .locatedBy("//div[contains(@class,'{0}')]//div[contains(@class,'x-grid3-row-expander')]");

    public static final Target DELTA_BRANDS_ACTIONS_EDIT_BUTTON = Target.the("Delta Brands Actions Edit Button")
            .locatedBy("//div[contains(@class,'x-grid3-col-action')]//img[contains(@class,'x-action-col-0')]");

    public static final Target DELTA_FEATURES_TAB_LABEL = Target.the("Delta Features Tab Label")
            .locatedBy("//div[contains(@class,'featureDataGrid-bwrap')]//span[contains(@class,'x-grid3-hd-desc')][contains(.,'{0}')]");

    public static final Target DELTA_RPOs_TAB_LABEL = Target.the("Delta RPOs Tab Label")
            .locatedBy("//div[contains(@class,'rpoDataGrid-bwrap')]//span[contains(@class,'x-grid3-hd-desc')][contains(.,'{0}')]");

    public static final Target DELTA_FEATURES_STATUS_LIST = Target.the("Delta Features Status List")
            .locatedBy("//div[contains(@class,'featureData')]//div[contains(@class,'x-grid-group-title')]");

    public static final Target DELTA_RPOs_STATUS_LIST = Target.the("Delta RPOs Status List")
            .locatedBy("//div[contains(@class,'rpoData')]//div[contains(@class,'x-grid-group-title')]");

    public static final Target RPOs_STATUS_LIST = Target.the("RPOs Status List")
            .locatedBy("//div[contains(@class,'rpoDataGrid')]//div[contains(@class,'x-grid-group-hd')]//div[contains(@class,'x-grid-group-title')]");

    public static final Target DELTA_TAB_EXPANDER_ICON = Target.the("Delta Tab Expander Icon")
            .locatedBy("//div[contains(@class,'{0}')]//div[contains(@class,'x-grid3-row-expander')]");

    public static final Target DELTA_POPUP_HEADER = Target.the("Delta PopUp Header")
            .locatedBy("//span[contains(@class,'x-window-header-text')][contains(.,'{0}')]");

    public static final Target DELTA_EDIT_VEHICLE_LABEL = Target.the("Delta Edit Vehicle Label")
            .locatedBy("//label[contains(@for,'{0}')]");

    public static final Target DELTA_EDIT_VEHICLE_LANGUAGE_DROPDOWN = Target.the("Delta Edit Vehicle Language Dropdown")
            .locatedBy("//img[contains(@class,'x-form-arrow-trigger')]");

    public static final Target DELTA_EDIT_VEHICLE_CLOSE_BUTTON = Target.the("Delta Edit Vehicle Close Button")
            .locatedBy("//div[contains(@class,'x-window-draggable')]//div");

    public static final Target DELTA_SPECIFIC_VEHICLE_VALUES = Target.the("Delta Specific Vehicle Values")
            .locatedBy("//dd[contains(text(),'{0}')]/parent::div/dt[contains(text(),'{1}')]/ancestor::td/preceding-sibling::td[1]//div[contains(.,'{2}')]/ancestor::td/preceding-sibling::td//div[contains(@class,'x-grid3-col-expander')]");

    public static final Target DELTA_VEHICLE_SUB_LIST_VALUES = Target.the("Delta Vehicle Sub List Values")
            .locatedBy("//td[contains(@onclick,'{0}')]//div[contains(@class,'gmdv-sublist-expander')]");

    public static final Target DELTA_VEHICLE_SUB_LIST_CODES = Target.the("Delta Vehicle Sub List Codes")
            .locatedBy("//td[contains(@class,'code')]");

    public static final Target DELTA_SUB_LIST_CODE_HEADER_TEXT = Target.the("Delta Sub List Code Header Text")
            .locatedBy("//tr/th[contains(@class,'code')]");

    public static final Target DELTA_SUB_LIST_FVD_HEADER_TEXT = Target.the("Delta Sub List FVD Header Text")
            .locatedBy("//tr/th[contains(.,'FVD')]");

    public static final Target DELTA_VEHICLE_SUB_LIST_FVD_VALUES = Target.the("Delta Vehicle Sub List FVD Values")
            .locatedBy("//div[contains(@class,modelDataGrid)]//dd[contains(@class,'gmdv-sublist-body-expanded')]//td[contains(.,'{0}')]");

    public static final Target DELTA_BRANDS_SPECIFIC_EDIT_ICON = Target.the("Delta Brands Specific Edit Icon")
            .locatedBy("//div[contains(@class,'x-grid3-col-deltaStatus')][contains(.,'{0}')]/parent::td/following-sibling::td//div/dt[contains(text(),'{1}')]/parent::div/child::dd[contains(text(),'{2}')]/ancestor::td/following-sibling::td[3]//div/img");

    public static final Target DELTA_BUTTONS = Target.the("Delta Buttons")
            .locatedBy("//button[contains(@class,'x-btn-text')][contains(.,'{0}')]");

    public static final Target EDIT_VEHICLE_DROPDOWN_VALUES = Target.the("Edit Vehicle Dropdown Values")
            .locatedBy("//div[contains(@class,'x-combo-list-item')]");

    public static final Target EDIT_VEHICLE_VEHICLE_VALUE = Target.the("Edit Vehicle Vehicle Value")
            .locatedBy("//div[contains(@class,'x-form-display-field')]");

    public static final Target DELTA_BRANDS_IGNORE_ICON = Target.the("Delta Brands Ignore Icon")
            .locatedBy("//div[contains(@class,'modelDataGrid')]//div[contains(@class,'x-grid3-col-action')]//img[contains(@class,'ico-col-deltaIgnore')]");

    public static final Target DELTA_BRANDS_ACCEPT_ICON = Target.the("Delta Brands Accept Icon")
            .locatedBy("//div[contains(@class,'x-grid3-col-action')]//img[contains(@class,'ico-col-deltaAccept')]");

    public static final Target DELTA_BRANDS_SPECIFIC_ACTIONS_IGNORE_ICON = Target.the("Delta Brands Specific Actions Icon")
            .locatedBy("//div[contains(@class,'x-grid3-col-deltaStatus')][contains(.,'{0}')]/parent::td/following-sibling::td//div/dt[contains(text(),'{1}')]/parent::div/child::dd[contains(text(),'{2}')]/ancestor::td/following-sibling::td[3]//div/img[contains(@class,'ico-col-deltaIgnore')]");

    public static final Target DELTA_BRANDS_SPECIFIC_ACTIONS_ACCEPT_ICON = Target.the("Delta Brands Specific Actions Icon")
            .locatedBy("//div[contains(@class,'x-grid3-col-deltaStatus')][contains(.,'{0}')]/parent::td/following-sibling::td//div/dt[contains(text(),'{1}')]/parent::div/child::dd[contains(text(),'{2}')]/ancestor::td/following-sibling::td[3]//div/img[contains(@class,'ico-col-deltaAccept')]");

    public static final Target FEATURES_TAB_SPECIFIC_VEHICLE_VALUE = Target.the("Features Tab Specific Vehicle Value")
            .locatedBy("//div[contains(@class,'x-grid-group-title')][contains(.,'{0}')]");

    public static final Target FEATURES_ACTIONS_ICON = Target.the("Features Actions Icon")
            .locatedBy("//div[(text()='{0}')]/parent::td/preceding-sibling::td//div[contains(@class,'x-grid3-col-original')]/parent::td/following-sibling::td[3]//div//img[contains(@class,'deltaIgnore')]");

    public static final Target RPOs_ACTIONS_ICON = Target.the("RPOs Actions Icon")
            .locatedBy("//div[(text()='{0}')]/parent::div/following-sibling::div/div/table//td[8]//div//img[contains(@class,'ico-col-deltaIgnore')]");

    public static final Target RPOs_ACCEPT_ACTIONS_ICON = Target.the("RPOs Accept Actions Icon")
            .locatedBy("//div[contains(@class,'x-grid3-col-action')]/child::img[contains(@class,'ico-col-deltaAccept')]");

    public static final Target FEATURES_IGNORED_COUNT = Target.the("RPOs Ignored Count")
            .locatedBy("//div[contains(@class,'featureDataGrid')]//tr/td[contains(@class,'count ignored')]");

    public static final Target FEATURES_ACCEPTED_COUNT = Target.the("RPOs Ignored Count")
            .locatedBy("//div[contains(@class,'featureDataGrid')]//tr/td[contains(@class,'count-first')]");

    public static final Target RPOs_ACCEPTED_COUNT = Target.the("RPOs Accepted Count")
            .locatedBy("//div[contains(@class,'rpoDataGrid')]//tr/td[contains(@class,'count-first')]");

    public static final Target DELTA_BRANDS_VEHICLE_COUNT = Target.the("Delta Brands Vehicle Count")
            .locatedBy("//div[contains(@class,'modelDataGrid-body')]//tr/td[contains(@class,'count')]");

    public static final Target RPOs_COUNT_TEXT = Target.the("RPOs Count Text")
            .locatedBy("//div[contains(@class,'rpoDataGrid-body')]//tr/td[contains(@class,'label')][contains(.,'{0}')]");

    public static final Target RPOs_COUNT_IGNORED_VALUE = Target.the("RPOs Count Ignored Value")
            .locatedBy("//div[contains(@class,'rpoDataGrid-body')]//tr/td[contains(@class,'count ignored')]");

    public static final Target DELTA_FEATURES_SUB_LIST = Target.the("Delta Features Sub List")
            .locatedBy("//div[contains(@class,'featureDataGrid')]//div[contains(@class,'x-grid3-col-action')]//img[contains(@class,'ico-col-deltaIgnore')]");

    public static final Target DELTA_RPOs_SUB_LIST = Target.the("Delta RPOs Sub List")
            .locatedBy("//div[contains(@class,'rpoDataGrid')]//div[contains(@class,'x-grid3-col-action')]//img[contains(@class,'ico-col-deltaIgnore')]");

}
