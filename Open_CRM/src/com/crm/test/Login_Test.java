package com.crm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {
	
	

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagarseleniumstl@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("***");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		

	}

}
