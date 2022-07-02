package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {

	// 1.Data Members/Variables
	
	@FindBy(id="pin") private WebElement Pin;
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement Continue;
	
	
	// 2.Constructor
	
	public  KitePinPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	// 3.Methods
	
	public void sendpin()
	{
		Pin.sendKeys("982278");
	}
	
	public void clickonContinueButton()
	{
		Continue.click();
	}
	

}
