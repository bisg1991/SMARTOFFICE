package smartoffice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import smartoffice.functions.CommonFunctionsLib;

import smartoffice.pageobjects.LoginPageObjects;
import smartoffice.functions.WebActions;
import smartoffice.functions.SeleniumException;

public class LoginPage {

protected WebDriver driver;
protected WebActions action;
private LoginPageObjects lpo;
	
	public LoginPage(WebDriver driver, WebActions action) {
		lpo = new LoginPageObjects(driver);
		this.driver = driver;
		this.action = action;
 }
    public void SignIn() throws SeleniumException{
    	
    	action.click(lpo.txtEmail).sendKeys("bg25@mailinator.com");
    	CommonFunctionsLib.log("Entered the email");
    	
    	action.click(lpo.txtpassword).sendKeys("123456");
    	CommonFunctionsLib.log("Entere the password");
    	
    	action.click(lpo.btnsignin);
    	CommonFunctionsLib.log("Clicked on the Sign in button");
    	
    }



}