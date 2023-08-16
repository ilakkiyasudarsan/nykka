package Advanceselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidLogin {
	@Test
	public void Testcase_001()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.navigate().refresh();
		MyLast3Program mlp=new MyLast3Program(driver);
		mlp.SetLogin();
		driver.close();
	}

}
