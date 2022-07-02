package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException{
		
	        System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
	        
		    WebDriver driver= new ChromeDriver();
		    
		    driver.get("https://www.amazon.in/");
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

		    // Positive x value--> right hand side, Y value +ve --> down 
			// Positive x value--> right hand side, Y value -ve --> up 
			// Negative x value--> left hand side, Y value +ve --> down 
			// Negative x value--> left hand side, Y value -ve --> up 

		    JavascriptExecutor j = ((JavascriptExecutor)driver);
		    
            j.executeScript("window.scrollBy(20,4000)");  //For Down Side 
	        Thread.sleep(2000);
		    
		    j.executeScript("window.scrollBy(40,-3000)");  //For Up Side
		    Thread.sleep(2000);
		    
		    Dimension d=new Dimension(100,700);
		    
		    driver.manage().window().setSize(d);
		    
		    j.executeScript("window.scrollBy(4000,60)");  //For Right Side
		    Thread.sleep(2000);
		    
            j.executeScript("window.scrollBy(-3000,40)");  //For left Side
		    
		    
		    

	}

}
