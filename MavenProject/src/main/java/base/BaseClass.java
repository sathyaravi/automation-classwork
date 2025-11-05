package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;
	

	//Precondition
	
	@BeforeMethod
	
	public void preCondition() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	
	//postcondition
	
	@AfterMethod
	public void postCondition() {
		
		driver.quit();

	}


}
