package com.automationpractice.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.foundation.PageObject;
import com.automationpractice.frameWork.DriverTools;

public class GenericProductDetailsPage extends PageObject{

	@FindBy(xpath = "//*[@id='add_to_cart']/button")
	private WebElement addToCartButton;
	
	@FindBy(id = "wishlist_button")
	private WebElement wishlistButton;
	
	@FindBy(xpath = "//h3[@class='page-product-heading' and text()='Data sheet']")
	private WebElement dataSheetText;
	
	private WebElement WishlistMessage;
	private WebElement checkoutButton;
	private WebElement cartSuccessIcon;
	
	protected GenericProductDetailsPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public GenericProductDetailsPage clickaddToCart() {
		addToCartButton.click();
		checkoutButton = this.driver.findElement(By.xpath("//a[@title ='Proceed to checkout']"));
		cartSuccessIcon = this.driver.findElement(By.xpath("//i[@class = 'icon-ok']"));
		return this;
	}
	
	public GenericProductDetailsPage clickWishList() {
		wishlistButton.click();
		WishlistMessage = this.driver.findElement(By.xpath("//*[@class = 'fancybox-error']"));
		return this;
	}
	
	public String getWishlistMessage() {
		WishlistMessage.click();
		return WishlistMessage.getText();
	}

	public WebElement getDataSheet() {
		DriverTools.scrollToElement(dataSheetText, this.driver);
		return dataSheetText;
	}
	
	public WebElement getAddToCartIcon() {
		cartSuccessIcon.click();
		return cartSuccessIcon;
	}

}
