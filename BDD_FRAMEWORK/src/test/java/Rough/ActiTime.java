package Rough;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.actitime.com/jasban/login.do");
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("som.jasban@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("NU9uDEge");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(8000);
		
		//driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();
		Thread.sleep(8000);
		
		WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'+')]"));
		
		
		  JavascriptExecutor js =(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", ele);
		
		 
		
		Thread.sleep(8000);
		
		System.out.println("clicked +");
	
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[13]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/div[1]/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[1]/td[1]/input[@placeholder='Enter task name']")).sendKeys("task1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Create Tasks')]")).click();
		
		
 //	driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		
		
		
		


	}

}
