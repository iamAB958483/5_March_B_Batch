package POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		    
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	        
	        
	        
	        KiteLoginPage login= new KiteLoginPage(driver);  
	        login.SendUserName();
	        login.SendPassword();
	        login.ClickOnLoginButton();
	        
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	        
	        KitePinPage pinpage= new KitePinPage(driver);
	        pinpage.sendpin();
	        pinpage.clickonContinueButton();
	        
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	        
	        
	        KiteHomePage home = new KiteHomePage(driver);
	        home.clickonHomePageUserid();
	        home.clickonLogOutButton();
	        
	        driver.quit();

	}

}
