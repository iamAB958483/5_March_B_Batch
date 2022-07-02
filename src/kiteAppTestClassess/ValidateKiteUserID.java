package kiteAppTestClassess;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import kiteAppBaseClassess.BaseClassess;
import kiteAppPOM.KiteHomePage;
import kiteAppPOM.KiteLoginPage;
import kiteAppPOM.KitePinPage;

public class ValidateKiteUserID extends BaseClassess
{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
	}
	
	
	
	
	
  @Test
  public void validateUserName() {
  }
}
