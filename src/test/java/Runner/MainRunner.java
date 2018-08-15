package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/main/java/features/"},
		glue= {"stepDefinition"},
		dryRun=false,
		monochrome= true,
		tags= {"@tagPractice"},
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"
		}
		)

public class MainRunner {

}
