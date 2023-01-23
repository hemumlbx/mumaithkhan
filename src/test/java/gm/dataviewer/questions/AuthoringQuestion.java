package gm.dataviewer.questions;

import gm.dataviewer.pages.AuthoringPage;
import gm.dataviewer.pages.CommonElements;
import net.serenitybdd.screenplay.Question;

public class AuthoringQuestion {

    public static Question<Boolean> offerExistsForName(String offerName) {
        return VisibilityQuestion.forElement(AuthoringPage.OFFER_ROW_BY_NAME.of(offerName));
    }

    public static Question<String> offerNumberValue() {
        return TextQuestions.getText(AuthoringPage.OFFER_NUMBER);
    }

}
