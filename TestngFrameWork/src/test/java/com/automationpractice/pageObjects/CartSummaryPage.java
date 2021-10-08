package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class CartSummaryPage extends PageObject{

	@FindBy(xpath = "//*[@id='center_column']//a[@title = 'Proceed to checkout']")
	private WebElement ProcedeToCheckoutButton;
	
	public CartSummaryPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public CheckoutSignInPage ClickProcedeNotLoggedIn() {
		ProcedeToCheckoutButton.click();
		return new CheckoutSignInPage(this.driver,this.baseUrl);
	}
	
	public CheckoutAddressPage ClickProcedeLoggedIn() {
		ProcedeToCheckoutButton.click();
		return new CheckoutAddressPage(this.driver,this.baseUrl);
	}
}
