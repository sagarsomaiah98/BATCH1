package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.crm.testbase.TestBase;

public class Form_Page extends TestBase {
	
	public void form_page() throws InterruptedException {
		
		
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
	}

}
