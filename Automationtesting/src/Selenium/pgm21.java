package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm21 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		Boolean loginbtn=driver.findElement(By.id("keepLoogedCheckBox")).isSelected();
		if(loginbtn==true)
		{
			System.out.println(loginbtn+".......>login button is selected");
		}
		else
		{
			System.out.println(loginbtn+".......>login button is not selected");	
		}
		driver.close();
	}

}
