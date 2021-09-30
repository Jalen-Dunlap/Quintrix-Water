package com.automationpractice.frameWork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverTools {

	public static void scrollToElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void waitForVisibilityOfElemet(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);;
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForVisibilityOfText(WebElement element, WebDriver driver, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.attributeContains(element,"value",value));
	}
	
	public static Boolean waitForVisibilityOfTextBolean(WebElement element, WebDriver driver, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean isVisible=wait.until(ExpectedConditions.attributeContains(element,"value",value));
		return isVisible;
	}

}
