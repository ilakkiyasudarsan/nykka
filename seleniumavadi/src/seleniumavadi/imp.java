package seleniumavadi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class imp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\seleniumavadi\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@class='css-ejuz3m'])[1]")).click();
		//WebDriverWait wait=new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.titleContains("wait"));
		driver.findElement(By.xpath("//input[@class='input text-center']")).sendKeys("8220025359");
		driver.findElement(By.xpath("//button[@class='button big fill full ']")).click();
		//driver.findElement(By.xpath("//button[@class='button big fill full ']")).click();
		driver.findElement(By.xpath("(//li[@class='MegaDropdownHeadingbox'])[5]")).click();
		
	}

	
	

}
