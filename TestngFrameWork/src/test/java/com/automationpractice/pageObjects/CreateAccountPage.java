package com.automationpractice.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;
import com.automationpractice.frameWork.DriverTools;

public class CreateAccountPage extends PageObject {

	protected CreateAccountPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	@FindBy(id = "customer_firstname")
	private WebElement fNameInput;

	@FindBy(id = "customer_lastname")
	private WebElement lNameInput;

	@FindBy(id = "email")
	private WebElement emailAddressInput;

	@FindBy(id = "passwd")
	private WebElement passwordInput;

	@FindBy(id = "firstname")
	private WebElement addressFNameInput;

	@FindBy(id = "lastname")
	private WebElement addressLNameInput;

	@FindBy(id = "address1")
	private WebElement addressLine1;

	@FindBy(id = "city")
	private WebElement cityInput;

	@FindBy(id = "id_state")
	private WebElement stateDropDown;

	@FindBy(id = "postcode")
	private WebElement zipCodeInput;

	@FindBy(id = "phone_mobile")
	private WebElement mobilePhoneInput;

	@FindBy(id = "alias")
	private WebElement addressAlisInput;

	@FindBy(id = "submitAccount")
	private WebElement registerBtn;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement alertBox;

	public String FillInCreateAccountDetails() {

		WebElement arizonaEle = stateDropDown.findElement(By.cssSelector(" [value='1']"));

		String fName = "Bill";
		String lName = "Tacos";

		fNameInput.sendKeys(fName);
		lNameInput.sendKeys(lName);

		passwordInput.sendKeys("12345");

		addressLine1.sendKeys("1234 no where");
		cityInput.sendKeys("some city");

		DriverTools.scrollToElement(arizonaEle, this.driver);
		stateDropDown.click();
		arizonaEle.click();

		zipCodeInput.sendKeys("24151");
		mobilePhoneInput.sendKeys("3463442345");

		registerBtn.click();

		String title = driver.getTitle();
		return title;
	}

	public WebElement FillInCreateAccountDetailsNegativeTest() throws InterruptedException {

		WebElement arizonaEle = stateDropDown.findElement(By.cssSelector(" [value='1']"));

		String fName = "Bill";
		String lName = "Tacos";

		fNameInput.sendKeys(fName);
		lNameInput.sendKeys(lName);

		passwordInput.sendKeys("12345");

		addressLine1.sendKeys("1234 no where");
		cityInput.sendKeys("some city");

		DriverTools.scrollToElement(arizonaEle, this.driver);
		stateDropDown.click();
		arizonaEle.click();

		registerBtn.click();

		return alertBox;

	}
}
