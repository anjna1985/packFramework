package regressionSuiteTestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestFailure extends BaseTest {

	@Test
	public void doRegister() {
		Assert.fail("Failing login test");
	}
	@Test
	public void doLogin() {

		Assert.assertEquals(true, true);
	}
	@Test
	public void doPerformAction() {

		Assert.assertEquals(true, false);
	}
	@Test
	public void isSkip() {
		throw new SkipException("Skipping the test as the condition is not met");
	}
}
