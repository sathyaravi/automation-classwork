package javarevisiontopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownMethods {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
				
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Testleaf testing Account");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("ODBT");
		
		/*We can handle the dropdown using select class in selenium webdriver
		Syntax: Select options = new Select(WebElement);
		options.selectbyvalue("value")  --  uses the value of the value attribute
		options.selectbyvisibletext("OWN"); - uses the text from DOM of the particular option
		options.selectbyindex(0) - index starts from 0
		*/
		
		WebElement element = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		
		Select industryDropdown = new Select(element);
		
		//Select dropdown value using index
		
		industryDropdown.selectByIndex(0);
		
		
		WebElement element2 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		
		Select ownerDropdown = new Select(element2);
		
		//using select by value method
		
		ownerDropdown.selectByValue("OWN_PROPRIETOR");
		
		
		WebElement element3 = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		
		Select sourceDropdown  = new Select(element3);
		
		sourceDropdown.selectByVisibleText("Cold Call");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		System.out.println("Account Created Sucessfully");
		
		driver.close();
		
		
		

	}

}
