package domain;

import io.restassured.response.Response;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.hamcrest.Matchers;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class ErrorHandler implements Task {
    private String error;
    
    public ErrorHandler(String error) {
        this.error = error;
    }
    
    public static Performable because(String error) {
        return Instrumented.instanceOf(ErrorHandler.class).withProperties(error);
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        Response response = lastResponse();
        actor.should(
                seeThatResponse("Expected no Error Message",
                        res -> response.then().assertThat().body("ErrorMessagesType.errorMessageList.errorMsg", Matchers.isEmptyOrNullString()))
        );
    }
}
