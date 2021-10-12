package com.automationpractice.foundation;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automationpractice.frameWork.DriverManager;
import com.automationpractice.frameWork.DriverManagerFactory;
import com.automationpractice.frameWork.DriverTools;
import com.automationpractice.frameWork.ConfigsReader;


public abstract class TestBase {

	public DriverManager drivermanager;
	public String baseUrl = "http://automationpractice.com/index.php";

	@BeforeMethod
	public void setup() {

		this.drivermanager = new DriverManagerFactory().getManager(ConfigsReader.getProperty("browser"));
		this.drivermanager.createDriver();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		getDriver().navigate().to(this.baseUrl);
		
	}

	@AfterMethod
	public void cleanUp(ITestResult result) {
		
		
		if(ITestResult.FAILURE==result.getStatus()) {
			DriverTools.captureScreen(getDriver());
		};
		this.drivermanager.quitDriver();
	}

	public WebDriver getDriver() {
		return this.drivermanager.getDriver();
	}
}
