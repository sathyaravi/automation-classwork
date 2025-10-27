package week4day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionsClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		

		//Initialize web driver
		ChromeDriver driver = new ChromeDriver(options);
		//Load the url
		driver.get("https://www.amazon.in/");
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		WebElement scrollClick=driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(scrollClick).perform();
		
		// Get and print text
        String text = scrollClick.getText();
        System.out.println("Text of the link is: " + text);

		
    	File ScreenShot = scrollClick.getScreenshotAs(OutputType.FILE);
    	
    	File target = new File("./data/sample.png");
    	
    	FileUtils.copyFile(ScreenShot, target);

		  

	}

}
