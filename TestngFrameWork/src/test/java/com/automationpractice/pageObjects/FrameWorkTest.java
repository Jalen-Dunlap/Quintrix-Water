package com.automationpractice.pageObjects;

import org.openqa.selenium.WebDriver;

import com.automationpractice.foundation.PageObject;

public class FrameWorkTest extends PageObject {

	public FrameWorkTest(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String test() {
		return driver.getTitle();
	}

}
