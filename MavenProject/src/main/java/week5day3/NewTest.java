package week5day3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	/*Annotations*/
	
	@BeforeSuite
	public void Login() {
	  System.out.println("Inside Login method-Before Suite");
	}
	
	
	@BeforeTest
	public void createLead() {
	  System.out.println("Inside Create Lead method - Before Test");
	}
	
	@BeforeClass
	public void editLead() {
		System.out.println("Inside edit lead method Before Class");
	}
	
	@BeforeMethod
	public void duplicateLead() {
		
		System.out.println("Inside Duplicate Leadd method- Before Method");
	}
	
	@Test
	public void deleteLead() {
		System.out.println("Inside Delete lead method- Test");

	}
	
	@AfterMethod
	public void viewLead() {
		
		System.out.println("Inside view Leadd method-  After Method");
	}
	
	@AfterClass
	public void printLead() {
		System.out.println("Inside print lead - After class");
	}
	
	@AfterTest
	public void logoutLead() {
		System.out.println("Inside logour lead method - After Test");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Close Browser - After suite");

	}
}
