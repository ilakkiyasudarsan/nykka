package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pg15 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:///www.facebook.com/");
		WebElement Link=driver.findElement(By.link);
		String fontcolor=Link.getCssValue("color");
		String fontfamily=Link.getCssValue("family");
	     String fontsize=Link.getCssValue("size");
	     System.out.println("fontcolor is.....>"+fontcolor);
	     System.out.println("fontcolor is.....>"+fontfamily);
	     System.out.println("fontcolor is.....>"+fontsize);
	     driver.close();
	}
}
