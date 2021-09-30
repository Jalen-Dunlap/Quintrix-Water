package com.automationpractice.foundation;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.automationpractice.frameWork.DriverManager;
import com.automationpractice.frameWork.DriverManagerFactory;
import com.automationpractice.frameWork.ConfigsReader;


public abstract class TestBase {

	public DriverManager drivermanager;
	protected String baseUrl = "http://automationpractice.com/index.php";

	@BeforeTest
	public void setup() {

		this.drivermanager = new DriverManagerFactory().getManager(ConfigsReader.getProperty("browser"));
		this.drivermanager.createDriver();

		getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		getDriver().navigate().to(this.baseUrl);

	}

	@AfterTest
	public void cleanUp() {
		this.drivermanager.quitDriver();
	}

	public WebDriver getDriver() {
		return this.drivermanager.getDriver();
	}
}
