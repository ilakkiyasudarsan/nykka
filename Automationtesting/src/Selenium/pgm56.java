package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm56 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(null);
		Thread.sleep(2000);
		driver.findElement(null).clear();
		Thread.sleep(2000);
		driver.findElement(null).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		String ExpectedResult="You Pressed Cancel";
		Thread.sleep(2000);
		String ActualResult=driver.findElement(null).click();
		Thread.sleep(2000);
		if(ActualResult.equals(ExpectedResult))
				{
			System.out.println(ActualResult+"......>Text are same");
				}
		else
		{
			System.out.println(ActualResult+"......>Text are not same");
			
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
