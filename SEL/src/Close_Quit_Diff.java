import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit_Diff {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		 System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			//maxmize the browser
			
			driver.manage().window().maximize();
			
			
			//Launch browser
			driver.get("https://login.salesforce.com/");
			Thread.sleep(2000); // wait for 2 seconds
			
			driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
			Thread.sleep(2000);
			
			//driver.close();
			driver.quit();

	}

}
