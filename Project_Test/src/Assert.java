import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Assert {
	
	
	
	
	@Test
	public void login_test() {
		
		//Lines of selenium code
		// Value of subscribe and store it string variable actual
		
		// String variable with expected
		
		String value1="subscribe";
		
		String value2="subscribe";
		
		
		  if(value1.equalsIgnoreCase(value2))
			  
		  System.out.println(" test case passed"); 
		  
		  else {
		  
		  System.out.println("test case failed");
		  System.out.println(" msg");
		 
		  }
		//assertEquals(actual, expected);
		assertEquals(value1,value2,"login not successful");
		
		
		
		
		
		
	}

}
