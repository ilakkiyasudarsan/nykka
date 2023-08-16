package Selenium;

import javax.swing.JEditorPane.JEditorPaneAccessibleHypertextSupport.HTMLLink;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class Demo {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/ilakk/OneDrive/Desktop/ipl1.html");
		driver.manage().window().maximize();
		HTMLLink<WebElement> alllinks=driver.findElement(By.tagName("/a"));
		int count=alllinks.size();
		for
		
		
	}

}
