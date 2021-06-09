
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bfr_Afr_Method {
	
	
	 @Test
	   public void testCase1() {
	      System.out.println("in test case 1");
	   }

	   // test case 2
	   @Test
	   public void testCase2() {
	      System.out.println("in test case 2");
	   }

	   @AfterMethod
	   public void afterMethod() {
	      System.out.println("in afterMethod");
	   }

	  

	   
	   @Test
	   public void testCase3() {
	      System.out.println("in test case 3");
	   }

@BeforeMethod
public void beforeMethod() {
   System.out.println("in beforeMethod");
}
}