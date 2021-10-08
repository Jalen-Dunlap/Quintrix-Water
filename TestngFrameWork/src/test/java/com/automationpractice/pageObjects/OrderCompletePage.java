package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class OrderCompletePage extends PageObject{

	@FindBy(xpath = "//*[@id='center_column']/h1")
	private WebElement confirmationTitle;
	
	protected OrderCompletePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String confirmConfirmation() {
		return confirmationTitle.getText();
	}
}
