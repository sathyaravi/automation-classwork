package week4day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HandleAlert {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        
        driver.get("https://www.leafground.com/alert.xhtml");
        
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        
       
        
        Alert promptText =  driver.switchTo().alert();
             
        
        promptText.sendKeys("John Doe");
          
        promptText.dismiss();
        
        String displayedText = driver.findElement(By.id("confirm_result")).getText();
        
        System.out.println(displayedText);
        
        if (displayedText.contains("cancelled")){
        	
        	System.out.println("Message verified successfully");
        }
        else {
        	System.out.println("Message not verified");
        }
        
        
        
        
		
		
	}

}
