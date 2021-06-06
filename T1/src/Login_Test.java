import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='txtUsernam']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		
		
		driver.findElement(By.xpath("//input[@id='callFromDate']")).sendKeys("2021-05-31");
		driver.findElement(By.xpath("//input[@id='callToDate']")).sendKeys("2021-05-31");
		
		
		

	}

}
