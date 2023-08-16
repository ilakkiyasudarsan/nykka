package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class pgm23 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(null)
		String Text=driver.findElement(By.xpath("//nobr)[1]")).getText();
		System.out.println(Text);
		driver.close();
		

}}
