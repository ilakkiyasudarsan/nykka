package Advanceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pgm119 {
	static WebDriver driver;
	@Test
	public void Testcase_007()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.close();
	}
		@Test
		public void Testcase_008()
		{
			driver = new ChromeDriver();
			driver.get("https://www.qspider.com/");
			driver.close();
			
		
	}

}
