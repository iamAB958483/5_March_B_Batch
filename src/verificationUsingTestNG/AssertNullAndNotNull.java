package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullAndNotNull {
 
	@Test
  public void myMethod2() 
  {
	  String p=null;
	  String q="Hello";
	  
//	  Assert.assertNull(p,"Value is Not Null TC is Failed");
//	  Reporter.log("Value is Null TC is Passed", true);
	  
	  
      Assert.assertNotNull(q,"Value is Null TC is Failed");
      Reporter.log("Value is Not Null TC is Passed",true);
	  
	  
	  
  }
}
