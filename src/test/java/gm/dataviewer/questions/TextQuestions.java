package gm.dataviewer.questions;

import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.pages.DeltaTabPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.stream.Collectors;

public class TextQuestions {
    public static Question<String> getAttribute(Target text, String attribute) {
        return actor -> {
            WebElementFacade elementFacade = text.resolveFor(actor);
            return elementFacade.getAttribute(attribute);
        };
    }

    public static Question<List<String>> defaultTextFromAllOccurrences(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            return webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
        };
    }

    public static Question<String> getDefaultValue(Target defaultText) {
        return actor -> {
            WebElementFacade elementFacade = defaultText.resolveFor(actor);
            return elementFacade.getValue();
        };
    }

    public static Question<String> getCSS(Target text, String attribute) {
        return actor -> {
            WebElementFacade elementFacade = text.resolveFor(actor);
            return elementFacade.getCssValue(attribute);
        };
    }

    public static Question<List<String>> valueFromAllOccurrences(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            return webElementFacades.stream().map(WebElementFacade::getValue).collect(Collectors.toList());
        };
    }

    public static Question<List<String>> textFromAllOccurrences(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            return webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
        };
    }

    public static Question<List<String>> textFromAllOccurrencesTrim(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            List<String> brands =  webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
            return brands.stream().map(s -> s.substring(0, s.lastIndexOf('(')).trim()).collect(Collectors.toList());
        };
    }

    public static Question<String> getText(Target defaultText) {
        return actor -> {
            WebElementFacade elementFacade = defaultText.resolveFor(actor);
            return elementFacade.getText();
        };
    }

    public static Question<String> getValue(Target inputField) {
        return actor -> {
            WebElementFacade elementFacade = inputField.resolveFor(actor);
            return elementFacade.getValue();
        };
    }

    public static Question<Boolean> checkEnglishOriginalCFDexists(String attribute, String vehicle, String featureCode) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabPage.VEHICLE_FEATURE_ORIGINAL_ENGLISH_CFD.of(attribute, vehicle, featureCode).resolveFor(actor);
            return elementFacade.isPresent();
        };
    }

    public static Question<Boolean> checkFrenchOriginalCFDexists(String attribute, String vehicle, String featureCode) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabPage.VEHICLE_FEATURE_ORIGINAL_FRENCH_CFD.of(attribute, vehicle, featureCode).resolveFor(actor);
            return elementFacade.isPresent();
        };
    }

    public static Question<Boolean> checkEnglishNewCFDexists(String attribute, String vehicle, String featureCode) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabPage.VEHICLE_FEATURE_NEW_ENGLISH_CFD_DESCRIPTION.of(attribute, vehicle, featureCode).resolveFor(actor);
            return elementFacade.isPresent();
        };
    }

    public static Question<Boolean> checkFrenchNewCFDexists(String attribute, String vehicle, String featureCode) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabPage.VEHICLE_FEATURE_NEW_FRENCH_CFD_DESCRIPTION.of(attribute, vehicle, featureCode).resolveFor(actor);
            return elementFacade.isPresent();
        };
    }

    public static Question<Boolean> checkVehicleExists(String vehicle) {
        return actor -> {
            WebElementFacade elementFacade = DVPublishPage.SELECTED_VEHICLES.of(vehicle).resolveFor(actor);
            return elementFacade.isPresent();
        };
    }

    public static Question<Boolean> checkVehicleExistsUnderPublishQueue(String vehicle) {
        return actor -> {
            WebElementFacade elementFacade = DVPublishPage.FEATURE_TYPE_RESULTS_PAGE_VEHICLE.of(vehicle).resolveFor(actor);
            return elementFacade.isPresent();
        };
    }

    public static Question<Boolean> checkVehicleAttributeExistsAuthoring(String attribute) {
        return actor -> {
            WebElementFacade elementFacade = DVPublishPage.CHECKBOX.of(attribute).resolveFor(actor);
            return elementFacade.isPresent();
        };
    }

    public static Question<Boolean> checkProgramExists(String programNumber) {
        return actor -> {
            WebElementFacade elementFacade = DVPublishPage.PROGRAM_ROW_BY_NUMBER.of(programNumber).resolveFor(actor);
            return elementFacade.isPresent();
        };
    }
}

