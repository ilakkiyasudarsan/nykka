package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm45 
{
	
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ilakk/OneDrive/Desktop/A2B.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement List=driver.findElement(By.id("a2b"));
		Select s=new Select(List);
		String all=s.getWrappedElement().getText();
		System.out.println(all);
		driver.close();
		
	}

}
