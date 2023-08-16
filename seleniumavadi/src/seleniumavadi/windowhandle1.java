package seleniumavadi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandle1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Actions act=new Actions(driver);
	Thread.sleep(2000);
	 WebElement mobile=driver.findElement(By.xpath("//span[text()='Mobiles & Tablets']"));
	act.contextClick(mobile).build().perform();
	Robot rb=new Robot();
	Thread.sleep(2000);
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	
	
	
	}
}
