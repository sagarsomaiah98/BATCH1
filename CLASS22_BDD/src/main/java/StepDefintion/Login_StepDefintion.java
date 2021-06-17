package StepDefintion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefintion {
	
	
	@Given("^Enter the url \"([^\"]*)\" of the application$")
	public void enter_the_url_of_the_application(String url) throws Throwable {
		System.out.println("Enter the url of the application = "+url);
	 
	}

	@When("^Enter the username \"([^\"]*)\"$")
	public void enter_the_username(String uname) throws Throwable {
	  
		System.out.println("username entered is "+uname);
	}

	@When("^Enter the password \"([^\"]*)\"$")
	public void enter_the_password(String pwd) throws Throwable {
		System.out.println("password entered is "+pwd);
	 
	}

	@Then("^Click Submit$")
	public void click_Submit() throws Throwable {
		
		System.out.println(" clicked submit");
		
		System.out.println("*************************************");
	  
	}

	
	
	@Given("^Logged to the application$")
	public void logged_to_the_application() throws Throwable {
		
		System.out.println("logged to the application");
	  
	}

	@When("^I select all the mail$")
	public void i_select_all_the_mail() throws Throwable {
		System.out.println("select all the mail");
	  
	}

	@When("^I click delete button$")
	public void i_click_delete_button() throws Throwable {
		
		System.out.println("delete button");
	   
	}

	@Then("^All mail are deleted$")
	public void all_mail_are_deleted() throws Throwable {
	  
		
		System.out.println("mail are deleted");
	}

	@Given("^Logged to the application as admin$")
	public void logged_to_the_application_as_admin() throws Throwable {
		System.out.println("logged to application as admin");
	    
	}

	@When("^I compose mail and dont send$")
	public void i_compose_mail_and_dont_send() throws Throwable {
		System.out.println("compose mail and dont send");
	   
	}

	@Then("^Mail are saved in outbox$")
	public void mail_are_saved_in_outbox() throws Throwable {
		System.out.println("mail saved in outbox");
	 
	}


	@Given("^server is running$")
	public void server_is_running() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("**********************");
	System.out.println("server is running");
	}

	@Given("^I username and password is created$")
	public void i_username_and_password_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("username and password is created");
	}
	


}
