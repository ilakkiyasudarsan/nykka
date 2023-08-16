package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class pg19 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://deo.actitie.co/login.do");
		Thread.sleep(3000);
		Boolean Image=driver.findElement(by.xapth).isDisplayed();
		if(Image==true)
		{
			System.out.println(Image+"*****logo is displayed");
		}
		else
		{
			System.out.println(Image+"*****logo is not displayed");	
		}
		driver.close();
	}

}
