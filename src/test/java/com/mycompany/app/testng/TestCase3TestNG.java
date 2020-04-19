package com.mycompany.app.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3TestNG {

	@Test(priority = 1, groups = { "functional", "smoke" })
	public void doUserReg() {
			System.out.println("Executing User Reg test");
			Assert.fail("User not registered successfully");
		}
	

	@Test(priority = 2, dependsOnMethods = "doUserReg", alwaysRun = true, groups = { "functional", "smoke" }) // https://testng.org/doc/documentation-main.html#dependent-methods
	public void doLogin() {
		System.out.println("Executing login test");
	}

	
	@Test(priority = 3, dependsOnMethods = "doUserReg", alwaysRun = true, groups = "functional")
	public void thirdTest() {
		System.out.println("Executing third test");
	}

	@Test(priority = 4)
	public void forthTest() {
		System.out.println("Executing forth test");
	}

}
