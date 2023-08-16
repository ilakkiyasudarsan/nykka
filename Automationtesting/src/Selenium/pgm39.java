package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm39 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//div[.='login'")).clear();
		int i=0;
		while(i<100)
		try{
			driver.findElement(By.id("logoutlink")).clear();
			
		}
		catch(Exception e)
		{
			i++;
		}
		driver.close();
		
	}

}
