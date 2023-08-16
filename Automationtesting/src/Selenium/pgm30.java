package Selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm30 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:////C:users/lenovoDesktop/yuvan.html");
		List<WebElement>alllinks=driver.findElement(By.Tagname("a"));
		int count=alllinks.size();
		for(int i=0;i<count;i++)
		{
			String Text=alllinks.get(i).getText();
			System.out.println(Text);
		}
		driver.close();
			
	}

}
