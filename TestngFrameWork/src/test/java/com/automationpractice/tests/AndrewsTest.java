package com.automationpractice.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.foundation.TestBase;
import com.automationpractice.frameWork.DriverTools;
import com.automationpractice.pageObjects.ContactUsPage;
import com.automationpractice.pageObjects.GenericProductDetailsPage;
import com.automationpractice.pageObjects.HomePage;

public class AndrewsTest extends TestBase {

	@Test
	public void createUserPositiveFR002B1P2() {
		String home = new HomePage(getDriver(), this.baseUrl).gotoSignInFromHomePage().CreateAccount()
				.FillInCreateAccountDetails();

		Assert.assertEquals(home, "My account - My Store");
	}

	@Test
	public void createUserNegativeFR002B1P2() throws InterruptedException {
		WebElement alertBox = new HomePage(getDriver(), this.baseUrl).gotoSignInFromHomePage().CreateAccount()
				.FillInCreateAccountDetailsNegativeTest();

		Assert.assertTrue(alertBox.isDisplayed());
	}

	@Test
	public void resetPasswordPositive() {
		WebElement alertBox = new HomePage(getDriver(), this.baseUrl).gotoSignInFromHomePage().clickForgotPassword()
				.RetrievePassword("potato@potato.com");
		Assert.assertTrue(alertBox.isDisplayed());
	}

	@Test
	public void FR004B2P1clickProductImageToSeeProductDetailsPage() {
		WebElement home = new HomePage(getDriver(), this.baseUrl).clickProductImage().getDataSheet();
		Assert.assertEquals(home.getText().toLowerCase(), "data sheet");
	}

	@Test
	public void FR013B1P4ContactSupportpositiveTest() {
		WebElement support = new HomePage(getDriver(), this.baseUrl).clickContactUs().selectCustomerService()
				.enterEmail("bill@billmail.com").msgSendKeys("hello").clickSubmit();
		Assert.assertTrue(support.isDisplayed());
	}

}
