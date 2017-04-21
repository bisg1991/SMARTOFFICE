package com.saf.so.smartoffice;

import java.util.Hashtable;

import org.testng.annotations.Test;

import initiator.BrowserInitiator;
import initiator.Grid_2;
import smartoffice.pages.AddBuildingPage;
import smartoffice.pages.AddFloorPage;
import smartoffice.pages.AddSpacePage;
import smartoffice.pages.BookMeetingPage;
import smartoffice.pages.CreateMeetingPage;

// Login > create building > create floor > create space > and book a meeting on the space that was created recently.
public class Starter extends Grid_2 {

	private AddBuildingPage addbuilpge;
	private AddFloorPage addflrpge;
	private AddSpacePage addspcepge;
	private CreateMeetingPage createmeet;
	private BookMeetingPage bkmeet;

	@Test(priority = 1)
	public void loginTest() throws Exception {

		addbuilpge = login.SignIn("naimesh.prajapati@softwebsolutions.com","qwerty");
       
	}

	@Test(priority = 2)
	public void AddBuildingTest() throws Exception {

		addflrpge = addbuilpge.addNewBuilding("Auda garden");
	}

	@Test(priority = 3)
	public void AddFlrTest() throws Exception {
		addspcepge = addflrpge.addNewFloor("SOFTWEB SOLUTIONS", "FIRST");
	}

	/*@Test(priority = 4)
	public void AddSpacePage() throws Exception {
		createmeet = addspcepge.addspace("SOFTWEB SOLUTIONS", "FIRST", "Meeting Room");

	}

	@Test(priority = 5)
	public void meetingcreate() throws Exception {
		bkmeet = createmeet.createMeeting();
	}

	@Test(priority = 6, dataProvider = "readData")
	public void meetingbook(Hashtable<String, String> data) throws Exception {
		
       bkmeet.bookameeting(data.get("title"), data.get("email"), data.get("amenities"), data.get("catering"),data.get("venue"));
	}*/
	

}
