package gm.dataviewer.tasks;

import gm.dataviewer.helpers.FileHelper;
import gm.dataviewer.helpers.RemoteUtils;
import gm.dataviewer.questions.AuthoringQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class OfferAuthoringActivePDF implements Task {

    private final String brand;
    private final String nameplate;
    private final String description;
    private final String offerName;
    private String fileName;
    private final String attributeType;

    private OfferAuthoringActivePDF(String brand, String nameplate, String description, String offerName, String fileName, String attributeType) {
        this.brand = brand;
        this.nameplate = nameplate;
        this.description = description;
        this.offerName = offerName;
        this.fileName = fileName;
        this.attributeType = attributeType;
    }

    static public OfferAuthoringActivePDF activePDFDescription(String brand, String nameplate, String description, String offerName, String fileName, String attributeType) {
        return new OfferAuthoringActivePDF(brand, nameplate, description, offerName, fileName, attributeType);
    }

    @Step("{0} search using vehicle year and division")
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().attemptsTo(
                ClickOn.activeTab(),
                ClickOn.offerLink(offerName));
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
        String offerNumber = theActorInTheSpotlight().recall("Offer Number");
        fileName = offerNumber + "-0";
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
