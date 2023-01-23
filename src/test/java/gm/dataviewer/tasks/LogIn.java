package gm.dataviewer.tasks;

import gm.dataviewer.pages.LoginForm;
import gm.dataviewer.utils.enums.DataViewerApplicationEnum;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.SystemEnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LogIn implements Task {
    final static EnvironmentSpecificConfiguration environmentVariables = EnvironmentSpecificConfiguration.from(SystemEnvironmentVariables.createEnvironmentVariables());

    private String username;
    private String password;
    boolean isUS;
    DataViewerApplicationEnum application;

    public LogIn(DataViewerApplicationEnum application) {
        this.application = application;
    }

    public static LogIn toApplication(DataViewerApplicationEnum application) {
        return instrumented(LogIn.class, application);
    }

    public LogIn asJohn() {
        this.username = application == DataViewerApplicationEnum.DATA_VIEWER || application == DataViewerApplicationEnum.OFFER_AUTHORING || application == DataViewerApplicationEnum.DEALER_SUMMARY || application == DataViewerApplicationEnum.PROGRAM_SUMMARY ?
                environmentVariables.getProperty("johnUsername") :
                environmentVariables.getProperty("johnUsernameAuthoring");
        this.password = environmentVariables.getProperty("password");
        return this;
    }

    public LogIn asJane() {
        this.username = environmentVariables.getProperty("janeUsername");
        this.password = environmentVariables.getProperty("password");
        return this;
    }

    public LogIn forTheCountry(String country) {
        this.isUS = "US".equals(country);
        return this;
    }

    @Step("{0} logs into application")
    public <T extends Actor> void performAs(T actor) {
        getDriver().close();
        String url;
        switch (application) {
            case DATA_VIEWER:
                url = isUS ?
                        environmentVariables.getProperty("webdriver.base.dataviewer.us") :
                        environmentVariables.getProperty("webdriver.base.dataviewer.ca");
                break;
            case OFFER_AUTHORING:
                url = isUS ?
                        environmentVariables.getProperty("webdriver.base.offer.authoring.us") :
                        environmentVariables.getProperty("webdriver.base.offer.authoring.ca");
                break;

            case INCENTIVE_AUTHORING:
                url = isUS ?
                        environmentVariables.getProperty("webdriver.base.incentive.authoring.us") :
                        environmentVariables.getProperty("webdriver.base.incentive.authoring.ca");
                break;
            case DEALER_SUMMARY:
                url = isUS ?
                        environmentVariables.getProperty("webdriver.base.dealer.summary.us") :
                        environmentVariables.getProperty("webdriver.base.dealer.summary.ca");
                break;
            case PROGRAM_SUMMARY:
                url = isUS ?
                        environmentVariables.getProperty("webdriver.base.program.summary.us") :
                        environmentVariables.getProperty("webdriver.base.program.summary.ca");
                break;
            case PROGRAM_SEARCH_UI:
                url = isUS ?
                        environmentVariables.getProperty("webdriver.base.search.ui.us") :
                        environmentVariables.getProperty("webdriver.base.search.ui.ca");
                break;

            default:
                throw new RuntimeException("url not initialized");
        }
        actor.attemptsTo(
                Open.url(url),
                Enter.theValue(username).into(LoginForm.USERNAME_BOX),
                Enter.theValue(password).into(LoginForm.PASSWORD_BOX),
                Click.on(LoginForm.SUBMIT_BOX)
        );
    }
}
