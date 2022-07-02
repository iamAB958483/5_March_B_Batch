package POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {

	

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		    
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	        
	        
	        FacebookLoginPage Login= new FacebookLoginPage(driver);
	        Login.SendUserName();
	        Login.SendPassword();
	        Login.ClickOnLoginButton();
	        
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	        
	        FacebookLogOutPage logout= new  FacebookLogOutPage(driver);

	        logout.FacebookLogOutPage();
	        logout.clickonLogOutButton();
	       
	}

}
