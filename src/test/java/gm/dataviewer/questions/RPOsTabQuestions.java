package gm.dataviewer.questions;

import gm.dataviewer.pages.RPOsTabPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class RPOsTabQuestions {
    public static Question<String> theRPOsPageTitle() {
        return TextQuestions.getText(RPOsTabPage.RPOs_PAGE_TITLE);
    }

    public static Question<String> theRPOsLabel(String label) {
        return TextQuestions.getText(RPOsTabPage.RPOs_LABEL.of(label));
    }

    public static Question<String> theRPOsDropdownLabel(String label) {
        return TextQuestions.getText(RPOsTabPage.RPOs_DROPDOWN_LABEL.of(label));
    }

    public static Question<String> theRPOsTabText(String text) {
        return TextQuestions.getText(RPOsTabPage.RPOs_LAYOUT_TABS_TEXT.of(text));
    }

    public static Question<String> addRPOsHeaderText(String headerText) {
        return TextQuestions.getText(RPOsTabPage.RPO_HEADER_TEXT.of(headerText));
    }

    public static Question<String> addRPOsSpecificText(String year) {
        return TextQuestions.getText(RPOsTabPage.EDIT_RPO_SPECIFIC_TEXT_VALUES.of(year));
    }

    public static Question<String> addRPOsLabel(String addRPOLabel) {
        return TextQuestions.getText(RPOsTabPage.ADD_RPO_LABELS.of(addRPOLabel));
    }

    public static Question<String> editRPOPanelText() {
        return TextQuestions.getText(RPOsTabPage.EDIT_RPO_PANEL_TEXT);
    }

    public static Question<String> editRPOHistoryGridText(String text) {
        return TextQuestions.getText(RPOsTabPage.EDIT_RPO_HISTORY_GRID_TEXT.of(text));
    }

    public static Question<String> addRPOsPanelText() {
        return TextQuestions.getText(RPOsTabPage.ADD_RPO_PANEL_TEXT);
    }

    public static Question<String> theRPOsCategoryLabel() {
        return TextQuestions.getText(RPOsTabPage.RPOs_CATEGORY);
    }

    public static Question<String> theRPOsWarningText(String message) {
        return TextQuestions.getText(RPOsTabPage.RPO_ARCHIVE_WARNING_TEXT.of(message));
    }

    public static Question<String> theAddRPOsErrorMessage() {
        return TextQuestions.getText(RPOsTabPage.ADD_RPO_ERROR_HIDDEN_MESSAGE);
    }

    public static Question<String> theRPOsText(String name) {
        return TextQuestions.getText(RPOsTabPage.RPOs_TEXT.of(name));
    }

    public static Question<Boolean> theRPOsCheckerIcon() {
        return actor -> {
            WebElementFacade elementFacade = RPOsTabPage.RPOs_LAYOUT_CHECKER.resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<String> theDuplicateRPOErrorMessage() {
        return actor -> {
            WebDriver driver = getDriver();
            Alert alertDialog = driver.switchTo().alert();
            return alertDialog.getText();
        };
    }

    public static Question<Boolean> theRPOsWarningButton(String button) {
        return actor -> {
            WebElementFacade elementFacade = RPOsTabPage.RPO_ARCHIVE_WARNING_BUTTON.of(button).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theRPOsCloseIcon() {
        return actor -> {
            WebElementFacade elementFacade = RPOsTabPage.ADD_RPO_CLOSE_BUTTON.resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theRPOsButton(String button) {
        return actor -> {
            WebElementFacade elementFacade = RPOsTabPage.RPOs_BUTTON.of(button).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theRPOsAddButton(String button) {
        return actor -> {
            WebElementFacade elementFacade = RPOsTabPage.RPOs_BUTTON.of(button).resolveFor(actor);
            return elementFacade.isDisabled();
        };
    }

    public static Question<Boolean> theRPOsDropdownButton(String dropdownButton) {
        return actor -> {
            WebElementFacade elementFacade = RPOsTabPage.RPOs_DROPDOWN_BUTTON.of(dropdownButton).resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theRPOsEditCategory() {
        return actor -> {
            WebElementFacade elementFacade = RPOsTabPage.RPOs_EDIT_CATEGORY_ICON.resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<List<String>> trimRPOsValues(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            List<String> RPOs = webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
            return RPOs.stream().map(s -> s.substring(0, s.lastIndexOf('(')).trim()).collect(Collectors.toList());
        };
    }
}
