package Advanceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pgm117 {
	static WebDriver driver;
	@Test
	public void Testcase_003()
	{
		driver=new ChromeDriver();
		driver.get("https://www.swiggy.com");
		driver.close();
	}
	@Test
	public void Testcase_004()
	{
		driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.close();
	}

}
