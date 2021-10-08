package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class CheckoutAddressPage extends PageObject{

	@FindBy(xpath = "//button[@name = 'processAddress']")
	private WebElement ProcedeToCheckoutButton;
	
	public CheckoutAddressPage(WebDriver driver, String baseUrl) {
		super(driver,baseUrl);
	}
	
	public ShippingPage clickProcedeToCheckout() {
		ProcedeToCheckoutButton.click();
		return new ShippingPage(this.driver,this.baseUrl);
	}
	
}
