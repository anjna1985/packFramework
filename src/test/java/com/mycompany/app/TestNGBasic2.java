package com.mycompany.app;

import org.testng.annotations.Test;

public class TestNGBasic2 extends BaseTest {
	
	@Test
    public void test1 ()
    {
    	System.out.println("Test1 in testngbasic2");
    }

	@Test(groups= {"Smoke"})
    public void test2 ()
    {
    	System.out.println("Test2 in testngbasic2");	
    }

	@Test(enabled=false)
    public void test3 ()
    {
    	System.out.println("Test3");	
    }

}

//Install s/w 1st and then from the build configure