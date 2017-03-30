package com.saf.so.smartoffice;

import org.testng.annotations.Test;

import initiator.BrowserInitiator;
import smartoffice.pages.ImportUserPage;

public class Starter3 extends BrowserInitiator {

	private ImportUserPage iup;
	
	@Test(priority = 1)
	public void loginTest() throws Exception {
		
		iup = login.Sign("bg25@mailinator.com", "123456");
	}

	
	@Test(priority=2)
	public void addusermembertest() throws Exception{
		
		iup.inviteuser();
	}
	
	
	
	
	
	
	
	
}
