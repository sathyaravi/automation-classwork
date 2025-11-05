package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookImplementation extends BaseClass {
	
	//Precondition
	
	@Before
	
	public void preCondition() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	
	//postcondition
	
	@After
	public void postCondition() {
		
		driver.quit();

	}

}
