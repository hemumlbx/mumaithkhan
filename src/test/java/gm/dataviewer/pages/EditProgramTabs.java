package gm.dataviewer.pages;

import net.serenitybdd.screenplay.targets.Target;

public class EditProgramTabs {

    public static final Target TAB = Target.the("Tab")
            .locatedBy("//ul/li[text()='{0}']");

}
