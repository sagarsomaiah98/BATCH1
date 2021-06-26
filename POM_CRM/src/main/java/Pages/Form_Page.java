package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;





public class Form_Page extends TestBase {
	
	
	
public WebDriver ldriver;
	
	public Form_Page(WebDriver cdriver) {
		ldriver=cdriver;
		PageFactory.initElements(cdriver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Forms')]")
	WebElement uname;
	
	@FindBy(xpath="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement submit;
	
	
	@FindBy(xpath="//span[contains(text(),'Forms')]")
	WebElement Forms;
	
	@FindBy(xpath="//button[contains(text(),'Add')]")
	WebElement Add;
	@FindBy(xpath="//input[@name='name']")
	WebElement name;
	
	@FindBy(xpath="//textarea[@name='intro']")
	WebElement introText;
	
	@FindBy(xpath="//textarea[@name='outro']")
	WebElement outroText;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement Save;
	
	
	
	@FindBy(xpath="//i[@class='dropdown icon']")
	WebElement formDropdown;
	
	@FindBy(xpath="//span[contains(text(),'Address')]")
	WebElement addressSelection;
	
	@FindBy(xpath="//button[contains(text(),'Add')]")
	WebElement AddDropdown;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement titleText;
	@FindBy(xpath="//input[@name='extra']")
	WebElement extraText;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement descriptionText;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement SaveButton;
	
	
	public void Add_form() throws InterruptedException {
		
		Forms.click();
		Add.click();
		name.sendKeys("John");
		introText.sendKeys("This is sample text");
		outroText.sendKeys("Completed the form");
		Save.click();
		Thread.sleep(3000);
	}
	
	
	public void Add_address() throws InterruptedException {
		formDropdown.click();
		addressSelection.click();
		AddDropdown.click();
		titleText.sendKeys("mr");
		extraText.sendKeys("this is the text sample");
		descriptionText.sendKeys("24 Spencer street Aus");
		SaveButton.click();
		Thread.sleep(2000);
		Forms.click();
		System.out.println("address done");
		
	}
	
	
	

}
