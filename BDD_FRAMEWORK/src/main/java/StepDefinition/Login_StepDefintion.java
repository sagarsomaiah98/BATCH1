package StepDefinition;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import Sauce_Pages.Login_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.TestBase;
import util.TestUtil;

public class Login_StepDefintion extends TestBase{
	
	@Given("^Launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws Throwable {

		// intialize();
	   
	 String url=  prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		
	}

	@When("^I enter the username \"([^\"]*)\" and enter the password \"([^\"]*)\"$")
	public void i_enter_the_username_and_enter_the_password(String uname, String pwd) throws Throwable {
		loginpage= new Login_Page(driver);
		loginpage.enter_username(uname);
		loginpage.enter_password(pwd);
		
	  
		
	}

	@Then("^I click submit$")
	public void i_click_submit() throws IOException  {
		
		try {
			loginpage.click_submit();
			String value=TestUtil.gettext("//span[contains(text(),'Products')]");
			
			assertEquals(value, "PRODUCTS");
			
			TestUtil.Screenshot();
		} catch (IOException e) {
			
			TestUtil.Screenshot();
			System.out.println(" Unable to click on submit");
			e.printStackTrace();
		}
	}
	
	
	

}
