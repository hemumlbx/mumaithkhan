package gm.dataviewer.questions;

import gm.dataviewer.pages.DeltaTabLayoutPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeltaTabLayoutQuestions {

    public static Question<String> theDeltaPageTitle() {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_PAGE_TITLE);
    }

    public static Question<String> theDeltaTabsTitle(String label) {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_TABS.of(label));
    }

    public static Question<String> theDeltaTabsVehicleLabel(String vehicleLabel) {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_TABS_VEHICLE_LABEL.of(vehicleLabel));
    }

    public static Question<String> theDeltaBrandsTabLabel(String brandsLabel) {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_BRANDS_TAB_LABEL.of(brandsLabel));
    }

    public static Question<String> theDeltaRPOsTabLabel(String rposLabel) {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_RPOs_TAB_LABEL.of(rposLabel));
    }

    public static Question<String> theDeltaFeaturesTabLabel(String featuresLabel) {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_FEATURES_TAB_LABEL.of(featuresLabel));
    }

    public static Question<String> theDeltaEditVehicleHeaderText(String text) {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_POPUP_HEADER.of(text));
    }

    public static Question<String> theDeltaEditVehicleLabels(String label) {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_EDIT_VEHICLE_LABEL.of(label));
    }

    public static Question<String> theDeltaSubListHeaderCodeText() {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_SUB_LIST_CODE_HEADER_TEXT);
    }

    public static Question<String> theDeltaSubListHeaderFVDText() {
        return TextQuestions.getText(DeltaTabLayoutPage.DELTA_SUB_LIST_FVD_HEADER_TEXT);
    }

    public static Question<String> theEditVehicleVehicleTextValue() {
        return TextQuestions.getText(DeltaTabLayoutPage.EDIT_VEHICLE_VEHICLE_VALUE);
    }

    public static Question<String> theFeaturesAcceptedValue() {
        return TextQuestions.getText(DeltaTabLayoutPage.FEATURES_ACCEPTED_COUNT);
    }

    public static Question<String> theRPOsAcceptedValue() {
        return TextQuestions.getText(DeltaTabLayoutPage.RPOs_ACCEPTED_COUNT);
    }

    public static Question<String> theRPOsCountText(String text) {
        return TextQuestions.getText(DeltaTabLayoutPage.RPOs_COUNT_TEXT.of(text));
    }

    public static Question<Boolean> theDeltaTabButton(String button) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_BRANDS_BUTTONS.of(button).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theDeltaButtons(String button) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_BUTTONS.of(button).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theDeltaBrandsExpanderButton(String button) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_BRANDS_EXPANDER_BUTTON.of(button).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theFeaturesTabButton(String button) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_FEATURES_BUTTONS.of(button).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theRPOsTabButton(String button) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_RPOs_BUTTONS.of(button).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theEditVehicleCloseButton() {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_EDIT_VEHICLE_CLOSE_BUTTON.resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theDeltaSpecificActionsIgnoreButton(String status, String division, String brand) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_BRANDS_SPECIFIC_ACTIONS_IGNORE_ICON.of(status, division, brand).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theDeltaSpecificActionsAcceptButton(String status, String division, String brand) {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_BRANDS_SPECIFIC_ACTIONS_ACCEPT_ICON.of(status, division, brand).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theDeltaIgnoreIcon() {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_BRANDS_IGNORE_ICON.resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theDeltaAcceptIcon() {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_BRANDS_ACCEPT_ICON.resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }


    public static Question<Boolean> theDeltaActionsEditIcon() {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.DELTA_BRANDS_ACTIONS_EDIT_BUTTON.of().resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }


    public static Question<Boolean> theRPOsAcceptActionsIcon() {
        return actor -> {
            WebElementFacade elementFacade = DeltaTabLayoutPage.RPOs_ACCEPT_ACTIONS_ICON.resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }


    public static Question<Boolean> theResultsCountMatchesTheCountOnThePage() {
        return actor -> {
            List<WebElementFacade> results = DeltaTabLayoutPage.DELTA_BRANDS_LIST.resolveAllFor(actor);
            int resultsCount = results.size();
            int countElement = Integer.parseInt(DeltaTabLayoutPage.DELTA_BRANDS_VEHICLE_COUNT.resolveFor(actor).getText());
            if (resultsCount == countElement) {
                return true;
            } else {
                return false;
            }
        };
    }

    public static Question<Boolean> theFeaturesIgnoredResultsMatchesTheCountOnThePage() {
        return actor -> {
            List<WebElementFacade> results = DeltaTabLayoutPage.DELTA_FEATURES_SUB_LIST.resolveAllFor(actor);
            int resultsCount = results.size();
            int countElement = Integer.parseInt(DeltaTabLayoutPage.FEATURES_IGNORED_COUNT.resolveFor(actor).getText());
            if (resultsCount == countElement) {
                return true;
            } else {
                return false;
            }
        };
    }

    public static Question<Boolean> theRPOsResultsMatchesTheCountOnThePage() {
        return actor -> {
            List<WebElementFacade> results = DeltaTabLayoutPage.DELTA_RPOs_SUB_LIST.resolveAllFor(actor);
            int resultsCount = results.size();
            int countElement = Integer.parseInt(DeltaTabLayoutPage.RPOs_COUNT_IGNORED_VALUE.resolveFor(actor).getText());
            if (resultsCount == countElement) {
                return true;
            } else {
                return false;
            }
        };
    }


    public static Question<List<String>> trimStatusValues(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            List<String> Delta = webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
            return Delta.stream().map(s -> s.substring(0, s.lastIndexOf('(')).trim()).collect(Collectors.toList());
        };
    }

    public static Question<List<String>> theDeltaSubListHeaderCodeValues(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            List<String> Delta = webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
            return new ArrayList<>(Delta);
        };
    }

    public static Question<List<String>> theDeltaSubListHeaderFVDValues(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            List<String> Delta = webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
            return new ArrayList<>(Delta);
        };
    }
}

