package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
        // 1.Data Members/Variables
	
		@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
		
		@FindBy(xpath="//a[text()=' Logout']") private WebElement logOutButton;
		
		

		// 2.Constructor
		
		public KiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
	   // 3.Method
		
		public String getActualUserID()
		{
			String actualUserID = userID.getText();
			return actualUserID;
		}
		
		public void validateUserID(String expectedUsername)
		{
			String actualUserID = userID.getText();
			String expectedUserID = expectedUsername;
			

		 if(actualUserID.equals(expectedUserID))
			{
				System.out.println("User ID Matching....Test Case is Passed");
			}
			else
			{
				System.out.println("User ID Not Matching....Test Case is Failed");
			}
					
		}
		

		public void clickOnLogOutButton() throws InterruptedException
		{
			userID.click();
			
			Thread.sleep(200);
			
			logOutButton.click();
		}

}
