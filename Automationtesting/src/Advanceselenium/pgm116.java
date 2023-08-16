package Advanceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pgm116 {
	static WebDriver driver;
	@Test
	public void testcase_001()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}
	@Test
	public void testcase_002()
	{
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.close();
	}
	

}
