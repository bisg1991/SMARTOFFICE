package smartoffice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateMeetingPageObjects {

	public CreateMeetingPageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//html/body/nav/ul/li[2]/a[@class='lbl']")
	public WebElement menusearch;
    
    @FindBy(xpath="//div[@id='tab-1']/div[5]/div[1]/div[@class='search_results-row ng-scope']/div[1]/div[2]/h3/a")
    public WebElement txtspacetitle;
	
}
