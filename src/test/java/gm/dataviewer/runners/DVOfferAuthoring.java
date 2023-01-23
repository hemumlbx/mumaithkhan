package gm.dataviewer.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "json:target/cucumber/cucumber_report10.json",
        features = "src/test/resources/features/offerauthoring",
        glue = "classpath:gm.dataviewer.steps"
)
public class DVOfferAuthoring {

}
