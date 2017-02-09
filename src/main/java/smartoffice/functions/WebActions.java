package smartoffice.functions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions {

	private WebDriver driver;
	public int CLICK_TIMEOUT_SECONDS = 10;

	public WebActions(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement click(WebElement el) throws SeleniumException {
		String tag = el.getTagName();
		try {
			waitUntilClickable(el, CLICK_TIMEOUT_SECONDS);
			// try {
			el.click();
			/*
			 * } catch (Exception e) { Actions actions = new Actions(driver);
			 * actions.moveToElement(el).click().perform(); }
			 */
		} catch (NoSuchElementException e) {
			throw new SeleniumException(
					"WebAction -> click() - Error in click operation on element <%s>: %s" + tag + e.getMessage());
		}
		return el;
	}

	public WebElement waitUntilClickable(final WebElement el, int timeout) {
		int waitSeconds = timeout;
		final String message = "Element never became clickable after '%d' seconds" + waitSeconds;
		WebDriverWait wait = new WebDriverWait(driver, waitSeconds);
		wait.withMessage(message).ignoring(StaleElementReferenceException.class);
		wait.until(new ExpectedCondition<WebElement>() {
			public WebElement apply(WebDriver webDriver) {
				if (isClickable(el)) {
					return el;
				}
				return null;
			}
		});
		return el;
	}

	public boolean isClickable(WebElement el) {
		if (el == null) {
			return false;
		}
		try {
			if (!el.isDisplayed()) {
				return false;
			}
			if (!el.isEnabled()) {
				return false;
			}
			if (el.getSize().getHeight() <= 0 || el.getSize().getWidth() <= 0) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}
    
	public WebElement selectdropdown(WebElement ele,String element){
    	Select sel = new Select(ele);
        sel.selectByVisibleText(element);
    	return ele;
    	
    }

	 public static void UploadFile(String filePath) throws AWTException {
		  StringSelection stringSelection = new StringSelection(filePath);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		 }
	
	 public String getSelectedTextFromDropDown(WebElement el) throws SeleniumException {
		  Select select = new Select(el);
		  WebElement temp = select.getFirstSelectedOption();
		  String text = temp.getText();
		  System.err.println("Drop val: " + text);
		  return text;
		 }
}
