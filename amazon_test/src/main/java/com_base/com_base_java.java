package com_base;


	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class com_base_java {

		public static WebDriver driver;
		public static WebDriver Launch_Browser(String browser) {
			if(browser.equalsIgnoreCase("chrome"))
				{
      
				
				 WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
				}
			else if(browser.equalsIgnoreCase("edge"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			return driver;
		
		}
		public static WebDriver url(String url)
		{
			driver.get(url);
			return driver;
		}
		public static void input(WebElement element,String value)
		{
			element.sendKeys(value);
			//return driver;
			
		}
		public static void click(WebElement element){
			element.click();
			
	}
		
		public static WebDriver launchUrl(String url) {
			driver.get(url);
			return driver;
			
		}
		///////dropdown///////////////////////////////////////
		public static void DropDown(WebElement element,String selectiontype,String value)
		{
			Select s=new Select(element);
			if(selectiontype.equalsIgnoreCase("value"))
			{
				s.selectByValue(value);
			}else if(selectiontype.equalsIgnoreCase("visibletext")){
				s.selectByVisibleText(value);
			}else if (selectiontype.equalsIgnoreCase("index")) {

				int a = Integer.parseInt(value);
				s.selectByIndex(a);
			}
		}
		///////////////////////navigation-method////////////////////////////////////
		
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void navforward() {

		driver.navigate().forward();

	}

	public static void navback() {

		driver.navigate().back();

	}

	public static void navtourl(String url) {
		driver.navigate().to(url);
	}
	////////////Actions//////////////////////////////////////////
	public static void action(WebElement element,String type,String value)
	{
		Actions ac = new Actions(driver);

		if (type.equalsIgnoreCase("contextclick")) {

			ac.contextClick(element).build().perform();

		} else if (type.equalsIgnoreCase("doubleclick")) {

			ac.doubleClick(element).build().perform();

		} else if (type.equalsIgnoreCase("draganddrop")) {

			ac.dragAndDrop(element, element).build().perform();

		} else if (type.equalsIgnoreCase("draganddropxy")) {
			int int1 = Integer.parseInt(value);
			ac.dragAndDropBy(element, int1, int1).build().perform();

		} else if (type.equalsIgnoreCase("clickandhold")) {

			ac.clickAndHold(element).build().perform();
		}

	}
	////////////////////////robot///////////////////////////////////
	public static void keyboard(String type)
	{
		Robot r =  (Robot) driver;
		if (type.equalsIgnoreCase("pressenterkey")) {

			r.keyPress(KeyEvent.VK_ENTER);
		} else if (type.equalsIgnoreCase("pressupkey")) {
			r.keyPress(KeyEvent.VK_UP);

		} else if (type.equalsIgnoreCase("pressdownkey")) {
			r.keyPress(KeyEvent.VK_DOWN);

		} else if (type.equalsIgnoreCase("releseenterkey")) {
			r.keyRelease(KeyEvent.VK_ENTER);
		} else if (type.equalsIgnoreCase("releaseupkey")) {
			r.keyRelease(KeyEvent.VK_UP);

		} else if (type.equalsIgnoreCase("releasedownkey")) {
			r.keyRelease(KeyEvent.VK_DOWN);
		}
	}

	public static void get(String type) {

		if (type.equalsIgnoreCase("geturl")) {
			String url = driver.getCurrentUrl();
			System.out.println(url);
		} else if (type.equalsIgnoreCase("gettitle")) {
			String title = driver.getTitle();
			System.out.println(title);
		} else if (type.equalsIgnoreCase("pagesource")) {
			String pageSource = driver.getPageSource();
			System.out.println(pageSource);
		}
	}


	public static void scanner(String type) {
		Scanner sc = new Scanner(System.in);

		if (type.equalsIgnoreCase("simplestring")) {
			sc.next();
		} else if (type.equalsIgnoreCase("simpleinteger")) {
			sc.hasNextInt();

		}

	}

	public static void print(String type, String value) {

		if (type.equalsIgnoreCase("syso")) {

			System.out.println(value);

		} else if (type.equalsIgnoreCase("syser")) {

			System.err.println(value);

		}

	}
	public static void sendkeys(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void Screenshot() throws IOException {

		TakesScreenshot ss = (TakesScreenshot) driver;

		File screenshot = ss.getScreenshotAs(OutputType.FILE);

		File loc = new File("D:\\Selenium\\Lime_Road\\screenshot1");

		FileUtils.copyFile(screenshot, loc);

	}

	public static void scroll(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].ScrollIntoVeiw(true);",element);

	}
	}



