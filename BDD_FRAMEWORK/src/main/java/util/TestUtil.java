package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;

public class TestUtil extends TestBase {
	
	
	public  static void Screenshot() throws IOException {
		
		String name = driver.getTitle();

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(System.getProperty("user.dir") + "\\Screenshots\\" + name + ".jpeg");

		FileUtils.copyFile(SrcFile, DestFile);
			
	}
	
	
	

	public  static String gettext(String xpath) {
		
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	
	public static void selectDropDown(WebElement ele,String text) {
		
		Select sel = new Select(ele);
		
		sel.deselectByVisibleText(text);
		
		
	}
	
}
