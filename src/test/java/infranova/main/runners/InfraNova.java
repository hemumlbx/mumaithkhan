package infranova.main.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/infranova/infra_nova_contact_page_layout.feature",
        glue = "classpath:infranova.main.steps"
)
public class InfraNova {

}
