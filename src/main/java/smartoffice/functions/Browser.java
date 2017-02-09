package smartoffice.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {

	 public static WebDriver getBrowsers(String browserName) {
			WebDriver driver = null;
	 
			switch (browserName) {
			case "Firefox":
				
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver", "F:\\seleniumOcm30\\geckodriver-v0.10.0-win64\\geckodriver.exe");
			        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					 driver = new MarionetteDriver(capabilities); //for selenium 3 use new
					driver = new FirefoxDriver();
				}
				break;
			
			case "IE":
				
				if (driver == null) {
					System.setProperty("webdriver.ie.driver",
							"C:\\Users\\abc\\Desktop\\Server\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
				}
				break;
			
			case "Chrome":
				
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			}
			return driver;

}
}
