package listnersStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class  ListnerData implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
	Reporter.log("TC has been started");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
	}
	
	

}
