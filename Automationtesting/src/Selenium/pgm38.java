package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class pgm38 {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitwait(Duration.Ofseconds(15));
     driver.manage().wondow().maximize();
     driver.get("https://demo.actitime.com/login.do");
     driver.findElement(by.id("username")).sendkeys("admin");
     driver.findElement(by.id("pwd")).sendkeys("manager");
     driver.findElement(by.xpath("//div [.='login']")).click();
     driver.findElement(by.id("logoutLink")).click();
     driver.close();
}
     
}
