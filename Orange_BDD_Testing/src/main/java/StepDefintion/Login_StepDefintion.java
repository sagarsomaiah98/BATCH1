package StepDefintion;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefintion {
	
	
	 WebDriver driver;
	
	
	@Given("^Enter the url \"([^\"]*)\" of the application$")
	public void enter_the_url_of_the_application(String url) throws Throwable {
		System.out.println("Enter the url of the application = "+url);
		
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		 driver.navigate().to(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	 
	}

	@When("^Enter the username \"([^\"]*)\"$")
	public void enter_the_username(String uname) throws Throwable {
	  
		System.out.println("username entered is "+uname);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
	}

	@When("^Enter the password \"([^\"]*)\"$")
	public void enter_the_password(String pwd)  {
		System.out.println("password entered is "+pwd);
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);
	 
	}

	@Then("^Click Submit$")
	public void click_Submit() throws Throwable {
		
		System.out.println(" clicked submit");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		
		System.out.println("*************************************");
	  
	}
	
	
	@Then("^Close the application$")
	public void close_the_application() throws Throwable {
	  driver.close();
	}

	
	
	@Then("^I see the invalid message$")
	public void i_see_the_invalid_message() throws Throwable {
	String error=  driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
	  System.out.println(error);
	  assertEquals(error, "Invalid credentials");
	  
	}

	
	


}
