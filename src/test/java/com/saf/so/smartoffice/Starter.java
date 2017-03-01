package com.saf.so.smartoffice;

import org.testng.annotations.Test;
import initiator.BrowserInitiator;
import smartoffice.functions.SeleniumException;
import smartoffice.pages.AddBuildingPage;
import smartoffice.pages.AddFloorPage;

public class Starter extends BrowserInitiator {

	private AddBuildingPage addbuilpge;
	private AddFloorPage addflrpge;

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
		addflrpge.addNewFloor("SOFTWEB SOLUTIONS");
	}
}
