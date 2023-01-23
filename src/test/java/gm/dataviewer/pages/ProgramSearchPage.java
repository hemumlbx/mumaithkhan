package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProgramSearchPage extends PageObject {
    public static final Target DETAILED_SEARCH = Target.the("detailed search")
            .locatedBy("#rdoDetailedSearch");

    public static final Target RESET = Target.the("Reset Button")
            .locatedBy("#btnReset");

    public static final Target MODEL_YEAR = Target.the("Vehicle Model Year")
            .locatedBy("//*[@id='pnl-detailedSearch']/table[2]/tbody/tr[6]/td[2]/div[1]//span[text()='{0}']/ancestor::div[1]/input");

    public static final Target VEHICLE_OPTION = Target.the("Vehicle Option")
            .locatedBy("//*[@id='pnl-detailedSearch']/table[2]/tbody/tr[6]/td[2]/div[3]//span[text()='{0}']/ancestor::div[1]/input");

    public static final Target SUBMIT = Target.the("Submit Button")
            .locatedBy("#btnSubmit");

    public static final Target VEHICLE_DIVISION_DROPDOWN = Target.the("Vehicle Division Dropdown")
            .locatedBy("#pnl-detailedSearch > table:nth-child(3) > tbody > tr:nth-child(6) > td:nth-child(2) > div:nth-child(2) > div > img");

    public static final Target SELECTION_TARGET = Target.the("Selection Target")
            .locatedBy("//div[@class='x-layer x-combo-list ']//div//div[text()='{0}']/ancestor::div[1]/div[text()='{1}']");

    public static final Target ALL_PROGRAM_ROWS = Target.the("All Program Rows")
            .locatedBy(".x-grid3-cell-inner.x-grid3-col-number");
}
