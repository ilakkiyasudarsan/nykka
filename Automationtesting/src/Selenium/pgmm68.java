package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgmm68 {
	public static void main(String[] args) {
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://nxtgenaiacademy.com/multiplewindows/");
String parentadd=driver.getWindowHandle();
driver.findElement(By.xpath("//button[@name='newbrowserwindow123'and@id='button1']")).click();
Set<String>alladd=driver.getWindowHandles();
for(String i:alladd)
{
System.out.println(i);
driver.close();	
}
}}
