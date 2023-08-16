package Selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm40 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(" The page is has been loaded within 15 sec");
	}
	catch(Exception e)
	{
		System.out.println("The page is not loaded within 15 sec");
	}
	driver.close();

}}
