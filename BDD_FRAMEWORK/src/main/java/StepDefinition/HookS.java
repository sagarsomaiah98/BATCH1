package StepDefinition;

import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.TestBase;

public class HookS extends TestBase{
	
	
	@Before
	public void init() throws IOException {
		
		
		 intialize();
	}
	
	
	@After
	public void tearDown() {
		
		//driver.close();
	}

}
