package smartoffice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFloorPageObjects {

	
	public AddFloorPageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//li[@id='floor']/a/span")
	public WebElement tabfloors;

    @FindBy(xpath="//div[@id='floor']/div[1]/div[2]/button")
	public WebElement btnaddfloors;

	@FindBy(id="locationid")
	public WebElement drpselbuilding;

	@FindBy(name="name")
	public WebElement txtflrnme;

	@FindBy(name="floors")
	public WebElement txtflrno;

	@FindBy(id="floorsave")
	public WebElement btnflrsve;


}
