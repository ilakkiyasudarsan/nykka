package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pgmm63 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("...remote-allow-origins=*");
		co.addArguments("...disable-notifications");
		Thread.sleep(2000);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
	}

}
