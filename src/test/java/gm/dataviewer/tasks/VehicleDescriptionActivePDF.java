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

public class VehicleDescriptionActivePDF implements Task {

    private final String brand;
    private final String nameplate;
    private final String description;
    private final String programNumber;
    private final String fileName;
    private final String attributeType;

    private VehicleDescriptionActivePDF(String brand, String nameplate, String description, String programNumber, String fileName, String attributeType) {
        this.brand = brand;
        this.nameplate = nameplate;
        this.description = description;
        this.programNumber = programNumber;
        this.fileName = fileName;
        this.attributeType = attributeType;
    }

    static public VehicleDescriptionActivePDF activePDFDescription(String brand, String nameplate, String description, String programNumber, String fileName, String attributeType) {
        return new VehicleDescriptionActivePDF(brand, nameplate, description, programNumber, fileName, attributeType);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.activeTab(),
                ClickOn.programLink(programNumber));
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
        String parsedText = VerifyPDF.readPDFContent(fileName);
        if (!brand.equalsIgnoreCase("null")) {
            if (attributeType.equalsIgnoreCase("Vehicle Feature Codes")) {
                theActorInTheSpotlight().should(eventually(
                        seeThat("verify downloaded pdf", VerifyPDF.isContentPresent(brand + " " + description, parsedText), is(true))
                ).waitingForNoLongerThan(05).seconds());
            } else {
                theActorInTheSpotlight().should(eventually(
                        seeThat("verify downloaded pdf", VerifyPDF.isContentPresent(brand + " " + "w/" + description, parsedText), is(true))
                ).waitingForNoLongerThan(05).seconds());
            }
        } else {
            theActorInTheSpotlight().should(eventually(
                    seeThat("verify downloaded pdf", VerifyPDF.isContentPresent(nameplate, parsedText), is(true))
            ).waitingForNoLongerThan(05).seconds());
        }
        WaitforElement.certainTime();
        if (RemoteUtils.isRunningRemotely()) {
            FileHelper.deleteDownloadedFile(fileName + ".pdf");
        }
        VerifyPDF.cleanupDraftDownloadedResources(fileName);
    }
}
