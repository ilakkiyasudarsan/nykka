package seleniumavadi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alterprogam1 
{
	static WebDriver driver;
	private static void browser()throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
private static void simplealert() throws InterruptedException
{
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
	}
private static void confirmalert() throws InterruptedException
{
	driver.findElement(By.id("confirmButton")).click();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	alert.dismiss();
	//WebElement r=driver.findElement(By.id("confirmResult"));
	System.out.println(alert.getText());	
	
}
public static void main(String[] args) throws InterruptedException 
{
	browser();
	simplealert();
	confirmalert();
}

}
