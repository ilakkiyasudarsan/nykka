package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm22 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.co/login.do");
		String Link=driver.findElement(By.linkText("actitimeInc.")).getTagName();
		if(Link.equals("a"))
		{
			System.out.println(Link+"......>Tag name of the link is a");
		}
		else
		{
			System.out.println(Link+"......>Tag name of the link is not a");	
		}
		driver.close();
	}

}
