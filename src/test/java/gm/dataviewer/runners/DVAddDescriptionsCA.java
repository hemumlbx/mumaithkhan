package gm.dataviewer.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = "json:target/cucumber/cucumber_report1.json",
        features = "src/test/resources/features/publishdescriptions/publish_add_descriptions",
        glue = "classpath:gm.dataviewer.steps",
        tags = "@CanadaOnly"
)
public class DVAddDescriptionsCA {

}
