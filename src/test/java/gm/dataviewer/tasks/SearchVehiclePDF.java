package gm.dataviewer.tasks;

import gm.dataviewer.helpers.FileHelper;
import gm.dataviewer.helpers.RemoteUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class SearchVehiclePDF implements Task {

    private final String text;

    private SearchVehiclePDF(String text) {
        this.text = text;
    }

    static public SearchVehiclePDF searchPDF(String text) {
        return new SearchVehiclePDF(text);
    }

    @Step("{0} search using By Vehicle ")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                ClickOnSearchTab.printButton());
        try {
            Thread.sleep(5000);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ALT);
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_ALT);
            robot.keyRelease(KeyEvent.VK_S);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String[] expectedText = text.split(",");
        String parsedText = VerifyPDF.readPDFContent("vehicles");
        for (String text : expectedText) {
            theActorInTheSpotlight().should(eventually(
                    seeThat("verify downloaded pdf", VerifyPDF.isContentPresent(text, parsedText), is(true))
            ).waitingForNoLongerThan(05).seconds());
        }
        WaitforElement.certainTime();
        if (RemoteUtils.isRunningRemotely()) {
            FileHelper.deleteDownloadedFile("vehicles");
        }
        VerifyPDF.cleanupDraftDownloadedResources("vehicles");
    }
}
