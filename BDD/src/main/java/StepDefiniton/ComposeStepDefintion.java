package StepDefiniton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComposeStepDefintion {
	
	
	@Given("^the credentials$")
	public void the_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("credentials");
	}

	@When("^I click compose$")
	public void i_click_compose() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("compose");
	}

	@Then("^mail sent$")
	public void mail_sent() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("mail sent");
	}
	
	
	
	@Given("^To address$")
	public void to_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("address");
	}

	@When("^I enter self$")
	public void i_enter_self() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println(" enter self");
	}

	@Then("^I send$")
	public void i_send() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("send");
	}

	@Given("^multi select$")
	public void multi_select() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("multi select");
	}

	@When("^multi details$")
	public void multi_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("multi details");
	}

	@Then("^I Send$")
	public void i_Send() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("send");
	}


}
