package com.crm.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.testbase.TestBase;

public class Login_Page extends TestBase{
	
public void login(String username, String pwd) {
	//new TestBase();
	
	
	driver.get("https://ui.cogmento.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

}


}