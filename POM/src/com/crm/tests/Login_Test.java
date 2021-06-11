package com.crm.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.pages.Login_Page;
import com.crm.testbase.TestBase;

public class Login_Test {
	Login_Page l;
	@BeforeTest
	public void intialization() {
		
		l= new Login_Page();
	}
	
	@Test
	public void logintest() {
		
		l.login("sagarseleniumstl@gmail.com", "*****");
		
		
		
		
	}
	@AfterTest
	
	public void teardown() {
		
		//TestBase.driver.quit();
	}
	
	

}
