package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseclassforActitimeApplication {
	static ChromeDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demo.actitime/login.do");
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
		
	}

}
