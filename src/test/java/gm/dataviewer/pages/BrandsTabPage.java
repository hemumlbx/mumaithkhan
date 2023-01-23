package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BrandsTabPage extends PageObject {

    public static final Target BRAND_PAGE_TAB = Target.the("Tab")
            .locatedBy("//a[contains(., '{0}')]");

    public static final Target BRAND_PAGE_TITLE = Target.the("Title")
            .locatedBy("//div[contains(@class,'page-header')]//h3");

    public static final Target DROPDOWN_BUTTON = Target.the("Year dropdown Button")
            .locatedBy("//input[contains(@name,'{0}')]//following-sibling::img");

    public static final Target DROPDOWN_VALUES = Target.the(" Dropdown Values")
            .locatedBy("//div[contains(@class,'x-combo-list-item')][contains(.,'{0}')]");

    public static final Target BRAND_LAYOUT_DROPDOWN_VALUES = Target.the(" Brand Layout Dropdown Values")
            .locatedBy("//div[contains(@class,'x-combo-list-item')]");

    public static final Target BRAND_GRID_VALUES = Target.the("Brand Grid Values")
            .locatedBy("//div[contains(@class,'x-grid-group-collapsed')]");

    public static final Target BUTTON = Target.the("button")
            .locatedBy("//span[@class=' x-btn-text'][contains(.,'{0}')]");

    public static final Target BRAND_LABEL_TEXT= Target.the("Brand Label Text")
            .locatedBy("//div[contains(@class,'x-grid3-hd-{0}')]");

    public static final Target ADD_BRAND_HEADER = Target.the("Add Brand Header")
            .locatedBy("//span[contains(@class,'x-window-header-text')][contains(.,'{0}')]");

    public static final Target ADD_BRAND_LABELS = Target.the("Add Brand Labels")
            .locatedBy("//div[contains(@class,'x-form-item')]//label[contains(text(),'{0}')]");

    public static final Target ADD_BRAND_DROPDOWN = Target.the("Add Brand Language Dropdown")
            .locatedBy("//div[contains(.,'Add Brand')]//input[contains(@name,'{0}')]//following-sibling::img");

    public static final Target ADD_BRAND_HEADER_TEXT = Target.the("Language Label")
            .locatedBy("//span[contains(@class,'x-fieldset-header-text')][contains(.,'{0}')]");

    public static final Target ADD_BRAND_CURSOR_ICON = Target.the("Language Label")
            .locatedBy("//img[contains(@src,'{0}')]");

    public static final Target ADD_BRAND_BUTTON = Target.the("Add Brand Button")
            .locatedBy("//div[contains(.,'Add Brand')]//span[contains(@class,'x-btn-text')][contains(.,'{0}')]");

    public static final Target CANYON_BRAND = Target.the("Canyon Brand")
            .locatedBy("//div[contains(@class,'ux-grow-action-text')][contains(.,'{0}')]");

    public static final Target DEALS_LIST= Target.the("Deals List")
            .locatedBy("//div[contains(text(),'T2')]");

    public static final Target ADD_BRAND_DROPDOWN_VALUES= Target.the("Add Brand Language Dropdown values")
            .locatedBy("//div[contains(@class,'x-combo-list-item')]");

    public static final Target ADD_BRAND_SPECIFIC_VALUE= Target.the("Add Brand Specific Division value")
            .locatedBy("//div[contains(@class,'x-combo-list-item')][contains(.,'{0}')]");
}
