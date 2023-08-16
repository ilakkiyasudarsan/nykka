package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm16 {
public static void main(String[] args) {
	ChromeDriver  driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
	int XaxisofLoginButton=LoginButton.getLocation().getX();
	int yaxisofLoginButton=LoginButton.getLocation().getY();
	System.out.println("X-axis of login Button is...>"+XaxisofLoginButton);
	System.out.println("y-axis of login Button is...>"+yaxisofLoginButton);

driver.close();
}
}
