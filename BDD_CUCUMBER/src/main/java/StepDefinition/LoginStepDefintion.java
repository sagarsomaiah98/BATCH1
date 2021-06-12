package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefintion {
	
	@Given("^launch the browser$")
	public void enterurl() throws Throwable {
	 
	   System.out.println(" website entered");
	}

	@Given("^there user logs in through Login Window by using Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void entercredentials(String arg1, String arg2) throws Throwable {
		
		System.out.println(" credentials entered ");
	    
	}

	@Then("^login must be successful\\.$")
	public void login_successful() throws Throwable {
		
		System.out.println("logged successfully");
	   
	}


	
	
	

}
