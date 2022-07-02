package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	// 1.Data Members/Variables
	
	@FindBy(id="userid") private WebElement UN;
	
	@FindBy(id="password") private WebElement PWD;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
	
	
	//Constructor
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Method
	
	public void SendUserName()
	{
		UN.sendKeys("ELR321");
	}
	
	public void SendPassword()
	{
		PWD.sendKeys("Dhana1111");
	}
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}
	
	
		
		
	

}
