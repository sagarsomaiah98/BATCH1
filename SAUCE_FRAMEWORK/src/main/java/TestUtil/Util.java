package TestUtil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestBase.TestBase;

public class Util extends TestBase {
	
	
	
public  static void Screenshot() throws IOException {
		
		String name = driver.getTitle();

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(System.getProperty("user.dir") + "\\Screenshots\\" + name + ".jpeg");

		FileUtils.copyFile(SrcFile, DestFile);
			
	}
	

}
