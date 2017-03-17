package smartoffice.functions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class CaptureBrowserScreenShot {

	public CaptureBrowserScreenShot() {

	}

	/**
	 * Purpose : This method generates unique file name
	 * 
	 * @return GetDateTime
	 * @throws Exception
	 */
	private String getDateTime() throws Exception {
		try {
			SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
			Date now = new Date();
			String strDate = sdfDate.format(now);
			String strTime = sdfTime.format(now);
			strTime = strTime.replace(":", "-");
			return (strDate + "_" + strTime);
		} catch (Exception e) {
			throw new Exception(e.getLocalizedMessage());
		}
	}

	/**
	 * Purpose : This method takes screenshot
	 * 
	 * @throws IOException
	 * @throws Exception
	 */
	public String takeScreenShots(WebDriver driver) throws Exception, IOException {
		try {
			File temp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File stored = new File(System.getProperty("user.dir") + "\\Report\\Screenshot\\" + getDateTime() + ""
					+ (++CommonFunctionsLib.imageCount) + ".png");
			FileUtils.copyFile(temp, stored);
			return stored.toString();
		} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			throw new Exception(somePlatformsDontSupportScreenshots.getLocalizedMessage());
		} catch (IOException e) {
			throw new Exception(e.getLocalizedMessage());
		}
	}


}
