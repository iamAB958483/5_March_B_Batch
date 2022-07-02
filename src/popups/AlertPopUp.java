package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
		    
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			
	        driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			
	}

}
