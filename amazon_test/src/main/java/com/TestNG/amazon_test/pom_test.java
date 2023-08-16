package com.TestNG.amazon_test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom_test {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();
		
		driver.findElement(By.xpath("//div[@class='aok-relative']")).click();
	}
}
