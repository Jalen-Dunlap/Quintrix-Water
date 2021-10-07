package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;
import com.automationpractice.frameWork.DriverTools;

public class ContactUsPage extends PageObject {

	public ContactUsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);

	}

	
	@FindBy(id = "id_contact")
	private WebElement subjectHeadingDropDown;

	@FindBy(id = "message")
	private WebElement messageBox;

	@FindBy(xpath = "//span[text()='Send']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement successMsg;
	
	@FindBy(id = "email")
	private WebElement emailInput;
	
	
	
	public ContactUsPage selectCustomerService() {
		DriverTools.selectDdValue(subjectHeadingDropDown, 1);
		return this;
	}



	public ContactUsPage msgSendKeys(String msg) {
		messageBox.sendKeys(msg);
		return this;
	}



	public WebElement clickSubmit() {
		submitBtn.click();
		return successMsg;
	}



	public ContactUsPage enterEmail(String email) {
		emailInput.sendKeys(email);
		return this;
	}
	
	
	
	
	
	
}
