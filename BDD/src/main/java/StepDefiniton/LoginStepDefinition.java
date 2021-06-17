package StepDefiniton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	@Given("^server is running$")
	public void server_is_running() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("*************");
	 System.out.println("Background server running");
	}

	@Given("^I username and password is created$")
	public void i_username_and_password_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(" Background username and password created");
	}

	
	
	
	
	
	@Given("^Enter the \"([^\"]*)\" of the application$")
	public void enter_the_of_the_application(String arg1) throws Throwable {
		System.out.println("Enter the url  "+arg1);
		
	    
	
	}

	@When("^Enter the username \"([^\"]*)\"$")
	public void enter_the_username(String arg1) throws Throwable {
		System.out.println("Enter the password  "+arg1);
	}

	@When("^Enter the  password \"([^\"]*)\"$")
	public void enter_the_password(String arg1) throws Throwable {
		System.out.println("Enter the password  "+arg1);
	}
	
	@When("^Click Submit$")
	public void click_Submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("click submit");
	}


	@Then("^Login Successful$")
	public void login_Successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("login succesful");
	}
}
