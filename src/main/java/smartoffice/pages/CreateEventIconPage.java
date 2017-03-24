package smartoffice.pages;

import org.openqa.selenium.WebDriver;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.WebActions;
import smartoffice.pageobjects.AddSpacePageObjects;
import smartoffice.pageobjects.BookMeetingPageObjects;
import smartoffice.pageobjects.CreateEventIconPageObjects;

public class CreateEventIconPage extends LoginPage {
	
	private CreateEventIconPageObjects objceipo;
	private BookMeetingPageObjects objbmpo2;

	public CreateEventIconPage(WebDriver driver, WebActions action) {
		super(driver, action);
		objceipo = new CreateEventIconPageObjects(driver);
		objbmpo2 = new BookMeetingPageObjects(driver);
	}

	public void createmeetingfromicon(String titles, String emails) throws Exception{
		
		int i=2;
		
		while(i<=10){
		
		try {
				action.click(objceipo.btncreateevent);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				action.clickByJS(objceipo.btncreateevent);
			}
		CommonFunctionsLib.sleep(3);
		
		objbmpo2.txttitle.sendKeys(titles);
		
		Thread.sleep(2000);
		
		objceipo.clkclockicon.click();
		
		objceipo.clkuparrowicon.click();
		
		objceipo.clkselspacedrop.click();
		
		action.selectFromDropDown(objceipo.clkselspacedrop, i);
		
		CommonFunctionsLib.sleep(3);
		
		objbmpo2.txtemail.sendKeys(emails);
		CommonFunctionsLib.sleep(3);
		
		objbmpo2.chkincludeme.click();
		
		objceipo.btnbooknow.click();
		
		CommonFunctionsLib.sleep(3);
		
		i++;
		
		}
	}
	
	
	
}
