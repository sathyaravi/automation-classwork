package week3day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launchpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate and launch the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Log into the portal
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
		String enteredUser = driver.findElement(By.id("username")).getDomAttribute("value");
		System.out.println(enteredUser);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	
	
		
	
	}

}
