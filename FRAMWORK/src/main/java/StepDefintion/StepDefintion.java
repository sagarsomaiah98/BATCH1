package StepDefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefintion {
	
	@Given("^Launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
	    
	}

	@When("^I enter the username \"([^\"]*)\" and enter the password \"([^\"]*)\"$")
	public void i_enter_the_username_and_enter_the_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^I click submit$")
	public void i_click_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}



}
