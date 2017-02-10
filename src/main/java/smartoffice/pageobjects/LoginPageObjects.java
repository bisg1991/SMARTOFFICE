package smartoffice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	public LoginPageObjects(WebDriver driver){
           PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	public WebElement txtEmail;
	
	@FindBy(id="password")
	public WebElement txtpassword;
	
	@FindBy(id="signinbtn")
	public WebElement btnsignin;
	
}
