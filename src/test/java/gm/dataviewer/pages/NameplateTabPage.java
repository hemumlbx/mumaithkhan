package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;

public class NameplateTabPage extends PageObject {

    public static final Target PAGE_TAB = Target.the("Tab")
            .locatedBy("//a[contains(., '{0}')]");

    public static final Target PAGE_TITLE = Target.the("Title")
            .locatedBy("//div[contains(@class,'page-header')]//h3");

    public static final Target PAGE_LABEL = Target.the("Label")
            .locatedBy("//label[contains(., 'Division')]");

    public static final Target BUTTON = Target.the("button")
            .locatedBy("//span[@class=' x-btn-text'][contains(., '{0}')]");

    public static final Target DIVISION_DROPDOWN_BUTTON = Target.the("Division Dropdown Button")
            .locatedBy("//input[@name='divisionCode']/following-sibling::img");

    public static final Target DROPDOWN_VALUES = Target.the("Dropdown Values")
            .locatedBy("//div[contains(@class, 'x-combo-list-item')]");

    public static final Target LANGUAGE_DROPDOWN_BUTTON = Target.the("Language Dropdown Button")
            .locatedBy("//input[@name='languageCode']/following-sibling::img");

    public static final Target BRAND_DROPDOWN_VALUES = Target.the("Brand Dropdown Values")
            .locatedBy("//div[contains(@class,'x-combo-list-item')][contains(., '{0}')]");

    public static final Target GRID_RESULTS = Target.the("Grid Results")
            .locatedBy("//div[contains(@class,'x-grid-group-title')]");

    public static final Target BRAND_RESULTS = Target.the("Brand Results")
            .locatedBy("//div[contains(@class,'x-grid-group-title')]//div[@class='ux-grow-action-text']");

    public static final Target OVERLAY_HEADER = Target.the("Overlay Title")
            .locatedBy("//span[contains(@class,'window-header')]");

    public static final Target ADD_NAMEPLATE_LABEL = Target.the("Year Label")
            .locatedBy("//label[contains(@for,'{0}')]");

    public static final Target ADD_NAMEPLATE_TEXT = Target.the("Add Nameplate Text")
            .locatedBy("//span[contains(@class,'fieldset-header')][contains(.,'{0}')]");

    public static final Target CURSOR_BUTTON = Target.the("Cursor Button")
            .locatedBy("//img[contains(@style,'cursor:pointer')][contains(@src,'{0}')]");

    public static final Target DIVISION_DROPDOWN = Target.the("Division Dropdown")
            .locatedBy("//div[contains(.,'Add Nameplate')]//input[@name='divisionCode']/following-sibling::img");

    public static final Target LANGUAGE_DROPDOWN = Target.the("Language Dropdown")
            .locatedBy("//div[contains(.,'Add Nameplate')]//input[@name='languageCode']/following-sibling::img");

    public static final Target YEAR_DROPDOWN = Target.the("Year Dropdown")
            .locatedBy("//input[contains(@name,'modelYearCode')]//following-sibling::img");

    public static final Target ADD_BUTTON = Target.the("Add Button")
            .locatedBy("//div[contains(.,'Add Nameplate')]//span[@class=' x-btn-text'][contains(., '{0}')]");

    public static final Target NAMEPLATE_ERROR_ICON = Target.the("Nameplate Error Icon")
            .locatedBy("//input[contains(@type,'text')]/following-sibling::div");

    public static final Target SELECTED_ERROR_ICON = Target.the("Selected Error Icon")
            .locatedBy("//div[@name='nameplates']//following-sibling::div[contains(@class, 'invalid-icon')]");

    public static final Target VISIBLE_ERROR_MESSAGE = Target.the("Visible Error Message")
            .locatedBy("//div[@class='x-tip']");

    public static final Target EQUINOX_BRAND = Target.the("Equinox")
            .locatedBy("//div[contains(@class,'x-grid-group-title')]//div[contains(.,'{0}')]");

    public static final Target MODELS_LIST = Target.the("Models List")
            .locatedBy("//div[contains(text(),'{0}')]");

}