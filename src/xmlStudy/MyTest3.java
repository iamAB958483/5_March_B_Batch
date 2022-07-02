package xmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest3 {
	
	
    @Test(groups="Sanity Testing")
    public void myMethod1()
    {
       Reporter.log("my Method1 Sanity is Running",true);
    }
     
    @Test
    public void myMethod2()
    {
       Reporter.log("my Method2 is Running",true);
    }
    
    @Test(groups="Regression Testing")
    public void myMethod3()
    {
      Reporter.log("my Method3 Regression is Running",true);
    }
    
    @Test
    public void myMethod4()
    {
      Reporter.log("my Method4 is Running",true);
    }
   
   @Test(groups="Regression Testing")
   public void myMethod5()
   {
      Reporter.log("my Method5 Regression is Running",true);
   }
}
