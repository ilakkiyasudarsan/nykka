package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class pgm8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///c/userss/Lenovo/destop/IPL1html");
		Thread.sleep(2000);
		driver.findElement(By.id("d2")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("n3")).click();
		
		
	}

}
