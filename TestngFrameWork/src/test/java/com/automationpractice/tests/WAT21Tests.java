package com.automationpractice.tests;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.foundation.TestBase;
import com.automationpractice.pageObjects.FrameWorkTest;
import com.automationpractice.pageObjects.SignInPage;

public class WAT21Tests extends TestBase {


	@Test
	public void WAT21FR001B1PositiveTest() {
		
	}

	@Test
	public void WAT21FR001B1NegativeTest() {
		boolean failIsDisplayed;
		
		SignInPage page = 
				new SignInPage(this.getDriver(),this.baseUrl)
				.navigate()
				.enterEmail("jalenmbdunlap@gmail.com")
				.enterPassword("password")
				.clickSubmit();
		
		failIsDisplayed = page.isLoggedIn();
		
		assertTrue(failIsDisplayed);
	}
}
