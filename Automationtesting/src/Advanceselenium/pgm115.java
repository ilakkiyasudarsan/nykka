package Advanceselenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm115 {
	public static void main(String[] args) throws InterruptedException, IOException  {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com//");
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='hmenu-item'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Home Audio']")).click();
		Thread.sleep(2000);
        TakesScreenshot ts=(TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./screenshot/omg1.png");
		FileUtils.copyFile(source, destination);
		driver.close();
	}

}
