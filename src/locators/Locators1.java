package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
 		WebDriver driver= new ChromeDriver();
 		
 		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//For Name
	    driver.findElement(By.name("q")).sendKeys("YouTube");
	    
	    //For ClassName
	    
		
		    
		
		
		
		
		
	}


}
