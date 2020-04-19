package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed Test - "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//https://mvnrepository.com/artifact/com.google.inject/guice/4.2.3
		System.setProperty("org.uncommons.reportng.escape-output","false");
		Reporter.log("<a href=\"C:\\Screenshot.jpg\" target =\"_blank\">Scrrenshot");
		Reporter.log("<br>");
		Reporter.log("<a href=\"D:\\cc\\Software\\Screenshot.jpg\" target =\"_blank\"><img height=200 width=200 src=\"D:\\cc\\Software\\Screenshot.jpg\"></a>");
		System.out.println("Capturing Screenshot for the failed -- "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	
}
