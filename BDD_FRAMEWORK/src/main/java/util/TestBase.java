package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Sauce_Pages.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static Login_Page loginpage;
	
	
	public static void  intialize() throws IOException {
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
		 prop= new Properties();
		
		prop.load(fis);
		
		//String bname="chrome";
		
		
		  String bname= prop.getProperty("browser");
		  System.out.println(bname);
		  
		  WebDriverManager.chromedriver().setup(); driver= new
				  ChromeDriver(); 
		  
		  
		  switch(bname){
		  
		  
		  case "chrome": WebDriverManager.chromedriver().setup(); driver= new
		  ChromeDriver(); break; case "firefox":
		  WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
		  break; case "edge": WebDriverManager.edgedriver().setup(); driver=new
		  EdgeDriver(); break; default: System.out.println("invalid browser");
		  
		  
		  }
		 
		    
		
		
		
	}

}
