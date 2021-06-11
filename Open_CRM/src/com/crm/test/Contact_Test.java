package com.crm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Test {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagarseleniumstl@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("***");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Ken");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(3000);
		String name=driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).getText();
		System.out.println(name);
	
		
		
		

	}

}
