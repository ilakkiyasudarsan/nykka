package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm002 {
	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https:google.com/");
WebElement searchbox=driver.findElement("//textarea[.='class=\"gLFyf\"']", null).searchbox();

	}

}
