package seleniumavadi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitywait {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		
	}

	
	

}
