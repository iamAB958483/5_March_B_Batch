package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  
	@Test
  public void myMethod1() 
  {
		String a="ABHIJIT";
		String b="ABHIJIT";
		String c="BHAMARE";
		
	    // If a And b are same then TC should be passed else TC is Failed...
		
		
	//	Assert.assertEquals(a,b,"Strings are not Matching TC is failed");
	//	Reporter.log("Strings are Matching then TC is Passed ",true);
		
		
		Assert.assertNotEquals(a,b,"String are Matching TC is Failed");
		Reporter.log("Strings are not Matching TC is Passed",true);	
  }
}
