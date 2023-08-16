package Advanceselenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLast3Program {
	@FindBy(id="username")
	private WebElement usernameTextBox;
	@FindBy(name="pwd")
	private WebElement passwordTextBox;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBtton;
	public MyLast3Program(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void SetLogin()
	{
		usernameTextBox.sendKeys("admin");
		passwordTextBox.sendKeys("manager");
		LoginBtton.click();
	}
	

}
