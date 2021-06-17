package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sauce_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		Thread.sleep(3000);
		
		// add items to cart
		
		
		//verfiy product is displayed
		String products= driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		System.out.println(products);
		
		
		//click add to cart 
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(3000);
		
		
		  driver.findElement(By.xpath(" //button[@id='checkout']")).click(); 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("dean"); 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("warren");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("2145");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(" //input[@id='continue']")).click(); 
		  Thread.sleep(3000);
		  
		 String total= driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
		  Thread.sleep(3000);
		  
		  System.out.println("total cart value = "+total);
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//button[@id='finish']")).click();
		  
		  Thread.sleep(3000);
		  
		 String confirmation_order= driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")).getText();
		 
		 System.out.println(confirmation_order);
		 
		 driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		 
		

	}

}
