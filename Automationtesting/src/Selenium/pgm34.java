package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm34 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.filpkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		Thread.sleep(2000);
		List <WebElement>Autosugg=driver.findElement(By.xpath("//div[@class='/rtEPN-));"
	int count=autosugg.size();
	System.out.println(LBN);
	driver.close();
	
	}

}
