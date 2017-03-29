package smartoffice.pages;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import smartoffice.functions.CommonFunctionsLib;
import smartoffice.functions.WebActions;
import smartoffice.pageobjects.BookMeetingPageObjects;
import smartoffice.pageobjects.CreateEventIconPageObjects;
import smartoffice.pageobjects.CreateMeetingPageObjects;

public class CreateEventIconPage extends LoginPage {
	
	private CreateEventIconPageObjects objceipo;
	private BookMeetingPageObjects objbmpo2;
	public CreateMeetingPageObjects objcmpos;
	
	public CreateEventIconPage(WebDriver driver, WebActions action) {
		super(driver, action);
		objceipo = new CreateEventIconPageObjects(driver);
		objbmpo2 = new BookMeetingPageObjects(driver);
		objcmpos = new CreateMeetingPageObjects(driver);
	}

	public void createmeetingfromicon(String titles, String emails) throws Exception{
		
		 try {
				action.click(objcmpos.menusearch);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				action.clickByJS(objcmpos.menusearch);
			}
		
		int i=1;
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
		Thread.sleep(1000);
		List<WebElement> lst= driver.findElements(By.xpath("//div[@id='myModal']/div/form/div/div[1]/div[2]/div[2]/select/option"));
		int j=lst.size();
		action.selectFromDropDown(objceipo.clkselspacedrop, i);
		System.out.println(j);
		CommonFunctionsLib.sleep(5);
		objbmpo2.txtemail.sendKeys(emails);
		objbmpo2.txtemail.sendKeys(Keys.RETURN);
		CommonFunctionsLib.sleep(3);
		objbmpo2.chkincludeme.click();
		objceipo.btnbooknow.click();
		CommonFunctionsLib.sleep(3);
		
		int k=2;
		while(k<j){
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
			action.selectFromDropDown(objceipo.clkselspacedrop, k);
			CommonFunctionsLib.sleep(3);
			objbmpo2.txtemail.sendKeys(emails);
			objbmpo2.txtemail.sendKeys(Keys.RETURN);
			CommonFunctionsLib.sleep(3);
			objbmpo2.chkincludeme.click();
			objceipo.btnbooknow.click();
			CommonFunctionsLib.sleep(3);
			k++;
		}
		
		
	}
	
	
	
}
