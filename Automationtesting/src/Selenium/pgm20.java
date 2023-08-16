package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class pgm20 {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver =new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.co/");
		Thread.sleep(2000);
		boolean loginBtn=driver.findElement(By.xpath("//button[@name=login']")).isEnabled();
		if(loginBtn==true)
		{
			System.out.println(loginBtn+"......>login Button is Enabled");
			
		}
		else
		{
			System.out.println(loginBtn+"......>login Button is not Enabled");
		}
		driver.close();
	}
	

}
