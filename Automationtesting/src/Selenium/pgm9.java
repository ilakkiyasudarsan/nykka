package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm9 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///users/lenovo/desktop/IPL1.html");
		driver.findElement(By.linkText("Red")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("d")).click();
		
	}

}
