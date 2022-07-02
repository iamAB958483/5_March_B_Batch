package kiteAppTestClassess;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppBaseClassess.BaseClassUsingProperty;
import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;
import kiteAppUtility.UtilityUsingPropertyFile;

public class KiteUNTestUsingProperty extends BaseClassUsingProperty {
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUserName(UtilityUsingPropertyFile.readDataFromProperty("UN"));
		login.sendPassword(UtilityUsingPropertyFile.readDataFromProperty("PWD"));
		login.clickOnLoginButton();
		
		UtilityUsingPropertyFile.implicitWait(driver,200);
		
		pin.sendPin(UtilityUsingPropertyFile.readDataFromProperty("PIN"));
		pin.clickOnContinueButton();
		UtilityUsingPropertyFile.implicitWait(driver,200);
	}
  
	@Test
	public void ValidateUserName() throws IOException
	{
		String actualUserID=home.getActualUserID();
		String expectedUserID=UtilityUsingPropertyFile.readDataFromProperty("UN");
		
		Assert.assertEquals(actualUserID,expectedUserID,"Actual And Expected are Not Matching,TC is Failed");
        Reporter.log("Actual And Expected are Matching,TC is Passed",true);
        UtilityUsingPropertyFile.takeScreenshot(driver);
	}
	
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.clickOnLogOutButton();
	}
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	
}
