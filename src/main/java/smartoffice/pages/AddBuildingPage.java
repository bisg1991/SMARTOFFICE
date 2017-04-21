package smartoffice.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.WebActions;
import smartoffice.pageobjects.AddBuildingPageObjects;



public class AddBuildingPage extends LoginPage {

	private AddBuildingPageObjects objabp;
	
	public AddBuildingPage(WebDriver driver, WebActions action){
		super(driver, action);
		objabp=new AddBuildingPageObjects(driver);
	}
	
	public AddFloorPage addNewBuilding(String buildingname) throws Exception{
		
		CommonFunctionsLib.sleep(1);
		
		System.out.println("title: " + driver.getTitle());

		
		try {
			action.click(objabp.menusetting);
		} catch (Exception e) {
			action.clickByJS(objabp.menusetting);
		}
		CommonFunctionsLib.log("Clicked on the Settings option from the left hand side of the menu");
		
		objabp.btnAddBuilding.click();
		CommonFunctionsLib.log("Clicked on the Add Building button");
		
		objabp.txtname.sendKeys("SOFTWEB SOLUTIONS");
		CommonFunctionsLib.log("Enter the building name");
		
		objabp.txtfloors.sendKeys("3");
		CommonFunctionsLib.log("Entered the no of floors for a building ");
		
		objabp.txtaddress.sendKeys(buildingname);
		Thread.sleep(2000);
		objabp.txtaddress.sendKeys(Keys.DOWN);
		objabp.txtaddress.sendKeys(Keys.ENTER);
		
		CommonFunctionsLib.log("Entered the address for the building");
		
		action.scrollToElenent(objabp.btnsave);
		
		CommonFunctionsLib.sleep(5);
		
		objabp.btnsave.click();
		CommonFunctionsLib.log("Clicked the save button");
		
		
		return new AddFloorPage(driver, action);
		
	}
	
}
