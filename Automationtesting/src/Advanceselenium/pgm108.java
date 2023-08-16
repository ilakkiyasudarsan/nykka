package Advanceselenium;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pgm108 {
	@BeforeMethod
	public void openBrowser()
	{
		Reporter.log("open the browser ",true);
		
	}
	@AfterMethod
	public void closeBrowser()
	{
	Reporter.log("close the browser ",true);
	}
	@Test
	public void createcustomer()
	{
	Reporter.log("create customer ",true);
	}

}
