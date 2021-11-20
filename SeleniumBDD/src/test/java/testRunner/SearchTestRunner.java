package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = {"AppFeatures"},
				glue={"stepDefinition"}, monochrome = true,
				plugin= {"pretty","html:target/HtmlReports","pretty",
						"json:target/JSONFolder/JSONReports.json",
						"pretty","junit:target/junitFolder/junitReports.xml"})

public class SearchTestRunner {
	
	
}
