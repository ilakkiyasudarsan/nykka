package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm2 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.close();
	}

}
