package com.automationpractice.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.automationpractice.foundation.TestBase;
import com.automationpractice.pageObjects.HomePage;

public class CheckoutTests extends TestBase{
	@Test
	public void addToCartTest() {
		assertEquals("ORDER CONFIRMATION",
				new HomePage(this.getDriver(), this.baseUrl)
				.clickProductImage()
				.clickaddToCart()
				.clickChecoutButton()
				.ClickProcedeNotLoggedIn()
				.enterEmail("jalenmbdunlap@gmail.com")
				.enterPassword("password")
				.clickSignInCheckout()
				.clickProcedeToCheckout()
				.clickAgree()
				.clickProcede()
				.payup()
				.clickConfirm()
				.confirmConfirmation());

	}

}
