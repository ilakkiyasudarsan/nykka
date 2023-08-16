package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm28 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///c:/users/lenovo/desktop/yuvan.html");
		List<WebElement>alllinks=driver.findElements(By.xpath("//a"));
		int count=alllinks.size();
		System.out.println(count);
		driver.close();
	}

}
