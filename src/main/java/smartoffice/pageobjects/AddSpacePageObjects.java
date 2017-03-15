package smartoffice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSpacePageObjects {

	public AddSpacePageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@id='space']/a/span[text()='Spaces']")
	public WebElement tabspaces;
	
	@FindBy(xpath="//div[@id='Spaces']/div[1]/div[2]/button[2]")
	public WebElement btnaddSpace;
	
	@FindBy(name="name")
	public WebElement txtspacenme;
	
	@FindBy(id="locationid")
	public WebElement drpbuilding;
	
	@FindBy(id="floorid")
	public WebElement drpfloor;

	@FindBy(name="capacity")
	public WebElement txtcapacity;
	
	@FindBy(xpath="//div[@id='modal-space']/form/div/div/div[4]/div/div/div/select")
	public WebElement drpspacetype;
	
	@FindBy(xpath="//div[@id='modal-space']/form/div/div/div[6]/label/i[2]")
	public WebElement iconamenityexpand;
	
	@FindBy(xpath="//div[@id='modal-space']/form/div/div[1]/div[7]/div/div[2]/div[1]/input")
	public WebElement selectamenity;
	
	@FindBy(xpath="//div[@id='modal-space']/form/div/div[1]/div[10]/div/div/div/span")
	public WebElement btnchoosefile;
	
	@FindBy(xpath="//div[@id='modal-space']/form/div/div[2]/div/div/button")
	public WebElement btnsave;
	
}
