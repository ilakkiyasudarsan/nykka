package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm62 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the.internet.herokuapp.com/basic-auth");
	}

}
