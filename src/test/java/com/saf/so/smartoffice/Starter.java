package com.saf.so.smartoffice;

import org.testng.annotations.Test;
import org.testng.remote.RemoteTestNG;
import initiator.BrowserInitiator;
import smartoffice.functions.SeleniumException;

public class Starter extends BrowserInitiator{

	@Test(priority=1)
	public void loginTest() throws Exception {
		addbuilpge=login.SignIn("bg25@mailinator.com", "123456");
	}
	
	@Test(priority=2)
	public void AddBuildingTest() throws Exception {
		addbuilpge.addNewBuilding("Auda garden");
	}
	
}
