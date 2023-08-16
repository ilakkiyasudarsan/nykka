package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm59 
{
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https:www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(2000);
		driver.findElement( By.xpath("(//input)[1]")).sendKeys("ilakkiyavishuva@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("ilakkiya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[1]")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='View profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		Thread.sleep(2000);
		File f=new File("./Data/Resume.pdf");
		Thread.sleep(2000);
		String a=f.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(a);
		Thread.sleep(2000);
		//driver.close();
		
	}

}
