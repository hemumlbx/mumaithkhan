package gm.dataviewer.steps;

import gm.dataviewer.dataTableTypes.DataviewerSearchCategory;
import gm.dataviewer.pages.RPOsTabPage;
import gm.dataviewer.questions.RPOsTabQuestions;
import gm.dataviewer.questions.TextQuestions;
import gm.dataviewer.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static gm.dataviewer.pages.RPOsTabPage.*;
import static gm.dataviewer.questions.RPOsTabQuestions.*;
import static gm.dataviewer.tasks.GetPreviousAndCurrentYear.getPreviousYear;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class RPOsTabSteps {
    @When("^s?he navigates through (.*) Tab$")
    public void heNavigatesThroughRPOsTab(String RPOsTab) {
        theActorInTheSpotlight().remember("RPOsTab", RPOsTab);
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(RPOsTabPage.RPOs_PAGE_TAB.of(RPOsTab),
                isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo((ClickOnRPOsTabElement.theTabCalled(RPOsTab)),
                WaitUntil.the(RPOsTabPage.RPOs_PAGE_TITLE.of(RPOsTab), isVisible()).forNoMoreThan(5).seconds());
    }

    @Then("^s?he should verify the RPOs layout$")
    public void heShouldVerifyTheRPOsLayout() {
        String label = theActorInTheSpotlight().recall("RPOsTab");
        theActorInTheSpotlight().should(
                eventually(seeThat("RPOsPageTitle", theRPOsPageTitle(), equalToIgnoringCase(label))),
                eventually(seeThat("RPOsDropdownLabel", theRPOsDropdownLabel("Year"), containsString("Year" + ":"))),
                eventually(seeThat("RPOsDropdownLabel", theRPOsDropdownLabel("Division"), containsString("Division" + ":"))),
                eventually(seeThat("RPOsDropdownLabel", theRPOsDropdownLabel("Brand"), containsString("Brand" + ":"))),
                eventually(seeThat("RPOsDropdownLabel", theRPOsDropdownLabel("Category"), containsString("Category" + ":"))),
                eventually(seeThat("RPOsDropdownLabel", theRPOsDropdownLabel("Status"), containsString("Status" + ":"))),
                eventually(seeThat("RPOsPageLabel", theRPOsLabel("RPO"), containsString("RPO"))),
                eventually(seeThat("RPOsPageLabel", theRPOsLabel("Description"), containsString("Description"))),
                eventually(seeThat("RPOsPageLabel", theRPOsLabel("Chrome Description"), containsString("Chrome Description"))),
                eventually(seeThat("RPOsPageLabel", theRPOsLabel("Incentive Description"), containsString("Incentive Description"))),
                eventually(seeThat("RPOsPageLabel", theRPOsLabel("Offer Description"), containsString("Offer Description"))),
                eventually(seeThat("RPOsPageLabel", theRPOsLabel("Status"), containsString("Status"))),
                eventually(seeThat("RPOsPageLabel", theRPOsLabel("Action"), containsString("Action"))),
                eventually(seeThat("RPOsPageTabs", theRPOsTabText("Codes"), containsString("Codes"))),
                eventually(seeThat("RPOsPageTabs", theRPOsTabText("Categories"), containsString("Categories"))),
                eventually(seeThat("RPOsPageChecker", theRPOsCheckerIcon(), is(true))),
                eventually(seeThat("RPOsPageButton", theRPOsButton("Search"), is(true))),
                eventually(seeThat("RPOsPageButton", theRPOsButton("Add New RPO"), is(true))),
                eventually(seeThat("RPOsPageButton", theRPOsButton("Edit Selected"), is(true))),
                eventually(seeThat("RPOsPageDropdownButton", theRPOsDropdownButton("languageCode"), is(true))));
    }

    @When("^s?he selects Tab Categories")
    public void heSelectsTabCategories() {
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsCategoriesTab());
    }

    @Then("^s?he should verify the Categories Tab Layout using (.*)$")
    public void heShouldVerifyTheCategoriesLayout(String categories) {
        String[] categoryList = categories.split(",");
        theActorInTheSpotlight().should(
                eventually(seeThat("RPOsCategoriesLabel", theRPOsCategoryLabel(), containsString("Category"))),
                eventually(seeThat("RPOsCategoriesLabel", theRPOsLabel("Actions"), containsString("Actions"))),
                eventually(seeThat("RPOsCategoriesButton", theRPOsButton("Add New Category"), is(true))));
        eventually(seeThat("RPOsEditCategoryIcon", theRPOsEditCategory(), is(true)));
        for (String category : categoryList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_CATEGORY_LIST), hasItems(category.trim()))).waitingForNoLongerThan(05).seconds());
        }
    }

    @Then("^s?he should verify the list of dropdown values under RPOs tab$")
    public void heShouldVerifyTheListOfDropdownValues(DataviewerSearchCategory attributes) {
        String[] divisionList = attributes.division().split(",");
        String[] yearList = attributes.year().split(",");
        String[] brandList = attributes.brand().split(",");
        String[] categoryList = attributes.category().split(",");
        String[] statusList = attributes.status().split(",");
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("modelYearCode"));
        for (String years : yearList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES),
                    hasItems(years.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsSpecificYearDropdownValue(getPreviousYear()));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("division"));
        for (String divisions : divisionList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES),
                    hasItems(divisions.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsDivisionValue(divisionList[3]));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("modelUID"));
        for (String brands : brandList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES),
                    hasItems(brands.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsBrandValue(brandList[3]));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("categoryCode"));
        for (String categories : categoryList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES),
                    hasItems(categories.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsCategoryValue(categoryList[1]));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("status"));
        for (String state : statusList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES),
                    hasItems(state.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsStatusValue(statusList[0]));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsDropdownButton("languageCode"));
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES), hasItems("English"))
            ));
        }
    }

    @And("^s?he search for RPOs using following information$")
    public void heSearchForRPOsUsingInfo(DataviewerSearchCategory attributes) {
        theActorInTheSpotlight().attemptsTo(SearchCategoryType.searchCategory(attributes.year(), attributes.division(), attributes.brand(), attributes.category(), attributes.status()));
        theActorInTheSpotlight().remember("year", attributes.year());
        theActorInTheSpotlight().remember("division", attributes.division());
        theActorInTheSpotlight().remember("brand", attributes.brand());
        theActorInTheSpotlight().remember("category", attributes.category());
    }

    @Then("^s?he verifies the list of (.*) returned$")
    public void heVerifiesTheListOfRPOsReturned(String RPOs) {
        theActorInTheSpotlight().should(eventually(seeThat(RPOsTabQuestions.trimRPOsValues(RPOsTabPage.RPOs_RPOs_LIST.of(RPOs)),
                hasItems(RPOs))).waitingForNoLongerThan(05).seconds());
    }

    @Then("^s?he must see the list of (.*) returned$")
    public void heMustSeeTheListOfFeaturesReturned(String feature) {
        String[] featuresList = feature.split(",");
        String category = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsFeatureListValue(category));
        for (String features : featuresList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_SUB_LIST), hasItems(features.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().remember("feature", feature);
    }

    @When("^s?he clicks on Add New RPO$")
    public void heClicksOnAddNewRPO() {
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsButton("Add New RPO"));
    }

    @Then("^s?he should verify the Add New RPO Layout using the below dropdown values$")
    public void heShouldVerifyTheAddNewRPOLayoutUsingDropdownValues(DataviewerSearchCategory attributes) {
        String[] divisionList = attributes.division().split(",");
        String[] yearList = attributes.year().split(",");
        String[] brandList = attributes.brand().split(",");
        String[] categoryList = attributes.category().split(",");
        String country = theActorInTheSpotlight().recall("country");
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theAddRPODropdownButton("modelYearCode"));
        for (String years : yearList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES),
                    hasItems(years.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsSpecificYearDropdownValue(getPreviousYear()));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theAddRPODropdownButton("division"));
        for (String divisions : divisionList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES),
                    hasItems(divisions.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsDivisionValue(divisionList[0]));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theAddRPODropdownButton("modelUID"));
        for (String brands : brandList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES),
                    hasItems(brands.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsBrandValue(brandList[1]));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theAddRPODropdownButton("categoryCode"));
        for (String categories : categoryList) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES),
                    hasItems(categories.trim()))).waitingForNoLongerThan(05).seconds());
        }
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theRPOsCategoryValue(categoryList[1]));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theAddRPODropdownButton("languageCode"));
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES), hasItems("English"))
            ));
        }
        theActorInTheSpotlight().should(
                eventually(seeThat("Add RPO Label", addRPOsHeaderText("Add RPO"), containsString("Add RPO"))),
                eventually(seeThat("Language Label", addRPOsLabel("Language"), containsString("Language"))),
                eventually(seeThat("Model Year Label", addRPOsLabel("Model Year"), containsString("Model Year"))),
                eventually(seeThat("Division Label", addRPOsLabel("Division"), containsString("Division"))),
                eventually(seeThat("Chrome Brand Label", addRPOsLabel("Chrome Brand Name"), containsString("Chrome Brand Name"))),
                eventually(seeThat("Category Label", addRPOsLabel("Category"), containsString("Category"))),
                eventually(seeThat("RPO code Label", addRPOsLabel("RPO Code"), containsString("RPO Code"))),
                eventually(seeThat("Chrome Description Label", addRPOsLabel("Chrome Description"), containsString("Chrome Description"))),
                eventually(seeThat("Incentive Description Label", addRPOsLabel("Incentive Description"), containsString("Incentive Description"))),
                eventually(seeThat("Offer Description Label", addRPOsLabel("Offer Description"), containsString("Offer Description"))),
                eventually(seeThat("History Panel Text", addRPOsPanelText(), containsString("History"))),
                eventually(seeThat("Add RPO Add Button", theRPOsButton("Add"), is(true))),
                eventually(seeThat("Add RPO Cancel Button", theRPOsButton("Cancel"), is(true))),
                eventually(seeThat("Add RPO Close Icon", theRPOsCloseIcon(), is(true))));
    }

    @When("^s?he selects sub feature (.*) to Edit$")
    public void heSelectsASubFeatureToEdit(String value) {
        String SubFeatureType = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().remember("engine", value);
        theActorInTheSpotlight().attemptsTo(SelectRPOSubFeature.RPOSubFeatureToEdit(SubFeatureType, value));
    }

    @Then("^s?he verifies the Edit Selected Layout using (.*) and (.*) values$")
    public void heShouldVerifyTheEditSelectedLayout(String chromeDescriptionText, String chromeCFDText) {
        String country = theActorInTheSpotlight().recall("country");
        String year = theActorInTheSpotlight().recall("year");
        String division = theActorInTheSpotlight().recall("division");
        String brand = theActorInTheSpotlight().recall("brand");
        String category = theActorInTheSpotlight().recall("category");
        String featureValue = theActorInTheSpotlight().recall("engine");
        theActorInTheSpotlight().should(
                eventually(seeThat("RPOsEditFeatureLabel", addRPOsHeaderText("Edit RPO"), containsString("Edit RPO" + " " + featureValue + " - " + year + " " + division + " " + brand))),
                eventually(seeThat("Edit RPO Language Label", addRPOsLabel("Language"), containsString("Language" + ":"))),
                eventually(seeThat("Edit RPO Model Year Label", addRPOsLabel("Model Year"), containsString("Model Year" + ":"))),
                eventually(seeThat("Edit RPO Division Label", addRPOsLabel("Division"), containsString("Division" + ":"))),
                eventually(seeThat("Edit RPO Chrome Brand Label", addRPOsLabel("Chrome Brand Name"), containsString("Chrome Brand Name" + ":"))),
                eventually(seeThat("Edit RPO Category Label", addRPOsLabel("Category"), containsString("Category" + ":"))),
                eventually(seeThat("Edit RPO RPO Code Label", addRPOsLabel("RPO Code"), containsString("RPO Code" + ":"))),
                eventually(seeThat("Edit RPO Chrome Description Label", addRPOsLabel("Chrome Description"), containsString("Chrome Description" + ":"))),
                eventually(seeThat("Edit RPO Chrome CFD Label", addRPOsLabel("Chrome CFD"), containsString("Chrome CFD" + ":"))),
                eventually(seeThat("Edit RPO Incentive Description Label", addRPOsLabel("Incentive Description"), containsString("Incentive Description" + ":"))),
                eventually(seeThat("Edit RPO Offer Description Label", addRPOsLabel("Offer Description"), containsString("Offer Description" + ":"))));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theEditRPODropdownButton());
        if (country.equalsIgnoreCase("CA")) {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES), hasItems("English"))
            ));
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES), hasItems("Français"))
            ));
        } else {
            theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_DROPDOWN_VALUES), hasItems("English"))
            ));
        }
        theActorInTheSpotlight().should(
                eventually(seeThat("RPOsEditFeatureModelYear", addRPOsSpecificText(year), containsString(year))),
                eventually(seeThat("RPOsEditFeatureDivision", addRPOsSpecificText(division), containsString(division))),
                eventually(seeThat("RPOsEditFeatureChromeBrandName", addRPOsSpecificText(brand), containsString(brand))),
                eventually(seeThat("RPOsEditFeatureCategory", addRPOsSpecificText(category), containsString(category))),
                eventually(seeThat("RPOsEditFeatureRPOCode", addRPOsSpecificText(featureValue), containsString(featureValue))),
                eventually(seeThat("RPOsEditChromeDescription", theRPOsText("chromeDesc"), containsString(chromeDescriptionText))),
                eventually(seeThat("RPOsEditFeatureChromeCFD", theRPOsText("consumerFriendlyDesc"), containsString(chromeCFDText))),
                eventually(seeThat("RPOsEditPanelText", editRPOPanelText(), containsString("History"))),
                eventually(seeThat("RPOsEditHistoryGridText", editRPOHistoryGridText("Published"), containsString("Published Date"))),
                eventually(seeThat("RPOsEditHistoryGridText", editRPOHistoryGridText("User"), containsString("User"))),
                eventually(seeThat("RPOsEditSaveButton", theRPOsButton("Save"), is(true))),
                eventually(seeThat("RPOsEditPrintButton", theRPOsButton("Print"), is(true))),
                eventually(seeThat("RPOsEditCancelButton", theRPOsButton("Cancel"), is(true))),
                eventually(seeThat("Add RPO Close Icon", theRPOsCloseIcon(), is(true))));
    }

    @And("^s?he select sub feature (.*) to Edit$")
    public void heSelectSubFeatureToEdit(String value) {
        String FeatureType = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().remember("engine", value);
        theActorInTheSpotlight().attemptsTo(SelectRPOFeatureToEdit.RPOFeatureToEdit(FeatureType, value));
    }

    @When("^s?he selects sub feature (.*) to Archive$")
    public void heSelectsSubFeatureToArchive(String value) {
        String SubFeatureType = theActorInTheSpotlight().recall("category");
        theActorInTheSpotlight().attemptsTo(SelectRPOFeatureToArchive.RPOFeatureToArchive(SubFeatureType, value));
    }

    @Then("^s?he should verify the warning pop-up$")
    public void heShouldVerifyTheWarningPopUp() {
        theActorInTheSpotlight().should(
                eventually(seeThat("RPOsArchiveWarningMessage", addRPOsHeaderText("Warning"), containsString("Warning"))),
                eventually(seeThat("RPOsWarningText", theRPOsWarningText("This RPO"), containsString("This RPO may apply to multiple brands.\n" +
                        "Are you sure you want to archive this RPO?\n" +
                        "If the RPO is archived, it will no longer be available."))),
                eventually(seeThat("RPOsWarningYesButton", theRPOsWarningButton("Yes"), is(true))),
                eventually(seeThat("RPOsWarningNoButton", theRPOsWarningButton("No"), is(true))),
                eventually(seeThat("Add RPO Close Icon", theRPOsCloseIcon(), is(true))));
    }

    @Then("^s?he must verify the Error messages displayed$")
    public void heMustVerifyTheErrorMessagesDisplayed() {
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theAddRPODropdownButton("modelYearCode"));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theAddRPODropdownButton("divisionCode"));
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theAddRPODropdownButton("modelUID"));
        theActorInTheSpotlight().attemptsTo(MoveMouse.to(ADD_RPO_ERROR_ICON));
        theActorInTheSpotlight().should(eventually(
                seeThat(theAddRPOsErrorMessage(), equalToIgnoringCase("This field is required"))));
    }

    @And("^s?he clicks on EditSelected$")
    public void heClicksOnEditSelected() {
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsButton("Edit Selected"));
    }

    @Then("^s?he must verify the Error pop-up displayed$")
    public void heMustVerifyTheErrorPopupDisplayed() {
        theActorInTheSpotlight().should(
                eventually(seeThat("ErrorHeaderText", addRPOsHeaderText("Error"), containsString("Error"))),
                eventually(seeThat("ErrorMessage", theRPOsWarningText("No records"), containsString("No records have been selected."))),
                eventually(seeThat("OKButton", theRPOsWarningButton("OK"), is(true))),
                eventually(seeThat("CloseButton", theRPOsCloseIcon(), is(true))));
    }

    @Then("^s?he should verify the Add New Category layout$")
    public void heShouldVerifyTheAddNewCategoryLayout() {
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsButton("Add New Category"));
        theActorInTheSpotlight().should(
                eventually(seeThat("AddNewCategoryHeaderText", addRPOsHeaderText("Add Category"), containsString("Add Category"))),
                eventually(seeThat("AddNewCategoryLabel", addRPOsLabel("Category"), containsString("Category" + ":"))),
                eventually(seeThat("AddNewCategoryCancelButton", theRPOsButton("Cancel"), is(true))),
                eventually(seeThat("AddNewCategoryAddButton", theRPOsAddButton("Add"), is(false))));
    }

    @Then("^s?he must be able to Add a New Category named (.*) into categories$")
    public void heMustBeAbleToAddANewCategory(String value) {
        theActorInTheSpotlight().remember("value", value);
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsButton("Add New Category"));
        theActorInTheSpotlight().attemptsTo(EnterIntoAddNewCategory.categoryField(value));
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(ADD_CATEGORY_BUTTON.of("Add"), isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsAddCategoryButton("Add"));
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_CATEGORY_LIST), hasItems(value.trim()))).waitingForNoLongerThan(05).seconds());
    }

    @And("^s?he must be able to verify the Alert message (.*) If he repeats the previous step$")
    public void heMustBeAbleToVerifyTheErrorMessage(String message) {
        String value = theActorInTheSpotlight().recall("value");
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsButton("Add New Category"));
        theActorInTheSpotlight().attemptsTo(EnterIntoAddNewCategory.categoryField(value));
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(ADD_CATEGORY_BUTTON.of("Add"), isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsAddCategoryButton("Add"));
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().should(eventually(seeThat(theDuplicateRPOErrorMessage(), containsString(message))));
    }

    @And("^s?he selects category (.*) to Edit$")
    public void heSelectsCategoryNewToEdit(String Category) {
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.theCategoryTabList(Category));
        theActorInTheSpotlight().remember("category", Category);
    }

    @Then("^s?he must be able to rename New with (.*) in categories list$")
    public void heMustBeAbleToRenameCategory(String value) {
        theActorInTheSpotlight().remember("New-value", value);
        theActorInTheSpotlight().attemptsTo(EnterIntoAddNewCategory.categoryField(value));
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(EDIT_CATEGORY_BUTTON.of("Save"), isVisible()).forNoMoreThan(5).seconds());
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().attemptsTo(ClickOnRPOsTabElement.RPOsEditCategoryButton("Save"));
        theActorInTheSpotlight().attemptsTo(WaitforElement.certainTime());
        theActorInTheSpotlight().should(eventually(seeThat(TextQuestions.textFromAllOccurrences(RPOsTabPage.RPOs_CATEGORY_LIST), hasItems(value.trim()))).waitingForNoLongerThan(05).seconds());
    }
}

