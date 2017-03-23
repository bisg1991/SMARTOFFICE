package smartoffice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class BookMeetingPageObjects {
	
	public BookMeetingPageObjects(WebDriver driver){
        PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='nav-link']/span[contains(text(),'Booking')]")
	public WebElement tabbooking;

	@FindBy(xpath="//div[@id='Details']/div[3]/div/div/ul/li[1]/span[1]")
	public WebElement clktimeslot;

	@FindBy(id="title")
	public WebElement txttitle;

	@FindBy(name="email")
	public WebElement txtemail;

    @FindBy(xpath="//div[@class='row']/label[contains(text(),'Include Me')]")
	public WebElement chkincludeme;

	@FindBy(id="chkAmenities")
	public WebElement chkamenities;

	@FindBy(name="amenities")
	public WebElement txtamenities;

	@FindBy(id="chkCatering")
	public WebElement chkcatering;

	@FindBy(name="catering")
	public WebElement txtcatering;

	@FindBy(xpath="//div[@class='modal-body']/div[6]/div/textarea")
	public WebElement txtvenuedetails;

	@FindBy(xpath="//div[@class='col-md-4']/button")
	public WebElement btnbooknw;

}
