package Selenium;



import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm82 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\www.bbc.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.ScrollTo(0,document.body.ScrollHeight)");
		Thread.sleep(2000);
		jse.executeScript("Window.ScrollTo(0,0)");
		
		//driver.close();
		
		
	}

}
