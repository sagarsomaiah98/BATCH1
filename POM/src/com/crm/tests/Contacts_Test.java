package com.crm.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.pages.Contacts_Page;
import com.crm.pages.Login_Page;
import com.crm.testbase.TestBase;

public class Contacts_Test {
	
	Login_Page l;
	Contacts_Page cont;
	@BeforeTest
	public void intialization() {
		
		l= new Login_Page();
		l.login("sagarseleniumstl@gmail.com", "Sagarsomaiah");
	}
	
	@Test
	public void contacts_test() throws InterruptedException {
		cont=new Contacts_Page();
		cont.contacts_page("john", "ken");
		
		
	}

@AfterTest
	
	public void teardown() {
		
		TestBase.driver.quit();
	}
	
}
