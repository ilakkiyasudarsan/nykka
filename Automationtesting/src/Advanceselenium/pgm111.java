package Advanceselenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pgm111 {
	@BeforeClass
	public void Openbrowser()
	{
		Reporter.log("open the browser",true);
	}
	@AfterClass
	public void closebrowser()
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
		Reporter.log("create the customer",true);
	}
	@Test(priority=1,invocationCount = 2)
	public void editcustomer()
	{
		Reporter.log("edit the customer",true);
	}
	@Test
	public void Deletecustomer()
	{
		Reporter.log("delete the customer",true);
	}


}
