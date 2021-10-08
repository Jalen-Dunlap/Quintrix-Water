package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class PaymentPage extends PageObject{

	@FindBy(xpath = "//a[@title = 'Pay by bank wire']")
	private WebElement payByWire;
	
	protected PaymentPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public ConfirmationPage payup() {
		payByWire.click();
		return new ConfirmationPage(this.driver,this.baseUrl);
	}
}
