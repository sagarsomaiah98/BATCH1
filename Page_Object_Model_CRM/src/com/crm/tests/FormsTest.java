package com.crm.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.pages.FormsPage;
import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;

public class FormsTest extends TestBase{
	
	FormsPage form;
	LoginPage log;
	
	@BeforeMethod
	public void intialize() throws IOException {
		
		intialization();
		
		
	}
	@Test
	public void formTest() throws InterruptedException {
		
		log= new LoginPage();
		form= new FormsPage();
		log.loginPage("sagarseleniumstl@gmail.com", "Sagarsomaiah");
		form.formPage();
		
		
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		
		
	}

}
