package kiteWithExcel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		    
			WebDriver driver= new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
