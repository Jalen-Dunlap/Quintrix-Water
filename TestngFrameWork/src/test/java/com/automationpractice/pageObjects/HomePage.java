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

	@FindBy(xpath = "//*[@title='Contact us']")
	private WebElement contactUsBtn;

	@FindBy(xpath = "//ul[@id='homefeatured']//img[@title ='Faded Short Sleeve T-shirts']/..")
	private WebElement fadeShirtLink;

	public SignInPage gotoSignInFromHomePage() {
		signInBtn.click();
		return new SignInPage(this.driver, this.baseUrl);
	}

	public GenericProductDetailsPage clickProductImage() {
		fadeShirtLink.click();
		return new GenericProductDetailsPage(this.driver, this.baseUrl);
	}

	public ContactUsPage clickContactUs() {
		contactUsBtn.click();

		return new ContactUsPage(this.driver, this.baseUrl);
	}

}
