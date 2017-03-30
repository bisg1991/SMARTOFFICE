package initiator;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.Keyboard;
import smartoffice.functions.Reader;
import smartoffice.functions.WebActions;
import smartoffice.pages.LoginPage;

public class BrowserInitiator {

	WebDriver driver;
	private WebActions action;
	protected LoginPage login;
	private Keyboard kb;
	Reader xls;
	int sheet = 0;

	@BeforeSuite
	public void setUp() {

		System.setProperty("webdriver.gecko.driver", "D:\\Software\\GECKO\\geckodriver.exe");
		// System.setProperty("webdriver.gecko.driver","F:\\seleniumOcm30\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("http://sostaging.softwebopensource.com/");
		CommonFunctionsLib.log("Navigate to 'http://sostaging.softwebopensource.com/'");

		// driver.navigate().to("http://technexus.softwebsmartoffice.com/index#/dashboard");
		// CommonFunctionsLib.log("Navigate to
		// 'http://technexus.softwebsmartoffice.com/index#/dashboard'");

		action = new WebActions(driver);
		kb = new Keyboard(driver);
		login = new LoginPage(driver, action);
	}

	/*@AfterSuite
	public void destory() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}*/

	@DataProvider
	protected Object[][] readData(Method method) {
		xls = new Reader(sheet);
		return xls.readData(method.getName(), xls);
	}

	public Hashtable<String, String> readDataFromSheet(String testName, int sheet) {
		xls = new Reader(sheet);
		return xls.readData1(testName, xls);
	}
}
