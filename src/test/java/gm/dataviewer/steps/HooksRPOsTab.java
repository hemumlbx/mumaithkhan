package gm.dataviewer.steps;

import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.tasks.ClickOnRPOsTabElement;
import gm.dataviewer.tasks.EnterIntoAddNewCategory;
import gm.dataviewer.tasks.WaitforElement;
import io.cucumber.java.After;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static gm.dataviewer.pages.RPOsTabPage.EDIT_CATEGORY_BUTTON;
import static gm.dataviewer.pages.RPOsTabPage.RPOs_CATEGORY_LIST;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.hasItems;

public class HooksRPOsTab {

    @After("@resetCategoryFields")
    public void resetCategoryFields() {
        String categoryType = theActorInTheSpotlight().recall("category");
        String NewValue = theActorInTheSpotlight().recall("New-value");
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theCategoryTabList(NewValue));
        theActorInTheSpotlight().attemptsTo(EnterIntoAddNewCategory.categoryField(categoryType));
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(EDIT_CATEGORY_BUTTON.of("Save"), isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsEditCategoryButton("Save"));
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(RPOs_CATEGORY_LIST, isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOs_CATEGORY_LIST), hasItems(categoryType.trim()))).waitingForNoLongerThan(05).seconds());
    }
}
