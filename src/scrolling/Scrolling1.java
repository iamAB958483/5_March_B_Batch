package scrolling;


import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {

	public static void main(String[] args) throws InterruptedException {
		
	        System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
	        
		    WebDriver driver= new ChromeDriver();
		    
		    driver.get("https://vctcpune.com/");
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		    
		    //For Size
		    System.out.println(driver.manage().window().getSize());
		  
		    Dimension d= new Dimension(500,400);
		  
		    driver.manage().window().setSize(d);
		  
            //For Scrolling
		    Thread.sleep(1000);
		  
		    JavascriptExecutor j = ((JavascriptExecutor)driver);
		    
		    j.executeScript("window.scrollBy(2000,40)");
		  
		    //For Position
		   
		    Thread.sleep(2000);
		   
		    Point p=new Point(70,100);
		    
		    driver.manage().window().setPosition(p);
	}

}
