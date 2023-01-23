package gm.dataviewer.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VehiclesTab extends PageObject {

    public static final Target SELECT_VEHICLE_BUTTON = inIFrame("Select Vehicle Button",
            "//span[@id='selectvehicle-btn-wrapper']//button[not(@disabled)]");

    private static Target inIFrame(String name, String location) {
        return Target.the(name).inIFrame(IFrame.withPath(By.cssSelector("iframe"))).locatedBy(location);
    }

    private static Target inOverlayIFrame(String name, String location) {
        return Target.the(name).inIFrame(IFrame.withPath(By.xpath("//div[@class='x-window-bwrap']//iframe"))).locatedBy(location);
    }
}
