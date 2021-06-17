package com.janbask.sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Login {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		 WebElement element=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		 
		 Thread.sleep(3000);
		 element.sendKeys("Admin");
		 
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		 WebElement Login= driver.findElement(By.xpath("//input[@id='btnLogin']"));
		 System.out.println("Login button text value is  = "+Login.getAttribute("value"));
		 Login.click();
		 
		
		 	
		 	
		 	
		 	Thread.sleep(3000);
		 	
		 	
		 	 //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File("C:\\Users\\somai\\Desktop\\BATCH FILE\\login.jpeg");

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);
		 	
		 	System.out.println(" Logged in Successfully");
		 	
		 	
		 	
		 	driver.close();
		
	
	
		
		

	}

}
