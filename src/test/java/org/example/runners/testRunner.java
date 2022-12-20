package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\resources\\features",
        glue = {"org.example.stepDefinition"},
        tags = "@regression",
        plugin = { "pretty", "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "html:target/cucumber.html" ,
                "rerun:target/rerun.txt"},
        monochrome = true
)

public class testRunner {

}
