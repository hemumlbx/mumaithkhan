package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DVPublishPage extends PageObject {

    public static final Target NAVIGATION_TAB = Target.the("Navigation Tabs")
            .locatedBy("//div[@class='nav']//ul//li[contains(., '{0}')]");

    public static final Target NAVIGATION_TAB_PAGE_HEADERS = Target.the("Navigation Tab Page Header")
            .locatedBy("//h3[text() = '{0}']");

    public static final Target PROGRAM_HYPERLINK = Target.the("Program Row By Link")
            .locatedBy("//span[@class='gm-tenpoint-link'][contains(.,'{0}')]");

    public static final Target OFFER_HYPERLINK = Target.the("Offer Number Hyperlink")
            .locatedBy("//td[contains(@class, 'objectName')][contains(., '{0}')]/preceding-sibling::td[contains(@class, 'objectCode')]");

    public static final Target GET_OFFER_NUMBER = Target.the("Get Offer Number")
            .locatedBy("//td[contains(@class, 'objectName')][contains(., '{0}')]/preceding-sibling::td[contains(@class, 'objectCode')]//span");

    public static final Target ACTIVE_TAB = Target.the("Active Tab")
            .locatedBy("(//span[contains(text(),'Active')])[1]");

    public static final Target SEARCH_BUTTON_TABS = Target.the("Search Button Tabs")
            .locatedBy("//ul[@class='x-tab-strip x-tab-strip-top']//li[contains(., '{0}')]");

    public static final Target FEATURE_SEARCH_BUTTON = Target.the("Feature Tab Search Button")
            .locatedBy("//input[@name='featureType']/parent::div/following-sibling::span");

    public static final Target DIVISION_TYPE_SEARCH_BUTTON = Target.the("Division Type Search Button")
            .locatedBy("//input[@name='divisionCode']/parent::div/following-sibling::span");

    public static final Target COMMON_BUTTON_TYPE = Target.the("Common Button Type")
            .locatedBy("//button[contains(., '{0}')]");

    public static final Target NAMEPLATE_PUBLISH_SELECTED = Target.the("Nameplate Publish Selected")
            .locatedBy("//span[@id='ext-gen127']");

    public static final Target CATEGORY_SEARCH_BUTTON = Target.the("Category Search Button")
            .locatedBy("//input[@name='categoryCode']/parent::div/following-sibling::span");

    public static final Target DIVISION_SEARCH_BUTTON = Target.the("Division Search Button")
            .locatedBy("//input[@name='divisionCode']/parent::div/following-sibling::span");

    public static final Target CODE_SEARCH_BUTTON = Target.the("Code Search Button")
            .locatedBy("//input[@name='vehicleCode']/parent::div/following-sibling::span");

    public static final Target FEATURE_TEXT_FIELD = Target.the("Feature Text Field")
            .locatedBy("//input[@name='feature']");

    public static final Target RPO_TEXT_FIELD = Target.the("RPO Text Field")
            .locatedBy("//input[@name='rpo']");

    public static final Target FEATURE_TYPE_DROPDOWN = Target.the("Feature Type Dropdown")
            .locatedBy("//input[@name='featureType']/following-sibling::img");

    public static final Target DIVISION_TYPE_DROPDOWN = Target.the("Division Type Dropdown")
            .locatedBy("//input[@name='divisionCode']/following-sibling::img");

    public static final Target BRAND_TYPE_DROPDOWN = Target.the("Brand Type Dropdown")
            .locatedBy("//input[@name='modelUID']/following-sibling::img");

    public static final Target FEATURE_STATUS_DROPDOWN = Target.the("Feature Status Dropdown")
            .locatedBy("//input[@name='status']/following-sibling::img");

    public static final Target NAMEPLATE_DIVISION_TYPE_DROPDOWN = Target.the("Nameplate Division Type Dropdown")
            .locatedBy("//label[contains(@for, 'modelYear')]/parent::div/parent::div/following-sibling::div//img");

    public static final Target FEATURE_TYPE_DROPDOWN_VALUE = Target.the("Feature Type Dropdown Value")
            .locatedBy("//div[@class='x-layer x-combo-list ']//div[contains(@class, 'x-combo-list-item')][contains(., '{0}')]");

    public static final Target DROPDOWN_VALUES = Target.the("Dropdown Value List")
            .locatedBy("//div[contains(@class, 'x-combo-list-item')]");

    public static final Target EDIT_SELECTED = Target.the("Edit Selected")
            .locatedBy("//button[@type='button'][contains(., 'Edit Selected')]");

    public static final Target FEATURE_TYPE_RESULTS_PAGE = Target.the("Results Page")
            .locatedBy("//div[@class='x-grid-group-title']");

    public static final Target SEARCH_BY_VEHICLE_RESULTS = Target.the("Search Results Page")
            .locatedBy("//table[@class='x-grid3-row-table']");

    public static final Target FEATURE_TYPE_RESULTS_PAGE_VEHICLE = Target.the("Publish Vehicle")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]");

    public static final Target PUBLISH_PAGE_EXPANDER = Target.the("Publish Vehicle Expander")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]//div[contains(@class, 'expander')]");

    public static final Target PUBLISH_PAGE_CHECKER = Target.the("Publish Select Vehicle")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]//div[contains(@class, 'checker')]");

    public static final Target PUBLISH_SELECT_CATEGORY_TYPE = Target.the("Publish Select Category Type")
            .locatedBy("//div[contains(@id, '{0}')]//td[contains(@class, 'recordType')][contains(., '{1}')]/following-sibling::td[contains(@class, 'category')][contains(., '{2}')]");

    public static final Target RPO_CATEGORY_RESULTS = Target.the("Category Results Page")
            .locatedBy("//div[contains(@class,'description')][contains(., 'Body Code')]");

    public static final Target RPO_CODES = Target.the("RPO Codes")
            .locatedBy("//div[contains(@class,'description')][contains(., 'Description')]");

    public static final Target OVERLAY_WINDOW_HEADER_TEXT = Target.the("Overlay Window Header")
            .locatedBy("//span[contains(., '{0}')]");

    public static final Target RPO_CATEGORY = Target.the("RPO Category")
            .locatedBy("//div[contains(@class,'description')]");

    public static final Target EDIT_RPO_CATEGORY = Target.the("Edit RPO Category")
            .locatedBy("//div[contains(@class,'description')][contains(., '{0}')]/parent::td/following-sibling::td//div//img");

    public static final Target ADD_RPO_CATEGORY = Target.the("Add RPO Category")
            .locatedBy("//button[@type='button'][contains(., 'Add New Category')]");

    public static final Target FEATURE_TYPE_RESULTS_EXPAND = Target.the("Feature Type Results Page Expand")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]");

    public static final Target NAMEPLATE_BRAND_EXPAND = Target.the("Nameplate Brand Expand")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]");

    public static final Target FEATURE_VEHICLE_WARNING_OVERLAY = Target.the("Feature Vehicle Warning Overlay")
            .locatedBy("//div[@class='ext-mb-content']//span");

    public static final Target FEATURE_VEHICLE_WARNING_OVERLAY_BUTTONS = Target.the("Feature Vehicle Warning Overlay Buttons")
            .locatedBy("//button[@type='button'][contains(., '{0}')]");

    public static final Target OVERLAY_BUTTON = Target.the("Overlay Button")
            .locatedBy("//span[text() = '{0}']");

    public static final Target FEATURE_VEHICLE_CHECKBOX = Target.the("Feature Vehicle Checkbox")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]/parent::div/following-sibling::div//td[contains(., '{1}')]/preceding-sibling::td[contains(@class, 'checker')]");

    public static final Target FEATURE_TYPE_VALUE = Target.the("Feature Type Value")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]/parent::div/following-sibling::div//td[contains(., '{1}')]/preceding-sibling::td[contains(@class, 'checker')]");

    public static final Target FEATURE_VEHICLE_EDIT_ICON = Target.the("Feature Vehicle Edit Icon")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]/parent::div/following-sibling::div//td[contains(., '{1}')]/following-sibling::td[contains(@class, 'action')]");

    public static final Target FEATURE_TYPE_EDIT_ICON = Target.the("Feature Type Edit Icon")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]/parent::div/following-sibling::div//td[contains(., '{1}')]/following-sibling::td[contains(@class, 'action')]//img[contains(@class, 'edit')]");

    public static final Target FEATURE_TYPE_ARCHIVE_ICON = Target.the("Feature Type Archive Icon")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]/parent::div/following-sibling::div//td[contains(., '{1}')]/following-sibling::td[contains(@class, 'action')]//img[contains(@class, 'archive')]");

    public static final Target NAMEPLATE_EDIT_ICON = Target.the("Nameplate Edit Icon")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]//div[contains(@class, 'edit')]");

    public static final Target ADD_NEW_NAMEPLATE = Target.the("Add New Nameplate")
            .locatedBy("//button[@class='x-btn-text'][contains(., 'Add New Nameplate')]");

    public static final Target ADD_NEW_BRAND = Target.the("Add New Brand")
            .locatedBy("//button[@class='x-btn-text'][contains(., 'Add New Brand Name')]");

    public static final Target NAMEPLATE_DESCRIPTION = Target.the("Nameplate Description")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]");

    public static final Target DESCRIPTION_OVERLAY_LANGUAGE_LABEL = Target.the("Description Overlay Language Label")
            .locatedBy("//label[@for='availableLanguages']");

    public static final Target INCENTIVE_DESCRIPTION_TEXT_FIELD = Target.the("Incentive Description Text Field")
            .locatedBy("//label[@for='incentiveDescField']/following-sibling::div//input[@type='text']");

    public static final Target CHROME_DESCRIPTION_TEXT_FIELD = Target.the("Chrome Description Text Field")
            .locatedBy("//label[@for='chromeDescField']/following-sibling::div//input[@type='text']");

    public static final Target ADD_RPO_TEXT_FIELD = Target.the("Add RPO Text Field")
            .locatedBy("//input[@name='code']");

    public static final Target CATEGORY_TEXT_FIELD = Target.the("Category Text Field")
            .locatedBy("//input[@name='description']");

    public static final Target FEATURE_INCENTIVE_DESC_TEXT = Target.the("Feature Incentive Description")
            .locatedBy("//td[contains(., '{0}')]/following-sibling::td[contains(@class, 'incentiveDesc')]");

    public static final Target CATEGORY_DESCRIPTION = Target.the("Category Description")
            .locatedBy("//td[contains(@class, 'description')]");

    public static final Target RPO_CATEGORY_DESCRIPTION = Target.the("RPO Category Description")
            .locatedBy("//td[contains(@class, 'code')]");

    public static final Target FEATURE_OFFER_DESC_TEXT = Target.the("Feature Offer Description")
            .locatedBy("//td[contains(., '{0}')]/following-sibling::td[contains(@class, 'offerDesc')]");

    public static final Target FEATURE_CHROME_DESC_TEXT = Target.the("Feature Chrome Description")
            .locatedBy("//td[contains(., '{0}')]/following-sibling::td[contains(@class, 'chromeDesc')]");

    public static final Target NAMEPLATE_TEXT_FIELD = Target.the("nameplate Text Field")
            .locatedBy("//label[@for='nameplateDescription']/following-sibling::div//input[@type='text']");

    public static final Target OFFER_DESCRIPTION_TEXT_FIELD = Target.the("Offer Description Text Field")
            .locatedBy("//label[@for='offerDescField']/following-sibling::div//input[@type='text']");

    public static final Target LANGUAGE_DROPDOWN = Target.the("Select Language")
            .locatedBy("//input[@id='availableLanguages']/following-sibling::img");

    public static final Target AUTHORING_LANGUAGE_DROPDOWN = Target.the("Authoring Language Dropdown Arrow")
            .locatedBy("[class=x-box-inner] > div:nth-child(5) > img");

    public static final Target LANGUAGE = Target.the("English Selector")
            .locatedBy("//div[contains(@class,'x-combo-list-item')][contains(text(),'{0}')]");

    public static final Target YEAR_DROPDOWN = Target.the("Select Year")
            .locatedBy("//input[contains(@name,'modelYear')]/following-sibling::img");

    public static final Target CODE_DROPDOWN = Target.the("Select Code")
            .locatedBy("//input[contains(@name,'vehicleCode')]/following-sibling::img");

    public static final Target AUTHORING_YEAR_DROPDOWN = inOverlayIFrame("Year Dropdown",
            "//div[@id='year-division-brand']//tbody/tr[1]/td[2]//input");

    public static final Target DIVISION_DROPDOWN = inOverlayIFrame("Division Dropdown",
            "//div[@id='year-division-brand']//tbody/tr[2]/td[2]//input");

    public static final Target DROPDOWN_ITEM = inOverlayIFrame("Dropdown Item",
            "//div[contains(@class, 'x-combo-list-item') and contains(., '{0}')]");

    public static final Target NAMEPLATE = inOverlayIFrame("Nameplate",
            "//input[contains(@class, 'x-tree-node-cb') and ../a/span[.='{0}']]");

    public static final Target EXPAND_NAMEPLATE = inOverlayIFrame("Expand Nameplate",
            "//span[text() = '{0}']/parent::a/parent::div//img[contains(@class, 'plus')]");

    public static final Target BRAND = inOverlayIFrame("Brand",
            "//ul[@class='x-tree-node-ct']//input[contains(@class, 'x-tree-node-cb') and ../a/span[.='{0}']]");

    public static final Target BRAND_OVERLAY_YEAR_DROPDOWN = Target.the("Brand Overlay Year Dropdown")
            .locatedBy("//div[contains(., 'Model Year')]//input[contains(@name,'modelYear')]/following-sibling::img");

    public static final Target BRAND_OVERLAY_DIVISION_DROPDOWN = Target.the("Brand Overlay Division Dropdown")
            .locatedBy("//div[contains(., 'Model Year')]//input[contains(@name,'divisionCode')]/following-sibling::img");

    public static final Target BRAND_OVERLAY_CHROME_DROPDOWN = Target.the("Brand Overlay Chrome Dropdown")
            .locatedBy("//div[contains(., 'Model Year')]//input[contains(@name,'modelUID')]/following-sibling::img");

    public static final Target BRAND_OVERLAY_CATEGORY_TYPE_DROPDOWN = Target.the("Category Type Dropdown")
            .locatedBy("//div[contains(., 'Model Year')]//input[@name='categoryCode']/following-sibling::img");

    public static final Target CATEGORY_TYPE_DROPDOWN = Target.the("Category Type Dropdown")
            .locatedBy("//input[@name='categoryCode']/following-sibling::img");

    public static final Target RPO_CATEGORY_TYPE_DROPDOWN = Target.the("RPO Category Type Dropdown")
            .locatedBy("//div[contains(., 'Chrome Brand Name:')]/following-sibling::div//input[@name='categoryCode']/following-sibling::img");

    public static final Target SELECTED_VEHICLES = Target.the("Select Vehicles From Available")
            .locatedBy("//legend[contains(., 'Selected')]/following-sibling::div//dl[contains(., '{0}')]");

    public static final Target AVAILABLE_VEHICLES = Target.the("Available Vehicles")
            .locatedBy("//legend[contains(., 'Available')]/following-sibling::div//dl[contains(., '{0}')]");

    public static final Target RIGHT_ARROW = Target.the("Right Arrow")
            .locatedBy("//img[@src[contains(., 'right')]]");

    public static final Target LEFT_ARROW = Target.the("Left Arrow")
            .locatedBy("//img[@src[contains(., 'left')]]");

    public static final Target VEHICLE_SHORT_DESCRIPTION = Target.the("Vehicle Short Description")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//div[@id='currentShortDesc']");

    public static final Target VEHICLE_CURRENT_FVD = Target.the("Vehicle Current FVD")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//div[@id='currentFvd']");

    public static final Target VEHICLE_BRAND_COLUMN = Target.the("Vehicle Brand Column")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-panel-bwrap']//iframe")))
            .locatedBy("//div[contains(@class , 'col-brand')]//span");

    public static final Target OFFER_VEHICLE_DESCRIPTION = Target.the("Offer Vehicle Description")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-panel-bwrap']//iframe")))
            .locatedBy("//li[@id='vehicleDescWrap']");

    public static final Target NAMEPLATE_GRID_RESULTS = Target.the("Nameplate Grid Results")
            .locatedBy("//div[@class='x-grid-group-title']");

    public static final Target CATEGORY_TYPE_DROPDOWN_VALUE = Target.the("Category Type Dropdown Value")
            .locatedBy("//div[@class='x-layer x-combo-list '][contains(@style,'visibility: visible')]//div[contains(@class, 'x-combo-list-item')][contains(., '{0}')]");

    public static final Target INCENTIVE_DESCRIPTION_LANDING_PAGE = Target.the("Landing Page Incentive Description")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]/parent::div/following-sibling::div//td[contains(., '{1}')]/following-sibling::td[contains(@class, 'incentiveDesc')]");

    public static final Target OFFER_DESCRIPTION_LANDING_PAGE = Target.the("Landing Page Offer Description")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]/parent::div/following-sibling::div//td[contains(., '{1}')]/following-sibling::td[contains(@class, 'offerDesc')]");

    public static final Target PROGRAM_ROW_BY_NUMBER = Target.the("Program Row By Number")
            .locatedBy("//div[contains(@class,'x-panel')]//div[contains(@class, 'x-grid3-row')]/table[tbody//span[contains(.,'{0}')]]//div[@class='x-grid3-row-checker']");

    public static Target ACTION_BUTTON = Target.the("Action button")
            .locatedBy("//div[contains(@class,\"x-highlights-title-panel-body\")]//button[span[contains(.,\"{0}\")]]");

    public static final Target NEW_PROGRAM_BUTTON = Target.the("New Program Button")
            .locatedBy("//span[@class=' x-btn-text'][contains(.,'New Program')]");

    public static final Target RADIO_BUTTON = inOverlayIFrame("Radio Button", "//input[../label[.='{0}']]");

    public static final Target ATTRIBUTE_DROPDOWN = inOverlayIFrame("Attribute Dropdown",
            "//div[@id='attributePanel']//tbody/tr[1]/td[2]//input");

    public static final Target CHECKBOX = inOverlayIFrame("Checkbox", "//input[../label[contains(.,'{0}')]]");

    public static final Target HEADER_LABEL = Target.the("Landing Page Header")
            .locatedBy("//h3[contains(.,'{0}')]");

    public static final Target SELECT_VEHICLE = Target.the("Top Select Vehicles")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-panel-bwrap']//iframe")))
            .locatedBy("//span[@id='selectBtnTop']//span[@class=' x-btn-text'][contains(text(),'Select Vehicles')]");

    public static final Target VEHICLE_ACTION_BUTTON_OVERLAY = Target.the("Overlay {0} Button")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//button/span[text()='{0}']");

    public static final Target ACTION_BUTTON_OVERLAY = Target.the("Overlay {0} Button")
            .locatedBy("//div[contains(@class,'x-resizable-pinned')]//button/span[text()='{0}']");

    public static final Target TOP_INPUT_INCENTIVE = Target.the("Top Input Incentive")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-panel-bwrap']//iframe")))
            .locatedBy("//span[@id='inputBtnTop']//span[@class=' x-btn-text'][contains(text(),'Input Incentive Values')]");

    private static Target inOverlayIFrame(String name, String location) {
        return Target.the(name).inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe"))).locatedBy(location);
    }

    public static final Target MODEL_CHECKBOX = Target.the("Model Checkbox")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//td[contains(@class, 'x-grid3-td-Models')][contains(.,'{0}')]/preceding-sibling::td/div/div");

    public static final Target CASH_TEXTBOX = Target.the("Cash Text box")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//input[@class='input-cash']");

    public static final Target VEHICLE_FOOTNOTE_TEXT = Target.the("Foot Note Text")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("(//td[@class='ind']/input)[1]");

    public static final Target SAVE_AND_CLOSE_BUTTON = Target.the("Save & Close Button")
            .locatedBy("//span[@class=' x-btn-text'][contains(.,'Save & Close')]");

    public static final Target TEN_POINT_VEHICLE_YEAR = Target.the("Ten Point Model Year")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("//table[@class='section-compact-grid']//tr/th[contains(.,'{0}')]");

    public static final Target TEN_POINT_VEHICLE_MODEL = Target.the("Ten Point Model")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("//table[@class='section-compact-grid']//tr/td[contains(.,'{0}')]");

    public static final Target WARNING_OK_BUTTON = Target.the("Warning ok Button")
            .locatedBy("//button/span[contains(text(),'OK')]");

    public static final Target FOLDER_ACTION = Target.the("Folder Action")
            .locatedBy("//div[@class='group']//li[contains(.,'{0}')]");

    public static final Target WARNING_POST_BUTTON = Target.the("Warning Post Button")
            .locatedBy("//div[@class='x-window-bwrap']//div[@class='x-window-bl']//td[@class='x-toolbar-right']//span[@class='btn btn-standard '][contains(.,'OK')]");
}
