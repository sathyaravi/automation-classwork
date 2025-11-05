package stepdefinition;

import org.openqa.selenium.By;
import base.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefinition extends BaseClass {

	/*ChromeDriver driver;
	@Given("launch the browser")
	public void launch_the_browser() {
		
		driver = new ChromeDriver();
	
	}
	@Given("load the url")
	public void load_the_url() {
		
		
		driver.get("http://leaftaps.com/opentaps/");
	}*/
	@When("enter the username {string}")
	public void enter_the_username(String uname) {
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

	}
	@When("enter the password {string}")
	public void enter_the_password(String pswd) {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	}
	@When("click on the login button")
	public void click_on_the_login_button() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
	
	}
	@Then("Navigate to the next page")
	public void navigate_to_the_next_page() {
		
		String pageTitle = driver.getTitle();
		System.out.println("Current Page Title:"+pageTitle);

	}
	@But("Will not Navigate to the next page")
	public void will_not_navigate_to_the_next_page() {
	    System.out.println("Invalid Credentials");
	}

}
