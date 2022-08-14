package listnersnew;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("TestCase has been Started",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TestCase has been Failed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TestCase has been Skipped",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TestCase has been Passed",true);
	}
	
}
