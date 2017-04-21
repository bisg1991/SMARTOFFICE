package initiator;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.Keyboard;
import smartoffice.functions.Reader;
import smartoffice.functions.WebActions;
import smartoffice.pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class Grid_2 {
	
	public static WebDriver driver;
	String baseUrl, nodeURL;
	Reader xls;
	int sheet = 0;
	private WebActions action;
	protected LoginPage login;
	private Keyboard kb;
	

  
 
 @BeforeTest
 public void SETUP() throws MalformedURLException {
	  
	    nodeURL="http://192.168.4.155:5556/wd/hub";
	   
	    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	    capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		
        driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
        driver.manage().window().maximize();
        driver.navigate().to("http://technexus.softwebsmartoffice.com");
		CommonFunctionsLib.log("Navigate to 'http://sostaging.softwebopensource.com/'");

		action = new WebActions(driver);
		kb = new Keyboard(driver);
		login = new LoginPage(driver, action);
	  
	  
  }
  
 
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

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
