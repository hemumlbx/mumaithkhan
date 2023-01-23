package gm.dataviewer.tasks;

import gm.dataviewer.model.AuthorizedUser;
import gm.dataviewer.model.BuildRequestObject;
import gm.dataviewer.model.ModelEndPoints;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class MakeTheIncentiveProgramDetailsRequest implements Task {
    String programID;
    String revisionNumber;
    String language;
    String country;

    public MakeTheIncentiveProgramDetailsRequest(String programID) {
        this.programID = programID;
    }

    public static MakeTheIncentiveProgramDetailsRequest usingTheProgramID(String programID) {
        return instrumented(MakeTheIncentiveProgramDetailsRequest.class, programID);
    }

    public MakeTheIncentiveProgramDetailsRequest andRevisionNumber(String revisionNumber) {
        this.revisionNumber = revisionNumber;
        return this;
    }

    public MakeTheIncentiveProgramDetailsRequest andLanguage(String language) {
        this.language = language;
        return this;
    }

    public MakeTheIncentiveProgramDetailsRequest andCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, Object> jsonAsMap;
        BuildRequestObject buildDealerCodeRequest = new BuildRequestObject();
        if (country.equals("CA")) {
            if (language.equalsIgnoreCase("EN")) {
                jsonAsMap = buildDealerCodeRequest.requestProgramDetails("CA",
                        "EN",
                        programID,
                        Integer.parseInt(revisionNumber));
            } else {
                jsonAsMap = buildDealerCodeRequest.requestProgramDetails("CA",
                        "FR",
                        programID,
                        Integer.parseInt(revisionNumber));
            }
        } else {
            jsonAsMap = buildDealerCodeRequest.requestProgramDetails("US",
                    "EN",
                    programID,
                    Integer.parseInt(revisionNumber));
        }

        actor.attemptsTo(
                Post.to(ModelEndPoints.GETPROGRAMSEARCHDETAILS_ENDPOINT.toString()).with(request -> request
                        .header("username", AuthorizedUser.ASC_USER.toString())
                        .header("password", AuthorizedUser.ASC_PASSWORD.toString())
                        .header("Content-Type", "application/json")
                        .body(jsonAsMap)
                )
        );
        actor.should(
                seeThatResponse(
                        response -> response.statusCode(200)
                )
        );
    }
}
