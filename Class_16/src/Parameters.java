import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Parameters extends TestBase {
	
	public void login(String uname, String pwd) throws InterruptedException {
		new TestBase();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		 WebElement element=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		 
		 Thread.sleep(3000);
		 element.sendKeys(uname);
		 
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);
		 WebElement Login= driver.findElement(By.xpath("//input[@id='btnLogin']"));
		 System.out.println("Login button text value is  = "+Login.getAttribute("value"));
		 Login.click();
		 
		 driver.quit();
		 
		
		 	
	}

	public static void main(String[] args) throws InterruptedException {
		
		Parameters p = new Parameters();
		p.login("Admin","admin123");
		p.login("addfdf", "sdfsfsf");
		
		
		
		

	}

}
