package javarevisiontopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnRadiobuttonsandWebdriverMethods {

	public static void main(String[] args) {

		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		
		//Grand Child to grandparent - Xpath
		
		driver.findElement(By.xpath("//span[text()='Element']/ancestor::a")).click();
		
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		
		
		//WebDriver methods
		
		String currentPage = driver.getCurrentUrl();
		
		if (currentPage.contains("radio")) {
			
			System.out.println("Navigated to Current Page sucessfully:"+currentPage);
		}
		else {
			System.out.println("Error in navigating");
		}
		
		
		
		// Click the label or visible box (either works for UI)
		driver.findElement(By.xpath("//label[text()='Firefox']")).click();

		// Now check the hidden input
		WebElement actualRadio = driver.findElement(By.id("j_idt87:console1:1"));
		boolean isSelected = actualRadio.isSelected();
		System.out.println("Firefox is selected: " + isSelected);
	}

}
