import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Prov {
	
	
	@DataProvider (name = "login")
	
	 public Object[][] dpMethod(){
	 return new Object[][] {
		 
		 {"john",}, 
		 {"henry",},
		 {"dean",}
	 
	 };
	 
	 
	 
	 
	 }
	 
	    @Test (dataProvider = "login")
	    public void myTest (String uname) {
	    	
	    	
	       System.out.println(uname+"  |  ");
	    }
	}


