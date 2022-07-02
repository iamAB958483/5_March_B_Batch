package kiteAppBaseClassess;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassess 
{
	protected WebDriver driver;
	
	
	
	public void openBrowser()
	{
		    System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		    
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com/");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

}
