package com.automationpractice.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class SignInPage extends PageObject {

	protected SignInPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String email = "kurtkobam" + 31243 + (int) (Math.random() * ((1000000 - 31243) + 1)) + "@gmail.com";

	@FindBy(id = "email_create")
	private WebElement emailAddressInput;

	@FindBy(id = "SubmitCreate")
	private WebElement submitBtn;

	@FindBy(xpath = "//*[@id='login_form']/div/p[1]/a")
	private WebElement forgotPassword;

	public CreateAccountPage CreateAccount() {

		emailAddressInput.sendKeys(email);
		submitBtn.click();

		return new CreateAccountPage(this.driver, this.baseUrl);
	}

	public ForgotPasswordPage clickForgotPassword() {
		forgotPassword.click();
		return new ForgotPasswordPage(this.driver,this.baseUrl);
	}

}
