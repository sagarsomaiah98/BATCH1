package com.test.Janbask;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner extends Sauce_Test {

	@Test
	public void test() throws InterruptedException {
		/*
		 * System.out.println("test tesiting");
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe"); WebDriver driver =
		 * new ChromeDriver();
		 * 
		 * driver.get("https://www.google.com");
		 */
		
		Sauce_Test.login();
		
		System.out.println("done");
	}

}
