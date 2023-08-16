package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm14 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement Location=driver.findElement(By.id("email"));
	int HeightoftheEmailTextBox=Location.getSize().getHeight();
	int WidthoftheEmailTextBox=Location.getSize().getWidth();
	System.out.println("Height of the email text box is........>"+HeightoftheEmailTextBox);
	System.out.println("Width of the email text box is........>"+WidthoftheEmailTextBox);
	driver.close();
}
}
