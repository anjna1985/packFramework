package regressionSuiteTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractise extends BaseTest {
	
	@BeforeTest
	public void creatingDBConn() {
		System.out.println("Creating DB Conn");
	}
	
	@BeforeMethod
	public void lanuchBrowser()
	{
		System.out.println("Lanching Browser");
	}
	
	@Test(priority=1)
	public void UserRegistration ()
	{
		System.out.println("First Method: User Registration");
	}

	@Test(priority=2)
	public void LoginDetails() 
	{
		System.out.println("Second Method: Login Details");
		
	}

	@AfterMethod
	public void closingBrowser()
	{
		System.out.println("Closing Browser");
	}
	
	@AfterTest
	public void closeDBConn() {
		System.out.println("Creating DB Conn");
	}
	
	
}
