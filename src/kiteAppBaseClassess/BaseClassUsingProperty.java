package kiteAppBaseClassess;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAppUtility.UtilityUsingPropertyFile;


public class BaseClassUsingProperty {
	

	protected static WebDriver driver;
	
	
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	    
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(UtilityUsingPropertyFile.readDataFromProperty("URL"));
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
	
	public void takesScreenshot(String TCName) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\Screenshot\\Abhijit.png");
		
		FileHandler.copy(source,destination);
	}

}
