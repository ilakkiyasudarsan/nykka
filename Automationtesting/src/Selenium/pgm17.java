package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm17 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		WebElement loginButtton=driver.findElement(By.xpath("//button value[.='1']"));
		int EmailTbx=driver.findElement(By.id("email")).getLocation().getX();
		int PasswordTbx=driver.findElement(By.id("pass")).getLocation().getX();
		if(EmailTbx==PasswordTbx)
		{
			System.out.println("Both are aligned properly.....>"+EmailTbx+"="+PasswordTbx);
		}
		else
		{

			System.out.println("Both are  not aligned properly.....>"+EmailTbx+"="+PasswordTbx);
		}
		driver.close();
		
	}

}
