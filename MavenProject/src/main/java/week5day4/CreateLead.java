package week5day4;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@DataProvider(name="getValue")
	public String [][] sampleData() {
		String [][] data = new String[2][3];
		data[0][0] = "TLF";
		data[0][1] = "John";
		data[0][2] = "Doe";
		
		data[1][0] = "TLF2";
		data[1][1] = "Pamela";
		data[1][2] = "Doe";
		return data;
		
		
	
		
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
