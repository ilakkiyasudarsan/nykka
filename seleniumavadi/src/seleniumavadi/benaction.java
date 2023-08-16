package seleniumavadi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class benaction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement place=driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle text-dark'])[4]"));
		Actions a=new Actions(driver);
		a.moveToElement(place).perform();
	}

}
