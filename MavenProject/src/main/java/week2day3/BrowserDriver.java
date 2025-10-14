package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {

	public static void main(String[] args) throws InterruptedException {
		//Instantiating the browser
				ChromeDriver driver=new ChromeDriver(); 
				//Maximize the window 
				driver.manage().window().maximize();
				//Load the url
				driver.get("https://www.facebook.com/");
				
				driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("Tuna@321");
				
				driver.findElement(By.name("login")).click();
				
				String title = driver.getTitle();
				System.out.println(title);
				
				Thread.sleep(3000);
				
				//close the window
				driver.close();


	}

}
