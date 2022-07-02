package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {


	// 1.Data Members Or Variables
	
	@FindBy(id="email") private WebElement UN;
	
	@FindBy(id="pass") private WebElement PWD;
	
	@FindBy(xpath="//button[text()='Log In']") private WebElement LoginButton;
	
	
	
	// 2.Constructor
	
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
		

	// 3.Method
	
	public void SendUserName()
	{
		UN.sendKeys("bhamareabhijit44@gmail.com");
	}
		
	public void SendPassword()
	{
		PWD.sendKeys("95abhijit83");
	}
		
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}

}
