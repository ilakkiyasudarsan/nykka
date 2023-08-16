package Selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class pgm29 {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("");
	List<WebElement>Alllinks=driver.findElements(null);
	int count=Alllinks.size();
	System.out.println(count);
	Thread.sleep(2000);
	
	WebElement Link1=Alllinks.get(0);
	Thread.sleep(2000);
	Link1.click();
	
}}
