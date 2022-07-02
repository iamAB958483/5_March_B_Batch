package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
	    
	    driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		
		driver.findElement(By.xpath("(//a[text()='Student Review'])[1]")).click();
		
		//Thread.sleep(2000);
	
	}
	
			
}
