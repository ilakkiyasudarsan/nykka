package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm57 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.get("");
		Thread.sleep(2000);
		driver.findElement("").click();
		Thread.sleep(2000);
		driver.findElement("").click();
		Thread.sleep(2000);
		Alert a= driver.switchTo().alter();
		Thread.sleep(2000);
		a.sendKeys("yuvan");
		Thread.sleep(2000);
		String ActualResult=driver.findElement(null).getText();
		Thread.sleep(2000);
		if(ActualResult.contains(ExpectedResult))
		{
			System.out.println(ActualResult+"......>Test case is pass");
			
		}
		else
		{
			System.out.println(ActualResult+"......>Test case is fail");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
