package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
public WebDriver ldriver;
	
	public LoginPage(WebDriver cdriver) {
		ldriver=cdriver;
		PageFactory.initElements(cdriver, this);
			
		
	}
	
	@FindBy(id="user-name")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="login-button")
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
