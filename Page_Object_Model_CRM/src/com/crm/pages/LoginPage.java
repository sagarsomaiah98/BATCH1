package com.crm.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.crm.testbase.TestBase;

public class LoginPage extends TestBase {
	
	
	public void loginPage(String username, String pwd) throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	

}
