package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;

import com.automationpractice.foundation.PageObject;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	
	}

	public SignInPage gotoSignInFromHomePage() {
		
		return new SignInPage(this.driver, this.baseUrl);
	}

	
	
}
