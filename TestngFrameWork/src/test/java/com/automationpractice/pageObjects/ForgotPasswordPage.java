package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;


import com.automationpractice.foundation.PageObject;

public class ForgotPasswordPage extends PageObject{

	@FindBy(id = "email")
	private WebElement emailBox;
	
	@FindBy(xpath = "//*[@id='form_forgotpassword']/fieldset/p/button")
	private WebElement retrieveButton;
	

	private WebElement alertBox;
	protected ForgotPasswordPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public WebElement RetrievePassword(String email) {
		emailBox.sendKeys(email);
		retrieveButton.click();
		alertBox = 	this.driver.findElement(By.xpath("//*[@id='center_column']//p[@class = 'alert alert-success']"));
		return alertBox;
	}

}
