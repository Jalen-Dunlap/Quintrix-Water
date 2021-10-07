package com.automationpractice.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.automationpractice.foundation.TestBase;
import com.automationpractice.pageObjects.HomePage;

public class ProductDetailsPageTests extends TestBase{

	@Test
	public void wishlistTest() {
		assertEquals("You must be logged in to manage your wishlist.",
		new HomePage(getDriver(), this.baseUrl)
		.clickProductImage()
		.clickWishList()
		.getWishlistMessage());
	}
	
	@Test
	public void addToCartTest() {
			assertTrue(
					new HomePage(getDriver(), this.baseUrl)
					.clickProductImage()
					.clickaddToCart()
					.getAddToCartIcon()
					.isDisplayed());
	}
}
