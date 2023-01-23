package gm.dataviewer.questions;

import gm.dataviewer.pages.NameplateTabPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.stream.Collectors;

public class NameplateTabQuestions {

    public static Question<String> thePageTitle() {
        return TextQuestions.getText(NameplateTabPage.PAGE_TITLE);
    }

    public static Question<String> thePageLabel() {
        return TextQuestions.getText(NameplateTabPage.PAGE_LABEL);
    }
    public static Question<Boolean> theSearchPageButton() {
        return actor -> {
            WebElementFacade elementFacade = NameplateTabPage.BUTTON.of("Search").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }
    public static Question<Boolean> theNewNameplateButton() {
        return actor -> {
            WebElementFacade elementFacade = NameplateTabPage.BUTTON.of("Add New Nameplate").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }
    public static Question<Boolean> theAddButton() {
        return actor -> {
            WebElementFacade elementFacade = NameplateTabPage.BUTTON.of("Add").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }
    public static Question<Boolean> theCancelButton() {
        return actor -> {
            WebElementFacade elementFacade = NameplateTabPage.BUTTON.of("Cancel").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }
    public static Question<Boolean> theRightCursor() {
        return actor -> {
            WebElementFacade elementFacade = NameplateTabPage.CURSOR_BUTTON.of("right2").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }
    public static Question<Boolean> theLeftCursor() {
        return actor -> {
            WebElementFacade elementFacade = NameplateTabPage.CURSOR_BUTTON.of("left2").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }
    public static Question<String> theLanguageLabel() {
        return TextQuestions.getText(NameplateTabPage.ADD_NAMEPLATE_LABEL.of("availableLanguages"));
    }
    public static Question<String> theNameplateLabel() {
        return TextQuestions.getText(NameplateTabPage.ADD_NAMEPLATE_LABEL.of("nameplateDescription"));
    }
    public static Question<String> theYearLabel() {
        return TextQuestions.getText(NameplateTabPage.ADD_NAMEPLATE_LABEL.of("Year"));
    }
    public static Question<String> theDivisionLabel() {
        return TextQuestions.getText(NameplateTabPage.ADD_NAMEPLATE_LABEL.of("division"));
    }
    public static Question<String> theAvailableText() {
        return TextQuestions.getText(NameplateTabPage.ADD_NAMEPLATE_TEXT.of("Available"));
    }
    public static Question<String> theSelectedText() {
        return TextQuestions.getText(NameplateTabPage.ADD_NAMEPLATE_TEXT.of("Selected"));
    }
    public static Question<String> theNameplateErrorMessage() {
        return TextQuestions.getText(NameplateTabPage.VISIBLE_ERROR_MESSAGE);
    }
    public static Question<String> theSelectedErrorMessage() {
        return TextQuestions.getText(NameplateTabPage.VISIBLE_ERROR_MESSAGE);
    }
    public static Question<List<String>> trimBrandValues(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            List<String> brands = webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
            return brands.stream().map(s -> s.substring(0, s.lastIndexOf('(')).trim()).collect(Collectors.toList());
        };
    }
    public static Question<List<String>> yearDropdownValues() {
        return TextQuestions.textFromAllOccurrences(NameplateTabPage.DROPDOWN_VALUES);
    }
    public static Question<List<String>> modelListValues() {
        return TextQuestions.textFromAllOccurrences(NameplateTabPage.MODELS_LIST.of("Chevrolet Equinox"));
    }
}
