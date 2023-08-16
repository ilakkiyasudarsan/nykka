package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm66 
{
	static
	{
		System.setProperty("webDriver.Chrome.driver" ,"./driver/Chromedriver.exe");
	}
	
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://nxtgenaiacademy.com/multiplewindows/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button)[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button)[4]")).click();
	Thread.sleep(2000);
	Set<String>allwh=driver.getWindowHandles();
	int count=allwh.size();
	System.out.println(count);
	for(String i:allwh)
	{
		
		System.out.println(i);
	}
	driver.quit();
}
	

}
