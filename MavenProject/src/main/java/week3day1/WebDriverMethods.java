package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if (title.contains("Check")) {
			
			System.out.println("True");
			
		} else {
				System.out.println("False");
		}
		
		
		//Fetch the current url
		
		String  currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		
		//getText
		
		String text = driver.findElement(By.xpath("//h5[text()='Basic Checkbox']")).getText();
		
		System.out.println(text);
	}

}
