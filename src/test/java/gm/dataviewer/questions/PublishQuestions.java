package gm.dataviewer.questions;

import gm.dataviewer.pages.*;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

import static gm.dataviewer.pages.ProgramSearchPage.ALL_PROGRAM_ROWS;

public class PublishQuestions {

    public static Question<String> warningOverlayText() {
        return TextQuestions.getText(DVPublishPage.FEATURE_VEHICLE_WARNING_OVERLAY);
    }

    public static Question<String> incentiveDescriptionText(String feature, String vehicle) {
        return TextQuestions.getText(DVPublishPage.INCENTIVE_DESCRIPTION_LANDING_PAGE.of(feature, vehicle));
    }

    public static Question<String> offerDescriptionText(String feature, String vehicle) {
        return TextQuestions.getText(DVPublishPage.OFFER_DESCRIPTION_LANDING_PAGE.of(feature, vehicle));
    }

    public static Question<String> modifiedNameplate(String nameplate) {
        return TextQuestions.getText(DVPublishPage.NAMEPLATE_DESCRIPTION.of(nameplate));
    }

    public static Question<String> featureIncentiveDescription(String featureType) {
        return TextQuestions.getText(DVPublishPage.FEATURE_INCENTIVE_DESC_TEXT.of(featureType));
    }

    public static Question<List<String>> featureTypeValue() {
        return TextQuestions.textFromAllOccurrences(DVPublishPage.CATEGORY_DESCRIPTION);
    }

    public static Question<List<String>> rpoValues() {
        return TextQuestions.textFromAllOccurrences(DVPublishPage.RPO_CATEGORY_DESCRIPTION);
    }

    public static Question<String> featureOfferDescription(String featureType) {
        return TextQuestions.getText(DVPublishPage.FEATURE_OFFER_DESC_TEXT.of(featureType));
    }

    public static Question<String> chromeDescription(String featureType) {
        return TextQuestions.getText(DVPublishPage.FEATURE_CHROME_DESC_TEXT.of(featureType));
    }

    public static Question<List<String>> categoryText() {
        return TextQuestions.textFromAllOccurrences(DVPublishPage.RPO_CATEGORY);
    }

    public static Question<List<String>> list() {
        return TextQuestions.textFromAllOccurrencesTrim(DVPublishPage.NAMEPLATE_GRID_RESULTS);
    }

    public static Question<String> offerNumberValue() {
        return TextQuestions.getText(AuthoringPage.OFFER_NUMBER);
    }

    public static Question<List<String>> programsAreReturnedRegardlessOfRevisions() {
        return actor -> {
            List<String> programList = Text.of(ALL_PROGRAM_ROWS).viewedBy(actor).resolveAll();
            List<String> toReturn = new ArrayList<>();
            for (String program : programList) {
                toReturn.add(program.substring(0, program.length() - 4));
            }
            return toReturn;
        };
    }

    public static Question<String> programsUnderHeader(String header, String program) {
        return TextQuestions.getText(DealerSummaryPage.PROGRAM_UNDER_SPECIFIC_HEADER.of(header, program));
    }
}
