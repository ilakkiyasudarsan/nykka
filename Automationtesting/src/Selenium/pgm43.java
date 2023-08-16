package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm43 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ilakk/OneDrive/Desktop/A2B.html");
		WebElement List=driver.findElement(By.id("a2b"));
		Select s=new Select(List);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByVisibleText("PURI");
		Thread.sleep(2000);
		s.selectByVisibleText("DOSA");
		Thread.sleep(2000);
		s.selectByVisibleText("VADA");
		Thread.sleep(2000);
		s.deselectByIndex(2);
		Thread.sleep(2000);
		s.deselectByIndex(1);
		Thread.sleep(2000);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByVisibleText("VADA");
		
		
	}

}
