package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm13 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.opensourcebilling.org/en/users/sign-in");
	driver.findElement(By.id(null)).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("password")).clear();
	
	
	
}

}
