import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver .get("https://ebay.com");
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Lenovo ThinkPad X270 i5 7300U 2.6GHz 8GB 500GB 12.5\" Win 10 pro");
		 driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		 driver.findElement(By.xpath("//h3[contains(text(),'Lenovo ThinkPad X270 i5 7300U 2.6GHz 8GB 500GB 12.')]")).click();
		 driver.findElement(By.xpath("//h3[contains(text(),'Lenovo ThinkPad X270 i5 7300U 2.6GHz 8GB 500GB 12.')]")).clear();
		 
		 
		 
		 

	}

}
