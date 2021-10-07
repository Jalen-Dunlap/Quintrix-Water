package com.automationpractice.frameWork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverTools {

	public static void scrollToElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void waitForVisibilityOfElemet(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForVisibilityOfText(WebElement element, WebDriver driver, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.attributeContains(element, "value", value));
	}

	public static Boolean waitForVisibilityOfTextBolean(WebElement element, WebDriver driver, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean isVisible = wait.until(ExpectedConditions.attributeContains(element, "value", value));
		return isVisible;
	}

	public static void selectDdValue(WebElement element, int index) {

		try {
			Select select = new Select(element);
			int size = select.getOptions().size();

			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

}
