package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm6 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.close();
		
		
	}

}
