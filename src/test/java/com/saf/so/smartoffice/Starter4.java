package com.saf.so.smartoffice;

import java.util.ArrayList;
import java.util.Hashtable;

import org.testng.annotations.Test;

import initiator.BrowserInitiator;
import smartoffice.pages.CreateEventIconPage;

public class Starter4 extends BrowserInitiator {

	private CreateEventIconPage create;

	@Test(priority = 1)
	public void loginTest() throws Exception {
		System.out.println("here1!!");
		create = login.SignIns("bis02@mailinator.com", "123456");
	}

	
    private ArrayList<String> title = new ArrayList<>();
	private ArrayList<String> emails = new ArrayList<>();

	@Test(priority = 2, dataProvider = "readData")
	public void meetfromicon(Hashtable<String, String> data) {
		title.add(data.get("Title"));
		emails.add(data.get("emails"));
	}

	@Test(priority = 3)
	public void meetfromicon() throws Exception {
		create.meetfromsearchpage(title, emails);
	}

}
