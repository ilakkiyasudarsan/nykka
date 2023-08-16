package seleniumavadi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pathology {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gor-pathology.web.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("test@kennect.io");
		
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Qwerty@1234");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		WebElement  element=driver.findElement(By.xpath("//div[@class='MuiAutocomplete-endAdornment']"));
		element.click();
		WebElement ck = driver.findElement(By.xpath("//div[text()='AFP (ALPHA FETO PROTEINS)']"));
		
		
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",ck);
	
	driver.findElement(By.xpath("//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input']")).click();
	driver.findElement(By.xpath("//li[@data-value='20']")).click();
		
		//Select s=new Select(element);
		//s.selectByIndex(0);
		
//		Robot rb=new Robot();
//		rb.keyPress(KeyEvent.VK_DOWN);
//	rb.keyRelease(KeyEvent.VK_DOWN);
//	rb.keyPress(KeyEvent.VK_DOWN);
//	rb.keyRelease(KeyEvent.VK_DOWN);
//		WebElement  element1=driver.findElement(By.xpath("//input[@class='MuiSelect-nativeInput']"));
//		element1.click();		}
//
}
}