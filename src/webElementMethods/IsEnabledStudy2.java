package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.airtel.in/");
			
			Thread.sleep(6000);
			
			driver.findElement(By.linkText("Login")).click();
			
			Thread.sleep(1000);
			
			

	}

}
