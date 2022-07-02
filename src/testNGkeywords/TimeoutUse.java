package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutUse {
	
	@Test(timeOut=2400)
    public void D() throws InterruptedException 
    {
		Thread.sleep(2000);
		Reporter.log("D is Running",true);
    }
	
	@Test
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
