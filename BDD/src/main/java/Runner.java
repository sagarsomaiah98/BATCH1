import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(
features={"src\\main\\resources\\Features\\Login.feature"},
glue={"StepDefiniton"})
//tags="@Regression")
public class Runner {

}
