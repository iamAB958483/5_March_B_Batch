package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy1 {
  
  @Test
  public void myTest3() 
  {
	Reporter.log("Test Method3 is Running ",true);
  }
  
  
  @Test
  public void myTest4()
  {
	  Reporter.log("Test Method4 is Running",true);
  }
  
  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Before Method is Running",true);
  }
  
  
  @AfterMethod
  public void logout()
  {
	  Reporter.log("After Method is running",true);
  }
  
  @BeforeClass
  public void LaunchBrowser()
  {
	  Reporter.log("Before Class is Running ",true);
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("After Class is Running", false);
  }
  
  
}
