package smartoffice.pages;

import org.openqa.selenium.WebDriver;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.WebActions;
import smartoffice.pageobjects.AddBuildingPageObjects;
import smartoffice.pageobjects.AddSpacePageObjects;
import smartoffice.pageobjects.ImportUserPageObjects;

public class ImportUserPage extends LoginPage {
	
	private AddBuildingPageObjects abpo2;
	private ImportUserPageObjects impusr;

	public ImportUserPage(WebDriver driver, WebActions action) {
		super(driver, action);
		abpo2= new AddBuildingPageObjects(driver);
		impusr= new ImportUserPageObjects(driver);
	}
	 
	public void inviteuser() throws Exception{
		
		CommonFunctionsLib.sleep(2);
		try {
			action.click(abpo2.menusetting);
		} catch (Exception e) {
			action.clickByJS(abpo2.menusetting);
		}
		
		impusr.tabusers.click();
		CommonFunctionsLib.sleep(3);
		impusr.btninvitenewmembers.click();
		impusr.btmimportcsv.click();
		CommonFunctionsLib.sleep(2);
		CommonFunctionsLib.UploadFile("C:\\Users\\Biswajit.Ghosh\\Desktop\\sample85.csv");
		impusr.btnaddmembers.click();
		CommonFunctionsLib.sleep(7);
	}
   







}
