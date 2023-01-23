package gm.dataviewer.pages;

import net.serenitybdd.screenplay.targets.Target;

public class FeaturesTabPage {
    public static final Target FEATURE_PAGE_TAB = Target.the("Tab")
            .locatedBy("//a[contains(., '{0}')]");

    public static final Target FEATURE_PAGE_TITLE = Target.the("Title")
            .locatedBy("//div[contains(@class,'page-header')]//h3");

    public static final Target FEATURE_DROPDOWN_LABEL = Target.the("Feature Dropdown Label")
            .locatedBy("//label[contains(@class,'x-box-item')][contains(.,'{0}')]");

    public static final Target FEATURE_LABEL = Target.the("Feature Label")
            .locatedBy("//span[contains(@class,'x-grid3-hd-desc')][contains(.,'{0}')]");

    public static final Target FEATURE_BUTTON = Target.the("Feature Button")
            .locatedBy("//span[contains(@class,'x-btn-text')][contains(.,'{0}')]");

    public static final Target FEATURE_CHECK_BOX = Target.the("Feature Check Box")
            .locatedBy("//div[contains(@class,'x-grid3-hd-checker')]");

    public static final Target SUB_FEATURE_CHECK_BOX = Target.the("Sub Feature Check Box")
            .locatedBy("//div[contains(@class,'x-grid3-row-checker')]");

    public static final Target FEATURE_DROPDOWN_BUTTON = Target.the("Feature Dropdown Button")
            .locatedBy("//input[contains(@name,'{0}')]//following-sibling::img");

    public static final Target FEATURE_SPECIFIC_DROPDOWN_VALUES = Target.the("Feature Specific Dropdown Values")
            .locatedBy("//div[contains(@class,'x-combo-list-item')][contains(.,'{0}')]");

    public static final Target FEATURE_DROPDOWN_VALUES = Target.the("Feature Dropdown Values")
            .locatedBy("//div[contains(@class,'x-combo-list-item')]");

    public static final Target FEATURE_LIST = Target.the("Feature List")
            .locatedBy("//div[contains(@class,'x-grid-group-title')][contains(., '{0}')]");

    public static final Target FEATURE_SUB_LIST = Target.the("Feature Sub List")
            .locatedBy("//div[contains(@class,'x-grid3-col-description')]");

    public static final Target EDIT_SELECTED_HEADER = Target.the("Edit Selected Header")
            .locatedBy("//span[contains(@class,'x-window-header-text')][contains(.,'{0}')]");

    public static final Target EDIT_SELECTED_BUTTON = Target.the("Edit Selected Button")
            .locatedBy("//td[contains(@class,'x-btn-mc')][contains(.,'{0}')]");

    public static final Target EDIT_SELECTED_CLOSE_BUTTON = Target.the("Edit Selected Close Button")
            .locatedBy("//div[contains(@class,'x-tool x-tool-close')]");

    public static final Target EDIT_SELECTED_TEXT = Target.the("Edit Selected Text")
            .locatedBy("//span[contains(@class,'ext-mb-text')]");

    public static final Target EDIT_FEATURE_LABELS = Target.the("Edit Feature Labels")
            .locatedBy("//label[contains(@for,'{0}')]");

    public static final Target EDIT_FEATURE_PANEL_HEADER_TEXT = Target.the("Edit Feature Panel Header Text")
            .locatedBy("//span[contains(@class,'x-panel-header-text')]");

    public static final Target EDIT_FEATURE_TOGGLE_ARROW = Target.the("Edit Feature Toggle Arrow")
            .locatedBy("//div[contains(@class,'x-tool-toggle')]");

    public static final Target EDIT_FEATURE_LANGUAGE_DROPDOWN = Target.the("Edit Feature Language Dropdown")
            .locatedBy("//div[contains(.,'Edit Feature')]//input[contains(@name,'{0}')]//following-sibling::img");

    public static final Target EDIT_FEATURE_HISTORY_GRID_TEXT = Target.the("Edit Feature History Grid Text")
            .locatedBy("//label[contains(.,'{0}')]");

    public static final Target EDIT_SELECTED_WARNING_TEXT_MESSAGE = Target.the("Edit Selected Warning Text Message")
            .locatedBy("//span[contains(@class,'ext-mb-text')]");

    public static final Target EDIT_SELECTED_ARCHIVE_BUTTON = Target.the("Edit Selected Archive Button")
            .locatedBy("//td[contains(@class,'x-btn-mc')][contains(.,'{0}')]");

    public static final Target FEATURE_CATEGORY_CHECKER = Target.the("Select Feature Category")
            .locatedBy("//div[contains(@class,'description')][contains(., '{0}')]/parent::td/preceding-sibling::td[contains(@class, 'checker')]");

    public static final Target FEATURE_ARCHIVE_FOLDER = Target.the("Feature Archive Folder")
            .locatedBy("//div[contains(@class,'description')][contains(., '{0}')]/parent::td/following-sibling::td[contains(@class, 'action')]//div//img[contains(@class, 'archive')]");

}
