package Selenium;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class pgmm69 {
	public static void main(String[] args) {
		System.out.println("Enter the title which you want to close");
		Scanner s=new Scanner(System.in);
		String userTitle=s.nextLine();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.xpath("//button[.='New Browser Window']")).click();
		driver.findElement(By.xpath("//button[.='New Message Window']")).click();
		Set<String>allwindowadd=driver.getWindowHandles();
		for(String i:allwindowadd)
		{
			driver.switchTo().window(i);
			String allTitles=driver.getTitle();
			if(allTitles.contains(userTitle))
			{
				System.out.println(allTitles);
				driver.close();
			}
		}
		
	}

}
