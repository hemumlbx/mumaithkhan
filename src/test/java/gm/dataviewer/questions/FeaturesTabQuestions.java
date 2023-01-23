package gm.dataviewer.questions;

import gm.dataviewer.pages.FeaturesTabPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

public class FeaturesTabQuestions {
        public static Question<String> theFeaturesPageTitle() {
            return TextQuestions.getText(FeaturesTabPage.FEATURE_PAGE_TITLE);
        }
        public static Question<String> theFeaturesLabel(String label) {
        return TextQuestions.getText(FeaturesTabPage.FEATURE_DROPDOWN_LABEL.of(label));
        }
        public static Question<String> theFeaturesFeatureLabel(String featureLabel) {
            return TextQuestions.getText(FeaturesTabPage.FEATURE_LABEL.of(featureLabel));
        }
        public static Question<String> theFeaturesEditSelectedLabel(String message) {
        return TextQuestions.getText(FeaturesTabPage.EDIT_SELECTED_HEADER.of(message));
        }
        public static Question<String> theEditFeatureLanguageLabel(String text) {
        return TextQuestions.getText(FeaturesTabPage.EDIT_FEATURE_LABELS.of(text));
        }
        public static Question<String> theEditFeaturePanelHeaderTextLabel() {
        return TextQuestions.getText(FeaturesTabPage.EDIT_FEATURE_PANEL_HEADER_TEXT);
        }
        public static Question<String> theEditSelectedText() {
        return TextQuestions.getText(FeaturesTabPage.EDIT_SELECTED_TEXT);
        }
        public static Question<String> theEditFeatureHistoryText(String text) {
        return TextQuestions.getText(FeaturesTabPage.EDIT_FEATURE_HISTORY_GRID_TEXT.of(text));
        }
        public static Question<String> theEditSelectedWarningText() {
        return TextQuestions.getText(FeaturesTabPage.EDIT_SELECTED_WARNING_TEXT_MESSAGE);
        }

        public static Question<Boolean> theFeaturesButton(String featureButton) {
            return actor -> {
                WebElementFacade elementFacade = FeaturesTabPage.FEATURE_BUTTON.of(featureButton).resolveFor(actor);
                return elementFacade.isEnabled();
            };
        }
        public static Question<Boolean> theEditSelectedButton(String button) {
            return actor -> {
                WebElementFacade elementFacade = FeaturesTabPage.EDIT_SELECTED_BUTTON.of(button).resolveFor(actor);
            return elementFacade.isEnabled();
            };
        }
    public static Question<Boolean> theEditSelectedCloseButton() {
        return actor -> {
            WebElementFacade elementFacade = FeaturesTabPage.EDIT_SELECTED_CLOSE_BUTTON.resolveFor(actor);
            return elementFacade.isEnabled();
            };
        }

    public static Question<Boolean> theEditSelectedArchiveButton(String button) {
        return actor -> {
            WebElementFacade elementFacade = FeaturesTabPage.EDIT_SELECTED_ARCHIVE_BUTTON.of(button).resolveFor(actor);
            return elementFacade.isEnabled();
            };
        }
        public static Question<Boolean> theFeaturesCheckBox() {
            return actor -> {
                WebElementFacade elementFacade = FeaturesTabPage.FEATURE_CHECK_BOX.resolveFor(actor);
                return elementFacade.isEnabled();
             };
         }
    public static Question<Boolean> theEditFeatureToggleArrowButton() {
        return actor -> {
            WebElementFacade elementFacade = FeaturesTabPage.EDIT_FEATURE_TOGGLE_ARROW.resolveFor(actor);
            return elementFacade.isEnabled();
            };
        }
    public static Question<List<String>> trimFeaturesValues(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            List<String> features = webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
            return features.stream().map(s -> s.substring(0, s.lastIndexOf('(')).trim()).collect(Collectors.toList());
            };
        }
   }

