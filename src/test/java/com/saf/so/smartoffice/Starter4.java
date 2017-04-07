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

	/*
	 * Hashtable<String, String> tbl = new Hashtable<>();2
	 * 
	 * @Test(priority = 3, dataProvider = "readData") public void
	 * meetfromicon(Hashtable<String, String> bhisva) {
	 * tbl.put(bhisva.get("Title"), bhisva.get("emails")); }
	 */
	/*ArrayList<Hashtable<String, String>> list = new ArrayList<>();

	@Test(priority = 2, dataProvider= "readData")
	public void meetfromicon(Hashtable<String, String> data) {
		System.out.println("here!!");
		list.add(data);
		System.out.println("data list: " + data);
	}*/
	
/*	@Test(priority = 2, dataProvider = "readData")
	public void test(Hashtable<String, String> data) {
		System.out.println("here!!");
		list.add(data);
		System.out.println("data list: " + data);
	}*/

	@Test(priority = 2)
	public void meetfromicon() throws Exception {

		//create.meetfromicon(list);
		create.meetfromsearchpage();
	}

}
