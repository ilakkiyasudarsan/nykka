package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Selenium\\Lime\\src\\test\\java\\com\\feature\\Lime.feature",
glue = "com.stepdefinition",
//dryRun=false,
//monochrome=true,
//tags = "@smoketest",
plugin={"pretty",
	"json:Report/lime.json",
	"html:Report/lime.html",
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class LimeRoad  {
	public static WebDriver driver;
	@BeforeClass
	public static void browserlaunch(){
		
		driver = com.base.Base_class.Launch_Browser("chrome");
	
	}

}
