package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm10 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:users/Lenovo/desktop/IPL1.html/");
		driver.findElement(By.cssSelector("a[name='n2']")).click();
		
	}

}
