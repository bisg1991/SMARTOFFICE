package smartoffice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateMeetingPageObjects {

	public CreateMeetingPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*@FindBy(xpath = "//html/body/nav/ul/li[2]/a[@class='lbl']")
	public WebElement menusearch;  // For search in technexus
*/	
	@FindBy(xpath = "//html/body/nav/ul/li[1]/a[@class='lbl']")
	public WebElement menusearch; // For search in sostaging

	// @FindBy(xpath="//div[@id='tab-1']/div[5]/div[1]/div[@class='search_results-row
	// ng-scope']/div[1]/div[2]/h3/a")

	@FindBy(linkText = "»")
	public WebElement arrowNext;
	
	public WebElement getSpaceTitle(String title, WebDriver driver) {

		WebElement el = null;
		try {
			el = driver.findElement(By.xpath("//a[contains(text(), '" + title + "')]"));
			System.out.println(el.getText());
			el.click();
		} 
		catch (Exception e) {
			arrowNext.click();
		}
        return el;
	}

	public WebElement txtspacetitle;

}
