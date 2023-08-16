package Advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm120 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		//stroe the username textbox address as@001 in
		WebElement UNTBX=driver.findElement(By.id("username"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		UNTBX.sendKeys("admin");
		
		
	}

}
