package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

public class pgm5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("chennai");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.switchTo().activeElement().sendKeys("madurai");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		
	}

}
