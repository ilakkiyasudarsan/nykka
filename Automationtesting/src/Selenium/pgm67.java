package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm67 
{
	static 
	{
		System.setProperty("webDriver.Chrome.driver","./driver/Chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver ();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://nxtgenaiacademy.com/multiplewindows/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='New Browser Window']")).click();;
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[.='New Browser Window']")).click();
	Thread.sleep(5000);
	Set<String>allwh=driver.getWindowHandles();
	for(String i:allwh)
	{
		driver.switchTo().window(i);
		String Title=driver.getTitle();
		System.out.println(Title);
	}
		driver.quit();
	}
	
}

