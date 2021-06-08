import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		
		//Launch the browser- chrome
	//	System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\chromedriver\\chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
		
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\JARS\\jar_files\\geckodriver\\geckodriver.exe");
		//WebDriver driver1 = new FirefoxDriver();
		
		WebDriver driver2= new EdgeDriver();

	}

}
