package com.crm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.crm.pages.FormsPage;
import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;

public class FormsTest {
	
	FormsPage form;
	LoginPage log;
	
	
	@Test
	public void formTest() throws InterruptedException {
		
		log= new LoginPage();
		form= new FormsPage();
		log.loginPage("sagarseleniumstl@gmail.com", "Sagarsomaiah");
		form.formPage();
		
		
		
	}
	
	@AfterMethod
	public void teardown() {
		
		TestBase.driver.quit();
		
		
	}

}
