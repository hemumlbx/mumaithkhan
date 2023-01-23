package gm.dataviewer.tasks;

import gm.dataviewer.helpers.FileHelper;
import gm.dataviewer.helpers.RemoteUtils;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public class VerifyPDF implements Question<Boolean> {
    private String reqTextInPDF;
    private String fileName;

    public VerifyPDF(String reqTextInPDF, String fileName) {
        this.fileName = fileName;
        this.reqTextInPDF = reqTextInPDF;
    }

    public static Question<Boolean> isContentPresent(String reqTextInPDF, String fileName) {
        return Instrumented.instanceOf(VerifyPDF.class).withProperties(reqTextInPDF, fileName);
    }

    public static String getDownloadPath() {
        String downloadPath = System.getProperty("user.home") + "/Downloads/";
        File dir = new File(downloadPath);
        return downloadPath;
    }

    public static String readPDFContent(String fileName) {

        PDFTextStripper pdfStripper = null;
        PDDocument pdDoc = null;
        COSDocument cosDoc = null;
        String parsedText = null;

        try {
            if (RemoteUtils.isRunningRemotely()) {
                try {
                    FileHelper.getDownloadedFileFromRemoteServer(fileName + ".pdf");
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String dir = getDownloadPath();
            File file = new File(dir + fileName + ".pdf");
            System.out.println("file absolute path is - " + file.getAbsolutePath());
            PDFParser parser = new PDFParser(new org.apache.pdfbox.io.RandomAccessFile(file, "r"));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(5);

            pdDoc = new PDDocument(cosDoc);
            parsedText = pdfStripper.getText(pdDoc);


            pdfStripper = null;
            pdDoc.close();
            cosDoc.close();
            parser = null;
            file.delete();

        } catch (MalformedURLException e2) {
            System.out.println("URL string could not be parsed " + e2.getMessage());
        } catch (IOException e) {
            System.out.println("Unable to open PDF Parser. " + e.getMessage());
            try {
                if (cosDoc != null)
                    cosDoc.close();
                if (pdDoc != null)
                    pdDoc.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }

        } finally {
            try {
                System.out.println("Inside Finally");
                if (cosDoc != null)
                    cosDoc.close();
                System.out.println("closing cosDoc");
                if (pdDoc != null)
                    pdDoc.close();
                System.out.println("closing pdDoc");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("+++++++++++++++++");
        System.out.println(parsedText);
        System.out.println("+++++++++++++++++");
        return parsedText;
    }

    public static boolean verifyPDFContent(String reqTextInPDF, String parsedText) {
        boolean flag = false;
        if (parsedText.contains(reqTextInPDF)) {
            flag = true;
        }

        return flag;
    }

    public static String getPathToDownloadFile(String fileName) {
        return getDownloadPath() + fileName + ".pdf";
    }

    public static void cleanupActiveDownloadedResources(String fileName) {
        try {
            Thread.sleep(3000);
            String dir = System.getProperty("user.home") + "/Downloads/";
            File file = new File(dir + fileName + "-0.pdf");
            System.out.println("Before delete - " + file.getAbsolutePath());
            FileUtils.forceDeleteOnExit(file);
            FileUtils.deleteQuietly(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cleanupDraftDownloadedResources(String fileName) {
        try {
            Thread.sleep(3000);
            String dir = System.getProperty("user.home") + "/Downloads/";
            File file = new File(dir + fileName + ".pdf");
            System.out.println("Before delete - " + file.getAbsolutePath());
            FileUtils.deleteQuietly(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return verifyPDFContent(reqTextInPDF, fileName);
    }
}