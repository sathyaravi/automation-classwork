package week4day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFrames {

	public static void main(String[] args) {

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
       
        
        
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        
        driver.switchTo().frame("iframeResult");
        
        //driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));
        
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
        driver.switchTo().alert().accept();
        
    
                       
        String msg  = driver.findElement(By.id("demo")).getText();
        
        System.out.println(msg);
        
        if (msg.contains("OK")) {
        	System.out.println(" Ok was clicked successfully");
        }
        
        
        
        

	}

}
