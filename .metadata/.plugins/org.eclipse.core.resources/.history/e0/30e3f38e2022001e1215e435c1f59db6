package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm71 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("12345");
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement Month=driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(Month);
		s1.selectByIndex(8);
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.className("ui-datepicker-year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='15']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("alternative_number")).sendKeys("8220025359");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(2000);
		String expectedResult="please enter valid policy na";
		//String ActualResult=driver.findElement(By.xpath("//span[@id='policynumberErrar']")).getText();
		//if(ActualResult.equals("expectedResult"))
		//{
		//	System.out.println(ActualResult+"the text is same");
		//}
		//else
		//{
			//System.out.println(expectedResult+"the text is same");
		//}
		//driver.close();
		
		
	}
	

}
