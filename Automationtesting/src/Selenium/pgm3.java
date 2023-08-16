package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm3 
{
	

	public static void main(String[] args)throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		String ExceptedResult="Amazon";
		String ActualResult=driver.getTitle();
		if(ActualResult.contains(ExceptedResult))
				{
			System.out.println(ActualResult+"....>Test case is pass");
			
		}
		else
		{
			System.out.println(ActualResult+"....>Test case is  fail");
			
		}
		driver.close();
		
	}

	

	
	

	
	}


