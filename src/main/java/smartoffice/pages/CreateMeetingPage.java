package smartoffice.pages;

import org.openqa.selenium.WebDriver;

import smartoffice.functions.WebActions;
import smartoffice.pageobjects.AddSpacePageObjects;
import smartoffice.pageobjects.CreateMeetingPageObjects;

public class CreateMeetingPage extends LoginPage {

	private CreateMeetingPageObjects objcmpo;

	public CreateMeetingPage(WebDriver driver, WebActions action) {
		super(driver, action);
		objcmpo = new CreateMeetingPageObjects(driver);
	}
   
	public BookMeetingPage createMeeting() throws Exception{
		try {
			action.click(objcmpo.menusearch);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			action.clickByJS(objcmpo.menusearch);
		}
		
		//action.printnames(objcmpo.txtspacetitle);
		objcmpo.getSpaceTitle("ZONE -1", driver);
	
	    return new BookMeetingPage(driver, action);
	}

}
