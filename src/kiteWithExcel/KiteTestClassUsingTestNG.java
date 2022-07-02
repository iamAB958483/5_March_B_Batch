package kiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestClassUsingTestNG {
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	WebDriver driver;
	Sheet mySheet;
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException 
	{
		    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		    
			driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com/");
	        
			Reporter.log("Launching URL",true);
			
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	        
	        login= new KiteLoginPage(driver);
	        
	        home= new KiteHomePage(driver);
	        
	        pin= new KitePinPage(driver);
	        
	        File MyFile=new File("E:\\\\New folder\\\\Book3.xlsx");
	 	   
			mySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");		
	}
	
	@BeforeMethod
	public void loginToKite()
	{
		login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Sending Username",true);
		login.sendPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Sending Password",true);
		login.clickOnLoginButton();
		Reporter.log("Clicking on Login Button",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Sending PIN",true);
		pin.clickOnContinueButton();
		Reporter.log("Clicking on Continue Button",true);	
	}
	
	
  @Test
  public void verifyKiteUserName() 
  {	  
	  String expectedUserID = mySheet.getRow(0).getCell(0).getStringCellValue();
	  String actualUserID= home.getActualUserID();
	  Reporter.log("Validating User ID",true);
	  
	  Assert.assertEquals(expectedUserID,actualUserID,"Expected UserID and Actual UserID are not Matching TC is FAILED");
	  Reporter.log("Expected UserID and Actual UserID are Matching TC is PASSED",true);  
  }
  
  
  @AfterMethod
  public void logOutFromKiteApp() throws InterruptedException
  {
	  home.clickOnLogOutButton();
	  Reporter.log("Logging Out",true);
  }
  
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
  
  
}
