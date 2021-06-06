import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Frames_Handling extends TestBase{

	public static void main(String[] args) {
		new TestBase();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		Alert al= driver.switchTo().alert();
		al.accept();

	}

}
