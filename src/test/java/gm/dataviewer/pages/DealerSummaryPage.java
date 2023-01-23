package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DealerSummaryPage extends PageObject {

    public static final Target DETAILED_SEARCH = Target.the("detailed search checkbox")
            .locatedBy("#rdoDetailedSearch");
    public static final Target RESET_BUTTON = Target.the("RESET_BUTTON")
            .locatedBy("//span[@id='btnReset']");

    public static final Target VEHICLE_CHECKBOX_ALL = Target.the("VEHICLE_CHECKBOX_ALL")
            .locatedBy(
                    "//div[@class='x-tree-node-el x-unselectable x-tree-stubnode x-tree-node-expanded']//input[@class='x-tree-node-cb']");

    public static final Target CHECKBOX_DATE_BRAND = Target.the("CHECKBOX_DATE_BRAND")
            .locatedBy("//ul[@class='x-tree-node-ct']//li[contains(.,'{0}')]//input");

    public static final Target DROP_DOWN_BOX = Target.the("DROP_DOWN_BOX")
            .locatedBy("//input[@name='{0}']/../input[2]");

    public static final Target SELECTION_DROP_DOWN_VISIBLE = Target.the("SELECTION_DROP_DOWN_VISIBLE")
            .locatedBy("//div[contains(@style,'visible')]//div[@class='x-combo-list-item'][contains(.,\"{0}\")]");

    public static final Target BRAND_CHECKBOX_ALL = Target.the("BRAND_CHECKBOX_ALL")
            .locatedBy(
                    "//div[@class='x-panel x-tree']//div[@class='x-tree-node-el x-unselectable x-tree-stubnode " +
                            "x-tree-node-expanded']//input[@class='x-tree-node-cb']");

    public static final Target SUBMIT_BUTTON = Target.the("SUBMIT_BUTTON")
            .locatedBy("//span[@id='btnSubmit']//button");

    public static final Target LANGUAGE_DROPDOWN = Target.the("LANGUAGE")
            .locatedBy("//div[@id='lang']//span");

    public static final Target LANGUAGE = Target.the("English Selector")
            .locatedBy("//div[contains(@class,'x-combo-list-item')][contains(text(),'{0}')]");

    public static final Target LANGUAGE_CHOICE = Target.the("LANGUAGE_CHOICE")
            .locatedBy("//a[@id='{0}']");

    public static final Target VIEWING_PAGE = Target.the("VIEWING_PAGE")
            .locatedBy("//tr[@class='x-toolbar-left-row']");

    public static final Target PROGRAM_UNDER_SPECIFIC_HEADER = Target.the("Program from specific header")
            .locatedBy("//div[@class='x-grid-group-title'][contains(., '{0}')]/parent::div/following-sibling::div//div[contains(@class, 'programName')]//a[contains(., '{1}')]");

}
