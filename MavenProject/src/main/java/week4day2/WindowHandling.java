package week4day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        
        driver.get("https://www.irctc.co.in/nget/");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
     
        
        driver.findElement(By.linkText("FLIGHTS")).click();
        
        Set <String> childWindow = driver.getWindowHandles();
        
        
        
        List <String> newWindow = new ArrayList<String>(childWindow);
        
        String parentWindow = newWindow.get(0);
        
        driver.switchTo().window(newWindow.get(1));
        
        String title = driver.getTitle();
        System.out.println("Title of the window:"+title);
        
        driver.switchTo().window(parentWindow);
        driver.close();
        
	}

}
