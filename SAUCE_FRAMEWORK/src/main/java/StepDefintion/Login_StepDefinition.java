package StepDefintion;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import TestBase.TestBase;
import TestUtil.Util;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefinition  extends TestBase{
	
	LoginPage l;

	@Given("^Launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws Throwable {
		
		//intialize();
		
	
		System.out.println(" launch browser");
		
		
		
		driver.get("https://www.saucedemo.com/");
		
		
	 
	}

	@When("^I enter the username \"([^\"]*)\" and enter the password \"([^\"]*)\"$")
	public void i_enter_the_username_and_enter_the_password(String arg1, String arg2) throws Throwable {
		
		System.out.println("enter username and enter password");
		l= new LoginPage(driver);
		
		l.enter_username(arg1);
		l.enter_password(arg2);
		
		
		
	  
	}

	@Then("^I click submit$")
	public void i_click_submit() throws Throwable {
		
		try {
	   
		System.out.println("click submit");
		l.click_submit();
		
		String value= driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		
		assertEquals(value, "PRODUCTS");
		
		Util.Screenshot();
		}
		catch(Exception e) {
			Util.Screenshot();
			System.out.println("unsuccessful login");
		}
		
	}
	}