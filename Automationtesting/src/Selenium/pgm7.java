package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("file:///c:user/Lenovo/IPL1Teams.html");
		Thread.sleep(2000);
		WebElement Link1=driver.findElement(By.tagName("a"));
		Thread.sleep(2000);
		Link1.clear();
		Thread.sleep(2000);
		String Expres="Chennai super king";
		String Actress=driver.getTitle();
		if(Actress.contains(Expres))
		{
			System.out.println(Actress+"....> The test case is pass");
		}
			else
			{
				System.out.println(Actress+"....> The test case is fail");
			}
		driver.close();
			
		
		
	}

}
