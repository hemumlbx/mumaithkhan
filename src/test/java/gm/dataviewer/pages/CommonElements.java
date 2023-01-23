package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CommonElements extends PageObject {

    public static final Target IFRAME_BUTTON = Target.the("Iframe {0} Button")
            .inIFrame(IFrame.withPath(By.cssSelector("iframe")))
            .locatedBy("//button/span[text()='{0}']");

    public static final Target OVERLAY_BUTTON = Target.the("Overlay {0} Button")
            .inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe")))
            .locatedBy("//button/span[text()='{0}']");

    public static final Target CONFIRM_BUTTON = Target.the("Confirm Button")
            .locatedBy("(//div[contains(@class,'x-window-bwrap')]//button/span[text()='{0}'])[last()]");

    public static final Target TAB_BUTTON = Target.the("{0} Button")
            .locatedBy("//div[contains(@class,'x-window x-window-plain x-window-dlg')]//button/span[text()='{0}']");

    public static final Target CLOSE_OVERLAY = Target.the("Close Overlay Button")
            .locatedBy("//div[contains(@class,'x-resizable-pinned')]//div[@class='x-tool x-tool-close']");

    public static final Target HELP_OVERLAY = Target.the("Help Overlay Button")
            .locatedBy("//div[contains(@class,'x-resizable-pinned')]//div[@class='help']");

    public static final Target ACTION_BUTTON_OVERLAY = Target.the("Overlay {0} Button")
            .locatedBy("//div[contains(@class,'x-resizable-pinned')]//button/span[text()='{0}']");

    public static final Target CHECKBOX = Target.the("CheckBox")
            .locatedBy("//input[@type='checkbox']");

    public static final Target ACTION_BUTTON = Target.the("{0} Button")
            .locatedBy("//div[contains(@class,'x-plain-noborder')]//button/span[text()='{0}']");

    public static final Target OVERLAY = Target.the("Overlay")
            .locatedBy("//div[@class='x-window-bwrap']//iframe");
}
