package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;

import com.automationpractice.foundation.PageObject;

public class SignInPage extends PageObject {

	protected SignInPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public CreateAccountPage CreateAccount() {
		
		return new CreateAccountPage(this.driver, this.baseUrl);
	}

}
