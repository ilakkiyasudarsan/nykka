package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm48 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ilakk/OneDrive/Desktop/A2B.html");
		WebElement Location=driver.findElement(By.id("a2b"));
		Select s=new Select(Location);
		s.selectByIndex(0);
		s.selectByIndex(3);
		s.selectByIndex(1);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
