package stepDefinition;

import java.io.FileNotFoundException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.TestDriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends TestDriverFactory {

	@Before
	public void setUp() throws FileNotFoundException {
		driver = getDriver();
	}

	@After
	public void TearDown(Scenario scenario) {

		try {
			if(driver != null  && scenario.isFailed())
			{
				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}else {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
