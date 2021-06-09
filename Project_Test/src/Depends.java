import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends {
	
	@Test
	public void login() {
		
		int a=10;
		int b=20;
		Assert.assertEquals(a, b);
		
		System.out.println("login into application");
	}
	
	
	
	
	
	@Test(dependsOnMethods ={"login"})
	public void home_page() {
		
		System.out.println("home page");
	}

}
