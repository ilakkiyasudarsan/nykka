package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm60 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chennaisuperkings.com/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_K);
		r.keyRelease(KeyEvent.VK_K);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
