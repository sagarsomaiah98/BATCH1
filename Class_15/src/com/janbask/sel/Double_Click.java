package com.janbask.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
      System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
	
		
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);


		

		WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		
		Thread.sleep(3000);

		a.doubleClick(trialaction).perform();
		
	
		
		
		

	}

}
