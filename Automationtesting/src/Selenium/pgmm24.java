package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgmm24 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demmo.opensource ceilling.org/en/users/sign.in");
		Thread.sleep(2000);
		driver.findElement(By.id("user.login.btn")).submit();
		
	}

}
