package com.janbask.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test_Case {
	
	public static void Login_Test() {
		
		
	
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		Login_Test();
	}

}
