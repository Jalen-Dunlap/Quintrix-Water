package com.automationpractice.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;

public class GenericProductDetailsPage extends PageObject{

	@FindBy(xpath = "//*[@id='add_to_cart']/button")
	private WebElement addToCartButton;
	
	@FindBy(id = "wishlist_button")
	private WebElement wishlistButton;
	
	private WebElement WishlistMessage;
	private WebElement checkoutButton;
	
	
	protected GenericProductDetailsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public GenericProductDetailsPage clickaddToCart() {
		addToCartButton.click();
		checkoutButton = this.driver.findElement(By.xpath("//a[@title ='Proceed to checkout']"));
		return this;
	}
	
	public GenericProductDetailsPage clickWishList() {
		wishlistButton.click();
		WishlistMessage = this.driver.findElement(By.xpath("//*[@class = 'fancybox-error']"));
		return this;
	}
	
	public String getWishlistMessage() {
		return WishlistMessage.getText();
	}
	
	

}
