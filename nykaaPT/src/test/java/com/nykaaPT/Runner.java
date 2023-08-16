package com.nykaaPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.nykaa.com/");
				driver.findElement(By.xpath("//button[@class='css-1gzc5zn']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='css-ejuz3m']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input)[1]")).sendKeys("8220025359");
				Thread.sleep(2000);
				driver.findElement(By.id("submitVerification ")).click();
				//driver.findElement(By.xpath("//button[@class='button big fill full ']")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//input[@id='otpField']")).sendKeys("");
				Thread.sleep(50);
				driver.findElement(By.xpath("(//button)[3]")).click();
				Thread.sleep(50);
		}

	}


