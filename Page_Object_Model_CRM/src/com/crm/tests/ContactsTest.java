package com.crm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.crm.pages.ContactsPage;
import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;
import com.crm.util.TestUtil;

public class ContactsTest {
	
	LoginPage log;
	ContactsPage cont;
	
	
	@Test
	public void contactsTest() throws InterruptedException {
		
		log= new LoginPage();
		cont= new ContactsPage();
		
		log.loginPage("sagarseleniumstl@gmail.com", "Sagarsomaiah");
		
		cont.contactsPage(TestUtil.random_String(), TestUtil.random_String());
		
	}
	
	@AfterMethod
	public void teardown() {
		
		//TestBase.driver.quit();
		
		
	}
	

}
