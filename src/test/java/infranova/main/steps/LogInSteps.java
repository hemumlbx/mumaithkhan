package infranova.main.steps;

import infranova.main.utils.enums.DataViewerApplicationEnum;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogInSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^he opens a url (.*)$")
    public void heOpensAURL(String url) {
        theActorCalled(name).attemptsTo(
                "John".equals(name) ?
                        LogIn.toApplication(application).asJohn().forTheCountry(country) :
                        LogIn.toApplication(application).asJane().forTheCountry(country)
        );
        theActorInTheSpotlight().remember("country", country);
    }


}
