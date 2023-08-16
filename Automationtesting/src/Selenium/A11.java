package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11 {
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https:meesho.com");
		
		driver.findElement(By.xpath("//span[text()='Kids']")).click();
		driver.findElement(By.xpath("//p[text()='Dresses']")).click();
		
		
		driver.close();
	}

}
