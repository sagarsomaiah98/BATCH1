package StepDefinition;

import org.openqa.selenium.By;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.TestBase;

public class Order_StepDefinition extends TestBase {
	
	
	
	@When("^I add the item to the cart$")
	public void i_add_the_item_to_the_cart() throws Throwable {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(3000);
	}

	@When("^I click cart$")
	public void i_click_cart() throws Throwable {
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
