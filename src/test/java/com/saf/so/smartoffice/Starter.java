package com.saf.so.smartoffice;

import org.testng.annotations.Test;

import initiator.BrowserInitiator;
import smartoffice.functions.SeleniumException;

public class Starter extends BrowserInitiator{

	@Test(priority=1)
	public void loginTest() throws Exception {
		login.SignIn("bg25@mailinator.com", "123456");
	}
}
