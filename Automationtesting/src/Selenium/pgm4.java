package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm4 {
	

	public static void main(String[] args) throws InterruptedException
	
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https:\\www.google.com/");
		Thread.sleep(2000);	
		String ExceptedResult_001="google";
		String ActualResult_001=driver.getTitle();
		if(ActualResult_001.contains(ExceptedResult_001))
		{
			System.out.println(ActualResult_001+".....> The test case 1 is pass");
		}
		else
		{
			System.out.println(ActualResult_001+".....> The test case 1 is fail");
			
		}
		String ExceptedResult_002="https://www.google.com.in";
		String ActualResult_002=driver.getCurrentUrl();
		
		if(ActualResult_002.contains(ExceptedResult_001))
		{
			System.out.println(ActualResult_002+".....> The test case 2 is pass");
		}
		else
		{
			System.out.println(ActualResult_002+".....> The test case 2 is fail");
			
		}
		
		driver.close();
		
	}

	

}
