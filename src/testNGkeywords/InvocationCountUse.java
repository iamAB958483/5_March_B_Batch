package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
 
	@Test(invocationCount=3)
  public void myMethod() 
  {
		Reporter.log("My Method is Running",true);
  }
	
	@AfterMethod
	public void close()
	{
		Reporter.log("Closing Browser",true);
	}
}
