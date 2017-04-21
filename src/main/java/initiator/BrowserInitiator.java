package initiator;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.Keyboard;
import smartoffice.functions.LocalDriverManager;
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
    String browserName= "Firefox";
	
	@BeforeSuite
	public void setUp() throws InterruptedException {
            switch (browserName) {
			case "Firefox":
				if (driver == null) {
					//System.setProperty("webdriver.gecko.driver", "F:\\seleniumOcm30\\geckodriver-v0.10.0-win64\\geckodriver.exe");
					System.setProperty("webdriver.gecko.driver", "D:\\Software\\GECKO\\geckodriver.exe");
			        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					// driver = new MarionetteDriver(capabilities); //for selenium 3 use new
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					/*LocalDriverManager.setDriver(driver);
					Thread.sleep(3000);*/
				}
				break;
			
			case "IE":
				
				if (driver == null) {
					System.setProperty("webdriver.ie.driver",
							"C:\\Users\\abc\\Desktop\\Server\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					LocalDriverManager.setDriver(driver);
					Thread.sleep(3000);
				}
				break;
			
			case "Chrome":
				
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", "E:\\NewChrome\\chromedriver.exe");
					//System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					LocalDriverManager.setDriver(driver);
					Thread.sleep(3000);
				}
				break;
			}
		
       // driver = LocalDriverManager.getDriver();
		driver.navigate().to("http://technexus.softwebsmartoffice.com");
		CommonFunctionsLib.log("Navigate to 'http://sostaging.softwebopensource.com/'");

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
