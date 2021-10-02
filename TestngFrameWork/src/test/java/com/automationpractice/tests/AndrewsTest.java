package com.automationpractice.tests;

import org.testng.annotations.Test;

import com.automationpractice.foundation.TestBase;
import com.automationpractice.pageObjects.CreateAccountPage;
import com.automationpractice.pageObjects.HomePage;

public class AndrewsTest extends TestBase {

	
	// FR002.B1 P2 Buyers will be able to get registered on website with simple
	// registration form with details

//				Steps
//			
//				user is on sign in page
//			
//				user enters <kurtkobam@kurtmail.com /email> and clicks create account
//			
//				user enters First name, last name, email, <kurt123 /password> for “personal information“
//			
//				user enters first name, last name, address, city, and selects state, zip code, country and phone number and address alias. 
//			
//				user clicks register 
//			
//				Expected out come = pass

	@Test
	public void createUser() {
		CreateAccountPage home= new HomePage(getDriver(), this.baseUrl)
				.gotoSignInFromHomePage()
				.CreateAccount()
				.FillInCreateAccountDetails();
	}

}
