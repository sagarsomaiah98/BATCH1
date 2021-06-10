import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment_Sample {
	
	@Test
	public void test1() throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","D:\\JARS\\jar_files\\geckodriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("This is a link")).click();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//a[@href='https://www.javatpoint.com/']")).click();
		
		Thread.sleep(2000);
		
		//Locators
		
		//xpath
		
		//link text- only for links - a tag
		
		//id
		
		//name
		
		//css
		
		
		
		//xpath locator
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("janbask");
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		
		Thread.sleep(2000);
		
		//id locator
		driver.findElement(By.id("fname")).sendKeys("Janbask123");
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		
		Thread.sleep(2000);
		//name locator
		
		driver.findElement(By.name("firstName")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		Thread.sleep(2000);
		
		
	}
	
	
	

}
