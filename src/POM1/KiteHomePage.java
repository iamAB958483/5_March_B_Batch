package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	    // 1.Data Members/Variables
	
		@FindBy(xpath="//span[@class='user-id']") private WebElement Userid;
		
		@FindBy(xpath="//a[text()=' Logout']") private WebElement logOutButton;
		
		

		// 2.Constructor
		
		public KiteHomePage (WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		

		// 3.Method
		
		public void clickonHomePageUserid()
		{
			Userid.click();
		}
		

		public void clickonLogOutButton()
		{
			logOutButton.click();
		}
		

}
