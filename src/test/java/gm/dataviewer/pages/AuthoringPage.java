package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AuthoringPage extends PageObject {

    public static final Target GENERAL_LABEL = Target.the("Any General Label")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("//label");

    public static final Target MSRP_VALUE = Target.the("MSRP Value")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("#vehicleMsrp");

    public static final Target PRICE_DATE_VALUE = Target.the("Price Effective Date Value")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("#priceEffectiveDate");

    public static final Target MESSAGE_SECTION_VEHICLE = Target.the("Message Section Vehicle")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("//div[@class='message-section']//div[2]");

    public static final Target REVIEW_ITEMS_LIST = Target.the("Review Items List")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("//td[@class='reviewItem']//p");

    public static final Target LOTS_LIST = Target.the("Lots List")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("//table[@class='section-compact-grid']//tr//td");

    public static final Target OFFER_NUMBER = Target.the("Offer Number")
            .locatedBy("//td[@class='data-b']//li[1]//strong");

    public static final Target OFFER_ROW_BY_NAME = Target.the("Offer Row By Name")
            .locatedBy("//div[@class='x-grid3-cell-inner x-grid3-col-objectName' and starts-with(.,'{0}')]");

    public static final Target OFFER_ROW_BY_NAME_WITH_VEHICLE = Target.the("Offer Row By Name With Vehicle")
            .locatedBy("//div[@class='x-grid3-cell-inner x-grid3-col-objectName' and starts-with(.,'{0}')]/ancestor::td/following-sibling::td[1]/div[contains(@class, x-grid3-col-vehicle) and contains(normalize-space(),'{1}')]");

    public static final Target SEARCH_OFFER_ROW_BY_NAME = Target.the("Search Offer Row By Name")
            .locatedBy("//div[contains(@id,'searchresults')]//div[@class='x-grid3-cell-inner x-grid3-col-objectName' and starts-with(.,'{0}')]");

    public static final Target FOLDER = Target.the("Folder")
            .locatedBy("//div[@class='x-folder-body']//li[starts-with(.,'{0}')]");

    public static final Target OFFER_TAB_TEXT = Target.the("Offer Tab Text")
            .locatedBy("//div[contains(@class,'x-tab-panel-header')]//li[contains(@class,'x-tab-strip-closable')]//span[contains(@class,'x-tab-strip-title')]");

    public static final Target TAB = Target.the("Tab")
            .locatedBy("//div[contains(@class, 'x-plain-body')]/ul/li[contains(.,'{0}') and not(@disabled)]");

    public static final Target ACTIVE_TAB = Target.the("Active Tab")
            .locatedBy("//div[contains(@class, 'x-plain-body')]/ul/li[@class='wni-selected']");

}
