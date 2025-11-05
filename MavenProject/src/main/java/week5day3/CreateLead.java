package week5day3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@Test(enabled=false)
	public void createLead() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John12");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Doe12");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("The title of the page:"+title);
	}

}
