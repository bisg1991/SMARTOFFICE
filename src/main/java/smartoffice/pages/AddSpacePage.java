package smartoffice.pages;

import org.openqa.selenium.WebDriver;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.WebActions;
import smartoffice.pageobjects.AddFloorPageObjects;
import smartoffice.pageobjects.AddSpacePageObjects;

public class AddSpacePage extends LoginPage {

	private AddSpacePageObjects objaspo;
	
	public AddSpacePage(WebDriver driver, WebActions action){
		super(driver, action);
		objaspo=new AddSpacePageObjects(driver);
	}
	
	public void addspace(String buildingname, String floorname) throws Exception{
		
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
		
		objaspo.txtcapacity.sendKeys("10");
		
		objaspo.iconamenityexpand.click();
		
		objaspo.selectamenity.click();
		
	}
	
	
	
}
