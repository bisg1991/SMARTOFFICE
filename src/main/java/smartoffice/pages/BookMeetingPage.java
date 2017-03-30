package smartoffice.pages;

import org.openqa.selenium.WebDriver;

import smartoffice.functions.WebActions;
import smartoffice.pageobjects.BookMeetingPageObjects;

public class BookMeetingPage extends LoginPage {

	private BookMeetingPageObjects bmpo;

	// excel

	public BookMeetingPage(WebDriver driver, WebActions action) throws Exception {
		super(driver, action);
		bmpo = new BookMeetingPageObjects(driver);

	}

	/*
	 * public void bookameeting(String titletext, String emails, String
	 * amenities, String caterings, String venue){
	 * 
	 * bmpo.tabbooking.click();
	 * 
	 * bmpo.clktimeslot.click();
	 * 
	 * bmpo.txttitle.sendKeys(titletext);
	 * 
	 * bmpo.txtemail.sendKeys(emails);
	 * 
	 * bmpo.chkincludeme.click();
	 * 
	 * bmpo.chkamenities.click();
	 * 
	 * bmpo.txtamenities.sendKeys(amenities);
	 * 
	 * bmpo.chkcatering.click();
	 * 
	 * bmpo.txtcatering.sendKeys(caterings);
	 * 
	 * bmpo.txtvenuedetails.sendKeys(venue);
	 * 
	 * bmpo.btnbooknw.click();
	 * 
	 * 
	 * 
	 * }
	 */

	public void bookameeting(String title, String email, String amenities, String catering, String venue) throws Exception {
		bmpo.tabbooking.click();

		bmpo.clktimeslot.click();

		bmpo.txttitle.sendKeys(title);

		bmpo.txtemail.sendKeys(email);

		bmpo.chkincludeme.click();

		bmpo.chkamenities.click();

		bmpo.txtamenities.sendKeys(amenities);

		bmpo.chkcatering.click();

		bmpo.txtcatering.sendKeys(catering);

		bmpo.txtvenuedetails.sendKeys(venue);

		bmpo.btnbooknw.click();

	}

}
