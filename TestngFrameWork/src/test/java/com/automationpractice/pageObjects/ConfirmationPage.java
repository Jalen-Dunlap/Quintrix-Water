package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class ConfirmationPage extends PageObject{

	@FindBy(xpath = "//*[@id='cart_navigation']/button")
	private WebElement confirmButton;
	
	protected ConfirmationPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public OrderCompletePage clickConfirm() {
		confirmButton.click();
		return new OrderCompletePage(this.driver,this.baseUrl);
	}
}
