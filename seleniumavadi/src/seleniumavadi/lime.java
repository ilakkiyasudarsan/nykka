package seleniumavadi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lime {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.limeroad.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='SHOP MEN']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='loaderCat vipshoesLdr dIb mA pA r0   h80 b4 l0 t0 ']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//img[@id='64d02d34fd1d3c4b0115a100']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@id='18401153']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='size_29511137']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='ADD TO CART']")).click();
	//vascriptExecutor js = (JavascriptExecutor) driver;
	//.executeScript("argument[0].ScrollIntoVeiw(true);",element);
}
}
//div[@id='shopMen']