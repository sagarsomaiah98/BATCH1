package com.crm.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.pages.LoginPage;
import com.crm.testbase.TestBase;

public class LoginTest extends TestBase{
	
	
	
	@BeforeMethod
	public void intialize() throws IOException {
		
		intialization();
		
		
	}
	
	
	
	@Test(priority=1)
	public void logintest() throws InterruptedException {
		LoginPage	log= new LoginPage();
		
		log.loginPage("sagarseleniumstl@gmail.com", "Sagarsomaiah");
	
		
	}
	
	@Test(priority=2)
	
	public void invalidlogintest() throws InterruptedException {
		
		LoginPage log= new LoginPage();
		
		
		log.loginPage("dffd", "dfdfdfd");
		Thread.sleep(3000);
		
		String error=TestBase.driver.findElement(By.xpath("//p[contains(text(),'Invalid login')]")).getText();
		
		assertEquals(error, "Invalid login");
		
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.close();
		
		
	}

}
