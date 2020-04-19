package com.mycompany.app;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic extends BaseTest {
	
	
	
	@BeforeTest
    public void beforetest1 ()
    {
    	System.out.println("I am in before test");
    }
	
	@BeforeClass
    public void beforeclass1 ()
    {
    	System.out.println("I am in before class of testngbasic");
    }
	
	@BeforeMethod
    public void beforemethod1 ()
    {
    	System.out.println("I am in before method of testngbasic");
    }
	
	@Test(groups= {"Smoke"})
    public void test1 ()
    {
    	System.out.println("Test1 in testngbasic");
    }

	@Test
    public void test2 ()
    {
    	System.out.println("Test2 in testngbasic");	
    }
	
	@AfterMethod
    public void aftermethod1 ()
    {
    	System.out.println("I am in after method of testngbasic");
    }
	
	@AfterTest
    public void aftertest1 ()
    {
    	System.out.println("I am in after test");
    }
	
	@AfterClass
    public void Afterclass1 ()
    {
    	System.out.println("I am in after class of testngbasic");
    }

	
    public void test3 ()
    {
    	System.out.println("Test3");	
    }

}

//Install s/w 1st and then from the build configure