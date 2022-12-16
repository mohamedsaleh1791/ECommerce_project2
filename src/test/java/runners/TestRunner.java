package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\resources\\features",
        glue = "stepDefinition",
        tags = "@regression"
)

public class TestRunner {

}
