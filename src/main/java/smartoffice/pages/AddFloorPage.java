package smartoffice.pages;

import org.openqa.selenium.WebDriver;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.WebActions;
import smartoffice.pageobjects.AddFloorPageObjects;

public class AddFloorPage extends LoginPage {

	private AddFloorPageObjects objafpo;
	
	public AddFloorPage(WebDriver driver, WebActions action){
		super(driver, action);
		objafpo=new AddFloorPageObjects(driver);
	}
	
	public AddSpacePage addNewFloor(String buildingname, String floorname) throws Exception{
		
		/*objafpo.tabfloors.click();
		CommonFunctionsLib.log("Clicked on the Floor tab");*/
		CommonFunctionsLib.sleep(3);
		try {
			action.click(objafpo.tabfloors);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			action.clickByJS(objafpo.tabfloors);
		}
		CommonFunctionsLib.log("Clicked on the Floor tab");
		
	
		objafpo.btnaddfloors.click();
		CommonFunctionsLib.log("Clicked on Add Floor button");
		
		CommonFunctionsLib.selectElementByNameMethod(objafpo.drpselbuilding, buildingname);
		CommonFunctionsLib.log("Selected the building name from the dropdown");
		
		objafpo.txtflrnme.sendKeys(floorname);
		CommonFunctionsLib.log("Entered the floor name");
		
		objafpo.txtflrno.sendKeys("1");
		CommonFunctionsLib.log("Entered the floor number");
		
		objafpo.btnflrsve.click();
		CommonFunctionsLib.log("Clicked on the SAVE button");
		
		Thread.sleep(2000);
		
		return new AddSpacePage(driver, action);
	}
}
