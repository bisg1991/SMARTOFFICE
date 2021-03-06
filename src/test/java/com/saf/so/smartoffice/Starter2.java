package com.saf.so.smartoffice;

import java.util.Hashtable;

import org.testng.annotations.Test;

import initiator.BrowserInitiator;
import smartoffice.functions.Reader;
import smartoffice.pages.AddBuildingPage;
import smartoffice.pages.AddFloorPage;
import smartoffice.pages.AddSpacePage;
import smartoffice.pages.CreateEventIconPage;

// Login > create building > create floor > create space > book meeting on all the available spaces from the create event button present at the top header.

public class Starter2 extends BrowserInitiator {

	private AddBuildingPage addbuilpge;
	private AddFloorPage addflrpge;
	private AddSpacePage addspcepge;
	private CreateEventIconPage eip;

	@Test(priority = 1)
	public void loginTest() throws Exception {

		addbuilpge = login.SignIn("bis02@mailinator.com", "123456");
	}

	@Test(priority = 2)
	public void AddBuildingTest() throws Exception {

		addflrpge = addbuilpge.addNewBuilding("Auda garden");
	}

	@Test(priority = 3)
	public void AddFlrTest() throws Exception {
		addspcepge = addflrpge.addNewFloor("SOFTWEB SOLUTIONS", "FIRST");
	}

	@Test(priority = 4)
	public void AddSpacePage() throws Exception {
		eip = addspcepge.addspace2("SOFTWEB SOLUTIONS", "FIRST", "Meeting Room");
	}

	@Test(priority = 5, dataProvider = "readData")
	public void meetfromicon(Hashtable<String, String> data) throws Exception {
		Reader r = new Reader(0);
//		eip.meetfromicon(data);
	}

}
