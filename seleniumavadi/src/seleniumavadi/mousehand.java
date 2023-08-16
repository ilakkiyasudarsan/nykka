package seleniumavadi;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehand {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
	act.contextClick(mobile).build().perform();
	Robot rb=new Robot();
}
}
