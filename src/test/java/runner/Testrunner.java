package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = ("seleniumgluecode"),
        snippets = CAMELCASE,
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:reports/report.html"}
)

public class Testrunner {
}
