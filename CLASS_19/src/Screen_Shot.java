import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class Screen_Shot {

	@Test
	
	public void login() throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		TakesScreenshot ts= (TakesScreenshot)driver;
	File src=	ts.getScreenshotAs(OutputType.FILE);
	
//	 FileUtils.copyFile(src, new File("C:\\Users\\somai\\Desktop\\\BATCH FILE\\homePageScreenshot.png"));
	
		/*
		 * File DestFile=new File("C:\\\\Users\\\\somai\\\\Desktop\\\\BATCH FILE\\");
		 * 
		 * //Copy file at destination
		 * 
		 * FileUtils.copyFile(src, DestFile);
		 */
		
		
		
		
	}
}
