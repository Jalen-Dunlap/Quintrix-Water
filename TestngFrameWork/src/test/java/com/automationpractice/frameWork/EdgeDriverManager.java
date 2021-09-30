package com.automationpractice.frameWork;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		String edgeDriverPath = "src/test/resources/drivers/msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", edgeDriverPath);
		setDriver(new EdgeDriver());

	}

}
