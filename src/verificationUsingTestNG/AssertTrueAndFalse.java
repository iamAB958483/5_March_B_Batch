package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueAndFalse {
  
	@Test
  public void myMethod3() 
  {
	  boolean a=true;
	  boolean b=false;
	  
//	  Assert.assertTrue(a,"Value is False TC is Failed");
//	  Reporter.log("Value is True TC is Passed", a);
	  
	  
	  Assert.assertFalse(b,"Value is True TC is Failed");
	  Reporter.log("Value is False TC is Passed",true);
	  
  }
}
