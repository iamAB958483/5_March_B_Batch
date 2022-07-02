package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyStudy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Velocity Pune");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
