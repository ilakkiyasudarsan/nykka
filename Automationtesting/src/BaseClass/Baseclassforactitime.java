package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclassforactitime 
{
	/**
	 * *Upacasted & declared webdriver globally to access in everyclass
	 * fileInputstream has been declared static to hava to access in every class
	 * to get the access of file properties has been declared globally
	 */
	static WebDriver driver;
	static  FileInputStream fis;
	static Properties p;
	/**
	 * this method is used to open the browser with propertyfile
	 * @throws IOException
	 * @author ilakkiya
	 * all the datas are imported globally to access to all the classes
	 */
	@BeforeTest
	public void openBrowser()throws IOException
	{
		fis=new FileInputStream("./data/commondatas.txt");
		p=new Properties();
		p.load(fis);
		String Link=p.getProperty("URL");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get(Link);
		Reporter.log("open the chrome browser and entered the url successfully",true);
	}
	/**
	 * this m0ethod is used to login to the actitime application
	 * username and password has been retrived from propertyfile
	 * @throws Ioexception
	 */
	@BeforeMethod
	public void login()
	{
		String validusername=p.getProperty("UN");
		String validpassword=p.getProperty("PWD");
		driver.findElement(By.id("username")).sendKeys(validusername);
		driver.findElement(By.name("PWD")).sendKeys(validpassword);
		driver.findElement(By.xpath("div[.='login']")).click();
		Reporter.log("loogged in successfully inside the acti time application",true);
	}
	/**
	 * This method is used to logout fro the actitime application
	 */
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutlink")).clear();
		Reporter.log("logged out successfully froe acti time application",true);
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("closed fro the browser",true);
	}
	

}
