package StepDefintion;

import java.io.IOException;

import TestBase.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class HookS extends TestBase{
	
	
	@Before
	public void init() throws IOException {
		
		
		 intialize();
	}
	
	
	@After
	public void tearDown() {
		
		driver.close();
	}

}
