package Pages;

import org.openqa.selenium.By;

import Util.TestBase;



public class Contacts_Page extends TestBase {
	
	
	public void contacts_page(String fname, String lname) throws InterruptedException {
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lname);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		Thread.sleep(3000);
		String name=driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).getText();
		System.out.println(name);
		
	}
	
	

}
