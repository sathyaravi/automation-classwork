package week6day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@DataProvider(name="getValue",indices=0)
	public String [][] createLead() throws IOException {
		return CreateLeadUingExcelntegration.createLead();
		
	
		
	}
	@Test(dataProvider="getValue")
	public void createLead(String comName,String firstName, String lastName) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("The title of the page:"+title);
	}

}
