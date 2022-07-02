package testNGkeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
  
	@Test
	public void D() 
    {
		Assert.fail();
		Reporter.log("D is Running",true);
    }
	
	@Test(dependsOnMethods= {"D"}) 
	  public void C()
	  {
			Reporter.log("C is Running",true);
	  }
	
	@Test
	  public void A() 
	  {
			Reporter.log("A is Running",true);
	  }
	
	@Test
	  public void B() 
	  {
			Reporter.log("B is Running",true);
	  }
}
