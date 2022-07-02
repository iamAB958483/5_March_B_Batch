package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest4 {
	
	    @Test(groups="Regression Testing")
	    public void myMethod6()
	    {
	       Reporter.log("my Method6 Regression is Running",true);
	    }
	     
	    @Test(groups="Sanity Testing")
	    public void myMethod7()
	    {
	       Reporter.log("my Method7 Sanity is Running",true);
	    }
	    
	    @Test
	    public void myMethod8()
	    {
	      Reporter.log("my Method8 is Running",true);
	    }
	    
	    @Test
	    public void myMethod9()
	    {
	      Reporter.log("my Method9 is Running",true);
	    }
	   
	   @Test
	   public void myMethod10()
	   {
	      Reporter.log("my Method10 is Running",true);
	   }
}
