package week2day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Instantiating the browser
		ChromeDriver driver=new ChromeDriver(); 
		//Load the url
		driver.get("https://www.facebook.com/");
		//Maximize the window 
		driver.manage().window().maximize();
		//close the window
		driver.close();


	}

}
