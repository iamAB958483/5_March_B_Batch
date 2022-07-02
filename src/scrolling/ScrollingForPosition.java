package scrolling;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingForPosition {

	public static void main(String[] args)  {
		
	        System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
		    WebDriver driver= new ChromeDriver();
		    
		    driver.get("https://www.amazon.in/");
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		   
		    Point p=new Point(70,100);
		    
		    driver.manage().window().setPosition(p);
		    

	}

}
