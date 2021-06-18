package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	
	public static void intialize() throws IOException {
		
		
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\Config.properties");
		
		prop = new Properties();
		prop.load(fis);
		
		String bname=prop.getProperty("Browser");
		
		System.out.println("brower name == "+bname);
		
		switch(bname){
		  
		  
		  case "chrome":
			  System.setProperty("webdriver.chrome.driver",
					  "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe"); 
			  driver = new
					  ChromeDriver(); 
		  break; 
		  case "firefox":
		  WebDriverManager.firefoxdriver().setup(); 
		  driver = new FirefoxDriver();
		  break; case "edge":
			  WebDriverManager.edgedriver().setup(); driver=new
		  EdgeDriver(); 
			  break; 
		  default:
			  System.out.println("invalid browser");
		  
		  
		  }
		
		
		
		
		
		
		
		
			
			 
			  
			  driver.manage().window().maximize();
			 
		
		
		
		
		
		
	}
	
	
	
	
	

}
