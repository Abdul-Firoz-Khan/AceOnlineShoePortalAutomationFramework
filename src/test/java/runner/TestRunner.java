package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/lenovo/Documents/E/Testing/selenium-project/maven_project/SeleniumCucumberTests/src/test/java/features",
        glue = {"C:/Users/lenovo/Documents/E/Testing/selenium-project/maven_project/SeleniumCucumberTests/src/test/java/utility", "C:/Users/lenovo/Documents/E/Testing/selenium-project/maven_project/SeleniumCucumberTests/src/test/java/stepDefinition"},
        plugin = {"pretty","html:target/cucumber-html-report", "json:cucumber.json"}
)

public class TestRunner {
}
