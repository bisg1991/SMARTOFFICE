package com.saf.so.smartoffice;

import org.testng.annotations.Test;

import initiator.BrowserInitiator;
import initiator.Grid_2;
import smartoffice.pages.ImportUserPage;

public class Starter3 extends Grid_2 {

	private ImportUserPage iup;
	
	@Test(priority = 1)
	public void loginTest() throws Exception {
		
		iup = login.Sign("naimesh.prajapati@softwebsolutions.com", "qwerty");
	}

	
	@Test(priority=2)
	public void addusermembertest() throws Exception{
		
		iup.inviteuser();
	}
	
	
	
	
	
	
	
	
}
