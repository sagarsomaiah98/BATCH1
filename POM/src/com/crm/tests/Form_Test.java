package com.crm.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.pages.Form_Page;
import com.crm.pages.Login_Page;
import com.crm.testbase.TestBase;

public class Form_Test {
	
	Login_Page l;
	Form_Page frm;
	@BeforeTest
	public void intialization() {
		
		l= new Login_Page();
		l.login("sagarseleniumstl@gmail.com", "Sagarsomaiah");
	}
	
	@Test
	public void forms_test() throws InterruptedException {
		frm=new Form_Page();
		frm.form_page();
		
		
	}

@AfterTest
	
	public void teardown() {
		
		TestBase.driver.quit();
	}
	
	
	
	

}
