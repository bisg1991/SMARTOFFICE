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




	public void meetfromsearchpage(ArrayList<String> title, ArrayList<String> email) throws InterruptedException {
		CommonFunctionsLib.sleep(25);

		List<WebElement> lst;
		lst = driver.findElements(By.xpath("//a[contains(@class, 'spacetitle')]"));
		if (lst.size() > 0) {
			int j=lst.size();
			System.out.println(j);
			
		} 
		
		    
		    int z=1;
		    int count = 0;
            while( z <=lst.size()) {
			CommonFunctionsLib.sleep(2);
			driver.findElement(By.xpath("//div[@id='tab-1']/div[5]/div[1]/div["+z+"]/div[1]/div[2]/div/a[1]")).click();
			CommonFunctionsLib.sleep(1);
			objbmpo2.txttitle.sendKeys(title.get(count));
			objbmpo2.txtemail.sendKeys(email.get(count));
			objbmpo2.txtemail.sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			objceipo.btnbooknow.click();
			CommonFunctionsLib.sleep(3);
			count++;
		    //driver.findElement(By.xpath("//div[@id='myModal']/div/form/div/header/div/div[2]/button")).click();
		    z++;
		
		}

	}

}
