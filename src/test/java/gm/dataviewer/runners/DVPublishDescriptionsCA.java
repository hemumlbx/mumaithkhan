package gm.dataviewer.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "json:target/cucumber/cucumber_report14.json",
        features = "src/test/resources/features/publishdescriptions/publish_data_descriptions",
        glue = "classpath:gm.dataviewer.steps",
        tags = "@CanadaOnly"
)
public class DVPublishDescriptionsCA {

}
