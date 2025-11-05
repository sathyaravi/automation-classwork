package week5day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass {
	
	//@Test(threadPoolSize=1,alwaysRun=true)
	//@Test(dependsOnMethods= {"week5day3.EditLeadUsingXpath.editLead"})
	//@Test(invocationCount=3)
	@Test(invocationCount = 3, timeOut = 10000)
	public  void deleteLead() throws InterruptedException {
		
		//Navigate to Lead tab
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
		//Input the phone number to find the lead
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Capture the first lead from the resulting lead
		WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String leadID = firstLead.getText();
		System.out.println("First Lead from the resulting table:"+leadID);
		
		firstLead.click();
		
		//Delete the Lead
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(2000);
		//Find the lead again
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter the captured Lead
		
		driver.findElement(By.name("id")).sendKeys(leadID);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		//Verify the deletion message
		WebElement resultingText = driver.findElement(By.xpath("//div[@id='ext-gen437']"));
		String message = resultingText.getText();
		System.out.println("Result message: " + message);

		if (message.equals("No records to display")) {
		    System.out.println("Lead deleted Successfully");
		} else {
		    System.out.println("Lead still exists");
		}
	

	}

}
