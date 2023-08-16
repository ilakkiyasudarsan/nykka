package seleniumavadi;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nykka_minproject {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@class='css-65och3'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("8220025359");
		driver.findElement(By.xpath("//button[@id='submitVerification']")).click();
		
		driver.findElement(By.xpath("//button[@class='button big fill full ']")).click();
		//Thread.sleep(30000);
		
		WebElement mom=driver.findElement(By.xpath("(//li[@class='MegaDropdownHeadingbox'])[7]"));
		Actions act = new Actions(driver);
		act.moveToElement(mom).perform();
//		
	//	driver.findElement(By.xpath("Baby Powder")).click();
		driver.findElement(By.xpath("//a[text()='Baby Powder']")).click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
         //   js.executeScript("window.scrollBy(0,100))","");
		//Thread.sleep(2000);
		Thread.sleep(8000);
		Set<String>allwin=driver.getWindowHandles();
		for(String i:allwin)
		{
			driver.switchTo().window(i);
		}
		
		
		driver.findElement(By.xpath("//img[@alt='Sebamed']//following::div[text()='Himalaya Baby Powder']")).click();
		
		
		//driver.close();
		driver.findElement(By.xpath("//select[@class='css-2t5nwu']")).click();
	
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		//span[@class='btn-text'])[1]

		
		//span[@class='active css-d3w64v']
	
	}
}