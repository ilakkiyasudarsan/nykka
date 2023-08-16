package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm47 
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ilakk/OneDrive/Desktop/A2B.html");
		WebElement Location=driver.findElement(By.id("a2b"));
		Select s=new Select(Location);
		List<WebElement>allopt=s.getOptions();
		int count=allopt.size();
		for(int i=0;i<count;i++)
		{
			Thread.sleep(2000);
			s.selectByIndex(i);

	}
		for(int i=count-1;i>=0;i--)
		{
			Thread.sleep(2000);
			s.selectByIndex(i);

	}
		driver.close();


}}
