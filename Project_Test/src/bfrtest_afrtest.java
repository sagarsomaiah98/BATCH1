import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bfrtest_afrtest {
	
	
	
	  @BeforeTest
	   public void beforeTest() {
	      System.out.println("in beforeTest");
	   }

	   @AfterTest
	   public void afterTest() {
	      System.out.println("in afterTest");
	   }
	   
	   
	   @Test
	   public void testCase1() {
		      System.out.println("in test case 1");
		   }

		   // test case 2
		   @Test
		   public void testCase2() {
		      System.out.println("in test case 2");
		   }

}
