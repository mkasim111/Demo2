package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.practise.LoginPage;
import com.cucumber.practise.PracticePage;

public class TestDriverFactory {

	public static WebDriver driver;
	public static PracticePage pp;
	public static LoginPage lp;
	Properties prop;
	InputStream input = null;

	public WebDriver getDriver() throws FileNotFoundException {
		prop = new Properties();
		

		try {
			input = new FileInputStream(Constant.CONFIG_PROPERTIES_DIRETORY);
			prop.load(input);
			String browserName = prop.getProperty("browser");

			switch (browserName) {

			case "firefox":
				if (null == driver) {
					
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRETORY);
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				}
				break;

			case "chrome":

				if (null == driver) {
					
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRETORY);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

			case "ie":

				if (null == driver) {
					
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRETORY);
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					capabilities.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().window().maximize();
				}
				break;

			}

		} catch (Exception e) {

		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			pp = PageFactory.initElements(driver, PracticePage.class);
			lp = PageFactory.initElements(driver, LoginPage.class);
		}
		return driver;

	}

}
