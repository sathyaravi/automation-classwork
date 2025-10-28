package javarevisiontopics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserBasics {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Basic locators
		
		//Using name
		
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		
		//Using id
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//using className
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		System.out.println("Login Successful");
		
		//Using linktext
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Using xpath
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		System.out.println("Logged out");
		
		driver.close();
		
		
		
		

	}

}
