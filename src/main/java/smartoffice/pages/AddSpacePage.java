package smartoffice.pages;

import org.openqa.selenium.WebDriver;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.WebActions;
import smartoffice.pageobjects.AddFloorPageObjects;
import smartoffice.pageobjects.AddSpacePageObjects;
import smartoffice.pageobjects.CreateMeetingPageObjects;

public class AddSpacePage extends LoginPage {

	private AddSpacePageObjects objaspo;
	

	public AddSpacePage(WebDriver driver, WebActions action) {
		super(driver, action);
		objaspo = new AddSpacePageObjects(driver);
	}

	public CreateMeetingPage addspace(String buildingname, String floorname, String spacetype) throws Exception {

		try {
			action.click(objaspo.tabspaces);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			action.clickByJS(objaspo.tabspaces);
		}

		objaspo.btnaddSpace.click();

		objaspo.txtspacenme.sendKeys("ZONE -1");

		CommonFunctionsLib.selectElementByNameMethod(objaspo.drpbuilding, buildingname);

		CommonFunctionsLib.selectElementByNameMethod(objaspo.drpfloor, floorname);

		objaspo.txtcapacity.clear();
		objaspo.txtcapacity.sendKeys("10");
		
		CommonFunctionsLib.selectElementByNameMethod(objaspo.drpspacetype, spacetype);

		objaspo.iconamenityexpand.click();

		objaspo.selectamenity.click();

		objaspo.btnchoosefile.click();
		
		CommonFunctionsLib.sleep(1);

		 //CommonFunctionsLib.UploadFile("C:\\Users\\BISWAJIT\\Desktop\\rooms.jpg"); //HP Laptop
		 CommonFunctionsLib.UploadFile("C:\\Users\\Biswajit.Ghosh\\Desktop\\rooms.jpg"); // Desktop

		// Runtime.getRuntime().exec("G:/AUTOIT-SMART/meeting.exe"); //Using AutoIT

		//CommonFunctionsLib.sleep(1);
		try {
			action.click(objaspo.btnsave);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			action.clickByJS(objaspo.btnsave);
		}
        CommonFunctionsLib.log("Click on button 'Save'", driver);

        return new CreateMeetingPage(driver, action);
	}
	
	
	public CreateEventIconPage addspace2(String buildingname, String floorname, String spacetype) throws Exception {

		try {
			action.click(objaspo.tabspaces);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			action.clickByJS(objaspo.tabspaces);
		}

		objaspo.btnaddSpace.click();

		objaspo.txtspacenme.sendKeys("ZONE -1");

		CommonFunctionsLib.selectElementByNameMethod(objaspo.drpbuilding, buildingname);

		CommonFunctionsLib.selectElementByNameMethod(objaspo.drpfloor, floorname);

		objaspo.txtcapacity.clear();
		objaspo.txtcapacity.sendKeys("10");
		
		CommonFunctionsLib.selectElementByNameMethod(objaspo.drpspacetype, spacetype);

		objaspo.iconamenityexpand.click();

		objaspo.selectamenity.click();

		objaspo.btnchoosefile.click();

		 //CommonFunctionsLib.UploadFile("C:\\Users\\BISWAJIT\\Desktop\\rooms.jpg"); //HP Laptop
		 CommonFunctionsLib.UploadFile("C:\\Users\\Biswajit.Ghosh\\Desktop\\rooms.jpg"); // Desktop

		// Runtime.getRuntime().exec("G:/AUTOIT-SMART/meeting.exe"); //Using AutoIT

		//CommonFunctionsLib.sleep(1);
		try {
			action.click(objaspo.btnsave);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			action.clickByJS(objaspo.btnsave);
		}
        CommonFunctionsLib.log("Click on button 'Save'", driver);
        
        return new CreateEventIconPage(driver, action);
	}

}
