package xmlStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest5 {
	
	// I Want 1,3,5 And Do not Want 2,5
 
    @Test
    public void myMethod1()
    {
       Assert.fail();	
       Reporter.log("my Method1 is Running",true);
    }
     
    @Test
    public void myMethod2()
    {
       Reporter.log("my Method2 is Running",true);
    }
    
    @Test
    public void myMethod3()
    {
      //Assert.fail();		
      Reporter.log("my Method3 is Running",true);
    }
    
    @Test
    public void myMethod4()
    {
      Reporter.log("my Method4 is Running",true);
    }
   
   @Test
   public void myMethod5()
   {
      Reporter.log("my Method5 is Running",true);
   }
}
