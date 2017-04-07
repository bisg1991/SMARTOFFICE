package smartoffice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEventIconPageObjects {
	
	public CreateEventIconPageObjects(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath="//html/body/header/div[1]/div[2]/div/div[3]/div/div[2]/button")
    public WebElement btncreateevent;
    
    @FindBy(xpath="//div[@id='myModal']/div/form/div/div/div[2]/div/div/div[3]/div/div/span/span")
    public WebElement clkclockicon;
    
    @FindBy(css="td.uib-increment.minutes > a.btn.btn-link > span.glyphicon.glyphicon-chevron-up")
    public WebElement clkuparrowicon;
    
    @FindBy(xpath="//div[@id='myModal']/div/form/div/div/div[2]/div[2]/select")
    public WebElement clkselspacedrop;
    
    @FindBy(css="div.col-md-4 > button.btn.btn-primary")
    public WebElement btnbooknow;

    




}
