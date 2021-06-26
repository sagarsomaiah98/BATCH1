package com.janbask.read.Data;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Data_Testing {

	public static void main(String[] args) throws InterruptedException {
	
		Xls_Reader xls= new Xls_Reader("D:\\JANBASK\\BATCH 1\\DataParameterization\\src\\main\\java\\TestData\\SAUCE_LOGIN.xlsx");
		int total_Rows=xls.getRowCount("SAUCE");
		//System.out.println(total_Rows);
		
		
		      System.setProperty("webdriver.chrome.driver",
				  "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe"); 
				 
		
		
		
		
		for(int i=2;i<=total_Rows;i++) {
			
			String uname= xls.getCellData("SAUCE", "USERNAME", i);
			
			String pwd= xls.getCellData("SAUCE", "PASSWORD", i);
			
			WebDriver driver = new ChromeDriver();
			  
			  
			  driver.get("https://www.saucedemo.com/");
			  driver.manage().window().maximize();
			  
			  driver.findElement(By.id("user-name")).sendKeys(uname);
			  driver.findElement(By.id("password")).sendKeys(pwd);
			  driver.findElement(By.name("login-button")).click();
			  driver.close();
			  
			  Thread.sleep(3000);
			//  driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
			
			  
			//  driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
			 
			  
			  
		      
		}
		
		
		
		
		
		
		  
		  
		 
		 
	}

}
