package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class pgm42 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(2000);
WebElement date=driver.findElement(By.id("day"));
Select s=new Select(date);
s.selectByIndex(10);
Thread.sleep(2000);
WebElement month=driver.findElement(By.id("month"));
Select s2=new Select(month);
s2.selectByValue("2");
Thread.sleep(2000);
WebElement yr=driver.findElement(By.id("year"));
Select s3=new Select(yr);
s3.selectByVisibleText("2000");
Thread.sleep(2000);



	}

}
