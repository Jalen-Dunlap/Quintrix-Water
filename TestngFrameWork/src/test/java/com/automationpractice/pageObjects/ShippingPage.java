package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class ShippingPage extends PageObject{

	@FindBy(id = "cgv")
	private WebElement agreeBox;
	
	@FindBy(xpath = "//button[@name = 'processCarrier']")
	private WebElement procedeToCheckoutButton;
	
	protected ShippingPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public ShippingPage clickAgree() {
		agreeBox.click();
		return this;
	}
	
	public PaymentPage clickProcede() {
		procedeToCheckoutButton.click();
		return new PaymentPage(this.driver,this.baseUrl);
	}

}
