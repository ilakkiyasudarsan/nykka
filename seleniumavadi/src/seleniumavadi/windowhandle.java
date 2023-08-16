package seleniumavadi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandle {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
				
		act.contextClick(mobile).build().perform();
		Robot rb=new Robot();
		//driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement tv=driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		act.contextClick(tv).build().perform();
		Robot rv=new Robot();
		//driver.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		Set<String>allwin=driver.getWindowHandles();
		int count=allwin.size();
		System.out.println("no of window:"+count);
		for(String i:allwin)
		{
			driver.switchTo().window(i);
			String AllTitles=driver.getTitle();
					if(AllTitles.contains(AllTitles))
					{
						System.out.println(AllTitles);
						driver.close();
			
					}
		}
		
		
	}


}
