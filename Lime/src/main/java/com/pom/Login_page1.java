package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page1 {
	public WebDriver driver;
	@FindBy(xpath = "//span[text()='SHOP MEN']")
	private WebElement shopmen;

	public WebElement getshopmen() {
	return shopmen;
	}
	@FindBy(xpath="//div[@class='loaderCat vipshoesLdr dIb mA pA r0   h80 b4 l0 t0 ']")
	private WebElement footwear;
	
public WebElement getFootwear() {
		return footwear;
}
	@FindBy(xpath="(//span[@class=\" h321  dB vT pR bgF wp100\"])[1]")
	private WebElement Damn;
	//img[@alt='Voguish Oxford Shoes ']
	
	public WebElement getDamn() {             
		return Damn;
	}
	@FindBy(xpath="//img[@id='18401153']")
	private WebElement color;
	
	
	public WebElement getColor() {
		return color;
	}
	@FindBy(xpath="//span[@id='size_29511137']")
	private WebElement size;


	public WebElement getSize() {
		return size;
	}
	@FindBy(xpath="//div[text()='ADD TO CART']")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}


	public Login_page1(WebDriver driver2) {
        this.driver=driver2;
        PageFactory.initElements(driver, this);
	}
	}

