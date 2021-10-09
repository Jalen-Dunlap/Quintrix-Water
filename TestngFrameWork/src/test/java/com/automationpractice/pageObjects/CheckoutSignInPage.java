package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;

public class CheckoutSignInPage extends SignInPage{

	public CheckoutSignInPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public CheckoutAddressPage clickSignInCheckout() {
		submitLoginBtn.click();
		return new CheckoutAddressPage(this.driver,this.baseUrl);
	}
	
	public CheckoutSignInPage enterEmail(String email) {
		emailSignInInput.sendKeys(email);
		return this;
	}

	public CheckoutSignInPage enterPassword(String password) {
		passwordInput.sendKeys(password);
		return this;
	}
}
