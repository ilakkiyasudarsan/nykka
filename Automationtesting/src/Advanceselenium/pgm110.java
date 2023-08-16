package Advanceselenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pgm110
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open the browser",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close the browser",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@Test
	public void createcustomer()
	{
		Reporter.log("create the custoer",true);
	}
	@Test
	public void deletecustomer()
	{
		Reporter.log("delete the custoer",true);
	}


}
