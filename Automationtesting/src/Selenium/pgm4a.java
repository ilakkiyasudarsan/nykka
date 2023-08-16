package Selenium;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class pgm4a {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google/");
		Thread.sleep(2000);
		driver.get("https://www.swiggy");
		Thread.sleep(2000);
		driver.get("https://www.zomato");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
	}

}
