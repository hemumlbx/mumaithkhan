package gm.dataviewer.pages;

import net.serenitybdd.screenplay.targets.Target;

public class RPOsTabPage {
    public static final Target RPOs_PAGE_TAB = Target.the("Tab")
            .locatedBy("//a[contains(., '{0}')]");

    public static final Target RPOs_PAGE_TITLE = Target.the("Title")
            .locatedBy("//div[contains(@class,'page-header')]//h3");

    public static final Target RPOs_DROPDOWN_LABEL = Target.the("RPOs Dropdown Label")
            .locatedBy("//label[contains(@class,'x-box-item')][contains(.,'{0}')]");

    public static final Target RPOs_LABEL = Target.the("RPOs Label")
            .locatedBy("//span[(text()='{0}')]");

    public static final Target RPOs_LAYOUT_TABS_TEXT = Target.the("RPOs Layout Tabs Text")
            .locatedBy("//div[contains(@class,'x-tab-bwrap')][contains(.,'{0}')]");

    public static final Target RPOs_LAYOUT_CHECKER = Target.the("RPOs Checker")
            .locatedBy("//div[contains(@class,'x-grid3-hd-checker')]");

    public static final Target RPOs_BUTTON = Target.the("RPOs Button")
            .locatedBy("//span[contains(@class,'x-btn-text')][contains(.,'{0}')]");

    public static final Target RPOs_DROPDOWN_BUTTON = Target.the("RPOs Dropdown Button")
            .locatedBy("//input[contains(@name,'{0}')]//following-sibling::img");

    public static final Target RPOs_CATEGORY = Target.the("RPOs Category")
            .locatedBy("//td[contains(@class,'x-grid3-cell-first sort-asc')]//span[(text()='Category')]");

    public static final Target RPOs_CATEGORY_LIST = Target.the("RPOs Category List")
            .locatedBy("//div[contains(@class,'x-grid3-col-description')]");

    public static final Target RPOs_EDIT_CATEGORY_ICON = Target.the("RPOs Edit Category Icon")
            .locatedBy("//div[contains(@class,'x-grid3-col-action')]");

    public static final Target RPOs_DROPDOWN_VALUES = Target.the("RPOs Dropdown Values")
            .locatedBy("//div[contains(@class,'x-combo-list-item')]");

    public static final Target RPOs_SPECIFIC_DROPDOWN_VALUES = Target.the("RPOs Specific Dropdown Values")
            .locatedBy("//div[contains(@class,'x-combo-list-item')][contains(.,'{0}')]");

    public static final Target RPOs_RPOs_LIST = Target.the("RPOs Category List")
            .locatedBy("//div[contains(@class,'x-grid-group-title')][contains(., '{0}')]");

    public static final Target RPOs_SUB_LIST = Target.the("RPOs Sub List")
            .locatedBy("//div[contains(@class,'x-grid3-col-code')]");

    public static final Target RPOs_SUB_LIST_CHECKER = Target.the("RPOs Sub List Checker")
            .locatedBy("//div[contains(@class,'x-grid3-col-code')][contains(.,'{0}')]");

    public static final Target RPO_HEADER_TEXT = Target.the("Add RPO Header Text")
            .locatedBy("//span[contains(@class,'x-window-header-text')][contains(.,'{0}')]");

    public static final Target ADD_RPO_LABELS = Target.the("Add RPO Labels")
            .locatedBy("//label[contains(@class,'x-form-item-label')][contains(.,'{0}')]");

    public static final Target ADD_RPO_PANEL_TEXT = Target.the("Add RPO Panel Text")
            .locatedBy("//span[contains(@class,'x-panel-header-text')]");

    public static final Target ADD_RPO_CLOSE_BUTTON = Target.the("Add RPO Close Button")
            .locatedBy("//div[contains(@class,'x-tool-close')]");

    public static final Target EDIT_RPO_DROPDOWN_BUTTON = Target.the("Edit RPO Dropdown Button")
            .locatedBy("//div[contains(.,'Edit RPO')]//input[contains(@name,'languageCode')]//following-sibling::img");

    public static final Target EDIT_RPO_SPECIFIC_TEXT_VALUES = Target.the("Edit RPO Specific Text Values")
            .locatedBy("//div[contains(@class,'x-form-display-field')][contains(.,'{0}')]");

    public static final Target EDIT_RPO_PANEL_TEXT = Target.the("Edit RPO Panel Text")
            .locatedBy("//span[contains(@class,'x-panel-header-text')]");

    public static final Target EDIT_RPO_HISTORY_GRID_TEXT = Target.the("Edit RPO History Grid Text")
            .locatedBy("//div[contains(@class,'dv-historygrid-summary')]//label[contains(.,'{0}')]");

    public static final Target RPO_ARCHIVE_FOLDER = Target.the("RPO Archive Folder")
            .locatedBy("//div[contains(@class,'x-grid3-row-selected')]//img[contains(@class,'ico-col-archive')]");

    public static final Target RPO_ARCHIVE_WARNING_TEXT = Target.the("RPO Archive Warning Text")
            .locatedBy("//span[contains(@class,'ext-mb-text')]");

    public static final Target RPO_ARCHIVE_WARNING_BUTTON = Target.the("RPO Archive Warning Button")
            .locatedBy("//button[contains(@class,'x-btn-text')][contains(.,'{0}')]");

    public static final Target ADD_RPO_DROPDOWN_BUTTON = Target.the("Add RPO Dropdown Button")
            .locatedBy("//div[contains(.,'Add RPO')]//input[contains(@name,'{0}')]//following-sibling::img");

    public static final Target ADD_RPO_ERROR_ICON= Target.the("Add RPO Error Icon")
            .locatedBy("//div[@class='x-form-invalid-icon']");

    public static final Target ADD_RPO_ERROR_HIDDEN_MESSAGE= Target.the("Add RPO Error Hidden Message")
            .locatedBy("//div[@class='x-tip']");

    public static final Target RPO_EDIT_ICON = Target.the("RPO Edit Icon")
            .locatedBy("//div[contains(@class,'x-grid3-row-selected')]//img[contains(@class,'ico-col-edit')]");

    public static final Target ADD_CATEGORY_FIELD = Target.the("Add Category Field")
            .locatedBy("//input[contains(@name,'description')]");

    public static final Target ADD_CATEGORY_BUTTON = Target.the("Add Category Button")
            .locatedBy("//div[contains(.,'Add Category')]//span[contains(@class,'x-btn-text')][contains(.,'{0}')]");

    public static final Target EDIT_CATEGORY_BUTTON = Target.the("Edit Category Button")
            .locatedBy("//div[contains(.,'Edit Category')]//span[contains(@class,'x-btn-text')][contains(.,'{0}')]");

    public static final Target RPOs_TEXT = Target.the("RPOs Code Chrome Description Text")
            .locatedBy("//div[contains(@name,'{0}')]");

    public static final Target CATEGORY_TAB_LIST = Target.the("Category Tab List")
            .locatedBy("//div[contains(@class,'description')][contains(., '{0}')]/parent::td/following-sibling::td[contains(@class, 'action')]//div//img[contains(@class, 'action')]");
}

