import org.testng.annotations.Test;

public class Ignor {
	
	@Test(enabled = false)
	public void test1() {
		System.out.println("test1");
		
	}
	@Test
	public void test2() {
		
		System.out.println("test2");
		
	}

}
