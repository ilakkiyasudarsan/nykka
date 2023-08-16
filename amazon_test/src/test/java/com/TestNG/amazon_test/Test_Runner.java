package com.TestNG.amazon_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Runner {
	static WebDriver driver;
	@Test
	public void testcase_001()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	public void testcase_002()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
	
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();
	
	driver.findElement(By.xpath("//div[@class='aok-relative']")).click();
	}
	@Test
	public void testcase_003()
	{
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();
	}
	@Test
	public void testcase_004()
	{
	driver.findElement(By.xpath("//div[@class='aok-relative']")).click();
	
		
	}
	

}

