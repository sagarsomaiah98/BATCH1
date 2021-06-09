import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Methods {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//maxmize the browser
		
		driver.manage().window().maximize();
		
		
		//Launch browser
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		Thread.sleep(2000); // wait for 2 seconds
		
		//Typing- where to type / what to type
		
		//driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000); 
		
		String actual=driver.findElement(By.xpath("//input[@id='Subscriber_link']")).getAttribute("value");
		
		//System.out.println("value after i logged in = "+actual);
		
		
		if(actual.equalsIgnoreCase("subscribe"))
			System.out.println(" test case pass");
		
		
		
		driver.quit();
		
		
		
		
		
		//Clicking- where to type
		
		//driver.findElement(null).click();
		
		
		

	}

}
