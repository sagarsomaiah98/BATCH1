import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class bfrcl_afr_cl {
	
	
	 public void testCase1() {
	      System.out.println("in test case 1");
	   }

	   // test case 2
	   @Test
	   public void testCase2() {
	      System.out.println("in test case 2");
	   }

	
	 @BeforeClass
	   public void beforeClass() {
		 
		 
		 
		 
	      System.out.println("in beforeClass");
	   }

	   @AfterClass
	   public void afterClass() {
	      System.out.println("in afterClass");
	   }

}
