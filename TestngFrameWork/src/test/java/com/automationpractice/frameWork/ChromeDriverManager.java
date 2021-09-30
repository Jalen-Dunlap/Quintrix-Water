package com.automationpractice.frameWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		String chromeDriverPath = "src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		setDriver(new ChromeDriver());

	}
}
