package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm55 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alterts.html/");
		driver.findElement(null).clear();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		String text=a.getText();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		System.out.println(text);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
