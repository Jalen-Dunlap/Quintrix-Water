package com.automationpractice.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.foundation.TestBase;
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


}
