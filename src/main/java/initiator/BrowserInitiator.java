package initiator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import smartoffice.pages.AddBuildingPage;
import smartoffice.pages.LoginPage;
import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.WebActions;

public class BrowserInitiator {
	
	private WebDriver driver;
	private WebActions action;
	protected LoginPage login;
    protected AddBuildingPage addbuilpge;
	
	
	@BeforeMethod
	public void setUp() {

		//System.setProperty("webdriver.gecko.driver", "D:\\Software\\GECKO\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "F:\\seleniumOcm30\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("http://sostaging.softwebopensource.com/");
		CommonFunctionsLib.log("Navigate to 'http://sostaging.softwebopensource.com/'");
		action = new WebActions(driver);
		login = new LoginPage(driver, action);
	}

	/*@AfterMethod
	public void destory() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}*/

}
