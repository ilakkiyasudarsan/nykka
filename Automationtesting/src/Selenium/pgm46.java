package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class pgm46 {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/ilakk/OneDrive/Desktop/A2B.html");
		WebElement Location=driver.findElement(By.id("a2b"));
		Select s=new Select(Location);
		boolean output=s.isMultiple();
	System.out.println(output);
		driver.close();
	}

}
