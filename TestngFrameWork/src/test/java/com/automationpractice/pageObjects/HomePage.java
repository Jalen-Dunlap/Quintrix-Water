package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	
	}

	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signInBtn;
	
	
	public SignInPage gotoSignInFromHomePage() {
		signInBtn.click();
		return new SignInPage(this.driver, this.baseUrl);
	}

	
	
}
