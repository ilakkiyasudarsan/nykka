package Advanceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pgm118 {
	static WebDriver driver;
	@Test
	public void Testcase_005()
	{
		driver=new ChromeDriver();
		driver.get("/https:www.netfix.com/");
		driver.close();
	}
	@Test
	public void Testcase_006()
	{
		driver=new ChromeDriver();
		driver.get("/https:www.ola.com/");
		driver.close();
	}

}
