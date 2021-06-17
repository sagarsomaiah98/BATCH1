package Rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sauce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
		
		
		  driver.findElement(By.xpath("//button[@id='checkout']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("dean");
		  driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("wense");
		  driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("2145");
		  driver.findElement(By.xpath("//input[@id='continue']")).click();
		  Thread.sleep(2000);
		  
		  String total=
		  driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
		  
		  System.out.println(total); Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@id='finish']")).click();
		  Thread.sleep(2000);
		  
		  String confirmation= driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
		  
		  System.out.println(confirmation);
			
			  driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			  Thread.sleep(2000);
				/*
				 * driver.findElement(By.xpath("/a[@id='logout_sidebar_link']")).click();
				 * Thread.sleep(8000);
				 * 
				 * driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"
				 * )).click(); Thread.sleep(8000);
				 */
			 
		 

	}

}
