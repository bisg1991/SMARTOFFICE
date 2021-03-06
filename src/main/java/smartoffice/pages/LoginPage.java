package smartoffice.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.SeleniumException;
import smartoffice.functions.WebActions;
import smartoffice.pageobjects.LoginPageObjects;

public class LoginPage {

	protected WebDriver driver;
	protected WebActions action;
	private LoginPageObjects obj;

	public LoginPage(WebDriver driver, WebActions action) {
		obj = new LoginPageObjects(driver);
		this.driver = driver;
		this.action = action;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public AddBuildingPage SignIn(String userName, String password) throws Exception {

		obj.txtEmail.sendKeys(userName);
		CommonFunctionsLib.log("Entered the email");

		obj.txtpassword.sendKeys(password);
		CommonFunctionsLib.log("Entered the password");

		obj.btnsignin.click();
		CommonFunctionsLib.log("Clicked on the Sign in button");

		return new AddBuildingPage(driver, action);

	}


	public CreateEventIconPage SignIns(String userName, String password) throws Exception {

		obj.txtEmail.sendKeys(userName);
		CommonFunctionsLib.log("Entered the email");

		obj.txtpassword.sendKeys(password);
		CommonFunctionsLib.log("Entered the password");

		obj.btnsignin.click();
		CommonFunctionsLib.log("Clicked on the Sign in button");

		return new CreateEventIconPage(driver, action);

	}

	public ImportUserPage Sign(String userName, String password) throws Exception {

		obj.txtEmail.sendKeys(userName);
		CommonFunctionsLib.log("Entered the email");

		obj.txtpassword.sendKeys(password);
		CommonFunctionsLib.log("Entered the password");

		obj.btnsignin.click();
		CommonFunctionsLib.log("Clicked on the Sign in button");

		return new ImportUserPage(driver, action);

	}






}