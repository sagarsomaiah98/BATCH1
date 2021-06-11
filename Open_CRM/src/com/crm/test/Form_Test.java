package com.crm.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Form_Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagarseleniumstl@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("****");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Forms')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("John");
		driver.findElement(By.xpath("//textarea[@name='intro']")).sendKeys("This is sample text");
		driver.findElement(By.xpath("//textarea[@name='outro']")).sendKeys("Completed the form");
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[@name='selectedElementType']"));
		System.out.println(ele);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='dropdown icon']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Address')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Mr");
		driver.findElement(By.xpath("//input[@name='extra']")).sendKeys("John");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("24 Spencer street Aus");
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Forms')]")).click();
		Thread.sleep(3000);
		
		WebElement elemen= driver.findElement(By.xpath("//tbody/tr[1]/td[4]"));
		Actions action = new Actions(driver);
		action.moveToElement(elemen).build().perform();
		
		 

		//driver.findElement(By.xpath("//tr[1]/td/div/input[@type='checkbox']")).click();
		System.out.println("click check box");
		String check=driver.findElement(By.xpath("//tr[1]/td/div/input[@type='checkbox']")).getAttribute("type");
		
		System.out.println(check);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		while(true) {
			System.out.println("while loop");
		
			
		WebElement e=driver.findElement(By.xpath("//tr[1]/td/div/input[@type='checkbox']"));
		Thread.sleep(3000);
		
		
		  
		  jse.executeScript("arguments[0].click()", e);	
		  
		  
			
			driver.findElement(By.xpath("//tr[1]/td[7]/div/button/i[@class='trash icon']")).click();
			driver.findElement(By.xpath("//button/i[@class='checkmark icon']")).click();
            
           Thread.sleep(2000);
           try {
          WebElement el= driver.findElement(By.xpath("//tr[1]/td/div/input[@type='checkbox']"));
          el.click();
          System.out.println("try block" +check);
            }
            
			
			  catch(Exception e2) {
			  
			  System.out.println("catch block "+check); 
			  break;
			  }
			 
			
		                    }
		System.out.println("outside");
		driver.quit();
		  
		}
			
		
		
		}
		
		
		
		

		
		
		
		
		
	


