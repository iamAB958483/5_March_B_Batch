package kiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	

	    // 1.Data Members/Variables
	
	    @FindBy(id="pin") private WebElement PIN;
		
		@FindBy(xpath="//button[@class='button-orange wide']") private WebElement ContinueButton;
		
		
		
		// 2.Constructor
		
		public  KitePinPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		

		// 3.Methods
		
		public void sendPin(String pin)
		{
			PIN.sendKeys(pin);
		}
		
		public void clickOnContinueButton()
		{
			ContinueButton.click();
		}
		
		







}


