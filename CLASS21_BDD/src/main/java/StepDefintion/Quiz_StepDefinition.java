package StepDefintion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Quiz_StepDefinition {
	
	//ctrl+shift+O
	
	WebDriver driver;
	
	@Given("^Enter the url \"([^\"]*)\"$")
	public void enter_the_url(String url) throws Throwable {
		
            System.out.println("Enter the url of the application = "+url);
		
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		 driver.navigate().to(url); //or driver.get();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	   
	}

	@Then("^I capture the text$")
	public void i_capture_the_text() throws Throwable {
		
		String text=driver.findElement(By.xpath("//b[contains(text(),'This is sample text.')]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
	   
	}

	@Then("^I click the link$")
	public void i_click_the_link() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'This is a link')]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
	 
	}

	@Then("^I Enter the text \"([^\"]*)\"$")
	public void i_Enter_the_text(String val) throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(val);
		Thread.sleep(3000);
	    
	}

	@Then("^I click the button$")
	public void i_click_the_button() throws Throwable {
		
		driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
		Thread.sleep(3000);
	 
	}

	@Then("^I select the radio button$")
	public void i_select_the_radio_button() throws Throwable {
		
		driver.findElement(By.id("female")).click();
		Thread.sleep(3000);
	   
	}

	@Then("^I select the checkbox$")
	public void i_select_the_checkbox() throws Throwable {
		driver.findElement(By.xpath(" //body/div[1]/div[8]/div[1]/form[1]/input[2]")).click();
		Thread.sleep(3000);
	  
	}



}
