package gm.dataviewer.pages;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IncentivesTab extends PageObject {

    public static final Target PROGRAM = Target.the("Program TOD")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("#tableMiddle #topData td:nth-child({0})");

    public static final Target TOD_CHECKBOX = Target.the("Program TOD Checkbox")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//div[@class='x-grid3-cell-inner x-grid3-col-programId'][contains(.,'{0}')]/ancestor::tr/td[1]/div/span[3]");

    public static final Target TOD_CHECKBOX_TERM = Target.the("Program TOD Checkbox for Term")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//div[@class='x-grid3-cell-inner x-grid3-col-programId'][contains(.,'{0}')]/ancestor::tr/td[8]/div[contains(.,'{1}')]/ancestor::tr/td[1]/div/span[3]");

    public static final Target BOD_CHECKBOX_TD = Target.the("Program BOD Checkbox")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//div[(table/tbody/tr/td[4])[contains(.,'{0}')]]/table/tbody/tr[2]//tr[td[3][contains(., '{1}')]]/td[1]");

    public static final Target RESULT_NUMBER = Target.the("Number of Results")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//td[@class='td-pageSize']//input");

    public static final Target RESULT_NUMBER_DROPDOWN = Target.the("Number of Results Dropdown")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//td[@class='td-pageSize']//img");

    public static final Target DROPDOWN_OPTION = Target.the("Drop Down Option of {0}")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//div[contains(@class, 'x-combo-list-item') and contains(text(), '{0}')]");

}
