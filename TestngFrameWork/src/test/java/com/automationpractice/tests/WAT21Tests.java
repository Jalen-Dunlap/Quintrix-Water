package com.automationpractice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.foundation.TestBase;
import com.automationpractice.pageObjects.SignInPage;

public class WAT21Tests extends TestBase {


	@Test
	public void WAT21FR001B1PositiveTest() throws Exception {
		
		new SignInPage(this.getDriver(),this.baseUrl)
		.navigate()
		.enterEmail("jalenmbdunlap@gmail.com")
		.enterPassword("password")
		.clickSubmit();
		
		Assert.assertTrue(getDriver().getTitle().equals("My account - My Store"));
	}

	@Test
	public void WAT21FR001B1NegativeTest() throws Exception {
		new SignInPage(this.getDriver(),this.baseUrl)
		.navigate()
		.enterEmail("jalenmbdunlap@gmail.com")
		.enterPassword("pass")
		.clickSubmit();
		
		Assert.assertFalse(getDriver().getTitle().equals("My account - My Store"));
	}
}
