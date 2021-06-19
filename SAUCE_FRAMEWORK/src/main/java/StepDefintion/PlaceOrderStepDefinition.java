package StepDefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestBase.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class PlaceOrderStepDefinition extends TestBase {
	
	//shortcut to import everything is ctrl+shift+o
	
	@Given("^Launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	  
	}

	@When("^I enter the username \"([^\"]*)\" and enter the password \"([^\"]*)\"$")
	public void i_enter_the_username_and_enter_the_password(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("user-name")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
		
	   
	}

	@Then("^I click submit$")
	public void i_click_submit() throws Throwable {
		driver.findElement(By.name("login-button")).click();
	 
	}

	@When("^I add the item to the cart$")
	public void i_add_the_item_to_the_cart() throws Throwable {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(3000);
	   
	}

	@When("^I click cart$")
	public void i_click_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);

	}

	@When("^I click checkout$")
	public void i_click_checkout() throws Throwable {
		  driver.findElement(By.xpath(" //button[@id='checkout']")).click(); 
		  Thread.sleep(3000);
	
	}

	@When("^I enter the details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter_the_details(String arg1, String arg2, String arg3) throws Throwable {
		
		
		
		 driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(arg1); 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(arg2);
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(arg3);
		  Thread.sleep(3000);
	  
	}

	@When("^I click continue$")
	public void i_click_continue() throws Throwable {
		  driver.findElement(By.xpath(" //input[@id='continue']")).click(); 
		  Thread.sleep(3000);
	    
	}

	@When("^I verify total value$")
	public void i_verify_total_value() throws Throwable {
		
		String total= driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
		  Thread.sleep(3000);
		  
		  System.out.println("total cart value = "+total);
		  Thread.sleep(3000);
		  
	  
	}

	@When("^I click Finish$")
	public void i_click_Finish() throws Throwable {
  driver.findElement(By.xpath("//button[@id='finish']")).click();
		  
		  Thread.sleep(3000);
	
	}

	@When("^I verify the order$")
	public void i_verify_the_order() throws Throwable {
 String confirmation_order= driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")).getText();
		 
		 System.out.println(confirmation_order);
	  
	}

	@Then("^I navigate to home page$")
	public void i_navigate_to_home_page() throws Throwable {
		 driver.findElement(By.xpath("//button[@id='back-to-products']")).click();;
	}

}
