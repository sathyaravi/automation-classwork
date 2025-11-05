package runner;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/feature/login.feature", glue={"stepdefinition"},tags="@smoke",publish=true)
public class RunnerClass extends BaseClass {

	
	
}
