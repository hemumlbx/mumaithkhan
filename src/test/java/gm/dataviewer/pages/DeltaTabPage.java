package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DeltaTabPage extends PageObject {

    public static final Target BRANDS_RECORDS = Target.the("Delta Brands Records")
            .locatedBy("//div[@class='modelDataGrid-bwrap']//table[@class='x-grid3-row-table']");

    public static final Target FEATURES_RECORDS = Target.the("Feature Records")
            .locatedBy("//div[@class='featureDataGrid-bwrap']//div[@class='x-grid-group-title']");

    public static final Target RPO_RECORDS = Target.the("RPO Records")
            .locatedBy("//div[@class='rpoDataGrid-bwrap']//div[@class='x-grid-group-title']");

    public static final Target DELTA_TABS = Target.the("Delta Tabs")
            .locatedBy("//ul[@class='x-tab-strip x-tab-strip-top']//li[contains(.,'{0}')]");

    public static final Target DELTA_BRAND_VEHICLE = Target.the("Brand Tab Vehicle")
            .locatedBy("//td[contains(@class,'brandDescription ')][contains(., '{0}')]");

    public static final Target DELTA_BRAND_VEHICLE_STATUS = Target.the("Brand Tab Vehicle Status")
            .locatedBy("//td[contains(@class,'brandDescription ')][contains(., '{0}')]/preceding-sibling::td[@class='x-grid3-col x-grid3-cell x-grid3-td-deltaStatus ']");

    public static final Target DELTA_BRAND_VEHICLE_ENGLISH_DESCRIPTION = Target.the("Brand Tab Vehicle English Description")
            .locatedBy("//td[contains(@class,'brandDescription ')][contains(., '{0}')]/following-sibling::td//dd[contains(., 'English')]");

    public static final Target DELTA_BRAND_VEHICLE_FRENCH_DESCRIPTION = Target.the("Brand Tab Vehicle French Description")
            .locatedBy("//td[contains(@class,'brandDescription ')][contains(., '{0}')]/following-sibling::td//dd[contains(., 'French')]");

    public static final Target VEHICLE_EXPAND_FEATURE_TAB = Target.the("Vehicle Expand Feature Tab")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'title')][contains(., '{1}')]");

    public static final Target VEHICLE_FEATURE_CODE = Target.the("Vehicle Feature Code")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]");

    public static final Target VEHICLE_FEATURE_CODE_STATUS = Target.the("Vehicle Feature Code Status")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/preceding-sibling::td//div");

    public static final Target VEHICLE_FEATURE_CATEGORY = Target.the("Vehicle Feature Category")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/following-sibling::td//div[contains(@class,'{0}Description')]");

    public static final Target VEHICLE_FEATURE_NEW_ENGLISH_DESCRIPTION = Target.the("Vehicle Feature New English Description")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/following-sibling::td//div[contains(@class,'chromeDesc')]//dd[contains(., 'English')][1]");

    public static final Target VEHICLE_FEATURE_NEW_FRENCH_DESCRIPTION = Target.the("Vehicle Feature New French Description")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/following-sibling::td//div[contains(@class,'chromeDesc')]//dd[contains(., 'French')][1]");

    public static final Target VEHICLE_FEATURE_NEW_ENGLISH_CFD_DESCRIPTION = Target.the("Vehicle Feature New CFD English Description")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/following-sibling::td//div[contains(@class,'chromeDesc')]//dd[contains(., 'English')][2]");

    public static final Target VEHICLE_FEATURE_NEW_FRENCH_CFD_DESCRIPTION = Target.the("Vehicle Feature New CFD French Description")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/following-sibling::td//div[contains(@class,'chromeDesc')]//dd[contains(., 'French')][2]");

    public static final Target VEHICLE_FEATURE_ORIGINAL_ENGLISH_DESCRIPTION = Target.the("Vehicle Feature Original English Description")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/following-sibling::td//div[contains(@class,'originalDesc')]//dd[contains(., 'English')][1]");

    public static final Target VEHICLE_FEATURE_ORIGINAL_FRENCH_DESCRIPTION = Target.the("Vehicle Feature Original French Description")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/following-sibling::td//div[contains(@class,'originalDesc')]//dd[contains(., 'French')][1]");

    public static final Target VEHICLE_FEATURE_ORIGINAL_ENGLISH_CFD = Target.the("Vehicle Feature Original English CFD")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/following-sibling::td//div[contains(@class,'originalDesc')]//dd[contains(., 'English')][2]");

    public static final Target VEHICLE_FEATURE_ORIGINAL_FRENCH_CFD = Target.the("Vehicle Feature Original French CFD")
            .locatedBy("//div[@class='{0}DataGrid-bwrap']//div[contains(@class,'x-grid-group')][contains(., '{1}')]//div[contains(@class, 'body')]//div[contains(@class, '{0}Code')][contains(., '{2}')]/ancestor::td/following-sibling::td//div[contains(@class,'originalDesc')]//dd[contains(., 'French')][2]");

}
