package gm.dataviewer.questions;


import gm.dataviewer.pages.BrandsTabPage;
import gm.dataviewer.pages.DVPublishPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.stream.Collectors;

public class BrandsTabQuestions {
    public static Question<String> theBrandsPageTitle() {
        return TextQuestions.getText(BrandsTabPage.BRAND_PAGE_TITLE);
    }

    public static Question<Boolean> theBrandsSearchButton() {
        return actor -> {
            WebElementFacade elementFacade = BrandsTabPage.BUTTON.of("Search").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theAddNewBrandNameButton() {
        return actor -> {
            WebElementFacade elementFacade = BrandsTabPage.BUTTON.of("Add New Brand Name").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<String> theBrandMmcLabel() {
        return TextQuestions.getText(BrandsTabPage.BRAND_LABEL_TEXT.of("modelmmc"));
    }

    public static Question<String> theRpoLabel() {
        return TextQuestions.getText(BrandsTabPage.BRAND_LABEL_TEXT.of("rpo"));
    }

    public static Question<String> theVehicleDetailLabel() {
        return TextQuestions.getText(BrandsTabPage.BRAND_LABEL_TEXT.of("vehicleDesc"));
    }

    public static Question<String> theIncentiveDescriptionLabel() {
        return TextQuestions.getText(BrandsTabPage.BRAND_LABEL_TEXT.of("incentiveDesc"));
    }

    public static Question<String> theOfferDescriptionLabel() {
        return TextQuestions.getText(BrandsTabPage.BRAND_LABEL_TEXT.of("offerDesc"));
    }

    public static Question<String> theStatusLabel() {
        return TextQuestions.getText(BrandsTabPage.BRAND_LABEL_TEXT.of("status"));
    }

    public static Question<String> theActionsLabel() {
        return TextQuestions.getText(BrandsTabPage.BRAND_LABEL_TEXT.of("8"));
    }

    public static Question<String> theAddBrandLanguageLabel() {
        return TextQuestions.getText(BrandsTabPage.ADD_BRAND_LABELS.of("Language"));
    }

    public static Question<String> theAddBrandModelYearLabel() {
        return TextQuestions.getText(BrandsTabPage.ADD_BRAND_LABELS.of("Model"));
    }

    public static Question<String> theAddBrandDivisionLabel() {
        return TextQuestions.getText(BrandsTabPage.ADD_BRAND_LABELS.of("Division"));
    }

    public static Question<String> theAddBrandChromeDescriptionLabel() {
        return TextQuestions.getText(BrandsTabPage.ADD_BRAND_LABELS.of("Chrome Description"));
    }

    public static Question<String> theAddBrandOfferDescriptionLabel() {
        return TextQuestions.getText(BrandsTabPage.ADD_BRAND_LABELS.of("Offer"));
    }

    public static Question<String> theAddBrandIncentiveDescriptionLabel() {
        return TextQuestions.getText(BrandsTabPage.ADD_BRAND_LABELS.of("Incentive"));
    }

    public static Question<String> theAddBrandChromeBrandNameLabel() {
        return TextQuestions.getText(BrandsTabPage.ADD_BRAND_LABELS.of("Chrome Brand"));
    }

    public static Question<String> theAddBrandAvailableTextHeader() {
        return TextQuestions.getText(BrandsTabPage.ADD_BRAND_HEADER_TEXT.of("Available"));
    }

    public static Question<String> vehicleShortDescription() {
        return TextQuestions.getText(DVPublishPage.VEHICLE_SHORT_DESCRIPTION);
    }

    public static Question<String> vehicleCurrentFVD() {
        return TextQuestions.getText(DVPublishPage.VEHICLE_CURRENT_FVD);
    }

    public static Question<String> vehicleBrandColumn() {
        return TextQuestions.getText(DVPublishPage.VEHICLE_BRAND_COLUMN);
    }

    public static Question<String> offerVehicleDescription() {
        return TextQuestions.getText(DVPublishPage.OFFER_VEHICLE_DESCRIPTION);
    }

    public static Question<String> theAddBrandSelectedTextHeader() {
        return TextQuestions.getText(BrandsTabPage.ADD_BRAND_HEADER_TEXT.of("Selected"));
    }

    public static Question<List<String>> dealListValues() {
        return TextQuestions.textFromAllOccurrences(BrandsTabPage.DEALS_LIST);
    }

    public static Question<List<String>> languageDropdownValues() {
        return TextQuestions.textFromAllOccurrences(BrandsTabPage.ADD_BRAND_DROPDOWN_VALUES);
    }

    public static Question<List<String>> addBrandYearDropdownValues() {
        return TextQuestions.textFromAllOccurrences(BrandsTabPage.ADD_BRAND_DROPDOWN_VALUES);
    }

    public static Question<Boolean> theAddBrandRightCursor() {
        return actor -> {
            WebElementFacade elementFacade = BrandsTabPage.ADD_BRAND_CURSOR_ICON.of("right2").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theAddBrandLeftCursor() {
        return actor -> {
            WebElementFacade elementFacade = BrandsTabPage.ADD_BRAND_CURSOR_ICON.of("left2").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theAddBrandCancelButton() {
        return actor -> {
            WebElementFacade elementFacade = BrandsTabPage.ADD_BRAND_BUTTON.of("Cancel").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<Boolean> theAddBrandAddButton() {
        return actor -> {
            WebElementFacade elementFacade = BrandsTabPage.ADD_BRAND_BUTTON.of("Add").resolveFor(actor);
            return elementFacade.isEnabled();
        };
    }

    public static Question<List<String>> trimMmcValues(Target target) {
        return actor -> {
            List<WebElementFacade> webElementFacades = target.resolveAllFor(actor);
            List<String> nameplate = webElementFacades.stream().map(WebElementFacade::getText).collect(Collectors.toList());
            return nameplate.stream().map(s -> s.substring(0, s.lastIndexOf('(')).trim()).collect(Collectors.toList());
        };

    }
}
