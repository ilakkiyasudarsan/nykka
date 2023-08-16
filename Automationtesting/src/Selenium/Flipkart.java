package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
      ChromeDriver driver=new ChromeDriver();
      Thread.sleep(3000);
      driver.get("https://www.flipkart.com/");
      Thread.sleep(3000);
      driver.manage().window().maximize();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      Thread.sleep(3000);
      driver.findElement(By.name("q")).sendKeys("oneplus");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("( //div[@class='eFQ30H'])[5]")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("[@class='_396cs4']")).click();
      Thread.sleep(2000);
      driver.findElement(By.name("q")).sendKeys("oppo");
      driver.findElement(By.xpath("[@class='_3704LK']")).click();
      Thread.sleep(3000);
      driver.close();
      
	}

}
