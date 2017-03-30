package smartoffice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportUserPageObjects {
	
	public ImportUserPageObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@id='content-wrap']/div/div/section/div[1]/div/ul/li[6]/a/span")
	public WebElement tabusers;

	@FindBy(xpath="//div[@id='Users']/div/div[2]/button[2]")
	public WebElement btninvitenewmembers;

	@FindBy(xpath="//div[@id='invite_member_form']/div/div[2]/blockquote/div[5]/span/span[text()='Import CSV']")
	public WebElement btmimportcsv;

	@FindBy(xpath="//div[@id='invite_member_form']/div/div[2]/blockquote/div[5]/button")
	public WebElement btnaddmembers;
	
	
	
	
	
}
