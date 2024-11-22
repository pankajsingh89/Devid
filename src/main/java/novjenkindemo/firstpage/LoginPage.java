package novjenkindemo.firstpage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeGroups
	public void beforeGroup() {
		System.out.println("Before Group");
	}
	
	@AfterGroups
	public void afterGroup() {
		System.out.println("After Group");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
		
	}
	
	@Test
	public void test() {
		System.out.println("Test");
	}
}
