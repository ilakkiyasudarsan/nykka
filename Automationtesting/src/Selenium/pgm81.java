package Selenium;

import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class pgm81 {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///c:/users/Lenovo/LOGINPAGE.html");
	  driver.findElement(By.id("d1")).sendKeys("admin");
	  Thread.sleep(2000);
	 RemoteDriver rwd=(RemoteDriver)driver;
	  rwd.execute script("document.getElementById('d2).value='manager';");
	  Thread.sleep(2000);
	  driver.findElement(By.id("d3")).click();
	  
	  
	}

	

}
