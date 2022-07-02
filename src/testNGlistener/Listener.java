package testNGlistener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteAppBaseClassess.BaseClassUsingProperty;

public class Listener implements ITestListener 
{
	BaseClassUsingProperty b=new BaseClassUsingProperty();  //Create object of Base class
	
	//ontestPass
	//ontestFail
	//ontestSuccess
	//ontestSkip
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		Reporter.log("TC is Failed Screenshot Taken",true);
		ITestListener.super.onTestFailure(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC is Success",true);
		ITestListener.super.onTestSuccess(result);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC is Skipped,Please Check Dependent TC",true);
		ITestListener.super.onTestFailure(result);
	}

}
