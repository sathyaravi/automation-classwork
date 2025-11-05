package week5day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	
	public  void preCondition(String Url, String userName, String passwd) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		

		//Initialize web driver
		driver = new ChromeDriver(options);
		//Load the url
		driver.get(Url);
		//Maximize the browser window
		driver.manage().window().maximize();
		//Account creation
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();

	}

}
