package smartoffice.pages;

import java.awt.event.KeyEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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

	private ArrayList<String> titles = new ArrayList<>();
	private ArrayList<String> emails = new ArrayList<>();

	private void setArrayLists(Hashtable<String, String> tbl) {

		System.out.println("map: " + tbl);

		for (Entry<String, String> vals : tbl.entrySet()) {
			if (vals.getKey().equals("Title")) {
				titles.add(vals.getValue());
			} else {
				emails.add(vals.getValue());
			}
		}
	}

	public void meetfromicon(ArrayList<Hashtable<String, String>> tbl) throws Exception {

		System.out.println("size: " + tbl.size());

		for (int i = 0; i < tbl.size(); i++) {
			setArrayLists(tbl.get(i));
		}
		System.out.println("title: " + titles);
		System.out.println("emails: " + emails);
		System.exit(0);

		/*
		 * try { action.click(objcmpos.menusearch); } catch (Exception e) { //
		 * TODO Auto-generated catch block
		 * action.clickByJS(objcmpos.menusearch); }
		 */

		int i = 1;
		try {
			action.click(objceipo.btncreateevent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			action.clickByJS(objceipo.btncreateevent);
		}
		CommonFunctionsLib.sleep(3);
		objbmpo2.txttitle.sendKeys(titles.get(0)); // title from the excel
													// sheet
		Thread.sleep(2000);
		objceipo.clkclockicon.click();
		objceipo.clkuparrowicon.click();
		objceipo.clkselspacedrop.click();
		Thread.sleep(1000);
		List<WebElement> lst = driver
				.findElements(By.xpath("//div[@id='myModal']/div/form/div/div[1]/div[2]/div[2]/select/option"));
		int j = lst.size();
		action.selectFromDropDown(objceipo.clkselspacedrop, i);
		System.out.println(j);
		CommonFunctionsLib.sleep(5);
		objbmpo2.txtemail.sendKeys(emails.get(0)); // emails from the excel
													// sheet
		objbmpo2.txtemail.sendKeys(Keys.RETURN);
		CommonFunctionsLib.sleep(3);
		objbmpo2.chkincludeme.click();
		objceipo.btnbooknow.click();
		CommonFunctionsLib.sleep(3);

		int k = 2;
		int count = 0;
		while (k < j) {
			try {
				action.click(objceipo.btncreateevent);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				action.clickByJS(objceipo.btncreateevent);
			}

			CommonFunctionsLib.sleep(3);
			objbmpo2.txttitle.sendKeys(titles.get(count));
			Thread.sleep(2000);
			objceipo.clkclockicon.click();
			objceipo.clkuparrowicon.click();
			objceipo.clkselspacedrop.click();
			action.selectFromDropDown(objceipo.clkselspacedrop, k);
			CommonFunctionsLib.sleep(3);
			objbmpo2.txtemail.sendKeys(emails.get(count));
			objbmpo2.txtemail.sendKeys(Keys.RETURN);
			CommonFunctionsLib.sleep(3);
			objbmpo2.chkincludeme.click();
			objceipo.btnbooknow.click();
			CommonFunctionsLib.sleep(3);
			count++;
		}
		k++;

	}

	public void meetfromsearchpage() throws InterruptedException {
		CommonFunctionsLib.sleep(25);

		List<WebElement> lst;
		
		/*int count = 0;
		while (true) {
			lst = driver.findElements(By.xpath("//a[contains(@class, 'spacetitle')]"));
			if (lst.size() > 0) {
				int j=lst.size();
				System.out.println(j);
				break;
			} else {
				CommonFunctionsLib.sleep(1);
				count++;
				if (count == 20) {
					break;
				}
			}
		}*/
        
		lst = driver.findElements(By.xpath("//a[contains(@class, 'spacetitle')]"));
		if (lst.size() > 0) {
			int j=lst.size();
			System.out.println(j);
			
		} 
		
		/*for (int i = 1; i <lst.size(); i++) {
			
			
		    
			driver.findElement(By.xpath("//div[@id='tab-1']/div[5]/div[1]/div["+i+"]/div[1]/div[2]/div/a[1]")).click();
			CommonFunctionsLib.sleep(1);
		    driver.findElement(By.xpath("//div[@id='myModal']/div/form/div/header/div/div[2]/button")).click();
		    i++;
		
		}*/
		   int z=1;
           while( z <=lst.size()) {
			CommonFunctionsLib.sleep(1);
			driver.findElement(By.xpath("//div[@id='tab-1']/div[5]/div[1]/div["+z+"]/div[1]/div[2]/div/a[1]")).click();
			CommonFunctionsLib.sleep(1);
		    driver.findElement(By.xpath("//div[@id='myModal']/div/form/div/header/div/div[2]/button")).click();
		    z++;
		
		}

	}

}
