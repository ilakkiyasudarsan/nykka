package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm18 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demo.actitie.com/login.do");
		Thread.sleep(3000);
		driver.findElement(by.id("username")).sendkeys("admin");
		Thread.sleep(3000);
		driver.findElement(by.name("password")).sendkeys("manager");
		Thread.sleep(3000);
		driver.findElement(by.xpath('//div[text()='login'])).click();
		Thread.sleep(3000);
		driver.findElement(by.xpath('//div[text()='logout'])).click();
	    Thread.sleep(3000);
	driver.close();

}}
