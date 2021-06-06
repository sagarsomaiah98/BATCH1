import org.openqa.selenium.By;

public class FR extends TestBase {
	
	public static void main(String[] args) throws InterruptedException {
		
		new TestBase();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		Thread.sleep(3000);
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.xpath("//iframe[contains(text(),'<br>')]")).click();
	}

}
