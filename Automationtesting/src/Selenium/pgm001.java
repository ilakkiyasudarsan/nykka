package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm001 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("facebook");
		//WebElement searchbox=driver.findElement(By.name("facebook"));
		Thread.sleep(2000);
		driver.close();
		
	}

}
