package scrolling;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingForSize {

	public static void main(String[] args) {
		
	        System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
		    WebDriver driver= new ChromeDriver();
		    
		    driver.get("https://www.amazon.in/");
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		    
		    System.out.println(driver.manage().window().getSize());
			  
		    Dimension d= new Dimension(500,400);
		  
		    driver.manage().window().setSize(d);

	}

}
