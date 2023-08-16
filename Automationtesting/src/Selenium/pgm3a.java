package Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class pgm3a {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String ps=driver.getPageSource();
		System.out.println(ps);
		driver.close();
	}

}
