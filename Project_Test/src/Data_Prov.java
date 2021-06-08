import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Prov {
	
	
	@DataProvider (name = "data-provider")
	 public Object[][] dpMethod(){
	 return new Object[][] {
		 
		 {"john","password123"}, 
		 {"henry","password456"}
	 
	 };
	 
	 
	 }
	 
	    @Test (dataProvider = "data-provider")
	    public void myTest (String uname, String pwd) {
	       System.out.println(uname+"  |  "+pwd);
	    }
	}


