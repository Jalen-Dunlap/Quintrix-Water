package com.automationpractice.tests;

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

}
