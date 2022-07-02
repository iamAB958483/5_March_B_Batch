package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTC {

	@Test
  public void myMethod4() 
  {
		String a="Abhijit";
		String b="Rajendra";
		String c="Bhamare";
		
		Assert.fail();  
		Assert.assertEquals(a,b,"Strings are not Matching TC is failed");
		Reporter.log("Strings are Matching then TC is Passed ",true);
  }
}
