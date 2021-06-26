import org.junit.Test;

public class TestRunner extends Sauce_Test {
	
	
	@Test
	public void test() throws InterruptedException {
		
		System.out.println("started");
		Sauce_Test.login();
		System.out.println("ended");
		
	}

}
