package week3day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListInterfaceAssignment {
	


	public static void main(String[] args) {
		
		//Instantiating and launching the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(options);//ctrl+shift+o  to import driveryo
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		
		List <WebElement> phonePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List <Integer> priceList = new ArrayList<Integer>();
		
		for (WebElement price:phonePrice) {
			
			String txt = price.getText().replace(",","").trim();
			
			int price1  = Integer.parseInt(txt);
			priceList.add(price1);
			System.out.println(price1);
		}
		
		Collections.sort(priceList);
		
		System.out.println("Lowest Price:"+priceList.get(0));
		
		
	}

}
