import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	@Test
	
	public void test() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.saucedemo.com/");//enter the url
		
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		driver.navigate().to("http://www.google.com");
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.close();
		
	}
	

}
