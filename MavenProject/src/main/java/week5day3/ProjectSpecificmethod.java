package week5day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificmethod {

	ChromeDriver driver;
	@BeforeMethod
	
	public  void preCondition() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		

		//Initialize web driver
		driver = new ChromeDriver(options);
		//Load the url
		driver.get("http://leaftaps.com/opentaps/");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Account creation
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();

}
}
