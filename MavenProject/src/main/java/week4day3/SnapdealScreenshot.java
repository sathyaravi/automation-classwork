package week4day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SnapdealScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		

		//Initialize web driver
		ChromeDriver driver = new ChromeDriver(options);
		//Load the url
		driver.get("https://www.amazon.in/");
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		
	
	}

}
