package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm41 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByIndex(4);
		Thread.sleep(2000);
		s.selectByValue("10");
		Thread.sleep(2000);
		s.selectByVisibleText("20");
		//Thread.sleep(2000);
		//driver.close();
	}

}
