package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotWithRandomName {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
 		WebDriver driver= new ChromeDriver();
 		
 		driver.manage().window().maximize();
 		
 		Thread.sleep(1000);
 		
 		driver.get("https://demoqa.com/select-menu");
 		
 		Thread.sleep(1000);
 		
        File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        String random=RandomString.make(3);
 		
 		File destination=new File("D:\\Screenshot\\Abhijit.png"+random+".png");
 		
 		FileHandler.copy(Source, destination);
			
 		
	}

}

