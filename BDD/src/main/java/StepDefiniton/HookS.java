package StepDefiniton;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookS {
	
	
	@Before
	public void database_is_running() throws Throwable {
	   System.out.println("before test");
	}

	
	@After
	public void user_registered() throws Throwable {
	   System.out.println("after test");
	   System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}


}
