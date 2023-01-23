package gm.dataviewer.questions;

import gm.dataviewer.pages.DVPublishPage;
import gm.dataviewer.pages.FeaturesTabPage;
import gm.dataviewer.pages.SearchTabPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class SearchTabQuestions {
    public static Question<String> title() {
        return TextQuestions.getText(FeaturesTabPage.FEATURE_PAGE_TITLE);
    }

    public static Question<Boolean> printButton() {
        return actor -> {
            WebElementFacade elementFacade = SearchTabPage.PRINT_BUTTON.resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<List<String>> languageDropdownValues() {
        return TextQuestions.textFromAllOccurrences(FeaturesTabPage.FEATURE_DROPDOWN_VALUES);
    }

    public static Question<List<String>> vehicleOptions() {
        return TextQuestions.textFromAllOccurrences(SearchTabPage.VEHICLE_OPTIONS);
    }

    public static Question<List<String>> featureTypelist() {
        return TextQuestions.textFromAllOccurrences(DVPublishPage.DROPDOWN_VALUES);
    }

    public static Question<String> featureList() {
        return TextQuestions.getText(DVPublishPage.FEATURE_TYPE_RESULTS_PAGE);
    }

    public static Question<List<String>> searchColumnNames() {
        return TextQuestions.textFromAllOccurrences(SearchTabPage.BY_FEATURES_COLUMN_NAMES);
    }

    public static Question<String> vehicleResults() {
        return TextQuestions.getText(SearchTabPage.BY_VEHICLE_RESULT_TEXT);
    }

    public static Question<String> specificVehicleResults(String vehicle) {
        return TextQuestions.getText(SearchTabPage.BY_VEHICLE_RESULT_SPECIFIC.of(vehicle));
    }
}

