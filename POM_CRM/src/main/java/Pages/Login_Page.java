package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;



public class Login_Page extends TestBase{
	
public WebDriver ldriver;
	
	public Login_Page(WebDriver cdriver) {
		ldriver=cdriver;
		PageFactory.initElements(cdriver, this);
		
		
		
	}
	
	@FindBy(name="email")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement submit;
	

	
	
	public void enter_username(String username) {
		uname.sendKeys(username);
	}
	
	public void enter_password(String password) {
		pwd.sendKeys(password);
	}
	
	public void click_submit() {
		submit.click();
		
	}
	
	
		
		
	
	
	


}


