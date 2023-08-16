package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm35 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.BBC.com/");
		List <WebElement>allnews=driver.findElements(By.xpath("//span[@class='top_list_item_bullet']/../h3"));
		int count=allnews.size();
		for(int i=0;i<count;i++)
		{
			String LBN=allnews.get(i).getText();
			System.out.println(LBN);
			driver.close();
			
		}
				
	}

}
