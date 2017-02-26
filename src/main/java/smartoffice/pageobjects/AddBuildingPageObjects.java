package smartoffice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBuildingPageObjects {

	public AddBuildingPageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
	}
  
	@FindBy(xpath="//ul[@class='side-menu-list']/li[4]/a/span")
	public WebElement menusetting;
	
	@FindBy(xpath="//div[@id='Locations']/div[1]/div[2]/button")
	public WebElement btnAddBuilding;

    @FindBy(name="name")
    public WebElement txtname;
    
    @FindBy(name="floors")
    public WebElement txtfloors;
    
    @FindBy(id="address")
    public WebElement txtaddress;
    
    /*@FindBy(xpath="//html/body/div[11]/div[1]")  
    public WebElement seladdress;*/
    
    @FindBy(xpath="html/body/div[11]/div")
    public WebElement seladdress;
    
    
    @FindBy(xpath="//div[@id='modal-location']/form/div/div[2]/div/div/button")
    public WebElement btnsave;


}
