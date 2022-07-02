package testNGlistener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Maharashtra {
  
	@Test
  public void Shahada() 
  {
		Reporter.log("Shahada TC is Running",true);
  }
	
	
	@Test
	public void Nandurbar()
	{
		Reporter.log("Nandurbar TC is Running",true);
	}
}
