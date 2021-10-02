package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;

import com.automationpractice.foundation.PageObject;

public class CreateAccountPage extends PageObject{

	protected CreateAccountPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public CreateAccountPage FillInCreateAccountDetails() {
		
		return this;
	}

}
