package com.mycompany.app.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2NG {
	
	@Test (priority=5, groups = "smoke")
	public void validateTitles() {
		
		  System.out.println("Beginning");
		  String expected_title = "Yahoo.com"; 
		  String actual_title = "Gmail.com";
		 
		  SoftAssert softAssert = new SoftAssert();
				  
		/* If else not report failure thing in console - So no use in Test NG
		 * if (expected_title.contentEquals(actual_title)) {
		 * System.out.println("TestCase Passed"); } else {
		 * System.out.println("TestCase Failed"); }
		 */
		System.out.println("Validating Title");
		softAssert.assertEquals(expected_title, actual_title, "Title not matched");
		//isElementPresent("xpath") - true/false
		
		System.out.println("Validaing Image");
		softAssert.assertEquals(true, false, "Textbox not present");
		//softAssert.assertTrue(false, "element not found");
		
		softAssert.assertEquals(true, true, "Textbox present");
		
		softAssert.fail("Test Case Failed.");
		System.out.println("Ending");
		
		softAssert.assertAll();
		
	}
	
}