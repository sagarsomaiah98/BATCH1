import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
		
		
	
		
	//	WebDriver driver= new ChromeDriver();
		
		
		
		
	System.setProperty("webdriver.gecko.driver", "D:\\JARS\\jar_files\\geckodriver\\geckodriver.exe");
		
		
	
		
		WebDriver driver1= new FirefoxDriver();
		

	}

}
