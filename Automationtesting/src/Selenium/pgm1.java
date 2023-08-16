package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class pgm1 {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchBox=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		searchBox.clear();
		Thread.sleep(2000);
		searchBox.clear();
		Thread.sleep(2000);
		searchBox.sendKeys("yuvan");
		
	}

}
