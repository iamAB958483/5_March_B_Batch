package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyStudy1 {

	public static void main(String[] args) throws InterruptedException {
		
		
	    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\\\chromedriver.exe");
			
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("velocity corporate");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		WebElement UserName=driver.findElement(By.xpath("//input[@name='email']"));
		
		UserName.sendKeys("123456");
		UserName.clear();
		
	//	WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		
	//	driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
