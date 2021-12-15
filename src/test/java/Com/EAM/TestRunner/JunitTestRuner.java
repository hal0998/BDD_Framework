package Com.EAM.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		glue = ".", features = ".", dryRun = false, monochrome = true, strict = true,
		plugin = { "pretty",
				"html:test-output", "json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		tags="@Smoke_Test"
		
		
		)

public class JunitTestRuner {

}
