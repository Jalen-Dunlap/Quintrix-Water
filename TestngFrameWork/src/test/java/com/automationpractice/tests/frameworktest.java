package com.automationpractice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.foundation.TestBase;

import com.automationpractice.pageObjects.FrameWorkTest;

public class frameworktest extends TestBase {


	@Test
	public void testNgFrameWorkTest()  {
		String test= new FrameWorkTest(getDriver(), this.baseUrl).test();
		Assert.assertEquals(test, "My Store");
	}

}
