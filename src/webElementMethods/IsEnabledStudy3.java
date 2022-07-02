package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy3 {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.myvi.in/");
			
			Thread.sleep(6000);
			
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			
			Thread.sleep(1000);
			
			WebElement OTPButton = driver.findElement(By.xpath("//button[text()='send OTP']"));
			
			boolean result = OTPButton.isEnabled();
			
			System.out.println("OTPButton status is "+result);
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9527812488");
			
			OTPButton.click();
			
			Thread.sleep(500);
			
			boolean result1 = OTPButton.isEnabled();
			
			System.out.println("OTPButton isEnabled() "+result1);
			
			
			
			
			
			
	}	

}
