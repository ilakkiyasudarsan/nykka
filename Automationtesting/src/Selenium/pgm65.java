package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm65 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.xpath("//button[.='New Browser Window']"));

		Thread.sleep(2000);
		Set<String>allwin=driver.getWindowHandles();
		int count=allwin.size();
		System.out.println("No of window=........>"+count);
		
		driver.quit();
		
	}

}
