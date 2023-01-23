package gm.dataviewer.tasks;

import gm.dataviewer.pages.DealerSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDealerSummaryBrand implements Task {

    private final String value;

    public SelectDealerSummaryBrand(String value) {
        this.value = value;
    }

    public static SelectDealerSummaryBrand called(String value) {
        return instrumented(SelectDealerSummaryBrand.class, value);
    }

    public <T extends Actor> void performAs(T actor) {
        if (!(value.equals("All") || value.equals("Tout"))) {
            actor.attemptsTo(
                    Click.on(DealerSummaryPage.BRAND_CHECKBOX_ALL),
                    Click.on(DealerSummaryPage.CHECKBOX_DATE_BRAND.of(value))
            );
        }
    }
}