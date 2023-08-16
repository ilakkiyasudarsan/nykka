package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.base.Base_class;
import com.pom.Login_page1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_defination extends Base_class {

	public Login_page1 lp = new Login_page1(driver);

	@Given("user Launch The {string} Url")
	public void user_launch_the_url(String string) {
		launchUrl(string);
	}

	@Then("user click the shop men and its navigate to home page")
	public void user_click_the_shop_men_and_its_navigate_to_home_page() throws InterruptedException {
		Thread.sleep(2000);
		lp.getshopmen().click();
	}

	@Given("user must be click footwear")
	public void user_must_be_click_footwear() throws InterruptedException {
		Thread.sleep(2000);
		lp.getFootwear().click();

	}

	

	@When("user select brand Damn good styles")
	public void user_select_brand_damn_good_styles() throws InterruptedException {
		Thread.sleep(2000);
		lp.getDamn().click();    
	}



//	@When("user select brand Damn good styles ")
//	public void user_select_brand_Damn_shoes() throws InterruptedException {
//		Thread.sleep(5000);
//		lp.getDamn().click();
//
//	}

	public Login_page1 getLp() {
		return lp;
	}

	@When("user clicks on color black later laceup sneakers")
	public void user_clicks_on_color_black_later_laceup_sneakers() throws InterruptedException {
		Thread.sleep(2000);
		lp.getColor().click();

	}

	@When("user select size 7UK")
	public void user_select_size_7uk() throws InterruptedException {
		Thread.sleep(2000);
		lp.getSize().click();

	}

	@When("user add the footwear to the cart")
	public void user_add_the_footwear_to_the_cart() throws InterruptedException {
		Thread.sleep(2000);
		lp.getCart().click();

	}

}
