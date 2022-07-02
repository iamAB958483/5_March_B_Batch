package actionClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAction2 {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		    
		    WebDriver driver=new ChromeDriver();
					
			driver.get("");
					
			driver.manage().window().maximize();
					
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

	}

}
