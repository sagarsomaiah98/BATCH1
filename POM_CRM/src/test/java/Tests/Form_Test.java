package Tests;







import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Form_Page;
import Pages.Login_Page;
import Util.TestBase;



public class Form_Test extends TestBase {
	
	Login_Page l= new Login_Page(driver);
	Form_Page frm=new Form_Page(driver);
	@BeforeTest
	public void intialization() throws InterruptedException {
		System.out.println("before method");
		l.enter_username("sagarseleniumstl@gmail.com");
		l.enter_password("Sagarsomaiah");
		l.click_submit();
		System.out.println("form loggin done");
		Thread.sleep(3000);
	}
	
@Test
	public void forms_test() throws InterruptedException {
	System.out.println("started");
	
		frm.Add_form();
		frm.Add_address();
		System.out.println("form test done");
		driver.close();
		
		
	}



	
	
	
	

}
