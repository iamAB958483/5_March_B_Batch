package kiteAppUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityUsingPropertyFile {
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(3);
        File destination=new File("D:\\Screenshot\\Abhijit.png"+random+".png");	
 		FileHandler.copy(source, destination);
	}
	
	public static String readDataFromProperty(String key) throws IOException
	{
		Properties prop= new Properties();
		
		FileInputStream myprop= new FileInputStream("D:\\5_March_B_Selenium\\myproperty.properties");
		
		prop.load(myprop);
		
		String value= prop.getProperty(key);
		
		return value;
	}
	
	
	public static void implicitWait(WebDriver driver,int timeUnit)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
		
	}
    
	
	
	

	
		
	


	
}
