package gm.dataviewer.questions;

import gm.dataviewer.pages.DeltaTabPage;
import net.serenitybdd.screenplay.Question;

public class DeltaTabQuestions {

    public static Question<String> brandVehicleStatus(String vehicle) {
        return TextQuestions.getText(DeltaTabPage.DELTA_BRAND_VEHICLE_STATUS.of(vehicle));
    }

    public static Question<String> brandVehicleEnglishDescription(String vehicle) {
        return TextQuestions.getText(DeltaTabPage.DELTA_BRAND_VEHICLE_ENGLISH_DESCRIPTION.of(vehicle));
    }

    public static Question<String> brandVehicleFrenchDescription(String vehicle) {
        return TextQuestions.getText(DeltaTabPage.DELTA_BRAND_VEHICLE_FRENCH_DESCRIPTION.of(vehicle));
    }

    public static Question<String> featureVehicleStatus(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_CODE_STATUS.of(attribute, vehicle, featureCode));
    }

    public static Question<String> featureVehicleCategory(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_CATEGORY.of(attribute, vehicle, featureCode));
    }

    public static Question<String> featureVehicleOriginalEnglishDescription(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_ORIGINAL_ENGLISH_DESCRIPTION.of(attribute, vehicle, featureCode));
    }

    public static Question<String> featureVehicleOriginalEnglishCFD(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_ORIGINAL_ENGLISH_CFD.of(attribute, vehicle, featureCode));
    }

    public static Question<String> featureVehicleOriginalFrenchCFD(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_ORIGINAL_FRENCH_CFD.of(attribute, vehicle, featureCode));
    }

    public static Question<String> featureVehicleOriginalFrenchDescription(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_ORIGINAL_FRENCH_DESCRIPTION.of(attribute, vehicle, featureCode));
    }

    public static Question<String> featureVehicleNewEnglishDescription(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_NEW_ENGLISH_DESCRIPTION.of(attribute, vehicle, featureCode));
    }

    public static Question<String> featureVehicleNewEnglishCFD(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_NEW_ENGLISH_CFD_DESCRIPTION.of(attribute, vehicle, featureCode));
    }

    public static Question<String> featureVehicleNewFrenchDescription(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_NEW_FRENCH_DESCRIPTION.of(attribute, vehicle, featureCode));
    }

    public static Question<String> featureVehicleNewFrenchCFD(String attribute, String vehicle, String featureCode) {
        return TextQuestions.getText(DeltaTabPage.VEHICLE_FEATURE_NEW_FRENCH_CFD_DESCRIPTION.of(attribute, vehicle, featureCode));
    }
}
