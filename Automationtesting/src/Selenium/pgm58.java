package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm58 
{
	

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file1:///c:/users/Lenovo/desktop/file1.html");
		Thread.sleep(2000);
		File f=new File(".data/File1.text");
		String AbsolutePathofFile=f.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.id("CV")).sendKeys(AbsolutePathofFile);
		
		
	}

}
