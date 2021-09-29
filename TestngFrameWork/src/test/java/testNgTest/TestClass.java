package testNgTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

	
	@BeforeMethod
	public void before() {
		
		System.out.println("Before Method test");
	}
	
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	
	@AfterMethod()
	public void after() {
		System.out.println("After method Test");
	}
	
}
