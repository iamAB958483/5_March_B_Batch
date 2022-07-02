package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass 
{
  @Test
  public void myMethod1() 
  {
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
	    
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
        driver.manage().window().maximize(); 
        
        Reporter.log("myMethod1 is Running",true);
     
        
  }
  @Test
  public void myMethod2()

  {
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Reporter.log("myMethod2 is Running",true);
  }
  

  @Test
  public void myMethod3()
  {
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
		Reporter.log("myMethod3 is Running",true);
  }


}



