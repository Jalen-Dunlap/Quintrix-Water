package com.automationpractice.frameWork;

public class DriverManagerFactory {
	DriverManager drivermanager;

	public DriverManager getManager(String driverType) {

		switch (driverType) {
		case "chrome":
			return new ChromeDriverManager();
		case "edge":
			return new EdgeDriverManager();
		default:
			throw new IllegalArgumentException("Driver type is not supported " + driverType);
		}

	}

}
