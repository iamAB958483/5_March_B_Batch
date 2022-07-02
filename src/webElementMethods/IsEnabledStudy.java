package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsEnabledStudy {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//h6[text()='Sign In'][1]")).click();
		
		Thread.sleep(1000);
		
		WebElement OTPButton =driver.findElement(By.xpath("//button[@type='submit']"));
		
		boolean result = OTPButton.isEnabled();
		
		System.out.println("OTPButton status is "+result);
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9552248483");
		
		Thread.sleep(500);
		
		boolean result1=OTPButton.isEnabled();
		
		System.out.println("OTPButton status is "+result1);
		
		
		

	}

}
