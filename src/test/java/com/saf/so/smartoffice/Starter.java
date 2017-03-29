package com.saf.so.smartoffice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import initiator.BrowserInitiator;
import smartoffice.functions.SeleniumException;
import smartoffice.pages.AddBuildingPage;
import smartoffice.pages.AddFloorPage;
import smartoffice.pages.AddSpacePage;
import smartoffice.pages.BookMeetingPage;
import smartoffice.pages.CreateEventIconPage;
import smartoffice.pages.CreateMeetingPage;

// Login > create building > create floor > create space > and book a meeting on the space that was created recently.
public class Starter extends BrowserInitiator {
    
	private AddBuildingPage addbuilpge;
	private AddFloorPage addflrpge;
    private AddSpacePage addspcepge;
    private CreateMeetingPage createmeet;
    private BookMeetingPage bkmeet;
    private CreateEventIconPage eip;
    
	
	@Test(priority = 1)
	public void loginTest() throws Exception {
		
		addbuilpge = login.SignIn("bg25@mailinator.com", "123456");
		
	}
	
	@Test(priority = 2)
	public void AddBuildingTest() throws Exception {
		
		addflrpge = addbuilpge.addNewBuilding("Auda garden");
	}

	@Test(priority = 3)
	public void AddFlrTest() throws Exception {
		addspcepge=addflrpge.addNewFloor("SOFTWEB SOLUTIONS", "FIRST");
	}

    @Test(priority= 4)
    public void AddSpacePage() throws Exception{
    	createmeet=addspcepge.addspace("SOFTWEB SOLUTIONS", "FIRST", "Meeting Room");
   	    
    }
 
    @Test(priority= 5)
    public void meetingcreate() throws Exception{
    	bkmeet=createmeet.createMeeting();
    }

    @Test(priority= 6)
    public void meetingbook() throws Exception{
    	bkmeet.bookameeting("Meeting on 23th March", "alpesh.solanki@softwebsolutions.com", "test amenities via automation", "test catering via automation", "Auda bodakdev");
    }
	
	
}
